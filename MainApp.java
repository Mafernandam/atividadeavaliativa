
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Cadastro de cachorro");
		System.out.println("Digite (1) para CADASTRAR um cachorro de cliente");
		System.out.println("Digite (2) para CADASTRAR um cachorro para adoção");
		int op = scanner.nextInt();

		if (op == 1) {
			Dono dono = new Dono(CadastroDono());
			Cachorro cachorro = new Cachorro(CadastroCachorro());
			System.out.printf("Nome do cachorro:  %s  e", cachorro.getNome());
			System.out.printf("nome do cliente:  %s ", dono.getNome());
		}

		else if (op == 2) {
			System.out.println("Digite o Código identificador: 0000");
			CachorroAdoção cachorro = new CachorroAdoção(CadastroCachorro(), scanner.nextLine());
			System.out.printf("Nome do cachorro: %s ", cachorro.getNome());	
		}
	}

	public static Cachorro CadastroCachorro() {
		Scanner scanner = new Scanner(System.in);

		Cachorro cachorro = new Cachorro();
		System.out.println("Digite o nome do cachorro");
		cachorro.setNome(scanner.nextLine());

		System.out.println("Digite a raça do cachorro");
		cachorro.setRaça(scanner.nextLine());

		return cachorro;
	}

	private static Dono CadastroDono() {
		Scanner scanner = new Scanner(System.in);
		Dono dono = new Dono();

		System.out.println("Cadastro de dono");
		System.out.println("Digite o nome do dono");
		dono.setNome(scanner.nextLine());

		System.out.println("Digite o endereço do dono");
		dono.setEndereço(scanner.nextLine());

		System.out.println("Digite o telefone do dono");
		dono.setTelefone(scanner.nextLine());
		return dono;

	}



}