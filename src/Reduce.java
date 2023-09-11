public class Reduce {
    public static void main(String[] args) {
        int i = 100;
        int steps = 0;
        while (i != 0) {
            boolean isEven = i % 2 == 0;
            if (isEven) {

                i -= 2;
                steps += 1;

            } else {
                i -= 1;
                steps += 1;
                isEven = true;
            }
        }
        System.out.println(steps);
    }
    public static int reduce(int i) {
        int steps = 0;
        while (i != 0) {
            boolean isEven = i % 2 == 0;
            if (isEven) {

                i -= 2;
                steps += 1;

            } else {
                i -= 1;
                steps += 1;
                isEven = true;
            }
        }
        return steps;
    }
}
