import java.util.Date;

public class Aluno {
    private int matricula;
    private float pontos;
    private int nome; 
    private String sexo;
    private String cep;
    private float altura;
    private float peso;
    private Date nascimento;
    private String telefoneAluno;
    private String emailAluno;
    private String loginUsuario;

    
    public Aluno(int matricula, float pontos, int nome, String sexo, String cep, float altura, float peso,
            Date nascimento, String telefoneAluno, String emailAluno, String loginUsuario) {
        this.matricula = matricula;
        this.pontos = pontos;
        this.nome = nome;
        this.sexo = sexo;
        this.cep = cep;
        this.altura = altura;
        this.peso = peso;
        this.nascimento = nascimento;
        this.telefoneAluno = telefoneAluno;
        this.emailAluno = emailAluno;
        this.loginUsuario = loginUsuario;
    }

    // Getters
    public int getMatricula() {
        return matricula;
    }

    public float getPontos() {
        return pontos;
    }

    public int getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getCep() {
        return cep;
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

    public String getTelefoneAluno() {
        return telefoneAluno;
    }

    public String getEmailAluno() {
        return emailAluno;
    }

    public String getLoginUsuario() {
        return loginUsuario;
    }

    // Setters
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setPontos(float pontos) {
        this.pontos = pontos;
    }

    public void setNome(int nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setCep(String cep) {
        this.cep = cep;
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

    public void setTelefoneAluno(String telefoneAluno) {
        this.telefoneAluno = telefoneAluno;
    }

    public void setEmailAluno(String emailAluno) {
        this.emailAluno = emailAluno;
    }

    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", pontos=" + pontos +
                ", nome=" + nome +
                ", sexo='" + sexo + '\'' +
                ", cep='" + cep + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                ", nascimento=" + nascimento +
                ", telefoneAluno='" + telefoneAluno + '\'' +
                ", emailAluno='" + emailAluno + '\'' +
                ", loginUsuario='" + loginUsuario + '\'' +
                '}';
    }
}