import java.util.Scanner;

public class Car {
        String name;
        int number;


        //생성자 오버로딩
        public  Car() {
//                this.name = "이름없음";
//                this.number = 0;
                this("이름없음",0);
        }

        public Car(int number) {
                this.number = number;
        }


        public Car(String name, int number) {
                this.name = name;
                this.number = number;
        }

}
