
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Exercício 1: Verificação de Cadeias na Linguagem");
        System.out.println(VerificaLinguagem.pertenceALinguagem("aaa"));
        System.out.println(VerificaLinguagem.pertenceALinguagem("bbb"));
        System.out.println(VerificaLinguagem.pertenceALinguagem("aab"));
        System.out.println();


        System.out.println("Exercício 2: Geração de Cadeias de Comprimento N");
        int n = 3;
        List<String> cadeiasGeradas = GeradorDeCadeias.gerarCadeias(n);
        System.out.println("Cadeias de comprimento " + n + ": " + cadeiasGeradas);
        System.out.println();


        System.out.println("Exercício 3: Verificação de Cadeias em uma Gramática");
        Gramatica gramatica = new Gramatica("S");


        gramatica.adicionarProducao("S", "aA");
        gramatica.adicionarProducao("S", "bB");
        gramatica.adicionarProducao("S", "c");
        gramatica.adicionarProducao("A", "aA");
        gramatica.adicionarProducao("A", "");
        gramatica.adicionarProducao("B", "bB");
        gramatica.adicionarProducao("B", "");


        System.out.println(gramatica.verificarCadeia("aaa"));  // true
        System.out.println(gramatica.verificarCadeia("bbb"));  // true
        System.out.println(gramatica.verificarCadeia("c"));    // true
        System.out.println(gramatica.verificarCadeia("ab"));   // false
    }
}