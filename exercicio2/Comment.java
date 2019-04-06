package exercicio2;

public class Comment {
	protected User UsuariodoComment;
	protected String commentid;
	protected String Comentario;
	
	public Comment(String commentid, String comentario) {
		this.commentid=commentid;
		this.Comentario=comentario;
	}
	public void setUserComment(User uc) {
		this.UsuariodoComment=uc;
	}
	public String getUserComment() {
		return UsuariodoComment.getnome();
	}
	public String getComentarioString(){
		return this.Comentario;
	}

}
