public class Position {
    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50, 60 };
        for (int elem : array) {
            System.out.println(elem);
        }
        array[5] = 120;
        for (int elem : array) {
            System.out.println(elem);
        }

    }
}
