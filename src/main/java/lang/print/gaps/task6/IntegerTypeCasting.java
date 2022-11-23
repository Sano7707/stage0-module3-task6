package lang.print.gaps.task6;

public class IntegerTypeCasting {
    public static void main(String[] args) {
        long first = 1000;
        int second = (int)first;
        first = second;
        System.out.println(first + "" + '\n' + second);

    }
}

