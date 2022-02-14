import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test1PF {
    public Map<String, List<Employee>> groupByJobTitle(List<Employee> employeeList) {
        return employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getTitle));
    }

    public double calculateAverage(List<Employee> employeeList) {
        return employeeList.stream()
                .mapToInt(employee -> employee.getSalary())
                .average()
                .getAsDouble();
    }
}
