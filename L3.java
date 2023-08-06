import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class L3 {
    public static void main(String[]args) {
        Object o = 1;
        GetType(o);
        o = 1.2;
        GetType(o);
        System.out.println(Sum(1.2,2.1));

        int [] a = new int [] {1,9};
        int [] b = new int [3];
        System.arraycopy(a, 0, b, 0, a.length); // из массива а в массив b скопировать данные с 0 элемента на всю длину
        for (int i: a){System.out.printf("%d", i);}
        for (int j: b){System.out.printf("%d", j);}

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2890);

        StringBuilder day = new StringBuilder("23");
        StringBuilder month = new StringBuilder("02");
        StringBuilder year = new StringBuilder("1999");
        StringBuilder [] date = new StringBuilder[]{day, month, year};
        List<StringBuilder> d = Arrays.asList(date);
        System.out.println(d);
        date[1] = new StringBuilder("2");
        System.out.println(d);
        List<Integer> new_list = List.of(1,2,3,4,56,78);
        Iterator<Integer> col = list.iterator();
        System.out.println();
        while (col.hasNext()){
            System.out.println(col.next());
        }

    }
    static void GetType(Object obj){
        System.out.println(obj.getClass().getName());
    }
    static Object Sum(Object a, Object b){
        if (a instanceof Double && b instanceof Double){
            return (Object)((Double) a + (Double)b);
        }
        else if(a instanceof Integer && b instanceof Integer){
            return (Object)((Integer) a + (Integer) b);
        } else return 0;
    }
    static int [] AddItem(int[] array, int item){
        int length = array.length;
        int [] temp = new int[length + 1];
        System.arraycopy(array, 0, temp, 0, length);
        temp[length] = item;
        return temp;
    }
}
