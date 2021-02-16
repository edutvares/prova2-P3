public class Leao extends Animal {

    public Leao(String nome) {
		super(nome);
	}

    @Override
    public void alimentar() {
        System.out.println("O leão se alimentou e rugiu");
    }

    @Override
    public void limpar() {
        System.out.println("o leão foi limpo e ficou com frio");
    }
}
