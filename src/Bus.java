


public class Bus extends Car1 {

    public void bbang() {
        System.out.println("빵빵");
    }

    public void Run() {
        super.Run(); //부모의 메서도 호출 가능 오버라이딩시
        System.out.println("안달려");
    }

}
