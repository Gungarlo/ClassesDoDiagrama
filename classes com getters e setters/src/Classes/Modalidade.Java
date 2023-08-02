public class Modalidades {
    private int codMod;
    private String nome;

    
    public Modalidades(int codMod, String nome) {
        this.codMod = codMod;
        this.nome = nome;
    }

    
    public int getCodMod() {
        return codMod;
    }

    public String getNome() {
        return nome;
    }

    
    public void setCodMod(int codMod) {
        this.codMod = codMod;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    @Override
    public String toString() {
        return "Modalidades{" +
                "codMod=" + codMod +
                ", nome='" + nome + '\'' +
                '}';
    }
}