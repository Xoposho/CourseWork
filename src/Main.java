
public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иван", "Добронравов", "Васильевич", 2, 40_000);
        employees[1] = new Employee("Марина", "Гнусмасова", "Петрова", 1, 35_000);
        employees[2] = new Employee("Максим", "Доигралес", "Олегович", 1, 20_000);
        employees[3] = new Employee("Сергей", "Мишустин", "Александрович", 3, 58_000);
        employees[4] = new Employee("Василий", "Задорнов", "Фёдорович", 5, 378_000);
        employees[5] = new Employee("Пётр", "Великий", "Станиславович", 2, 56_000);
        employees[6] = new Employee("Станислава", "Колозина", "Максимовна", 4, 123_000);
        employees[7] = new Employee("Мария", "Оленникова", "Артёмовна", 1, 34_000);
        employees[8] = new Employee("Людмила", "Державина", "Сергеевна", 2, 56_000);
        employees[9] = new Employee("Хасан", "Рзаев", "Заникович", 3, 89_000);


        EmployeeActions.showAllEmployee(employees);
        EmployeeActions.showSalaryCostsForMonth(employees);
        EmployeeActions.showMinSalaryEmployee(employees);
        EmployeeActions.showMaxSalaryEmployee(employees);
        EmployeeActions.showAvgSalaryCostsForMonth(employees);
        EmployeeActions.showFirstSecondLastName(employees);
    }
}
