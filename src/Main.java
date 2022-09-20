public class Main {
    public static void main(String[] args) {
        /*System.out.println("Hello world!");
        int a = (int) 0xF000000001L;
        System.out.println(a);
        System.out.println(0xF00000001L);*/

//        System.out.println(1/2);

//       todo arithmetic overflow
        byte i;
        for (i = 1; i > 0; i++) {
            System.out.println(i);
        }
        System.out.println(i);
        System.out.println(0x7F);
        System.out.println((byte)0x80);

        char c = 49;
        char c2 = '\u0001';
        char c3 = '1';
        char c4 = '\u0031';
        System.out.println(c4);
        System.out.println((int)c4);
        System.out.println(c);
    }
}
