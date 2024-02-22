package OrientaçãoObjeto;

import javax.swing.JOptionPane;

import Objeto.Aluno;

public class CursoJava {

public static void main(String[] args) {
	
	/*	String nome = JOptionPane.showInputDialog("QUAL O NOME DO ALUNO?");
		String idade = JOptionPane.showInputDialog("QUAL A IDADE DO ALUNO?");
		String dataNascimento = JOptionPane.showInputDialog("QUAL A DATA DE NASCIMENTO DO ALUNO?");
		String nomeMae = JOptionPane.showInputDialog("QUAL O NOME DA MÃE DO ALUNO?");
		String nomePai = JOptionPane.showInputDialog("QUAL O NOME DO PAI?");
		String nomeEscola = JOptionPane.showInputDialog("QUAL O NOME DA ESCOLA?");
		String nota1 = JOptionPane.showInputDialog("QUAL A NOTA1 ?");
		String nota2 = JOptionPane.showInputDialog("QUAL A NOTA2 ?");
		String nota3 = JOptionPane.showInputDialog("QUAL A NOTA3 ?");
		String nota4 = JOptionPane.showInputDialog("QUAL A NOTA4 ?");
			
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade)); /*"Transforma" int em string*/
		/*aluno1.setDataNascimento(dataNascimento);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setNota1(Double.parseDouble(nota1));/*"Tranforma" double em string*/
		/*aluno1.setNota2(Double.parseDouble(nota2));/*"Tranforma" double em string*/
		/*aluno1.setNota3(Double.parseDouble(nota3));/*"Tranforma" double em string*/
		/*aluno1.setNota4(Double.parseDouble(nota4));/*"Tranforma" double em string*/
	
	/*	System.out.println(aluno1.toString());/*Descrição do objeto na memoria*/
		/*System.out.println("Média Aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado());*/
	
	/*EQUALS E HAHSCODE (DIFERENCIAR E COMPARAR OBJETOS)*/

	Aluno aluno1 = new Aluno();
	aluno1.setNome("Matheus");
	
	Aluno aluno2 = new Aluno ();
	aluno2.setNome("Matheus");
	
	if (aluno1.equals(aluno2)) {
		System.out.println("Alunos são iguais");
	}else {
		System.out.println("Alunos são diferentes");
	}
	
}
	}
	

