package 备忘录模式;

public class Person {

    private String name;
    private String sex;
    private int age;

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 创建备份
    public Memento createMemento() {
        return new Memento(name, sex, age);
    }

    public void setMemento(Memento memento) {
        name = memento.getName();
        sex = memento.getSex();
        age = memento.getAge();
    }


    public void dis() {
        System.out.println("namme" + name + "__  age" + age + "__  sex" + sex);
    }

}
