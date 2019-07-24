import java.util.*;

public class Main {
    public static void main(String[] args) {
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
    public static void iterations (String[] arr) {
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
