public class Macaco extends Animal {

    public Macaco(String nome) {
		super(nome);
	}

    @Override
    public void alimentar() {
        System.out.println("O macaco se alimentou dando cambalhotas");
    }

    @Override
    public void limpar() {
        System.out.println("o macaco ficou pulando enquanto era limpo");
    }
}
