public class DNAWavelength {
    private DNA dna;

    public DNAWavelength() {
        this.dna = new DNA("");
    }

    public void setDNA(DNA dna) {
        this.dna = dna;
    }

    public int calculateWavelength() {
        String dnaSequence = dna.getSequence();
        int Wavelength = 0;
        for (int i = 0; i < dnaSequence.length(); i++) {
            if (dnaSequence.charAt(i) == 'A') {
                Wavelength += 1;
            } else if (dnaSequence.charAt(i) == 'C') {
                Wavelength += 2;
            } else if (dnaSequence.charAt(i) == 'G') {
                Wavelength += 3;
            } else if (dnaSequence.charAt(i) == 'T') {
                Wavelength += 4;
            } else {
                throw new IllegalArgumentException("Invalid DNA sequence");
            }
        }
        return Wavelength;
    }
}
