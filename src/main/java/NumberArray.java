// A NumberArray is an array of some length
// where every element is the same number
public class NumberArray {
    private int[] arr;

    // Creates a NumberArray
    public NumberArray(int number, int size) {
        // Note that we first need to MAKE the array
        arr = new int[size];

        // And then we need to fill the array!
        for (int i = 0; i < size; i++) {
            arr[i] = number;
        }
    }

    // Returns the value at the given index of our array
    public int getAtIndex(int index) {
        return this.arr[index];
    }

    // Adds up all the values in our array
    public int sum() {
        int x = 0;
        for (int i = 0; i < this.arr.length; i++) {
            x += this.arr[i];
        }
        return x;
    }

    // Increments all values in the array
    public void increment() {
        for (int i = 0; i < this.arr.length; i++) {
            this.arr[i] += 1;
        }
    }

    // Returns a nice String for our NumberArray
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
