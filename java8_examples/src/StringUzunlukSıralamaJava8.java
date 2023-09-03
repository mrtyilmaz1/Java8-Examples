import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringUzunlukSıralamaJava8 {

    //Java 8 ile Bir metin dizisi içindeki kelimelerin uzunluklarına göre sıralandığı bir Java programı yazın.
    // (Arrays.asList("Java", "Python", "C++", "JavaScript", "Ruby") gibi bir list oluşturup);

    public static void main(String[] args) {

        List<String> kelimeler = Arrays.asList("Java", "Python", "C++", "JavaScript", "Ruby");

        kelimeler.stream()
                .sorted(Comparator.comparing(String::length))
                // Comparator.comparing(String::length) kelimelerin uzunlukları için gerekli.
                // Eğer sadece .sorted kullanırsak baş harflerine göre sıralayacaktır.
                .forEach(System.out::println);

    }

}
