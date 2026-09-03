public class ExceptionExam3 {
    public static void main(String[] args) {

        try {
            int k = divide(10,0);
            System.out.println(k);

        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
        }
    }
    public static int divide(int i, int j) throws IllegalArgumentException{
        if (j==0) {
            throw new IllegalArgumentException("0으로 나눌 수 없습니다. ");
        }
        return i/j;
    }
}
