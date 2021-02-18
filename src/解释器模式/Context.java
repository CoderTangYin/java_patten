package 解释器模式;

/**
 * 上下文
 */
public class Context {

    private String input;
    private int output;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public int getOutput() {
        return output;
    }

    public void setOutput(int output) {
        this.output = output;
    }
}
