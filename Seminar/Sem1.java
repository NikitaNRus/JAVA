import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;

public class Sem1 {
    public void main() throws Exception {
        
        // Integer a = 10; // намного лучше, чем просто int
        // String word = "Hello";
        // Boolean flag = true;
        // for (int i=0; i<10; i++){
        //     System.out.println(i+10);
        // }
        // System.out.println(word + ", world!");
        // Integer [] mass = {12,51,14,46,67,89,32};
        // for (Integer item: mass) {
        //     System.out.println(item);
        // }
        // HashMap<String, Integer> dist = new HashMap<String, Integer>();
        // for (Integer item: mass){
        //     if (item%2==0){
        //         System.out.println(item);
        //     }
        //     else{
        //         System.out.println("не четное ");
        //     }  
        // }
        // Scanner in = new Scanner(System.in);
        // String line = in.nextLine();
        // Integer x = Integer.parseInt(line);
        // System.out.println(line);
        // in.close();

        // Игра угадай число
        Boolean start = true;
        Integer count = 3;
        Scanner in = new Scanner(System.in);
        Integer number = new Random().nextInt(11);
        while (start ==true & count!=0){            
            System.out.println("Введите число от 1 до 10");
            String num = in.nextLine();
            Integer x = Integer.parseInt(num);
            if (x == number){
                System.out.println("Вы угадали число!");
                start = false;
            }
            else{
                System.out.println("Вы не угадали число!");
                start = true;
                count-=1;
                System.out.println("У вас осталось попыток: "+count);
                if (count == 0){
                    System.out.println("Загаданное число: "+number);
                }
            }
        }
        in.close();
    }
}




