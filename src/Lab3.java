public class Lab3 {
    public static void main(String[] args) {
        String s = new String("ASD");

        String s1 = new String("ASD");
        String s2 = new String("ASD");
        System.out.println(1 == 1);
        int a = 1;
        int b = 1;
        System.out.println(a == b);
        int c = 2;
        System.out.println("a == --c: " + (a == --c));
        for (int i = 0; i < 10; ++i) {
            System.out.println(i + ": *");
        }

        int i = 0;
        while (i < 10) {
            System.out.println(i + ": *");

            System.out.println("i=" + i);
            int j = ++i;
            System.out.println("i=" + i);
        }

        /*int i = 6;
        System.out.println(i + 1);
        System.out.println(1 + i);
        int j = i++;
        *//*int j = i;
        i += 1;*//*
        System.out.println("i=" + i + ", j=" + j);
        int j2 = ++i;
        System.out.println("i=" + i + ", j2=" + j2);

        System.out.println(++i);
        System.out.println(i++);*/

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        /*int a = 1;
        int b = 1;
        System.out.println(a == b);*/
    }
}
