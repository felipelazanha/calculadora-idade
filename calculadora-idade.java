import java.util.Scanner;

public class CalculadoraIdade {
    public static void main(String[] args) {
            
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite o ano atual: ");
        int anoAtual = leitura.nextInt();

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = leitura.nextInt();

        int idade = anoAtual - anoNascimento;

        System.out.println("Sua idade é: " + idade + " anos.");
    }
}
