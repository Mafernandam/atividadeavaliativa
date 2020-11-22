import java.util.Scanner;

public class Cachorro {
	public String nome;
	public String raça;

	public Cachorro(String _nome, String _raça) {
		this.nome = _nome;
		this.raça = _raça;
	}

	public Cachorro() {
	}

	public Cachorro(Cachorro cachorro) {
		this.nome = cachorro.nome;
		this.raça = cachorro.raça;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

}
