public class Example {
    static int second(int n) {
        int result = n * 2;
        return result;
    }

    static int first(int n) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += second(i);
        }
        return total;
    }

    public static void main(String[] args) {
        int value = 4;
        System.out.println(first(value));
    }
}
