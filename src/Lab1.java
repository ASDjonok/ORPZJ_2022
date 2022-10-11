public class Lab1 {
    public static void main(String[] args) {
        int denominator = -1;
        int numerator = -1;
        double s = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 11; j++) {
//                todo NOT SKIP division by zero
                if (denominator == 0) {
                    break;
                } else {
                    s = (double) numerator / denominator;
                }
            }
        }
    }
}
