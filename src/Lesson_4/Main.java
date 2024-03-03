package Lesson_4;

import java.util.Objects;

public class Main {
    public Main() {

    }

    public static void main(String[] args) {
        Employee person = new Employee("Andrew Homenok", "Engineer", "a.homenok@mail.ru", "+3751122334455", 4000, 27);
       // System.out.println(person);
        person.infoEmployee();
        System.out.println();
        Employee[] persArray = new Employee[]{new Employee("Ivan Ivanov", "Department head", "i.ivanov@mail.ru", "+375293344455", 4500, 32), new Employee("Petr Petrov", "Worker", "p.petrov@mail.ru", "+375445577889", 1500, 35), new Employee("Sidor Sidorov", "Chief Specialist", "s.sidorov@mail.ru", "+375441010998", 2000, 29), new Employee("Anna Berezkina", "Leading Specialist", "a.berezkina@gmail.com", "+375299988776", 1800, 34), new Employee("Tatiana Ryabinina", "Chief Accountant", "t.ryabinina@gmail.com", "+375445566778", 3000, 39)};


        for(int i = 0; i < 5; ++i)
            {
                //System.out.println(persArray[i]);
                persArray[i].infoEmployee();
            }

        System.out.println();
        Park parkGomel = new Park();
        Park.Attraction attraction1 = parkGomel.new Attraction("Ромашка", 5, 3.1);
        Objects.requireNonNull(parkGomel);
        Park.Attraction attraction2 = parkGomel.new Attraction("Колесо обозрения", 10, 5.1);
        Objects.requireNonNull(parkGomel);
        Park.Attraction attraction3 = parkGomel.new Attraction("Цепные качели", 7, 2.15);
        Park.printPark();
        System.out.println(attraction1);
        System.out.println(attraction2);
        System.out.println(attraction3);
    }

}
