
public class Turma {
    public int quantidadeAlunos = 0;
    public Aluno[] alunos = new Aluno[10];

    public void adicionarAluno(Aluno aluno) {
        if (quantidadeAlunos < alunos.length) {
            alunos[quantidadeAlunos] = aluno;
            quantidadeAlunos++;
        }
    }

    public void listarAlunos() {
        System.out.println("--- Lista de Alunos na Turma ---");
        for (int i = 0; i < quantidadeAlunos; i++) {
            alunos[i].mostraInfo();
        }
    }

    public Aluno buscarMelhorAluno() {
        if (quantidadeAlunos == 0) return null;
        
        Aluno melhor = alunos[0];
        for (int i = 1; i < quantidadeAlunos; i++) {
            if (alunos[i].calculaMedia() > melhor.calculaMedia()) {
                melhor = alunos[i];
            }
        }
        return melhor;
    }
}
