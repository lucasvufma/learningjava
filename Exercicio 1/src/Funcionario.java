
public class Funcionario {
	private String Cargo;
	private int Salario;
	
	public Funcionario (String fCargo, int fSalario){
		Cargo=fCargo;
		Salario=fSalario;
	}
	
	public String getCargo() {
		return Cargo;
	}
	public void setCargo(String cargo) {
		Cargo = cargo;
	}
	public int getSalario() {
		return Salario;
	}
	public void setSalario(int salario) {
		Salario = salario;
	}
	public void sayTudo(){
		System.out.println("Funcionario 1: \nCargo: "+this.Cargo);
		System.out.println("Salario: "+this.Salario);
	}
	
	
	

}
