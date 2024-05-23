public class Main {
    public static void main(String[] args){
        Person myFirstPerson = new Person ("Cornelius Maximus", 24, true);
        System.out.println("Your person's stats are:");
        System.out.println(myFirstPerson.getName());
        System.out.println(myFirstPerson.getAge());
        System.out.println(myFirstPerson.isMarried());



    }
}