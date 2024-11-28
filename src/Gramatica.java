import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Gramatica {
    private String simboloInicial;
    private Map<String, Set<String>> producoes;

    public Gramatica(String simboloInicial) {
        this.simboloInicial = simboloInicial;
        this.producoes = new HashMap<>();
    }

    public void adicionarProducao(String naoTerminal, String producao) {
        producoes.putIfAbsent(naoTerminal, new HashSet<>());
        producoes.get(naoTerminal).add(producao);
    }

    public boolean verificarCadeia(String cadeia) {
        return verificar(cadeia, simboloInicial);
    }

    private boolean verificar(String cadeia, String naoTerminal) {
        if (cadeia.isEmpty()) {
            return producoes.getOrDefault(naoTerminal, Set.of()).contains("");
        }

        Set<String> regras = producoes.get(naoTerminal);
        if (regras == null) return false;

        for (String regra : regras) {
            if (!cadeia.startsWith(regra.substring(0, 1))) {
                continue;
            }

            if (regra.length() == 1 && cadeia.equals(regra)) {
                return true;
            }

            if (regra.length() > 1) {
                String proximoNaoTerminal = regra.substring(1);
                String restanteCadeia = cadeia.substring(1);

                if (verificar(restanteCadeia, proximoNaoTerminal)) {
                    return true;
                }
            }
        }
        return false;
    }
}
