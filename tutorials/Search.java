public class Search {
    public static void main(String[] args) {
        int[] array = { 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println("The even numbers in this list are: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + ", ");
            }
        }

        System.out.println();
        System.out.print("Numbers that multiplied by 2 give a number also in the array: ");
        for (int i = 0; i < array.length; i++) {
            int number = array[i] * 2;
            boolean found = false;
            int index = 0;
            while (!found && index < array.length) // efficient
            {
                if (array[index] == number) {
                    System.out.print(array[i] + ", ");
                    found = true;
                }
                index++;
            }
        }
    }
}
