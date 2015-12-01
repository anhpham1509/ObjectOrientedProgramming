package CompositePattern.Demo;

public class CompositePatternDemo {

    public static void main(String[] args) {

        Employee President = new Employee("Anh","President", 58000);

        Employee Manager1 = new Employee("Duy","Programming Manager", 32000);

        Employee Manager2 = new Employee("Pham","Testing Manager", 26000);

        Employee Programmer1 = new Employee("Hieu","Programming", 15000);
        Employee Programmer2 = new Employee("Tri","Programming", 12000);

        Employee Tester1 = new Employee("Hoang","Testing", 6000);
        Employee Tester2 = new Employee("Minh","Testing", 5000);

        President.add(Manager1);
        President.add(Manager2);

        Manager1.add(Programmer1);
        Manager1.add(Programmer2);

        Manager2.add(Tester1);
        Manager2.add(Tester2);

        //print all employees of the organization
        System.out.println(President);

        for (Employee headEmployee : President.getSubordinates()) {
            System.out.println(headEmployee);

            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}
