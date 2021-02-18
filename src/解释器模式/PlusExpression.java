package 解释器模式;

/**
 * 递增解释器
 */
public class PlusExpression extends Expression{
    @Override
    public void interpret(Context context) {

        // 获取上下文数值 进行操作
        String sInput = context.getInput();
        int iInput = Integer.parseInt(sInput);
        iInput += 1;

        // 递增操作结束后 修改上下文的值
        context.setOutput(iInput);
        context.setInput(String.valueOf(iInput));

        System.out.println("自动递增"+ iInput);

    }
}
