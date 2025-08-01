
public class oops1 {
    class Employee{
        int salary;
        String name;
        public int getSalary(){
            return salary;

        }
        public String getName(){
            return name;
        }
        public void setName(String n){
            name=n;
        }
    }
    public void main(String[] args) {
        Employee emp1=new Employee();
        emp1.salary=40;
        emp1.setName("Vishwajeet");
        System.out.println(emp1.salary);

    }

}
