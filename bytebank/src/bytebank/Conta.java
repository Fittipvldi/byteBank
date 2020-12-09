package bytebank;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private String titular;
	private static int total; //atributo referente a classe 
	
	// construtor padrão
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		total++;
	}
	
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo += saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		
		if(agencia <= 0) {
			System.out.println("Não é possível a numeração ser menor ou igual a zero.");
			return;
		}
		
		this.agencia = agencia;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		
		if(numero <= 0) {
			System.out.println("Não é possível a numeração ser menor ou igual a zero.");
			return;
		}
		
		this.numero = numero;
	}
	
	public static int getTotal() { //metodo da classe
		return Conta.total;
	}
}
