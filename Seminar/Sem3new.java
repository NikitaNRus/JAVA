import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String Name;
    String Author;
    String Presense;
    Book(String name, String author, String presense){
        Name = name;
        Author = author;
        Presense = presense;
    }
}


public class Sem3new {
    public static ArrayList<String> ReadLine(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя автора");
        String author = in.nextLine();
        System.out.println("Введите название книги");
        String name = in.nextLine();
        ArrayList<String> array = new ArrayList<String>();
        array.add(name);
        array.add(author);
        return array;
    }
    public static Boolean CheckBook(ArrayList<String> array, ArrayList<Book> book){
        for (Book b: book){
            if (b.Name == array.get(0) & b.Author == array.get(1)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Boolean start = true;
        ArrayList<Book> book = new ArrayList<Book>();
        while (start==true){
            ArrayList<String> array= ReadLine();
            Boolean presense = CheckBook(array, book);
            if (presense == false){
                array.add(presense.toString(false));
                Book b = new Book(array.get(0),array.get(1), array.get(2));
                book.add(b);
                for (Book bk: book){
                    System.out.println(bk.Name + " "+ bk.Author);
                }
            }
            else{
                System.out.println("Такая книга уже есть!");
                for (Book b: book){
                    System.out.println(b.Name + " "+ b.Author);
                }
            }
            Scanner in = new Scanner(System.in);
            System.out.println("Закрыть программу - y/n?");
            String ans = in.nextLine();
            if (ans.equals("y") ){
                start = false;
                in.close();
            }
        }
    }
}
