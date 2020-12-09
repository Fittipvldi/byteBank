package bytebank;

public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(13370, 22222);
		
		// A conta está inconsistente.
		conta.setAgencia(-50);
		conta.setNumero(-330);
		
		System.out.println(conta.getAgencia());
	}
	
}
