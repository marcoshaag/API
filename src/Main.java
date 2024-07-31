import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Digite o CEP: ");
        var cep = ler.nextLine();

        try {
            Endereco endereco = consultaCep.buscarEndereco(cep);
            System.out.println(endereco.bairro());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Erro");
        }


    }
}