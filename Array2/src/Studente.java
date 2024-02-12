public class Studente implements Comparable<Studente>{

    private String nome;
    private int age;

    //costruttore
    Studente(String nome, int age){

        this.nome = nome;
        this.age = age;
    }

    void saluta(){
        System.out.println("Ciao sono " + nome);
    }
    
    @Override
    public String toString(){
        String Stringa = "Nome: " + nome + "; age: " + age ;
        return Stringa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
  public int compareTo(Studente o) {
    return this.nome.compareTo(o.nome);
  }

}