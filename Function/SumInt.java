package Function;

public class SumInt {
    public static void main(String[] args) {
        int[] b = {1, 2, 3, 4, 5, 6, 7};

        long answer = SumInteger(b);

        System.out.println("답: " + answer);
    }

    public static long SumInteger(int[] a) {
        long answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i];
        }

        return answer;
    }
}
