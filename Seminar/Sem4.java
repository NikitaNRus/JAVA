// Принимает от пользователя строку вида text~num
// Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.

import java.util.LinkedList;
import java.util.Scanner;

public class Sem4 {
    public static void main(String[] args) {
        Integer start=1;
        LinkedList<String> list = new LinkedList<String>();
        Scanner in = new Scanner(System.in);
        while (start == 1){ 
            System.out.println("Введите строку вида 'text~num' или 'print-num'");
            String text = in.nextLine();
            String [] textSplit = text.split("~");
            Integer num = Integer.parseInt(textSplit[1]);
            if (textSplit[0].equals("print")){
                System.out.println(list.get(num));
                list.remove(list.get(num));
                System.out.println(list);
                start=0;
                in.close();
            }
            else{
                list.add(num,textSplit[0]);
                System.out.println(list);
            }
                
        }
            
    }
}
