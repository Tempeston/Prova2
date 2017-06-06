
public class AdministradorTeste {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Administrador a = new Administrador();
		
		a.setNome("Rafael");
		a.setAltura(1.84);
		a.setIdade(17);
		a.setSexo("Masculino");
		a.setSaldo(5500.00);
		a.Obterlucro(1000.00);
		System.out.println("Empregado: " + a.getNome());
		System.out.println("Sexo: " + a.getSexo());
		System.out.println("Idade: " + a.getIdade());
		System.out.println("Altura: " + a.getAltura());
		System.out.println("Salario: " + a.getSaldo());
	
	}
}