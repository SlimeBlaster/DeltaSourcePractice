public class Comparsion2Arrays {
    public static void main(String[] args) {
        boolean check = true;
        int[] numArray1 = {1, 2, 3, 4, 5, 5};
        int[] numArray2 = {1, 2, 3, 4, 5, 6};

        if (numArray1.length == numArray2.length) {
            for (int i = 0; i < numArray2.length; i++) {
                if (numArray1[i] != (numArray2[i])) {
                    check = false;
                }
            }

            if (check == true) {
                System.out.println("The two arrays are equal");
            } else {
                System.out.println("There are difference between these two arrays");
            }
        } else {
            System.out.println("There are difference between these two arrays");
        }
    }
}
