public class Lab2 {
    public static void main(String[] args) {
//        int[] array = {1, 2, 3};
//        int[] array = new int[]{1, 2, 3};
        /*int[] array;
        array = new int[]{1, 2, 3};*/
        int[] array = new int[4];
        int c = 1;

        int[][] matrix = {
                {1, 2},
                {3}
        };

//        int[][] matrix0 = {{}};
        int[][] matrix0 = new int[3][2];

        int[][] matrix2 = new int[3][];
        matrix2[0] = new int[3];
        matrix2[1] = new int[2];
        matrix2[2] = new int[2];
        matrix2[0][0] = -11;

        System.out.println(matrix2);
        for (int[] ints : matrix2) {
            for (int anInt : ints) {
                System.out.printf("%5d", anInt);
            }
            System.out.println();
//            System.out.println(ints);
        }

        /*for (int i = 0; i < matrix2.length; i++) {

        }*/
    }
}
