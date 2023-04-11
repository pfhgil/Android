package companylogic;

import java.util.ArrayList;
import java.util.List;

public class Company
{
    private String name = "";

    private final List<Employee> employees = new ArrayList<>();

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder("Information system name: " ).append(name).append("\nEmployees:\n");

        for(int i = 0; i < employees.size(); i++) {
            sb.append(i).append(") ").append(employees.get(i)).append("\n");
        }

        return sb.toString();
    }

    public void addEmployee(Employee newEmployee)
    {
        if(newEmployee.getAge() < 18) {
            System.out.println("Новый сотрудник " + newEmployee.getName() + " является несовершеннолетним!");
            return;
        }

        newEmployee.createUniqueID(this);

        employees.add(newEmployee);
    }

    public boolean removeEmployee(Employee employee) { return employees.remove(employee); }

    public boolean removeEmployee(int ID) { return employees.removeIf(employee -> employee.getID() == ID); }

    public Employee findEmployee(int ID) { return employees.stream().filter(employee -> employee.getID() == ID).findFirst().orElse(null); }

    public int getEmployeesNum() { return employees.size(); }

    public Employee getEmployee(int idx) { return employees.get(idx); }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
