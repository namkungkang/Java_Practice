//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //논리 연산자
       boolean a = true;
       boolean b = false;
       boolean c = true;

        System.out.println(a == b);
        System.out.println(a || b);
        System.out.println(a && c);
        System.out.println(b || c);
        System.out.println(a || c);
        System.out.println(b || b);
        System.out.println(a ^ c);

        //삼항 연산자
        int b1 = (5<4) ? 20 : 30;
        System.out.println(b1);
    }



}