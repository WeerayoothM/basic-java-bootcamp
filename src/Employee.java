public class Employee {
    // Properties or states
    // type | prop

    private int id;
    private String fname = "Weerayooth";
    private String lname = "Manawanich";
    //    Department department;
    private String pos;

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
