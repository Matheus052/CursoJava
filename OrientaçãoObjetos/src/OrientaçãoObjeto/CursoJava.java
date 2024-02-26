package OrientaçãoObjeto;

import javax.swing.JOptionPane;

import Classes.Aluno;

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
		aluno1.setIdade(Integer.valueOf(idade)); /*"Transforma" int em string*/
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setNomeEscola(nomeEscola);
		
		aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));/*"Tranforma" double em string*/
	
		aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));/*"Tranforma" double em string*/
		
		aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));/*"Tranforma" double em string*/
	
		aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));/*"Tranforma" double em string*/
		
		aluno1.getDisciplina().setDisciplina1(discliplina1);
		aluno1.getDisciplina().setDisciplina2(discliplina2);
		aluno1.getDisciplina().setDisciplina3(discliplina3);
		aluno1.getDisciplina().setDisciplina4(discliplina4);
		
		System.out.println(aluno1);/*Descrição do objeto na memoria*/
		System.out.println("Média Aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
	
	/*EQUALS E HAHSCODE (DIFERENCIAR E COMPARAR OBJETOS)*/

	/*Aluno aluno1 = new Aluno();
	aluno1.setNome("Matheus");
	
	Aluno aluno2 = new Aluno ();
	aluno2.setNome("Matheus");
	
	if (aluno1.equals(aluno2)) {
		System.out.println("Alunos são iguais");
	}else {
		System.out.println("Alunos são diferentes");
	}*/
	
}
	}
	

