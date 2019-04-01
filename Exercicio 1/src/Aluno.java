
public class Aluno {
// Var de Instância//
	private String Nome;
	private int Rg;
	private String Birthday;
	
//Construtor
public Aluno(String aNome,int aRg,String aBirthday){
	Nome=aNome;
	Rg=aRg;
	Birthday=aBirthday;
}
// Métodos
public String getBirthday(){
	return Birthday;
}
public void setBirthday(String newbirthday){
	newbirthday=Birthday;
	
}
public String getNome(){
	return Nome;
}
public void setNome(String newnome){
	newnome=Nome;
	
}
public int getRg(){
	return Rg;
}
public void setRG(int newrg){
	newrg=Rg;
}


}
