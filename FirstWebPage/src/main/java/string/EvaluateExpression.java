package string;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;

public class EvaluateExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a mathematical expression: ");
        String expression = scanner.nextLine();

        try {
            double result = evaluateExpression(expression);
            System.out.println("Result: " + result);
        } catch (ScriptException e) {
            System.err.println("Error: Invalid expression");
        }
    }

    public static double evaluateExpression(String expression) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript"); // Corrected engine name

        if (engine == null) {
            throw new ScriptException("JavaScript engine not found");
        }

        // Evaluate the expression and convert the result to a double
        Object evalResult = engine.eval(expression);
        if (evalResult instanceof Number) {
            return ((Number) evalResult).doubleValue();
        } else {
            throw new ScriptException("Invalid expression result");
        }
    }
}
