import java.util.Date;

public class AlunoConquista {
    private Date dataConquista;
    private int codAC;
    private int matricula; 
    private int codConquista; 

    
    public AlunoConquista(Date dataConquista, int codAC, int matricula, int codConquista) {
        this.dataConquista = dataConquista;
        this.codAC = codAC;
        this.matricula = matricula;
        this.codConquista = codConquista;
    }

    
    public Date getDataConquista() {
        return dataConquista;
    }

    public int getCodAC() {
        return codAC;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getCodConquista() {
        return codConquista;
    }

    
    public void setDataConquista(Date dataConquista) {
        this.dataConquista = dataConquista;
    }

    public void setCodAC(int codAC) {
        this.codAC = codAC;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setCodConquista(int codConquista) {
        this.codConquista = codConquista;
    }

    
    @Override
    public String toString() {
        return "AlunoConquista{" +
                "dataConquista=" + dataConquista +
                ", codAC=" + codAC +
                ", matricula=" + matricula +
                ", codConquista=" + codConquista +
                '}';
    }
}