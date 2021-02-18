package 解释器模式;

public class MinusExpression extends Expression {
    @Override
    public void interpret(Context context) {
        String sInput = context.getInput();
        int iInput = Integer.parseInt(sInput);

        iInput -= 1;

        context.setInput(String.valueOf(iInput));
        context.setOutput(iInput);

        System.out.println("自动递减"+ iInput);

    }
}
