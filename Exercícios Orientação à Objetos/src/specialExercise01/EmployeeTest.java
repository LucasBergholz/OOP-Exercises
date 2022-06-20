package specialExercise01;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.name = "John";
		employee.age = 19;
		employee.salaries = new double[] {1250, 1919, 3390.54 , 3780};

		employee.printt();
		
	}

}
