import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println("_________________________________");
        task2();

    }
    private static void task2 (){
        PhoneBook pb1 = new PhoneBook(4343456, "someemail1@mail.ru");
        PhoneBook pb2 = new PhoneBook(8888888, "someemail2@mail.ru");
        PhoneBook pb3 = new PhoneBook(3547788, "someemail3@mail.ru");
        PhoneBook pb4 = new PhoneBook(1234567, "someemail4@mail.ru");
        PhoneBook pb5 = new PhoneBook(6789012, "someemail5@mail.ru");

        Person p1 = new Person("Ivanov");
        Person p2 = new Person("Petrov");
        Person p3 = new Person("Sidorov");
        Person p4 = new Person("Vasiliev");
        Person p5 = new Person("Ivanov");

        HashMap<Person,PhoneBook> personPhoneBook = new HashMap<>();
        personPhoneBook.put(p1,pb1);
        personPhoneBook.put(p2,pb2);
        personPhoneBook.put(p3,pb3);
        personPhoneBook.put(p4,pb4);
        personPhoneBook.put(p5,pb5);

        findPhone(personPhoneBook, "Ivanov");
        findEmail(personPhoneBook, "Sidorov");
    }
    private static void findPhone (HashMap<Person, PhoneBook> map, String surname){
        ArrayList<Integer> arr = new ArrayList<>();
        Set<Map.Entry<Person, PhoneBook>> set = map.entrySet();
        Iterator<Map.Entry<Person, PhoneBook>> iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Person, PhoneBook> e = iterator.next();
            if (e.getKey().getSurname()==surname){
                arr.add(e.getValue().getPhone());
            }
        }
        System.out.println(arr);
    }
    private static void findEmail (HashMap<Person, PhoneBook> map, String surname){
        ArrayList<String> arr = new ArrayList<>();
        Set<Map.Entry<Person, PhoneBook>> set = map.entrySet();
        Iterator<Map.Entry<Person, PhoneBook>> iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Person, PhoneBook> e = iterator.next();
            if (e.getKey().getSurname()==surname){
                arr.add(e.getValue().getEmail());
            }
        }
        System.out.println(arr);
    }

    private static void task1 (){
        String[] poem = {
                "я", "всегда", "твердил", "что", "судьба", "игра",
                "что", "зачем", "нам", "рыба", "раз", "есть", "икра",
                "что", "готический", "стиль", "победит", "как", "школа",
                "как", "способность", "торчать", "избежав", "укола",
                "я", "сижу", "у", "окна", "за", "окном", "осина",
                "я", "любил", "немногих", "однако", "сильно"
        };
        set_(poem);
        iterations(poem);
    }
    private static void set_ (String[] arr){
        Set<String> set = new HashSet<>();
        for (int i = 0; i < arr.length ; i++) {
            set.add(arr[i]);
        }
        System.out.println("word list: " + set);
    }
    private static void iterations (String[] arr) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);

            } else {
                map.put(arr[i], 1);
            }
        }
        System.out.println("Iterations: " + map);
    }

}
