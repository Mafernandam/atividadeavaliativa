public class CachorroAdoção extends Cachorro {
    public String codigoIdentificador;

    public CachorroAdoção(Cachorro cachorro, String codigoIdentificador) {
        super(cachorro.nome, cachorro.raça);
        this.codigoIdentificador = codigoIdentificador;
    }

    public String getId() {
        return codigoIdentificador;
    }

    public void setId(String codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }
}
