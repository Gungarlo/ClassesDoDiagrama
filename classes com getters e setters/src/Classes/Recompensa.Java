public class Recompensa {
    private int cuponsDesconto;
    private int freteGratis;
    private String semanaExperimental;

    
    public Recompensa(int cuponsDesconto, int freteGratis, String semanaExperimental) {
        this.cuponsDesconto = cuponsDesconto;
        this.freteGratis = freteGratis;
        this.semanaExperimental = semanaExperimental;
    }

    
    public int getCuponsDesconto() {
        return cuponsDesconto;
    }

    public int getFreteGratis() {
        return freteGratis;
    }

    public String getSemanaExperimental() {
        return semanaExperimental;
    }

    
    public void setCuponsDesconto(int cuponsDesconto) {
        this.cuponsDesconto = cuponsDesconto;
    }

    public void setFreteGratis(int freteGratis) {
        this.freteGratis = freteGratis;
    }

    public void setSemanaExperimental(String semanaExperimental) {
        this.semanaExperimental = semanaExperimental;
    }

    
    @Override
    public String toString() {
        return "Recompensa{" +
                "cuponsDesconto=" + cuponsDesconto +
                ", freteGratis=" + freteGratis +
                ", semanaExperimental='" + semanaExperimental + '\'' +
                '}';
    }
}
