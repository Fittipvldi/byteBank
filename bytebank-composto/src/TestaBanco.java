
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente henrique = new Cliente();
		henrique.nome = "Henrique Fittipaldi";
		henrique.cpf = "472.693.608.55";
		henrique.profissao = "Programador";
		
		Conta contaDoHenrique = new Conta();
		contaDoHenrique.deposita(100);
		
		contaDoHenrique.titular = henrique;
		System.out.println(contaDoHenrique.titular.nome);
		
	}
}
