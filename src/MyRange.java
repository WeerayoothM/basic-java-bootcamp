import java.util.Scanner;

public class MyRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] tests = input.split(",");
        int start = Integer.parseInt(tests[0].substring(1));
        int end = Integer.parseInt(tests[1].substring(0,1));

        if (start > end){
            System.out.println("invalid input start number has more than end number");
            return ;
        }

        if (input.startsWith("(")) {
            start += 1;
        }
        if (input.endsWith(")")) {
            end -= 1;
        }

        String output = "";
        for (int i = start; i <= end; i++) {
            output += ", " + i;
        }
        System.out.println(output.substring(2));
    }
}
