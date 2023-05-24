import java.util.*;
// TCCGAG

public class Main {
    public static void main(String[] args) {
        DNA dna = new DNA("");
        DNAWavelength dnaWavelength = new DNAWavelength();
        dnaWavelength.setDNA(dna);
        System.out.println(dnaWavelength.calculateWavelength());
    }
}
