public class Aluno {

    double media, n1, n2, n3;

    public void mediaCalc() {
        media = (n1 + n2 + n3) / 3;
        System.out.println("Notas: " + n1 + " "+ n2 + " "+ n3);
        System.out.println("Média: " + media);
    }
}
