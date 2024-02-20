package OrientaçãoObjeto;

import javax.swing.JOptionPane;

import Objeto.Aluno;

public class CursoJava {

public static void main(String[] args) {
	
		String nome = JOptionPane.showInputDialog("QUAL O NOME DO ALUNO?");
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
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
	
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

