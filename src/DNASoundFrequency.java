public class DNASoundFrequency {
    private DNA dna;

    public DNASoundFrequency() {
        this.dna = new DNA("");
    }

    public void setDNA(DNA dna) {
        this.dna = dna;
    }

    public int calculateFrequency() {
        String dnaSequence = dna.getSequence();
        int frequency = 0;
        for (int i = 0; i < dnaSequence.length(); i++) {
            if (dnaSequence.charAt(i) == 'A') {
                frequency += 1;
            } else if (dnaSequence.charAt(i) == 'C') {
                frequency += 2;
            } else if (dnaSequence.charAt(i) == 'G') {
                frequency += 3;
            } else if (dnaSequence.charAt(i) == 'T') {
                frequency += 4;
            } else {
                throw new IllegalArgumentException("Invalid DNA sequence");
            }
        }
        return frequency;
    }
}
