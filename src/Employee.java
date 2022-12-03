public class Employee {
    final String firstName;
    final String secondName;
    final String lastName;
    int department;
    int salary;
    static int id = 1;

    Employee(String firstName, String secondName, String lastName, int department, int salary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public static int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID:" + Employee.id + ". Ф.И.О. - " +  lastName+ " " + firstName + " " + secondName + " Отдел: " + department + ". Зарплата: " + salary;
    }
}
