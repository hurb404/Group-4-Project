import java.util.*;
// TCCGAG

public class Main {
    public static void main(String[] args) {
        DNA dna = new DNA("");
        DNASoundFrequency dnaSoundFrequency = new DNASoundFrequency();
        dnaSoundFrequency.setDNA(dna);
        System.out.println(dnaSoundFrequency.calculateFrequency());
    }
}
