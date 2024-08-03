import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class PlusMinus {

    public static void main(String[] args) {
        // Ejemplo de uso con el input proporcionado
        List<Integer> arr = List.of(-4, 3, -9, 0, 4, 1);
        plusMinus(arr);
    }

    public static void plusMinus(List<Integer> arr) {
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        // Contar positivos, negativos y ceros
        for (Integer value : arr) {
            if (value > 0) {
                positiveCount++;
            } else if (value < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        // Calcular los ratios y redondear a 6 dígitos decimales
        BigDecimal size = BigDecimal.valueOf(arr.size());
        BigDecimal positiveRatio = BigDecimal.valueOf(positiveCount).divide(size, 6, RoundingMode.HALF_UP);
        BigDecimal negativeRatio = BigDecimal.valueOf(negativeCount).divide(size, 6, RoundingMode.HALF_UP);
        BigDecimal zeroRatio = BigDecimal.valueOf(zeroCount).divide(size, 6, RoundingMode.HALF_UP);

        // Imprimir los resultados
        System.out.println(positiveRatio);
        System.out.println(negativeRatio);
        System.out.println(zeroRatio);
    }
}
