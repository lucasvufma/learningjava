
public class TestaAluno {
	public static void main(String[] args) {
		Aluno Aluno1=new Aluno("Joao",12,"10/04/2007");
		Aluno Aluno2=new Aluno("Gabriela",19,"10/12/2000");
		
		System.out.println("Aluno 1: "+Aluno1.getNome());
		System.out.println("Rg: "+Aluno1.getRg());
		System.out.println("Data de Nascimento: "+Aluno1.getBirthday()+"\n");
		
		System.out.println("Aluno 2: "+Aluno2.getNome());
		System.out.println("Rg: "+Aluno2.getRg());
		System.out.println("Data de Nascimento: "+Aluno2.getBirthday());
		
	}
}
