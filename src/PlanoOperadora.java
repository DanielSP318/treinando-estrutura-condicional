public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M"; // M /T /B

        switch (plano) {
            case "T":
                System.out.println("5GB no YouTube");
                break;
            case "M":
                System.out.println("WhatsApp e Instagram gratuito");
                break;
            case "B":
                System.out.println("100 minutos de ligação");
                break;
            default:
                System.out.println("Plano não existente");
                break;
        }

        /*
         * If else tradicional não tão performatico
         * if (plano == "B") {
         * System.out.println("100 minutos de ligação");
         * } else if (plano == "M") {
         * System.out.println("100 minutos de ligação");
         * System.out.println("WhatsApp e Instagram gratuito");
         * } else if (plano == "T") {
         * System.out.println("100 minutos de ligação");
         * System.out.println("WhatsApp e Instagram gratuito");
         * System.out.println("5GB extra para vídeos do YouTube");
         * }
         */

    }
}
