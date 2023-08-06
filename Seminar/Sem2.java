import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Sem2 {
    public static void WriteFile(ArrayList<String> words){
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("Note1.txt"))){
            bw.write("Hello");
            for (String string : words) {
                bw.append(string+ "\n");
            } 
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    public static ArrayList<String> ReadFile(){
        ArrayList<String> words = new ArrayList<String>();
        try(BufferedReader br = new BufferedReader(new FileReader("Note1.txt"))){
            String c;
            while((c=br.readLine())!= null){
                words.add(c);
                //System.out.println(c);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return words;
    }
    public static void main(String[] args) {
        ArrayList<String> words = ReadFile();
        System.out.println(words.get(0));
        words.set(1, "hello, world");
        System.out.println(words.get(1));
        words.remove(2);
        System.out.println(words);
        WriteFile(words);
    }
}
