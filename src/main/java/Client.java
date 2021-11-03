public class Client {
    // You can write all of your testing code here:
    public static void main(String[] args) {
        // NumberArray Tests
        NumberArray n1 = new NumberArray(5, 10);
        System.out.println(n1);
        // [5, 5, 5, 5, 5, 5, 5, 5, 5, 5]
        System.out.println(n1.getAtIndex(2));
        // 5
        System.out.println(n1.sum());
        // 50
        n1.increment();

        System.out.println(n1);
        // [6, 6, 6, 6, 6, 6, 6, 6, 6, 6]

        // NumberSequence Tests
        NumberSequence ns1 = new NumberSequence(5, 10);
        System.out.println(ns1);
        // [5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
        System.out.println(ns1.sumPart(3, 6));
        // 27
    }
}
