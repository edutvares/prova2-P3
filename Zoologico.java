public class Zoologico {

    private Jaula jaulas[];
    private Cuidador cuidadores[];

    public Zoologico() {
        System.out.println("Novo zoologico criado");
    }

	public Zoologico(Jaula[] jaulas, Cuidador[] cuidadores) {
		this.jaulas = jaulas;
        this.cuidadores = cuidadores;
        System.out.println("Novo zoologico criado");
    }
    
    public void addJaula(Jaula jaula) {

    }

    public void addCuidador(Cuidador cuidador) {

    }

    public Jaula buscaJaula(String nomeJaula) {
        return new Jaula();
    }

    public Cuidador buscaCuidador(String nomeCuidador) {
        return new Cuidador();
    }

    public void removerJaula(String nomeJaula) {

    }

    public void removerCuidador(String nomeCuidador) {

    }

    public Animal[] buscaAnimaisJaula(String nomeJaula) {
        Animal[] animal;
        animal = new Animal[1];

        animal[0] = new Animal();

        return animal;
    }

    public void inventario() {

    }
    
    public void enterrarAnimal(String nomeAnimal) {

    }
    
}