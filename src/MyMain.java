public class MyMain {

    public static void main(String[] args) {
        long l1 = 100;
        long l2 = 300;
        long l3 = l1 + l2;

        float f = 120.563f;
        double d = 134.78;
        double d1 = 0.04;
        double d2 = 0.03;
        System.out.println(d1 - d2);

        System.out.println("l1: " + l1);
        System.out.println(l3);

        char c = 'X';
        System.out.println(c);

        String str = "Always look on the bright side of life";

        System.out.println(str);
        System.out.println(c + str);
        System.out.println(l1 + l2);

        boolean b = false;
        System.out.println(b);

        if (b) {
            System.out.println("is true");
        } else {
            System.out.println("is false");
        }

        System.out.println(times(10, 22));
        System.out.println(times(77, 88));
    }

    public static int times(int x, int y) {
        return (x * y);
    }

}
