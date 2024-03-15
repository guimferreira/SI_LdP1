public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Guilherme Medeiros", 36, 2023115);
        Professor professor = new Professor("Fernanada Dias", 25, 10000);

        System.out.println("Dados do aluno:");
        System.out.println("Nome: " + aluno.getNome() + "\nIdade: " + aluno.getIdade() + "\nMatrícula: " + aluno.getMatricula());
        System.out.println();
        System.out.println("Dados do professor:");
        System.out.println("Nome: " + professor.getNome() + "\nIdade: " + professor.getIdade());
        System.out.printf("Salário: R$%.2f", professor.getSalario());

    }
}