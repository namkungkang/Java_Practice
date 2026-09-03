public interface Calculator {
    public int plus(int x, int y);
    public int multiple(int x, int y);

    //디폴트 메서드
    default int exec(int x, int y) {
        return x + y;
    }
    //스태틱 매서드
    public static int exec2(int x, int y) {
        return x - y;
    }
}
