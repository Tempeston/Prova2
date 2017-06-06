
public class Administrador extends Empregado {

	
	Empregado Emp = new Empregado();
	
	public void Obterlucro(Double valor){
		setSaldo(getSaldo() + valor) ;
	} 
	
	
}
