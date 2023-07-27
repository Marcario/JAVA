
public class Person {
    private String name;
    private int age;

//    constructors
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


//    getters and setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    //creating a main class and call the function
    public static void main(String[] args) {
//        creating an instance for class Person
        Person person1 = new Person("Nelson", 27);
        Person person2 = new Person("Tina", 21);
//initial
        System.out.println("Person 1 - Name: " + person1.getName() + ", Age: " + person1.getAge());
        System.out.println("Person 2 - Name: " + person2.getName() + ", Age: " + person2.getAge());

//  MODIFYING
        System.out.println("before updating");
        person1.setName("Emmanuel");
        person1.setAge(28);

        System.out.println("Person1 - Name :" + person1.getName()+ ",Age: " +person1.getAge());


    }

}

