import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class MyRange {
    private final String input;

    public MyRange(String input) {
        this.input = input;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] tests = input.split(",");
        int start = Integer.parseInt(tests[0].substring(1));
        int end = Integer.parseInt(tests[1].substring(0, 1));

        if (start > end) {
            System.out.println("invalid input start number has more than end number");
            return;
        }

        if (input.startsWith("(")) {
            start += 1;
        }
        if (input.endsWith(")")) {
            end -= 1;
        }

        String output = "";
        for (int i = start; i <= end; i++) {
            if (i == start) {
                output += i;
                continue;
            }
            output += ", " + i;
        }
        if (output.length() > 0) {
            System.out.println(output);
        } else {
            System.out.println("No value in range");
        }
    }

    public boolean checkStartWithInclude() {
        return input.startsWith("[");
    }

    public int getFirstNumber() {
        int firstNumber = Character.getNumericValue(input.charAt(1));
        if (checkStartWithInclude()) {
            return firstNumber;
        }
        return firstNumber + 1;
    }

    public boolean checkEndWithInclude() {
        return input.endsWith("]");
    }

    public int getEndNumber() {
        int endNumber = Character.getNumericValue(input.charAt(3));
        if (checkEndWithInclude()) {
            return endNumber;
        }
        return endNumber - 1;
    }

    public String getResult() {
        int firstNumber = getFirstNumber();
        int endNumber = getEndNumber();

        // Collection Framework
        List<String> results = new ArrayList<String>();
        for (int i = firstNumber; i <= endNumber ; i++) {
            results.add(String.valueOf(i));
        }
        return  String.join(",",results);

    }
}
