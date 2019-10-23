public class Task2 {
    public static void main(String[] args) {

        try{
            System.out.println(divideByZero());
        } catch (Exception e) {
            System.out.println("Cant divide by 0");
        }
    }
    public static int divideByZero(){
        int a = 5;
        int b = 0;
        return a/b;
    }
}
