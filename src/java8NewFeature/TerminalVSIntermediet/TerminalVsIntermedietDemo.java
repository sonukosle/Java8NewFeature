package java8NewFeature.TerminalVSIntermediet;

import java.util.Arrays;
import java.util.List;

public class TerminalVsIntermedietDemo {
    public static void main(String[] args) {

        Employee e1 = new Employee(1, "code1");
        Employee e2 = new Employee(2, "code2");
        Employee e3 = new Employee(3, "code3");
        Employee e4 = new Employee(4, "code4");
        Employee e5 = new Employee(5, "code5");

        List<Employee> employees = Arrays.asList(e1, e2, e3, e4, e5);

        employees.stream().filter(e -> e.getId() % 2 == 0).map(e -> {

            e.printName();
            return e.getName();
        }).forEach(e -> System.out.println( "At last : "+e));

    }


    static class Employee {

        private int id;
        private String name;

        public Employee(int id, String name) {
            super();
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        public void printName() {
            System.out.println("employee name from printmethod : " + name);
        }
    }


}
