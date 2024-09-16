public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 10;

        if (nota >= 7) {
            System.out.println("Parabéns, você foi aprovado com nota: " + nota);
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Aluno(a) você ficou em recuperação com a nota: " + nota);
        } else {
            System.out.println("Infelizmente, você ficou reprovado com nota: " + nota);
        }

    }
}
