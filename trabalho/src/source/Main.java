package source;
public class Main {
    public static void main(String[] args) {
        NodePositionList<Integer> list = new NodePositionList<>();
        double result = list.calculateExpression();
        System.out.println("O resultado da expressão é: " + result);
    }
}