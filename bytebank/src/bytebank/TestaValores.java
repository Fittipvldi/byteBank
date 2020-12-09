package bytebank;

public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(13370, 22222);
		Conta conta2 = new Conta(1224, 122356);
		Conta conta3 = new Conta(22165, 214563);
		
		System.out.println("Possuimos: " + Conta.getTotal() + " contas!");
		
	}
	
}
