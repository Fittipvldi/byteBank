
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente henrique = new Cliente();
		henrique.setNome("Henrique Fittipaldi");
		henrique.setCpf("472.693.608.55");
		henrique.setProfissao("Programador");
		
		Conta contaDoHenrique = new Conta();
		contaDoHenrique.deposita(100);
		
		contaDoHenrique.setTitular(henrique);
		System.out.println(contaDoHenrique.getTitular().getNome());
		
	}
}
