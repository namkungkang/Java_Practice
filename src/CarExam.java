
import java.util.Scanner;

public class CarExam {
    public static void main(String[] args) {
        Car c2 = new Car("소방차",13);
        Car c3 = new Car("구급차",12);
        Car c1 = new Car();
        Car c4 = new Car(4);

        System.out.println(c1.name);
        System.out.println(c1.number);
        System.out.println(c2.name);
        System.out.println(c2.number);
        System.out.println(c3.name);
        System.out.println(c3.number);
    }

}
