package Error;

public class StackOverFlowErrorTest {
    private int stackLength = 1;

    /**
     * 栈上的stackOverFlowError
     * -Xss128k 设置栈大小
     */
    public void stackOverFlowErrorByVariable() {
        stackLength++;
        stackOverFlowErrorByVariable();
    }

    public static void main(String[] args) {
        StackOverFlowErrorTest stackOverFlowErrorTest = new StackOverFlowErrorTest();
        System.out.println("stack length: " + stackOverFlowErrorTest.stackLength);
        stackOverFlowErrorTest.stackOverFlowErrorByVariable();
    }
}
