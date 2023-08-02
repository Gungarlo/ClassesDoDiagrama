public class Participacao {
    private int codTurma; 
    private int matricula; 

    
    public Participacao(int codTurma, int matricula) {
        this.codTurma = codTurma;
        this.matricula = matricula;
    }

    
    public int getCodTurma() {
        return codTurma;
    }

    public int getMatricula() {
        return matricula;
    }

    
    public void setCodTurma(int codTurma) {
        this.codTurma = codTurma;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    
    @Override
    public String toString() {
        return "Participa{" +
                "codTurma=" + codTurma +
                ", matricula=" + matricula +
                '}';
    }
}