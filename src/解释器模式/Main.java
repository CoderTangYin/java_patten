package 解释器模式;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        test1();

    }

    private static void test1() {
        // 创建并设计 设置上下文
        Context context = new Context();
        context.setInput("10");
        context.setOutput(10);

        List<Expression> list = new ArrayList<>();
        list.add(new PlusExpression());
        list.add(new PlusExpression());
        list.add(new MinusExpression());

        for (Expression ex :
                list) {
            ex.interpret(context);
        }
    }

    private static void test() {
        // 创建并设计 设置上下文
        Context context = new Context();
        context.setInput("10");
        context.setOutput(10);

        // 进行递增操作
        Expression plus = new PlusExpression();
        plus.interpret(context);

        // 进行递减操作
        Expression minus = new MinusExpression();
        minus.interpret(context);
    }

}
