public class Operators {
    public static void main(String[] args) {

        // 산술 연산자

        int a = 10;
        int b = 20;
        String c = "abc";

        double d = 10;
        double e = 20;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(d / e);
        System.out.println(a + c);

        // 비교 연산자

        int f = 5;
        int g = 8;

        System.out.println(f > g);
        System.out.println(f < g);
        System.out.println(f >= g);
        System.out.println(f <= g);

        // = 대입연산자, == 비교연산자
        System.out.println(f == g);
        System.out.println(f != g);

        // 논리 연산자

        int h = 3;
        int j = 3;
        int k = 5;

        // AND(&&) 교집합
        System.out.println(h > j && h < k);

        // OR(||) 합집합
        System.out.println(h < j || h > k);

        // NOT(!) 여집합
        System.out.println(!true);
        System.out.println(!false);

        // 대입 연산자

        int l = 1;
        double price = 12.5;

        // 증감 연산자
        a++; // a = a + 1
        a--; // a = a - 1

    }
}
