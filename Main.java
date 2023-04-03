public class Main {
    public static void main(String[] args) {

        // Создаем 4 экземпляра класса Person для работы с ними.
        // node1 - родитель для node2
        // node2 - родитель для node3 и node4
        Person men1 = new Person("First","Man");
        Person men2 = new Person("Second","Man", men1);
        Person men3 = new Person("Third","Man", men2);
        Person men4 = new Person("Fourth","Man", men2);

        System.out.println("Перечень людей: " + Person.getPersons());

        System.out.println("Дети человека 1: " + men1.getChildren());
        System.out.println("Дети человека 2: " + men2.getChildren());
        System.out.println("Дети человека 3: " + men3.getChildren());

        System.out.println();

        System.out.println("Родители человека 1: " + men1.getParent());
        System.out.println("Родители человека 2: " + men2.getParent());
        System.out.println("Родители человека 3: " + men3.getParent());
        System.out.println("Родители человека 4: " + men4.getParent());
    }
}
