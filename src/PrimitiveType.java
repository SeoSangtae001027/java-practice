public class PrimitiveType {

    public static void main(String[] args){
        // 정수형

        // 1. byte(1 byte = 8 bits) 1111 0000 => 2^8 => -2^7 ~ 2^7-1
        // 2. short(2 bytes) -2^15 ~ 2^15-1
        // 3. int(4 bytes) -2^31 ~ 2^31-1
        // 4. long(8 bytes) -2^63 ~ 2^63-1

        byte a = 123;

        // 실수형

        // 1. double(8 bytes) 15자리
        // 2. float(4 bytes) 7자리

        double b = 1.23;

        System.out.println(a);
        System.out.println(b);

        // 문자형

        // char(2 bytes)
        // 아스키 + 유니 코드 체계 사용 가능

        char char_1 = 'a';
        char char_2 = 97;
        char char_3 = 0x61;

        System.out.println(char_1);
        System.out.println(char_2);
        System.out.println(char_3);

        // 논리형
        // boolean(1 byte)
        // 자바에서는 불리안 자료형에 1 또는 0의 값을 대입이 불가능

        boolean bool_1 = true;
        boolean bool_2 = false;
        boolean bool_3 = (100 < 0);

        System.out.println(bool_1);
        System.out.println(bool_2);
        System.out.println(bool_3);


    }
}
