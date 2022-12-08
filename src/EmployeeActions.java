public class EmployeeActions {

    public static void showAllEmployee(Employee[] employees) {
        for (Employee i : employees) {
            System.out.println(i);
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
        int idEmployee = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() < min) {
                    min = employees[i].getSalary();
                    idEmployee = i;
                }

            }
        }
        assert employees[idEmployee] != null;
        System.out.println("Минимальная зарплата сотрудника " + employees[idEmployee].getSecondName() + " " + employees[idEmployee].getFirstName() + " " + employees[idEmployee].getLastName() + " составляет " + min + " рублей. ");
    }

    public static void showMaxSalaryEmployee(Employee[] employees) {
        int max = employees[0].getSalary();
        int idEmployee = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() > max) {
                    max = employees[i].getSalary();
                    idEmployee = i;
                }

            }
        }
        assert employees[idEmployee] != null;
        System.out.println("Максимальная зарплата сотрудника " + employees[idEmployee].getSecondName() + " " + employees[idEmployee].getFirstName() + " " + employees[idEmployee].getLastName() + " составляет " + max + " рублей. ");
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
            System.out.println(i.getSecondName() + " " + i.getFirstName() + " " + i.getLastName());
        }
    }
}
// by Igor