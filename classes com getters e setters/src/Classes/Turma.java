package Classes;

import java.util.Date;

public class Turma {
    private int codTurma;
    private Date horario;
    private int bloco;
    private int matricula; 
    private int codMod; 

    
    public Turma(int codTurma, Date horario, int bloco, int matricula, int codMod) {
        this.codTurma = codTurma;
        this.horario = horario;
        this.bloco = bloco;
        this.matricula = matricula;
        this.codMod = codMod;
    }

    
    public int getCodTurma() {
        return codTurma;
    }

    public Date getHorario() {
        return horario;
    }

    public int getBloco() {
        return bloco;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getCodMod() {
        return codMod;
    }

    
    public void setCodTurma(int codTurma) {
        this.codTurma = codTurma;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public void setBloco(int bloco) {
        this.bloco = bloco;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setCodMod(int codMod) {
        this.codMod = codMod;
    }
    @Override
    public String toString() {
        return "Turma [codTurma=" + codTurma + ", horario=" + horario + ", bloco=" + bloco + ", matricula=" + matricula
                + ", codMod=" + codMod + "]";

    } 
}