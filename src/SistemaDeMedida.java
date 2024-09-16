public class SistemaDeMedida {
    public static void main(String[] args) {
        String sigla = "P";

        // Não é tão performatico em nível de sintaxe quanto o if tradicional.
        switch (sigla) {
            case "P":
                System.out.println("Pequeno");
                break;
            case "M":
                System.out.println("Médio");
                break;
            case "G":
                System.out.println("Grande");
                break;
            default:
                System.out.println("Tamanho Indefinido");
                break;
        }
        /*
         * Utilizando o If e Else if - Método menos performatico
         * if (sigla == "P") {
         * System.out.println("Pequeno");
         * } else if (sigla == "M"){
         * System.out.println("Médio");
         * } else if (sigla == "G") {
         * System.out.println("Grande");
         * } else {
         * System.out.println("Tamanho Indefinido");
         * }
         * 
         */
    }
}
