public class Employee {
    // Properties or states
    // type | prop

    private int id;
    private String fname;
    private String lname;
    private Department department;
    private String pos;

    // Constructor
    public Employee() {
        // call constructor
        this("","");
    } // add this for protext constructor overload

    public Employee(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    // Behaviors or method
    void doSmt() {

    }

    public String getFullName() {
        return fname + " " + lname;
    }

    public String getPositionName() {
        return this.pos;
    }

}
