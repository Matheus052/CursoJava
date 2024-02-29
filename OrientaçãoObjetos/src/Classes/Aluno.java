package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {

	String nome;
	int idade;
	String dataNascimento;
	String nomeMae;
	String nomePai;
	String nomeEscola;

	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public List<Disciplina> getDisciplinas() {
		return disciplinas;

	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;

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

	public String getNome() {
		return nome;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public double getMediaNota() {
		
		double somaNota = 0.0;
		
		for (Disciplina disciplina : disciplinas) {
			somaNota += disciplina.getNota();
		}
		
		
		return 0;
	}

	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 70) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", nomeMae="
				+ nomeMae + ", nomePai=" + nomePai + ", nomeEscola=" + nomeEscola + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataNascimento, idade, nome, nomeEscola, nomeMae, nomePai);
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
				&& Objects.equals(nomeMae, other.nomeMae) && Objects.equals(nomePai, other.nomePai);
	}

}
