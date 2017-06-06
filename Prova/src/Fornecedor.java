
public class Fornecedor extends Pessoa {
	
	double creditomax;
	double valoremdiv;
	
	Fornecedor(){
		
	}
	
	public double getCreditomax() {
		return creditomax;
	}
	public void setCreditomax(double credimax) {
		this.creditomax = credimax;
	}
	public double getValoremdiv() {
		return valoremdiv;
	}
	public void setValoremdiv(double valoremdiv) {
		this.valoremdiv = valoremdiv;
	}
	
	public void obtersaldo(double diferenca){
		creditomax +=diferenca;
		valoremdiv += diferenca;
	}
}