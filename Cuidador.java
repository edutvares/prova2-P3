import java.util.ArrayList;

public class Cuidador {
    
    private String nome;

    public Cuidador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void limparAnimal(Animal animal) {
        animal.limpar();
    }

    public void alimentarAnimal(Animal animal) {
        animal.alimentar();
    }

    public void limparJaula(Jaula jaula) {
        ArrayList<Animal> animais = jaula.getAnimais();
        for(Animal animal : animais) {
            animal.limpar();
        }
    }

}
