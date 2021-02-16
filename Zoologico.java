import java.util.ArrayList;

public class Zoologico {

    private ArrayList<Jaula> jaulas;
    private ArrayList<Cuidador> cuidadores;

	public Zoologico() {
        this.jaulas = new ArrayList<Jaula>();
        this.cuidadores = new ArrayList<Cuidador>();
        System.out.println("Novo zoologico criado");
    }
    
    public void addJaula(Jaula jaula) {
        if(jaulas.size() < 20 ) {
            this.jaulas.add(jaula);
        }else {
            System.out.println("Não é permitido o cadastro de mais de 20 jaulas");
        }
    }

    public void addCuidador(Cuidador cuidador) {
        this.cuidadores.add(cuidador);
    }

    public Jaula buscaJaula(String nomeJaula) {
        
        for( Jaula jaula : this.jaulas ) {
            if(jaula.getNome() == nomeJaula) return jaula;
        }
        return null;
    }

    public Cuidador buscaCuidador(String nomeCuidador) {
        for( Cuidador cuidador : this.cuidadores ) {
            if(cuidador.getNome() == nomeCuidador) return cuidador;
        }
        return null;
    }

    public void removerJaula(String nomeJaula) {
        for( Jaula jaula : this.jaulas ) {
            if(jaula.getNome() == nomeJaula) {
                this.jaulas.remove(jaula);
                break;
            }
        }
    }

    public void removerCuidador(String nomeCuidador) {
        for( Cuidador cuidador : this.cuidadores ) {
            if(cuidador.getNome() == nomeCuidador) {
                this.cuidadores.remove(cuidador);
                break;
            }
        }
    }

    public ArrayList<Animal> buscaAnimaisJaula(String nomeJaula) {
        for( Jaula jaula : this.jaulas ) {
            if(jaula.getNome() == nomeJaula) {
                return jaula.getAnimais();
            }
        }
        return null;
    }

    public void inventario() {
        for (Jaula jaula : this.jaulas) {
            System.out.println("\nNome da jaula: " + jaula.getNome());
            System.out.println("-------------------------------");
            jaula.listarAnimais();
        }
    }
    
    public void enterrarAnimal(String nomeAnimal) {
        boolean encontrou = false;

        for (Jaula jaula : this.jaulas) {
            ArrayList<Animal> animais = this.buscaAnimaisJaula(jaula.getNome());

            for( Animal animal : animais ) {
                if(animal.getNome() == nomeAnimal) {
                    jaula.removerAnimal(animal);
                    System.out.println(nomeAnimal + " faleceu e foi enterrado");
                    System.out.println("A " + jaula.getNome() + " agora está limpa");
                    encontrou = true;
                    break;
                }
            }
        }
        if(!encontrou) System.out.println("O animal não está cadastrado no zoológico");
    }
    
}