import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sem2new {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String stop = "end";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("Note1.txt"))){
            while (true){
                System.out.println("Введите, что хотите записать");
                String action = in.nextLine();
                if (!action.equals(stop)){
                    bw.write(action);
                    }
                else{
                    System.out.println("Конец");
                    break; 
                    }
                }
            in.close();
            }
        catch(IOException ex){
            System.out.println(ex.getMessage());
            }
        }
    }

