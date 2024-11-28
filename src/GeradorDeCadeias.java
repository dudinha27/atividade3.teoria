import java.util.ArrayList;
import java.util.List;

public class GeradorDeCadeias {

    public static List<String> gerarCadeias(int n) {
        List<String> cadeias = new ArrayList<>();

        if (n == 1) {
            cadeias.add("c");
        }

        gerarCadeiasComCaracter(cadeias, 'a', n);
        gerarCadeiasComCaracter(cadeias, 'b', n);

        return cadeias;
    }

    private static void gerarCadeiasComCaracter(List<String> cadeias, char c, int n) {
        StringBuilder cadeia = new StringBuilder();
        for (int i = 0; i < n; i++) {
            cadeia.append(c);
        }
        cadeias.add(cadeia.toString());
    }
}
