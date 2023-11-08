package interfaces.exercicios;

public class index {
    public static void main(String [] args){
        Pessoa pf = new PessoaFisica();
        Pessoa pj = new PessoaJuridica();
        

        pj.nome();
        pj.endereco();
        pj.cnpj();

        pf.nome();
        pf.endereco();
        pf.cpf();
    }

    
}
