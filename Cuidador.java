public class Cuidador {
    
    private String nome;

    public Cuidador() {

    }

    public Cuidador(String nome) {
        this.nome = nome;
    }

    public void limparAnimal(Animal animal) {
        animal.limpar();
    }

    public void alimentarAnimal(Animal animal) {
        animal.alimentar();
    }

    public void limparJaula(Jaula jaula) {
        jaula.limpar();
    }

}
