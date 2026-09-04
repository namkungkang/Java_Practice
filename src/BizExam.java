public class BizExam {
    public static void main(String[] args) {
        BizService bizService = new BizService();
        bizService.bizMethod(5);
        try {
            bizService.bizMethod(-3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
