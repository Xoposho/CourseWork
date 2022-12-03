public class EmployeeActions {

    public static void showAllEmployee(Employee[] employees) {
        for (Employee i : employees) {
            System.out.println(i);
            Employee.id++;
        }
    }

    public static void showSalaryCostsForMonth(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        System.out.println("Сумма трат на зарплаты в месяц: " + sum + " рублей.");
    }

    public static void showMinSalaryEmployee(Employee[] employees) {
        int min = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() < min) {
                    min = employees[i].getSalary();
                    Employee.id = i;
                }

            }
        }
        System.out.println("Минимальная зарплата сотрудника " + employees[Employee.id].getSecondName() + " " + employees[Employee.id].getFirstName() + " " + employees[Employee.id].getLastName() + " составляет " + min + " рублей. ");
    }

    public static void showMaxSalaryEmployee(Employee[] employees) {
        int max = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() > max) {
                    max = employees[i].getSalary();
                    Employee.id = i;
                }

            }
        }
        System.out.println("Максимальная зарплата сотрудника " + employees[Employee.id].getSecondName() + " " + employees[Employee.id].getFirstName() + " " + employees[Employee.id].getLastName() + " составляет " + max + " рублей. ");
    }

    public static void showAvgSalaryCostsForMonth(Employee[] employees) {
        int sum = 0;
        int countEmployee = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
                countEmployee++;
            }
        }
        System.out.println("Среднее значение зарплат: " + sum / countEmployee  + " рублей.");
    }

    public static void showFirstSecondLastName(Employee[] employees) {
        System.out.println("Список сотрудников:");
        for (Employee i : employees) {
            System.out.println(i.secondName + " " + i.lastName + " " + i.lastName);
        }
    }
}
