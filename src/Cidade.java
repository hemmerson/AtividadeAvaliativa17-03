/**
 * @author "Hemmerson Luis Barros da Rosa"
 * on date 23/03/2023
 */
public class Cidade {
    String nome;
    Estado estado;

    String dados(){
        return "Cidade: "+nome+"\n"+
                estado.dados()+"\n";
    }
}
