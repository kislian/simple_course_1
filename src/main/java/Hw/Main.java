package Hw;
import java.util.Scanner;
import java.io.IOException;
public class Main {
    static Employee[] employees = new Employee[10];
    static String[] wordListSecond = {"Джонсон", "Уильямс", "Джонс", "Браун", "Дэвис", "Миллер", "Уилсон",
            "Мур", "Тейлор", "Андерсон", "Томас", "Джексон", "Уайт", "Харрис", "Мартин", "Томпсон",
            "Гарсиа", "Мартинес", "Робинсон", "Кларк", "Родригес", "Льюис", "Клинтон", "Трамп", "Буш", "байден"};
    static String[] wordListFirst = {"Джон", "Роберт", "Майкл", "Вильям", "Дэвид", "Ричард", "Чарльз", "Джозеф",
            "Томас", "Кристофер", "Даниэль", "Пол", "Марк", "Дональд", "Джордж", "Кеннет", "Стивен", "Эдвард",
            "Брайан", "Рональд", "Энтони", "Кевин", "Джейсон", "Мэтью", "Дэнни", "Билл"};
    void inicial() {
        for (int i = 0; i < employees.length; i++) {
            int firstLentgh = wordListFirst.length;
            int secondLentgh = wordListSecond.length;
            int rand1 = (int) (Math.random() * firstLentgh);
            int rand2 = (int) (Math.random() * secondLentgh);
            String phase = wordListFirst[rand1] + " " + wordListSecond[rand2];
            employees[i] = new Employee(phase, (int) (Math.random() * 20000) +10000, (int) (Math.random() * 5) + 1);
        }
    }

    public static void main(String[] args) {
        Main start = new Main();
        start.inicial();
        printEmployee();
        System.out.println("Минимальная зарплата у сотрудника " + personMinSalaryEmployee() + " и составляет " + minSalaryEmployee());
        System.out.println("Максимальная  зарплата у сотрудника " + personMaxSalaryEmployee() + " и составляет " + maxSalaryEmployee());

        System.out.println("сумму затрат на ЗП в месяц=" + getSalarySum());
        System.out.println("среднее значение зарплат=" + avarageSalaryEmployee());

        printEmploeesFullName();
        //????????????????????Почему не работает ?????????????????????????
        System.out.print("\033[H\033[2J");
        System.out.flush();
        // Какой класс нужно подключить
        // new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    private static void printEmployee() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    private static int minSalaryEmployee() {
        int minSalaryEmployee = employees[0].getSalaryOfEmployee();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalaryOfEmployee() < minSalaryEmployee) {
                minSalaryEmployee = employees[i].getSalaryOfEmployee();
            }
        }
        return minSalaryEmployee;
    }

    private static String personMinSalaryEmployee() {
        int minSalaryEmployee = employees[0].getSalaryOfEmployee();
        String personMinSalary = employees[0].getFullNameOfEmployee();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalaryOfEmployee() < minSalaryEmployee) {
                minSalaryEmployee = employees[i].getSalaryOfEmployee();
                personMinSalary = employees[i].getFullNameOfEmployee();
            }
        }
        return personMinSalary;
    }

    private static int maxSalaryEmployee() {
        int maxSalaryEmployee = employees[0].getSalaryOfEmployee();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalaryOfEmployee() > maxSalaryEmployee) {
                maxSalaryEmployee = employees[i].getSalaryOfEmployee();
            }
        }
        return maxSalaryEmployee;
    }

    private static String personMaxSalaryEmployee() {
        int maxSalaryEmployee = employees[0].getSalaryOfEmployee();
        String personMaxSalary = employees[0].getFullNameOfEmployee();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalaryOfEmployee() > maxSalaryEmployee) {
                maxSalaryEmployee = employees[i].getSalaryOfEmployee();
                personMaxSalary = employees[i].getFullNameOfEmployee();
            }
        }
        return personMaxSalary;
    }

    private static void printEmploeesFullName() {

        for (Employee employee : employees) {
            System.out.println("ФИО сотрудника=>" + employee.getFullNameOfEmployee());
        }
    }

    private static double avarageSalaryEmployee() {

        return (double) (getSalarySum() / employees.length);

    }

    private static int getSalarySum() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalaryOfEmployee();
        }
        return sum;
    }
}
