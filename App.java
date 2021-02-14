public class App {
    public static void main(String[] args) throws Exception {
        
        Animal animal = new Animal("Urso pressão");
        Animal animal2 = new Animal("Gaivota muito louca");
        animal.alimentar();
        animal.limpar();

        Cuidador cuidador = new Cuidador("Zé Roberto");
        cuidador.alimentarAnimal(animal);
        cuidador.limparAnimal(animal);

        Jaula jaula = new Jaula("Jaula 1", 4);
        jaula.addAnimal(animal);
        jaula.addAnimal(animal2);
        jaula.addAnimal(animal);
        jaula.addAnimal(animal);
        jaula.addAnimal(animal);
        jaula.listarAnimais();

        jaula.removerAnimal(animal);
        jaula.listarAnimais();

    }
}
