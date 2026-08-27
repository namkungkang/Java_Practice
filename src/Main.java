//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //if문
        int x = 50;
        int y = 50;
        if(x > y) {
                System.out.println("x는 y보다 작습니다.");
        }
        //중괄호 없는 구문
        if(x > y)
            System.out.println("x와 y는 같다.");
        System.out.println("test");

        //else if, else 추가문
        if (x > y) {
            System.out.println("같다");
        } else if (x < y) {
            System.out.println("아니유");
            
        }else  {
            System.out.println("다르다");
        }


    }



}