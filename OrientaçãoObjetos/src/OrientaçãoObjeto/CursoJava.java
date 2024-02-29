package OrientaçãoObjeto;

import javax.swing.JOptionPane;

import Classes.Aluno;
import Classes.Disciplina;

public class CursoJava {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("QUAL O NOME DO ALUNO?");
		String idade = JOptionPane.showInputDialog("QUAL A IDADE DO ALUNO?");
		String dataNascimento = JOptionPane.showInputDialog("QUAL A DATA DE NASCIMENTO DO ALUNO?");
		String nomeMae = JOptionPane.showInputDialog("QUAL O NOME DA MÃE DO ALUNO?");
		String nomePai = JOptionPane.showInputDialog("QUAL O NOME DO PAI?");
		String nomeEscola = JOptionPane.showInputDialog("QUAL O NOME DA ESCOLA?");

		String discliplina1 = JOptionPane.showInputDialog("QUAL A 1º DISCIPLINA?");
		String nota1 = JOptionPane.showInputDialog("QUAL A NOTA 1 ?");

		String discliplina2 = JOptionPane.showInputDialog("QUAL A 2º DISCIPLINA?");
		String nota2 = JOptionPane.showInputDialog("QUAL A NOTA 2 ?");

		String discliplina3 = JOptionPane.showInputDialog("QUAL A 3º DISCIPLINA?");
		String nota3 = JOptionPane.showInputDialog("QUAL A NOTA 3 ?");

		String discliplina4 = JOptionPane.showInputDialog("QUAL A 4º DISCIPLINA?");
		String nota4 = JOptionPane.showInputDialog("QUAL A NOTA 4 ?");

		Aluno aluno1 = new Aluno();

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade)); /* "Transforma" int em string */
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setNomeEscola(nomeEscola);

		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Banco de dados");
		disciplina1.setNota(90);

		aluno1.getDisciplinas().add(disciplina1);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("HTML");
		disciplina2.setNota(80);

		aluno1.getDisciplinas().add(disciplina2);

		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("JSCODE");
		disciplina3.setNota(70);

		aluno1.getDisciplinas().add(disciplina3);

		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("GITHUB");
		disciplina4.setNota(80);

		aluno1.getDisciplinas().add(disciplina4);

		System.out.println(aluno1);/* Descrição do objeto na memoria */
		System.out.println("Média Aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));

	}
}
