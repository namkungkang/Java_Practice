//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
    //swith문
    int value;
    value = 2;

    switch (value) {
        case 1:
            System.out.println("바보");
            break;
        case 2:
            System.out.println("x");
            break;
        default:
            System.out.println("아니지롱");



    }
    String str =  "바보" ;
    switch (str) {
        case "바보" :
            System.out.println("안녕");

        case "멍청이" :
            System.out.println("아니다");
            break;
        default:
            System.out.println("하이");



    }




    }



}