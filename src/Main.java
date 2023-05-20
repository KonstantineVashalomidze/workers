import com.workers.Employee;
import com.workers.Gender;
import com.workers.Profession;

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        Employee.Statistic statisticOfEmp1 = emp1.new Statistic();

        emp1.setProfession(Profession.ACTOR);
        emp1.setGender(Gender.MALE);
        emp1.setSalary(500.0);

        System.out.println("Annual salary is: " + statisticOfEmp1.annualSalary());
        statisticOfEmp1.hasMoreSalary();



    }
}