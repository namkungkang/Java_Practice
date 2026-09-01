public class MyClassExam {
    public static void main(String[] args) {
        MyClass myclass = new MyClass();

        myclass.method1();
        myclass.method2(2);
        int value = myclass.method3();
        System.out.println(value);
        myclass.method4(10,20);

        int value2 = myclass.method5(10);
        System.out.println(value2);

        myclass.method5(3);
        myclass.method5(5);
    }
}
