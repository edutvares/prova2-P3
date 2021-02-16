import java.util.ArrayList;

public class Jaula {
    
    private String nome;
    private int capacidadeMaxima;
    private ArrayList<Animal> animais;

    public Jaula(String nome, int capacidadeMaxima) {

        if(capacidadeMaxima > 5) {
            System.out.println("Você não pode adicionar mais de 5 vagas na jaula");
            throw new IllegalArgumentException();
        }

        this.nome = nome;
        this.animais = new ArrayList<Animal>();
        this.capacidadeMaxima = capacidadeMaxima;
        
    }

    public String getNome() {
        return this.nome;
    }

    public ArrayList<Animal> getAnimais() {
        return this.animais;
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

    public void listarAnimais() {
        System.out.println("\nTodos os animais da " + this.nome);
        for (Animal animal : animais) {
            System.out.println(animal.getNome());
        }
    }

}
