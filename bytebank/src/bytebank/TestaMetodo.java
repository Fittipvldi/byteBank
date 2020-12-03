package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.setSaldo(100);
		conta1.deposita(50);
		System.out.println(conta1.getSaldo());
		
		boolean conseguiuRetirar = conta1.saca(20);
		System.out.println(conta1.getSaldo());
		System.out.println(conseguiuRetirar);
		
		Conta conta2 = new Conta();
		conta2.deposita(1000);
		
		if(conta2.transfere(300, conta1)) {
			System.out.println("transfer�ncia feita com sucesso");
		} else {
			System.out.println("transfer�ncia n�o realizada");
		}
		System.out.println(conta1.getSaldo());
		System.out.println(conta2.getSaldo());
	}	
}
