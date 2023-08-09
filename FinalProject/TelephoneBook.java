package FinalProject;

// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.
import java.util.*;


public class TelephoneBook {

    public static void SortedPrint(Map<String, ArrayList> map) {
        Set<String> keySet = map.keySet();
        int maxCount = 0;
        int minCount = 1_000_000;
        // Находим минимальное и максимальное значение
        for (var item : map.entrySet()) {
            if (maxCount < item.getValue().size())
                maxCount = item.getValue().size();
            if (minCount > item.getValue().size())
                minCount = item.getValue().size();
            }
        // Формируем стек, начиная с минимального количества номеров 
        Stack<String> st = new Stack<>();
        int num = minCount;
        while (num <= maxCount) {
            // System.out.println(map);
            for (var item : map.entrySet()) {
                if (item.getValue().size() == num) {
                    st.push(item.getKey());
                }  
            }
            num += 1;
        }
        // Распечатываем пары в порядке ключей, находящихся в стеке
        String name;
        for (int i = 0; i < keySet.size(); i++) {
            name = st.pop();
            for (var item : map.entrySet()) {
                if (name == item.getKey()) {
                    System.out.printf("%8s: ", item.getKey());
                    System.out.println(item.getValue());
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Инициализация начального списка
        Map<String, ArrayList> abon = new HashMap<>() {
            {
                put("Романов Иван", new ArrayList<Integer>() {
                    {
                        add(892045434);
                        add(891678920);
                        add(896783292);
                    }
                });
                put("Плюшкин Максим ", new ArrayList<Integer>() {
                    {
                        add(896783222);
                    }
                });
                put("Жуков Алексей", new ArrayList<Integer>() {
                    {
                        add(896213292);
                        add(892563222);

                    }
                });
                put("Ягодкин Антон", new ArrayList<Integer>() {
                    {
                        add(896290292);
                        add(894513221);
                        add(896223980);
                        add(896321392);
                    }
                });
            }
        };
        System.out.println();
        // Печатаем исходный набор данных
        System.out.println("Исходные данные: ");
        SortedPrint(abon);

        // Создаем циклическое меню
        Scanner scan = new Scanner(System.in, "cp866");
        Boolean getOut = false;
        String st;
        while (!getOut) {
            System.out.println("Введите номер действия (1 - добавить абонента, 9 - выйти из программы):");
            st = scan.nextLine();
            String name = "";
            String phString;
            switch (st) {
                case "1": {
                    System.out.println("Введите фамилию и имя абонента абонента:");
                    name = scan.nextLine();
                    if (abon.containsKey(name)) {
                        System.out.println("Такие фамилия и имя уже есть. Введите другие фамилию и имя!");
                        System.out.println();
                        break;
                    } else {
                        System.out.println("Введите номера телефонов через запятую: ");
                        phString = scan.nextLine();
                        String[] arr = phString.split(",");
                        ArrayList<Integer> arrInt = new ArrayList<>();
                        for (String item: arr) {
                            arrInt.add(Integer.parseInt(item.trim())) ;
                        }
                        abon.put(name, arrInt);
                        System.out.println();
                        SortedPrint(abon);
                        break;
                    }
                }
                case "9": {
                    getOut = true;
                    System.out.println();
                    System.out.println("До свидания!");
                    System.out.println();
                    break;
                }   


            }
        }

    }
}
