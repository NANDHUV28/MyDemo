package EmployeeInterface;

//storage interface
interface Storage {
    void addEmployee(Employee e) throws EmployeeAlreadyExistsException;
    Employee getEmployee(int empno) throws EmployeeNotFoundException;
}
//exception
class EmployeeAlreadyExistsException extends Exception {
    public EmployeeAlreadyExistsException(String message) {
        super(message);
    }
}

class EmployeeNotFoundException extends Exception {
    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
//employee class
class Employee {
    private int empno;
    private String name;

    public Employee(int empno, String name) {
        this.empno = empno;
        this.name = name;
    }

    public int getEmpno() {
        return empno;
    }

    public String getName() {
        return name;
    }
}

//implementation
class EmployeeStorage implements Storage {
    private Employee[] employees;
    private int count;

    public EmployeeStorage(int capacity) {
        employees = new Employee[capacity];
        count = 0;
    }

    @Override
    public void addEmployee(Employee e) throws EmployeeAlreadyExistsException {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmpno() == e.getEmpno()) {
                throw new EmployeeAlreadyExistsException("Employee with ID " + e.getEmpno() + " already exists.");
            }
        }

        employees[count++] = e;
    }

    @Override
    public Employee getEmployee(int empno) throws EmployeeNotFoundException {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmpno() == empno) {
                return employees[i];
            }
        }

        throw new EmployeeNotFoundException("Employee with ID " + empno + " not found.");
    }
}

public class EmpException {
    public static void main(String[] args) {
        // Create an instance of the EmployeeStorage
        EmployeeStorage storage = new EmployeeStorage(10);

        try {

            Employee emp1 = new Employee(1001, "Nandhini");
            storage.addEmployee(emp1);

            Employee emp2 = new Employee(1002, "Nandhu");
            storage.addEmployee(emp2);

            // adding a duplicate employee
            Employee emp3 = new Employee(1001, "Nandhuv");
            storage.addEmployee(emp3); // This will throw EmployeeAlreadyExistsException

        } catch (EmployeeAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Retrieve an employee
            Employee retrievedEmployee = storage.getEmployee(1002);
            System.out.println("Retrieved employee: " + retrievedEmployee.getName());

            // Try to retrieve a non-existent employee
            Employee nonExistentEmployee = storage.getEmployee(1003);
            System.out.println("Retrieved employee: " + nonExistentEmployee.getName());
        } catch (EmployeeNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}