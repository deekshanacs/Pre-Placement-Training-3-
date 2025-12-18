import java.util.*;
class Employee {
    int id;
    String name;
    Employee(int id, String name) { this.id = id; this.name = name; }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

public class MapScenario {
    public static void main(String[] args) {
        Map<Employee, String> map = new HashMap<>();
        map.put(new Employee(101, "John"), "Manager");
        System.out.println(map.get(new Employee(101, "John"))); 
    }
}
