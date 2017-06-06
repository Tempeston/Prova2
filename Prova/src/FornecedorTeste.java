
public class FornecedorTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fornecedor f = new Fornecedor();
		
		f.setNome("Do Posto");
		f.setAltura(1.70);
		f.setIdade(18);
		f.setSexo("Masculino");
		f.setCreditomax(10000);
		f.setValoremdiv(0);
		System.out.println("Empregado: " + f.getNome());
		System.out.println("Sexo: " + f.getSexo());
		System.out.println("Idade: " + f.getIdade());
		System.out.println("Altura: " + f.getAltura());
		System.out.println("Tem um saldo de: " + f.getCreditomax());
		System.out.println("Tem uma divida de: " + f.getValoremdiv());
		
	}

}
