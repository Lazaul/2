public class Person {
    private String name;
    private int age;
    private boolean married;


    public Person(String name, Integer age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }

    public String getName() {
        return "This peron's name is " + name;
    }

    public String getAge() {
        return "This person is " + age + " years old.";
    }

    public String isMarried() {
        if (married == true){
            return "This person is married.";
        }else{
            return "This person is not married.";
        }
    }
}
