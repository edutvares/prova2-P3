public class Animal {
    
    private String nome;

    public Animal() {

    }

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void alimentar() {
        System.out.println("O animal se alimentou");
    }

    public void limpar() {
        System.out.println("O animal foi limpo");
    }

}
