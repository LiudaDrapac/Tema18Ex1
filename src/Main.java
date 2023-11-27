import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<String> angazati = new ArrayList<>();
        angazati.add(23, String.valueOf(34.6));
        angazati.add(30, String.valueOf(65.2));
        angazati.add(22, String.valueOf(100.6));
        angazati.add(35, String.valueOf(69.8));
        angazati.add(43, String.valueOf(35.6));
        angazati.add(30, String.valueOf(65.2));
        angazati.add(21, String.valueOf(34.6));
        angazati.add(33, String.valueOf(65.2));

        List<String> rezultat = angazati.stream()
                .filter((a) -> a.contains("25"))
                .collect(Collectors.toList());
        System.out.println(rezultat);




            }
}