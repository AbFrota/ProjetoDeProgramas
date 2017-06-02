package personagem;
import comportamentos.ComportamentoHeroico;

public class Cavaleiro extends Personagem implements ComportamentoHeroico {
    public Cavaleiro (String nome){
		super (nome);
	};
    


    
   @Override
    public void andar() {
        System.out.println ("Olhos para frente, cotovelos fechados e ombros abertos, Lord "+getNome()+" ama sentir seus cabelos ao vento!");
    }

    @Override
    public void usarItem() {
        System.out.println ("A espada de "+getNome()+ " adora se sujar de sangue! ");
    }

    @Override
    public void guardarItem() {
        System.out.println ("Nem só de combates vive o homem, Lord "+getNome()+ " abaixa seu escudo!");
    }

    @Override
    public void atacar() {
        System.out.println ("Sinta toda a fúria de Lord "+getNome()+ " miserável!");
    }

    @Override
    public void defender() {
        System.out.println ("Não existe nenhum material mais forte do que o escudo do Lord  "+getNome()+ "!");    
    }

    @Override
    public void saltar() {
        System.out.println (" AVANTE! Não existe obstaculos para o incrível "+getNome());
    }
}
    

