import java.util.List;

public interface EmployeeDAO {

    int add(Employee employee);

    Employee getBuyId(int Id);

    List<Employee> getAllEmployee();

    void updateEmployee(int id, Employee employee);

    void deleteEmployee(Employee id);

    Employee getById(int id);
}