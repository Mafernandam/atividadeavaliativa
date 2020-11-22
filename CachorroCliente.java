public class CachorroCliente extends Cachorro {

    // dono e cachorroCliente são manny for manny.
	// Vários cachorros podem compartilhar dos mesmos (vários) donos
    // e vários donos podem ter os mesmos (vários) cachorros;
    
    public Dono Dono;

    public CachorroCliente(String _nome, String _raça, Dono dono) {
        super(_nome, _raça);
        setDono(dono);
    }

    public Dono getDono() {
        return Dono;
    }

    public void setDono(Dono dono) {
        Dono = dono;
    }
}
