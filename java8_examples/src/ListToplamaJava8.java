import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;


public class ListToplamaJava8 {
    // Java 8 ile bir liste (List) içindeki sayıların toplamını hesaplayan bir Java programı yazın.
    // (List'i elinizle oluşturabilirsiniz. Arrays.asList(....))


    public static void main(String[] args) {


        Supplier<Integer> rndNumber = () -> new Random().nextInt(0,101);

        List<Integer> list = Stream.generate(rndNumber).limit(10).toList(); // Random oluşan sayıları listenin içine atıyoruz.

        System.out.println(list);

        int toplam =  list.stream()
                .mapToInt(Integer::intValue) //Toplama işlemi için mapToInt ile Stream olan değişkenleri int yaptık.
                .sum();


        System.out.println(toplam);







    }
}
