package Objeto;

import java.util.Objects;

public class Aluno {


	public String nome;
	int idade;
	String dataNascimento;
	String nomeMae;
	String nomePai;
	String nomeEscola;
	double nota1;
	double nota2;
	double nota3;
	double nota4;
	
	public String getNome() {
		return nome;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getNomeEscola() {
		return nomeEscola;
	}
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public double getMediaNota() {
		return (nota1 + nota2 + nota3 + nota4) / 4;
	}
	
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 70) {
			return true;
		}else {
			return false;
		}
		
	}
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + ", nomeEscola=" + nomeEscola + ", nota1=" + nota1
				+ ", nota2=" + nota2 + ", nota3=" + nota3 + ", nota4=" + nota4 + ", getNome()=" + getNome()
				+ ", getIdade()=" + getIdade() + ", getDataNascimento()=" + getDataNascimento()
				+ ", getNomeMae()=" + getNomeMae() + ", getNomePai()=" + getNomePai() + ", getNomeEscola()="
				+ getNomeEscola() + ", getMediaNota()=" + getMediaNota() + ", getAlunoAprovado()=" + getAlunoAprovado()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
		
		
		

	}
	@Override
	public int hashCode() {
		return Objects.hash(dataNascimento, idade, nome, nomeEscola, nomeMae, nomePai, nota1, nota2, nota3, nota4);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(dataNascimento, other.dataNascimento) && idade == other.idade
				&& Objects.equals(nome, other.nome) && Objects.equals(nomeEscola, other.nomeEscola)
				&& Objects.equals(nomeMae, other.nomeMae) && Objects.equals(nomePai, other.nomePai)
				&& Double.doubleToLongBits(nota1) == Double.doubleToLongBits(other.nota1)
				&& Double.doubleToLongBits(nota2) == Double.doubleToLongBits(other.nota2)
				&& Double.doubleToLongBits(nota3) == Double.doubleToLongBits(other.nota3)
				&& Double.doubleToLongBits(nota4) == Double.doubleToLongBits(other.nota4);
	}

}

