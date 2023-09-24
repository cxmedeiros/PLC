class Curso {
  private String nome;
  private String codigo;

  public Curso(String nome, String codigo) {
    this.nome = nome;
    this.codigo = codigo;

  }  

  public String getNome() {
    return nome;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }
}

class Aluno {
  private String nome;
  private String cpf;
  private int idade;
  private Curso curso;

  public Aluno(String nome, String cpf, int idade, Curso curso) {
    this.nome = nome;
    this.cpf = cpf;
    this.idade = idade;
    this.curso = curso;
  }

  public String getNome() {
    return nome;
  }

  public String getCpf() {
    return cpf;
  }

  public int getIdade() {
    return idade;
  }

  public Curso getCurso() {
    return curso;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public void setCurso(Curso curso) {
    this.curso = curso;
  }
}

public class TestClass {
    public static void main(String[] args) {
      Curso curso = new Curso("Engenharia de Software", "ES");

      System.out.println("Informações de curso:");
      System.out.println(curso.getNome() + " - " + curso.getCodigo());
      System.out.println();


      Aluno aluno = new Aluno("João", "123456789-00", 20, curso);
      System.out.println("Informações do aluno:");

      System.out.println(aluno.getNome() + " - " + aluno.getCpf() + " - " + aluno.getIdade());
      System.out.println("Curso: " + aluno.getCurso().getNome() + " - " + aluno.getCurso().getCodigo());
    }
}