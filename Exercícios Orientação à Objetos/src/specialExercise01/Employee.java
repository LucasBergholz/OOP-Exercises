package specialExercise01;

public class Employee {
	public String name;
	public int age, counter = 0;
	public double[] salaries;
	public double average = 0;

	public void printt() {
		System.out.println("The name is = " + this.name);
		System.out.println("The age is = " + this.age);
		System.out.println("The salaries are = ");

		for (double salary: salaries) {
			System.out.println(salary);
			average = average + salary;
			counter = counter + 1;
		}
		
		average = average/counter;
		
		System.out.println("The average of the salaries is = " + average);
		
	}
	
}
