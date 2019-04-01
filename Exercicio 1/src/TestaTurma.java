
public class TestaTurma {
	public static void main(String[] args) {
		Turma Turma1 = new Turma(2,"8 Série","A","Técnico");
		Turma Turma2 = new Turma(1,"1 Série EM","B","Técnico");
		System.out.println("Turma 1:\nSérie: "+Turma1.getSerie());
		System.out.println("Periodo:"+Turma1.getPeriodo());
		System.out.println("Sigla:"+Turma1.getSigla());
		System.out.println("Modalidade:"+Turma1.getModalidade());
		
		System.out.println("\nTurma 2:\nSérie: "+Turma2.getSerie());
		System.out.println("Periodo:"+Turma2.getPeriodo());
		System.out.println("Sigla:"+Turma2.getSigla());
		System.out.println("Modalidade:"+Turma2.getModalidade());
	}

}
