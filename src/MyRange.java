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
        int end = Integer.parseInt(tests[1].substring(0,1));

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
            if ( i == start){
                output += i;
                continue;
            }
            output += ", " + i;
        }
        if (output.length() > 0){
            System.out.println(output);
        }else{
            System.out.println("No value in range");
        }
    }


    public boolean checkStartWithInclude() {
        return input.startsWith("[");
    }
}
