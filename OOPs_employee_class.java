class Employee{
    int salary;
    String name;
    public int getSalary()
    {
        return salary;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name=n;
    }

}


public class OOPs_employee_class {
    public static void main(String[] args) {
        Employee obj=new Employee();
        obj.setName("Shubhi");
        obj.salary=23;

        int sal=obj.getSalary();
        String name=obj.getName();
        System.out.println("Name: "+name+", Salary: "+sal);
    }
}
