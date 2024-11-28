public class VerificaLinguagem {

    public static boolean pertenceALinguagem(String cadeia) {
        if (cadeia == null || cadeia.isEmpty()) {
            return false;
        }
        char primeiro = cadeia.charAt(0);

        if (primeiro == 'a') {
            for (int i = 1; i < cadeia.length(); i++) {
                if (cadeia.charAt(i) != 'a') {
                    return false;
                }
            }
            return true;
        } else if (primeiro == 'b') {
            for (int i = 1; i < cadeia.length(); i++) {
                if (cadeia.charAt(i) != 'b') {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
