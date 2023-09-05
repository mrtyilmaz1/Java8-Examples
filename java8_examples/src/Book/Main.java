package Book;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

   /* -Bir Book class'ımız olsun (public class Book )
            - Bu classımızın 2 tane field'ı olsun. (title , author)
            - Main methodundan 3-4 tane Book oluşturun (new Book("Suç ve Ceza", "Dostoyevski") .... (bunu sanki veritabanından çekiyormuşuz gibi elimzle oluşturacağız, veritabanını öğrendiğimizde veritabanından çekeceğiz bunu..)
            - daha sonra kullanıcıdan bir Yazar adı(author) alın. ( elinle String author = "Dostoyevski" ve benzeri bişey gireiblirsin veya Scanner kullanabilirsin.)
            - Java8 Stream yapısı kullanarak bu author elimizde var ise, yazdığı kitap adını(getTitle) , bilgisini dönelim.
            - Yani burada Stream, Filter ve Map kullanmamız gerekebilir*/
    public static void main(String[] args) {

        Book book1 = new Book("Suç ve Ceza" , "Dostoyevski");
        Book book2 = new Book("Sherlock Holmes" , "Sir Arthur Conan Doyle");
        Book book3 = new Book("İçimizdeki Şeytan" , "Sabahattin Ali");
        Book book4 = new Book("Cesur Yeni Dünya" , "Aldous Huxley");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Yazar adını giriniz: ");
        String author = scanner.nextLine();

        List<String> books = Stream.of(book1, book2, book3, book4)
                .filter(book -> book.getAuthor().equals(author)) // equals: girilen yazarla eklenen yazarın karşılaştırmasını yapar.
                .map(Book::getTitle)
                .toList();

        books.forEach(System.out::println);



    }
}
