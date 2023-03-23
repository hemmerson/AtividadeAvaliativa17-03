/**
 * @author "Hemmerson Luis Barros da Rosa"
 * on date 23/03/2023
 */
public class Endereco {
    String logradouro;
    String bairro;
    String cep;
    String complemento;
    Cidade cidade;

    String dados(){
        return "Logradouro: "+logradouro+"\n"+
                "Bairro: "+bairro+"\n"+
                "CEP: "+cep+"\n"+
                "Complemento: "+complemento+"\n"+
                cidade.dados()+"\n";
    }
}
