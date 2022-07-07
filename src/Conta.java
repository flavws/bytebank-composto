
//template/modelo
public class Conta {

	private double saldo; //atributos
	int agencia;
	int numero;
	Cliente titular;
	String cpf;
	String profissao;
	
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta contaDestino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			contaDestino.deposita(valor);
			return true;
		}else {
			return false;
		}
	}
	
	public double pegaSaldo(){
		return this.saldo;
	}
}
