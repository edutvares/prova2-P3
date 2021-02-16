public class App {
    public static void main(String[] args) throws Exception {
        
        
        Animal animal = new Urso("Urso pressão");
        Animal animal2 = new Macaco("macaquinho");

        Animal hipo = new Hipopotamo("Moto-moto");
        hipo.alimentar();
        hipo.limpar();

        animal.alimentar();
        animal.limpar();

        Cuidador cuidador = new Cuidador("Zé Roberto");
        cuidador.alimentarAnimal(animal2);
        cuidador.limparAnimal(animal2);

        Jaula jaula = new Jaula("Jaula 1", 4);
        jaula.addAnimal(animal);
        jaula.addAnimal(animal2);
        jaula.addAnimal(animal2);
        jaula.addAnimal(animal);
        jaula.addAnimal(animal);
        jaula.listarAnimais();

        jaula.removerAnimal(animal);
        jaula.listarAnimais();

        Zoologico zoologico = new Zoologico();
        zoologico.addJaula(jaula);
        zoologico.addJaula(jaula);
        zoologico.addJaula(jaula);
        zoologico.addCuidador(cuidador);
        Jaula j = zoologico.buscaJaula("Jaula 1");
        if(j != null) {
            System.out.println("JAULA PRESSAO: " + j.getNome());
        }else{
            System.out.println("Não encontrou a jaula");
        }
        
        /* zoologico.removerJaula("Jaula 1");

        j = zoologico.buscaJaula("Jaula 1");
        if(j != null) {
            System.out.println("JAULA PRESSAO: " + j.getNome());
        }else{
            System.out.println("Não encontrou a jaula");
        } */

        Cuidador c = zoologico.buscaCuidador("Zé Roberto");
        if(c != null) {
            System.out.println("CUIDADOR: " + c.getNome());
        }else{
            System.out.println("Não encontrou o cuidador");
        }
        /* zoologico.removerCuidador("Zé Roberto");
        c = zoologico.buscaCuidador("Zé Roberto");
        if(c != null) {
            System.out.println("CUIDADOR: " + c.getNome());
        }else{
            System.out.println("Não encontrou o cuidador");
        } */

        zoologico.inventario();


        zoologico.enterrarAnimal("Urso pressão");

    }
}
