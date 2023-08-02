import java.util.Date;

public class Professor {
    private int matricula;
    private String sexo;
    private String nome;
    private String cpf;
    private float altura;
    private float peso;
    private Date nascimento;
    private String cep;
    private String telefoneProfessor;
    private String emailProfessor;
    private String loginProfessor;

    
    public Professor(int matricula, String sexo, String nome, String cpf, float altura, float peso, Date nascimento,
            String cep, String telefoneProfessor, String emailProfessor, String loginProfessor) {
        this.matricula = matricula;
        this.sexo = sexo;
        this.nome = nome;
        this.cpf = cpf;
        this.altura = altura;
        this.peso = peso;
        this.nascimento = nascimento;
        this.cep = cep;
        this.telefoneProfessor = telefoneProfessor;
        this.emailProfessor = emailProfessor;
        this.loginProfessor = loginProfessor;
    }

    
    public int getMatricula() {
        return matricula;
    }

    public String getSexo() {
        return sexo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public String getCep() {
        return cep;
    }

    public String getTelefoneProfessor() {
        return telefoneProfessor;
    }

    public String getEmailProfessor() {
        return emailProfessor;
    }

    public String getLoginProfessor() {
        return loginProfessor;
    }

    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setTelefoneProfessor(String telefoneProfessor) {
        this.telefoneProfessor = telefoneProfessor;
    }

    public void setEmailProfessor(String emailProfessor) {
        this.emailProfessor = emailProfessor;
    }

    public void setLoginProfessor(String loginProfessor) {
        this.loginProfessor = loginProfessor;
    }

    
    @Override
    public String toString() {
        return "Professor{" +
                "matricula=" + matricula +
                ", sexo='" + sexo + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                ", nascimento=" + nascimento +
                ", cep='" + cep + '\'' +
                ", telefoneProfessor='" + telefoneProfessor + '\'' +
                ", emailProfessor='" + emailProfessor + '\'' +
                ", loginProfessor='" + loginProfessor + '\'' +
                '}';
    }
}