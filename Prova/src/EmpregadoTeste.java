
public class EmpregadoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empregado e = new Empregado();
		
		e.setNome("Valmir");
		e.setAltura(1.78);
		e.setIdade(18);
		e.setSexo("Masculino");
		e.setSaldo(2500.00);
		System.out.println("Empregado: " + e.getNome());
		System.out.println("Sexo: " + e.getSexo());
		System.out.println("Idade: " + e.getIdade());
		System.out.println("Altura: " + e.getAltura());
		System.out.println("Salario: " + e.getSaldo());
	}

}
