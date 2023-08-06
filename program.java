import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
public class program{
    public static void main(String[] args) throws Exception {
        System.out.println("bye world");
        String s = " 2";
        String a = null;
        System.out.println(s);
        int salary = 123456;
        short age = 10;
        System.out.println(salary);
        System.out.println(age);
        float e = 2.7f;
        double pi = 3.1415;
        char ch = 'n';
        int c = 13;
        double d = c;
        boolean flag2 = 123 <=124;
        boolean f = true && false;
        boolean fd = true ^ true;
        String mag = "Hello world";
        var i = 123;
        System.out.println(Integer.toString(i++));
        System.out.println(Integer.toString(i));
        System.out.println(Integer.toString(++i));
        String ss = "qwer";
        s.length();
        s.charAt(1);
        int ap = 18;
        System.out.println(ap<<1);
        // 1000
        
        // Операции

        // Массивы
        int [] arr = new int[10];
        System.out.println(arr.length);
        arr = new int[]{1,2,3,4,5};
        System.out.println(arr.length);
        System.out.println(arr[3]);
        arr[3]=13;
        
        int[]brr[] = new int[3][5];
        for (int z = 0; z < brr.length;z++){
            for (int j = 0; j < brr[z].length; j++){
                System.out.printf("%d",brr[z][j]);
            }
            System.out.println();
        }
        // Преобразование

        // поулчение данных из терминала
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();

        // проверка на соответствие получаемого типа
        // Scanner pScanner = new Scanner(System.in);
        // System.out.printf("int p: ");
        // boolean flag = pScanner.hasNextInt();
        // System.out.println(flag);
        // int p  = pScanner.nextInt();
        // System.out.println(p);
        // pScanner.close();

        //
        s = "qwe";
        c = 123;
        String q = s+c;
        System.out.println(q);
        System.out.printf("%d + %d = %d \n", i, c, i+c);

        // операторы выбора
        int value = 1;
        int mounth = value;
        String text = "";
        switch(mounth) {
            case 1:
                text = "Autumn";
                break;
            case 2:
            case 3:
                text = "January";
                break;
            default:
                text = "mistake";
                break;
        }
        System.out.println(text);
        iScanner.close();


         lib.sayHi();

         // тернарный оператор
         c =1;
         int b = 2;
         int min = c < b ? c:b; // если условие выполняется, то вернется b 
         System.out.println(min);

        // Циклы
        value = 321;
        int count = 0;
        while (value !=0){
            value/=10;
            count++;
        }
        System.out.println(count);
        for (int j=0; j<10;j++){
            if (j%2 == 0){
                continue;
            }   
            System.out.println(j);
        }
        int [] arr1 = new int[] {1,2,3,4,5,77};
        for (int item: arr1){
            System.out.println(item);
        }
        // Работа с файлами
        // Создание и дозапись
        try (FileWriter fw = new FileWriter("file.txt", false)){
            fw.write("line 1");
            fw.write("\n");
            fw.write("line 2");
            fw.write("\n");
            fw.write("line 3");
            fw.write("\n");
            fw.flush();
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        // Чтение, посимвольно
        FileReader fr = new FileReader("file.txt");
        int o;
        while ((o=fr.read()) != -1){
            ch = (char) o;
            if (ch == '\n'){
                System.out.println(ch);
            }
            else{
                System.out.println(ch);
                }
            }
        // Чтение построчно
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str;
        while((str = br.readLine()) != null){
            System.out.printf("== %s ==\n", str);
        }
        br.close();
    }
}

            
        

       
// типы данных - примитивные (bool, int, short, long, float) и ссылочные (массивы)
// тип идентификатор;
// идентификатор = значение