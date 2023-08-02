public class Conquistas {
    private int codConquista;
    private String conquista;
    private int cupomDesconto; 

    
    public Conquistas(int codConquista, String conquista, int cupomDesconto) {
        this.codConquista = codConquista;
        this.conquista = conquista;
        this.cupomDesconto = cupomDesconto;
    }

    
    public int getCodConquista() {
        return codConquista;
    }

    public String getConquista() {
        return conquista;
    }

    public int getCupomDesconto() {
        return cupomDesconto;
    }

    
    public void setCodConquista(int codConquista) {
        this.codConquista = codConquista;
    }

    public void setConquista(String conquista) {
        this.conquista = conquista;
    }

    public void setCupomDesconto(int cupomDesconto) {
        this.cupomDesconto = cupomDesconto;
    }
    @Override
    public String toString() {
        return "Conquistas [codConquista=" + codConquista + ", conquista=" + conquista + ", cupomDesconto="
                + cupomDesconto + "]";

    
}
}