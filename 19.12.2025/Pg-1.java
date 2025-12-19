public class Employee {
    String name;
    int id;
    public Employee(String name, int id) {
        name = name; 
        id = id;
        
        System.out.println("Inside Constructor: Local Name = " + name);
    }

    public void displayInfo() {
        System.out.println("Field Name: " + name); 
        System.out.println("Field ID: " + id);
    }

    public static void main(String[] args) {
        System.out.println("--- Creating Employee ---");
        Employee emp = new Employee("Alice", 101);
        emp.displayInfo();
    }
}
