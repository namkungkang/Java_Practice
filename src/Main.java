import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //while문

        int total = 0;
        int i = 1;

        while (i < 10) {
            System.out.println(i + 1);
            i++;
            break;
        }
        while (i <= 100) {

            total = total + 1;
            System.out.println(total);
            break;
        }
    int value = 0;
        Scanner scan = new Scanner(System.in);

        do {
            value = scan.nextInt();
            System.out.println("입력 받은 값 " + value);

        }while (value <= 10);
        System.out.println("반복문 종료!");
    }

}