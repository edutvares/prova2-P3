import java.util.ArrayList;

public class Jaula {
    
    private String nome;
    private int capacidadeMaxima;
    private ArrayList<Animal> animais;

    public Jaula() {

    }

    public Jaula(String nome, int capacidadeMaxima) {
        this.nome =  nome;
        this.capacidadeMaxima = capacidadeMaxima;
        this.animais = new ArrayList<Animal>();
    }

    public void addAnimal(Animal animal) {

        if(this.animais.size() < this.capacidadeMaxima) {
            this.animais.add(animal);
            System.out.println("O animal foi adicionado");
        }else {
            System.out.println("A jaula já está cheia");
        }
    }

    public void removerAnimal(Animal animal) {
        this.animais.remove(animal);
    }

    public void limpar() {
        System.out.println("A jaula foi limpa");
    }

    public void listarAnimais() {
        System.out.println("\nTodos os animais da " + this.nome);
        for (int i = 0; i < this.animais.length; i++) {
            if(this.animais[i] != null)System.out.println(this.animais[i].getNome());
        }
    }

}
