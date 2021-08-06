public class Main {
    public static void main(String[] args){
        String fname = args[0];
        String lname = args[1];
        Employee weerayooth = new Employee(fname,lname); // default constructor
        String result = weerayooth.getFullName();
        System.out.println(result);
    }
}
