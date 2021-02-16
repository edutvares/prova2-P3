public class Urso extends Animal {

    public Urso(String nome) {
		super(nome);
	}

    @Override
    public void alimentar() {
        System.out.println("O urso se alimentou em silêncio");
    }

    @Override
    public void limpar() {
        System.out.println("o Urso se deitou e foi limpo");
    }

}
