import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //for문
        int total = 0;
        for (int i = 1; i<=100; i++) {
            total = total + i;
        }
        System.out.println(total);
        int total2 = 0;
            for(int y=0; y<=100; y++) {
                if(y % 2 == 0) {
                    if (y==50) {
                        break;
                    }
                total2 = total2 + y;
            }
        }
        System.out.println(total2);

    }
}