public class operadoresLogicos {

    public static void main(String[] args) {

        int a = 1, b = 2, c = 3;

        b = ++c; // a = 1 b = 4 c = 4
        System.out.println(b);

        a += b++; // a = 1 + 4 = 5 b = 4 + 1 = 5
        System.out.println(a);

        a = a++ + a; // a = 5 + 1 + 5 = 11
        System.out.println(a);

        a -= b--; // a = 11 - 5 = 6 b = 4
        System.out.println(a);

        c = a++ - ++b; // c = 6 - (4 + 1) = 1 a = 7 b = 5
        System.out.println(c);

        c -= ++a; // c = 1 - 8 = -7 a = 8 b = 5
        System.out.println(c);

        a -= ++c; // a = 8 + 6 = 14 c = -6 b = 5
        System.out.println(a);

        a -= c++; // a = 14 + 6 = 20 c = -5 b = 5
        System.out.println(a);

        a -= --c; // a = 20 + 6 = 26 c = -6 b = 5
        System.out.println(a);

    }
}
