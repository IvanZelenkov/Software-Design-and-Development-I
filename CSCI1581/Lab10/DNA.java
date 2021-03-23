// Ivan Zelenkov Problem 3 (DNA)

public class DNA {
    private char[] sequence;

    public DNA(char[] sequence) {
        this.sequence = sequence;
    }

    public char[] getSequence() {
        return sequence;
    }

    public DNA swap(DNA other, int swapPoint) {
        //Returns a new string that is a substring of this string.
        String seq = toString().substring(0, swapPoint);

        seq += other.toString().substring(swapPoint);

        return new DNA(seq.toCharArray());
    }

    public boolean equals(DNA other) {
        if(sequence.length != other.sequence.length) {
            return false;
        }
        for(int i = 0; i < sequence.length; i++) {
            if(sequence[i] != other.sequence[i]) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String seq="";
        for (char c : sequence) {
            seq += c;
        }
        return seq;
    }
}
