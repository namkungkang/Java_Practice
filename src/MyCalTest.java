public class MyCalTest {
    public static void main(String[] args) {
      Calculator calculator = new MyCal();
    int x =   calculator.plus(10,20);
      int i =   calculator.exec(5,6);
        System.out.println(x);
        System.out.println(i);

        int c = Calculator.exec2(3, 5);
        System.out.println(c);
    }
}
