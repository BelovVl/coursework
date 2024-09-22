public class Main {
    private static Employee[] employee = new Employee[10];

    public static void main(String[] args) {
        employee[0] = new Employee("SurName1 Name1 Patronomic1", 1, 35000f);
        employee[1] = new Employee("SurName2 Name2 Patronomic2", 2, 30000f);
        employee[2] = new Employee("SurName3 Name3 Patronomic3", 3, 25000f);
        employee[3] = new Employee("SurName4 Name4 Patronomic4", 4, 40000f);
        employee[4] = new Employee("SurName5 Name5 Patronomic5", 5, 45000f);
        employee[5] = new Employee("SurName6 Name6 Patronomic6", 1, 45500f);
        employee[6] = new Employee("SurName7 Name7 Patronomic7", 2, 40500f);
        employee[7] = new Employee("SurName8 Name8 Patronomic8", 3, 50000f);
        employee[8] = new Employee("SurName9 Name9 Patronomic9", 4, 50500f);
        employee[9] = new Employee("SurName10 Name10 Patronomic10", 5, 65500f);
        //
        print();
        System.out.println(" ");
        System.out.println("Сумма трат на заработную плату сотрудников: " + sumSalary());
        System.out.println(" ");
        System.out.println("Сотрудник с минимальной заработной платой: " + minSalary());
        System.out.println(" ");
        System.out.println("Сотрудник с максимальной заработной платой: " + maxSalary());
        System.out.println(" ");
        System.out.println("Среднее значение заработной платы: " + averageSalary());
        System.out.println(" ");
        printFIO();
    }


    //
    private static void print() {
        for (int i = 0; i < employee.length; i++) {
            if (employee != null) {
                System.out.println(employee[i]);
            }
        }
    }

    //
    private static int sumSalary() {
        int sum = 0;
        for (Employee salary : employee) {
            sum += salary.getSalary();
        }
        return sum;
    }

    //
    private static int minSalary() {
        int minSalary = (int) employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < minSalary) {
                minSalary = (int) employee[i].getSalary();
            }
        }
        return minSalary;
    }

    //
    private static int maxSalary() {
        int maxSalary = (int) employee[0].getSalary();
        for (int i = 1; i < employee.length; i++) {
            if (employee[i].getSalary() > maxSalary) {
                maxSalary = (int) employee[i].getSalary();
            }
        }
        return maxSalary;
    }

    //
    private static int averageSalary() {
        int sum = sumSalary();
        int averageSum = sum / employee.length;
        return averageSum;
    }

    //
    private static void printFIO() {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getFIO());
        }
    }
}