public class Swap {
    public static void main(String[] args) {
        String[] array = { "Alex", "Max", "Charlie", "Bob", "Ada", "Jim" };
        String temp = array[2];
        array[2]=array[4];
        array[4]=temp;

        for (String elem : array) {
            System.out.println(elem);
        }
    }
}
