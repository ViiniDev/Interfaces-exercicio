package interfaces.exercicios;
public class PessoaFisica implements Pessoa {

    private String cpf;

  
    @Override
    public void nome(){
        System.out.println("vinicius");
    };
    @Override
    public void endereco(){
        System.out.println("av. aruana"); 
    }
    @Override
    public void cnpj() {
        
    }
    @Override
    public void cpf() {
        System.out.println( "666.222.455-55" );
    }
   
    
}
