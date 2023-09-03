import java.util.Arrays;
import java.util.List;

public class IntKareleriTopJava8 {
    //Bir liste içindeki tamsayıları alın ve bu tamsayıların karelerini toplayan bir Java programı yazın.
    // (Arrays.asList(1,2,3,5,6,7...)) en son kareleri toplarken belki reduce kullanabilriiz ?
    public static void main(String[] args) {
        List<Integer> tamsayilar = Arrays.asList(1, 2, 3, 5, 6, 7);

        int karelerinToplami = tamsayilar.stream()
                .map(sayi -> sayi * sayi)
                .reduce(0, (a, b) -> a + b); //.mapToInt(Integer::intValue).map(e->e*e).sum(); da kullanılabilir.

        System.out.println("Karelerin Toplamı: " + karelerinToplami);
    }
}
