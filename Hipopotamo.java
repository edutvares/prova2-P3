public class Hipopotamo extends Animal {
    
    public Hipopotamo(String nome) {
        super(nome);
    }

    @Override
    public void alimentar() {
        System.out.println("O hipopotamo jogou a comida pra cima e destruiu a melancia");
    }

}
