import java.util.Calendar;
import java.util.Date;

/**
 * @author "Hemmerson Luis Barros da Rosa"
 * on date 23/03/2023
 */
public class Pessoa {
    String nome;
    Date dataNascimento;
    Endereco endereco;

    int idade(){
        Calendar nascimento = Calendar.getInstance();
        nascimento.setTime(dataNascimento);
        Calendar dataAtual = Calendar.getInstance();
        int diferencaMes = dataAtual.get(Calendar.MONTH) - nascimento.get(Calendar.MONTH);
        int diferencaDia = dataAtual.get(Calendar.DAY_OF_MONTH) - nascimento.get(Calendar.DAY_OF_MONTH);
        int idade = (dataAtual.get(Calendar.YEAR) - nascimento.get(Calendar.YEAR));

        if(diferencaMes < 0 || (diferencaMes == 0 && diferencaDia < 0)) {
            idade--;
        }

        return idade;
    }

    String dados(){
        return "Nome: "+nome+"\n"+
                "Idade: "+idade()+"\n"+
                endereco.dados()+"\n";
    }
}
