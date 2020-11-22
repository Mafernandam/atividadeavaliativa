public class Dono {
	String nome;
	String endereço;
	String telefone;

	// dono e cachorroCliente são muitos para muitos.
	// Vários cachorros podem compartilhar dos mesmos (vários) donos
	// e vários donos podem ter os mesmos (vários) cachorros;

	// Telefone é One to One.
	public Dono(Dono dono) {
		this.nome = dono.nome;
		this.endereço = dono.endereço;
		this.telefone = dono.telefone;
	}

	public Dono() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
