package Error;

public class StackOverFlowErrorTest2 {
    public static void main(String[] args) {
        StackOverFlowErrorTest2 test = new StackOverFlowErrorTest2();
        test.a();
    }
    public void a(){
        b();
    }

    public void b(){
        a();
    }
}
