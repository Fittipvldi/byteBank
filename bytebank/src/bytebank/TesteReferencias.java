package bytebank;

public class TesteReferencias {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(56254, 51234);
		primeiraConta.setSaldo(300);
		System.out.println("Saldo da primeira conta: " + primeiraConta.getSaldo());
		
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da segunda conta: " + segundaConta.getSaldo());
		
		segundaConta.setSaldo(100);
		System.out.println("Saldo da segunda conta: " + segundaConta.getSaldo());
		
		System.out.println(primeiraConta.getSaldo());
		
		if(primeiraConta == segundaConta) {
			System.out.println("São a mesma conta.");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
	
}
