package interfaces.exercicios;
public class PessoaJuridica implements Pessoa{
    
    private String cnpj;



    
    
    @Override
    public void nome(){

        System.out.println("gabriel");
    };
    @Override
    public void endereco(){

        System.out.println("Av.Capinajumba"); 
    }
    @Override
    public void cnpj() {
        System.out.println( "666.222.455/0001-55");
    }
    @Override
    public void cpf() {
        
    }

    
    
}
