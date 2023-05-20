public class StringExample {

    public static  void main(String[] args) {

        // String => 문자열 객체
        // 객체 => 힙 메모리 영역
        // 변수 => 힙 메모리 영역의 주소

        String str = "안녕하세요!"; // 문자열 리터럴
        String str_2 = new String("안녕하세요!"); // 생성자
        String str_3 = "안녕하세요!";

        if (str == str_2) {
            System.out.println("str == str_2");
        }
        if (str == str_3) {
            System.out.println("str == str_3");
        }

        if (str.equals(str_2)){
            System.out.println("str.equals(str_2)");
        }
        if (str.equals(str_3)){
            System.out.println("str.equals(str_3)");
        }
        if (str_2.equals(str_3)){
            System.out.println("str_2.equals(str_3)");
        }

        // 문장열 병합
        // 1. '+' 연산자

        String str_a = "Hello,";
        String str_b = "World";

        System.out.println(str_a + " " + str_b);

        // 2. StringBuilder
        StringBuilder strBdr_1 = new StringBuilder("Hello,");

        strBdr_1.append("World!");

        String str_new = strBdr_1.toString();

        System.out.println(str_new);


        // 문자열 슬라이스

        String str_index = "이름: 서상태";
        System.out.println(str_index.indexOf("이"));
        String str_name = str_index.substring(4, 7);
        System.out.println(str_name);

        // 문자열 대소문자 변환

        String str_q = "abc";
        String str_w = "ABC";

        str_q = str_q.toUpperCase();
        str_w = str_w.toLowerCase();

        System.out.println(str_q);
        System.out.println(str_w);

        if (str_q.equals(str_w)) {
            System.out.println("str_q.equals(str_w)");
        }
        if (str_q.equalsIgnoreCase(str_w)) {
            System.out.println("str_q.equalsIgnoreCase(str_w)");
        }

        // 공백 제거

        // 1. 양쪽 끝 공백
        String str_e = "     Hello   ";
        str_e = str_e.trim();
        System.out.println(str_e);

        // 2. 문자열 중간
        String str_r = "Hel  lo  ";
        str_r = str_r.trim();
        str_r = str_r.replace(" ", "");
        System.out.println(str_r);

    }
}
