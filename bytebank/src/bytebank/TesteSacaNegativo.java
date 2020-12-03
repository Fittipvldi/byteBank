package bytebank;

public class TesteSacaNegativo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		conta.saca(200);
		System.out.println(conta.getSaldo());
		
		// erro que ocorre sem encapsulamento:
		//conta.saldo = conta.saldo - 101;
		//System.out.println(conta.saldo);
		
		// com encapsulamento:
		System.out.println(conta.getSaldo());
		
	}
	
}
