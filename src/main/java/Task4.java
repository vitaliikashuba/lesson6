public class Task4 {
    public static void main(String[] args) {

        try {
            int a = 0;
            int b = 4 / a;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}

