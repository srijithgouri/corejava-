package Encapsulation;

public class MainClass {

	public static void main(String[] args) {
		Employee employee = new Employee();

		employee.setEmpId(108);
		employee.setName("srijith");
	//	employee.setPhone(9505533240L);
		employee.setEmail("srijithgouri2@gmail");
		System.out.println(employee.getEmpId());
		System.out.println(employee.getName());
		System.out.println(employee.getPhone());
		System.out.println(employee.getEmail());
	}

}
