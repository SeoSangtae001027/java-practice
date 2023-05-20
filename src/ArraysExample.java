public class ArraysExample {

    public static void main(String[] args) {

        // 배열 (Arrays)

        int[] price = {1000, 9000, 40000, 700};
        String[] mbti = {"INFP", "ENFP", "ISFJ", "ESTP"};

        System.out.println(price[0]);
        System.out.println(mbti[0]);

        price[1] = 8000;
        System.out.println(price[1]);

        System.out.println(price);

        System.out.println(mbti.length);

        for (int i=0; mbti.length > i; i++) {
            System.out.println(mbti[i]);
        }
    }
}
