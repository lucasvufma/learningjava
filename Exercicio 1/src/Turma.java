
public class Turma {
	int periodo;
	String serie;
	String sigla;
	String modalidade;
	
	public Turma(int periodo, String serie, String sigla, String modalidade) {
		super();
		this.periodo = periodo;
		this.serie = serie;
		this.sigla = sigla;
		this.modalidade = modalidade;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	
	

}
