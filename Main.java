package Home_Work2;

public class Main {
    public static void main(String[] args) {

        Person grandMotherM = new Person("Алевтина", 61);
        Person grandFatherM = new Person("Иван", 63);
        Person grandMotherF = new Person("Клара", 60);
        Person grandFatherF = new Person("Иннокентий", 63);
        Person mother = new Person("Ольга", 30, grandMotherM, grandFatherM);
        Person father = new Person("Сергей", 35, grandMotherF, grandFatherF);
        Person son = new Person("Антон", 15, mother, father);
        Person son2 = new Person("Андрей", 14);
        son2.setFather(father);
        son2.setMother(mother);
        Person son3 = new Person("Bob", 12, mother, father);


        father.printInfo(father);
        System.out.println("------------------------");
        son.printInfo(son);
        System.out.println("------------------------");

        Closet closet = new Closet();
        Human Bob = new Person("Bob", 32);
        ((Person) Bob).printInfo((Person) Bob);
        ((Person) Bob).toInteract(Bob, closet);
        if (closet.getState() == Closet.State.Open) {
            System.out.println("Bob opened the closet");
        }
        if (closet.getState() == Closet.State.Close) {
            System.out.println("Bob closed the closet");
        }
        System.out.println("------------------------");


        Animal cat = new Cat("Barsik");
        ((Cat) cat).printInfo((Cat) cat);
        ((Person) Bob).toInteract(Bob, cat);
    }
}

/* Класс Person наследуется от Human, Cat наследуется от Animal. Взаимодействие Human с объектами Closet b Animal
осуществляется при помощи интерфейса Interactive. Интерфейс Info общий для Person и Cat содержит методы для вывода
информации и записи ее в файл. Validator содержит некоторую логику проверки для заполнения полей Person.


*/
