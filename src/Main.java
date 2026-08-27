//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        // 산술연산자
        int i1 = -5;
        int i2 = -i1;
        int i3 = +i1;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        int i4 = ++i3;
        System.out.println(i4);
        System.out.println(i1);

        int i5 = i3--;
        System.out.println(i5);
        System.out.println(i3);

        int i = 30;
        int j = 20;

        System.out.println(i + j);

        System.out.println(i / j);

        System.out.println(i / (double)j);

        //비교연산자ㅎ

    }
}