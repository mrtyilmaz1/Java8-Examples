package Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
           /* Bir şirketin çalışanlarının bir listesi verildiğinde, çalışanların yaşlarına göre gruplandırılmasını
        sağlayan bir Java 8 programı yazın. Çalışanları temsil eden bir class olan Employee class'ını (class Employee) kullanın
         ve her çalışanın adını, yaşını ve pozisyonunu tutun. (name, age, position)
                -Main methodunda new Employee("Kadir", 30, "java developer") gibi 4-5 tane employee oluşturun.
                - Yaşlarına göre gruplamayı bi düşünün. Burada Map kullanmamız gerekir.
                 (Mesela 30 yaşında olan 1 kişi, 2kişi veeya daha çok kişi olabilir. )
                 Bu durumda Map kullanıp key alanında age bilgisi ve value'da List<Employee> tutabiliriz.
                 Yani görünüm şöyle olacak -> Map<Integer, List<Employee>>
                - elinizde bulunan List<Employee> yi yaşa göre gruplamak için java8 stream yapısında bulunan .
                collect(Collectors.groupingBy adında fonksiyon kullanılabilir. Araştırınız.*/
    public static void main(String[] args) {

        Employee employee1 = new Employee("Kadir", 30, "java developer");
        Employee employee2 = new Employee("Murat", 28, "purchasing specialist");
        Employee employee3 = new Employee("Elif", 30, "manager");
        Employee employee4 = new Employee("Tolga", 70, "boss");

        List<Employee> employees = new ArrayList<>();

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);



        Map<Integer , List<Employee>> map = employees.stream()
                .collect(Collectors.groupingBy(Employee::getAge));
        map.keySet().forEach(System.out::println);
        map.values().forEach(System.out::println);













    }
}
