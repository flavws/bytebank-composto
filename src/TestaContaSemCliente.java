
public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		
		//se a referencia não for populada, ela retornara um null, ex:
		//contaDaMarcela.titular.nome = "Marcela";
		
		contaDaMarcela.titular = new Cliente();
		contaDaMarcela.titular.nome = "Marcela";
		System.out.println(contaDaMarcela.titular.nome);
	}

}
