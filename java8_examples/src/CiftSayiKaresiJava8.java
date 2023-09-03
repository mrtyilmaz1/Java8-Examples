import java.util.Arrays;
import java.util.List;

public class CiftSayiKaresiJava8 {

    //Java 8 ile Bir liste içindeki çift sayıları filtreleyen ve bu çift sayıların karelerini hesaplayan bir Java programı yazın.

    public static void main(String[] args) {

        List<Integer> sayilar = Arrays.asList(1, 2, 3, 4, 5,6,7,8,9,10);

        sayilar.stream()
                .filter(e -> e % 2 == 0)
                .map(e -> e*e).forEach(System.out::println);



    }

}
