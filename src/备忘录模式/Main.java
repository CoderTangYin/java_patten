package 备忘录模式;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("詹姆斯","man", 35);

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(person.createMemento());
        person.dis();

        person.setName("戴维斯");
        person.setSex("man");
        person.setAge(29);
        person.dis();

        person.setMemento(caretaker.getMemento());

        person.dis();





    }



}
