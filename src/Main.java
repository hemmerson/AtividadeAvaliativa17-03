import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author "Hemmerson Luis Barros da Rosa"
 * on date 23/03/2023
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse("04/05/1989");

        Pessoa pessoa1 = new Pessoa();
        Endereco endereco1 = new Endereco();
        Cidade cidade1 = new Cidade();
        Estado estado1 = new Estado();

        pessoa1.nome = "João";
        pessoa1.dataNascimento = (data);
        pessoa1.endereco = endereco1;
        pessoa1.endereco.cidade = cidade1;
        pessoa1.endereco.cidade.estado = estado1;


        pessoa1.endereco.logradouro = "Rua Do Exemplo, n 15";
        pessoa1.endereco.bairro = "Bairro Legal";
        pessoa1.endereco.cep = "77.777-777";
        pessoa1.endereco.complemento = "Casa 01";
        pessoa1.endereco.cidade.nome = "Palmas";
        pessoa1.endereco.cidade.estado.nome = "Tocantins";
        pessoa1.endereco.cidade.estado.sigla = "TO";
        System.out.println(pessoa1.dados());
    }
}
