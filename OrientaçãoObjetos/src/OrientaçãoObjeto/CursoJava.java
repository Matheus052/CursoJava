package OrientaçãoObjeto;

import javax.swing.JOptionPane;

import Objeto.Aluno;

public class CursoJava {

public static void main(String[] args) {
	
		
	
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome("Matheus");
		aluno1.setIdade(19);
		aluno1.setDataNascimento("14/10/2004");
		aluno1.setNomeMae("Cristina");
		aluno1.setNomePai("Andre");
		aluno1.setNomeEscola("JDEV");
		aluno1.setNota1(10);
		aluno1.setNota2(10);
		aluno1.setNota3(10);
		aluno1.setNota4(100);
		dsdsd
		System.out.println("Nome = " + aluno1.getNome());
		System.out.println("Idade = " + aluno1.getIdade());
		System.out.println("Data Nascimento = " + aluno1.getDataNascimento());
		System.out.println("Nome Da Mãe = " + aluno1.getNomeMae());
		System.out.println("Nome do Pai = " + aluno1.getNomePai());
		System.out.println("Nome da escola = " + aluno1.getNomeEscola());
		System.out.println("Media escolar = " + aluno1.getMediaNota());
		System.out.println("Status de Aprovação = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		
		
	}

}

