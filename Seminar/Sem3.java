import java.util.ArrayList;
class People{
    String Name;
    Integer Age;
    People(String name, int age){
        Name = name;
        Age = age;
    }
}

public class Sem3 {
    public static void main(String[]args) {
        People p1 = new People("Vlad",30);
        People p2= new People("Ivan", 12);
        ArrayList<People> people = new ArrayList<People>();
        people.add(p1);
        people.add(p2);
        for (People p: people){
            System.out.println("Hello, " + p.Name);
        }
        


        // ArrayList<String> people = new ArrayList<String>();
        // people.add("Vlad");
        // people.add("Ivan");
        // people.add(1, "Vasya");
        // System.out.println(people);
        // System.out.println(people.get(1));
        // people.set(0, "Nikita");
        // System.out.println(people);
        // for(String item: people){
        //     System.out.println("Hello, "+ item);
        // }
        // if(people.contains("Vlad")){
        //     System.out.println("Привет!");
        // } else{
        //     System.out.println("Такого имени нет");
        // } 
        // System.out.println(people.size()); // Посмотреть длину массива
        // people.remove(0);
        // people.remove("Vlad");
    }
}
