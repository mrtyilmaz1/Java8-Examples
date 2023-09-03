import java.util.Arrays;
import java.util.List;

import java.util.stream.IntStream;

public class FaktöriyelJava8 {
    // bir liste içindeki tamsayıları alın ve bu tamsayıların faktöriyellerini hesaplayan bir Java programı yazın.
    //  (Arrays.asList(1, 2, 3, 4, )

    public static void main(String[] args) {
        List<Integer> tamsayilar = Arrays.asList(0 , 1, 2, 3, 4, 6);

        List<Integer> faktoriyeller = tamsayilar.stream()
                .map(e -> IntStream.rangeClosed(1, e) // 1'den e'ye kadar olan sayıları alıyoruz.
                .reduce(1, (a, b) -> a * b)) // 1'den e'ye kadar olan sayıları birbiri ile çarpıyoruz
                .toList();

        System.out.println("Tamsayıların Faktöriyelleri: " + faktoriyeller);
    }

}
