public class NumberSequence {
    private int[] arr;

    // The constructor should make an array of a given size
    // The array should then be filled with the values starting at the
    // given startValue and counting up by 1
    // e.g. new NumberSequence(5, 10) should create a NumberSequence whose
    // array arr contains: [5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
    public NumberSequence(int start, int size) {
        // YOUR CODE HERE
    }

    // Returns the sum of the numbers from index start up to but not
    // including end
    public int sumPart(int start, int end) {
        // YOUR CODE HERE
        return -1;
    }


    // Returns a nice String for our array
    public String toString() {
        String x = "[";
        for (int i = 0; i < this.arr.length; i++) {
            x += arr[i];
            if (i < this.arr.length-1) {
                x += ", ";
            }
        }
        x += "]";
        return x;
    }
}
