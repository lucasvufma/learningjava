package exercicio2;
import java.util.ArrayList;
import java.util.List;

public class Post {
	private String post_numero;
	private String mensagem;
	protected List<Comment> comentario;
	protected List<String> likes;
	
	public Post(String post_numero, String mensagem) {
		this.post_numero=post_numero;
		this.mensagem=mensagem;
		comentario = new ArrayList<Comment>();
		likes = new ArrayList<String>();
	}
	protected void addPostComment(User u1, Comment c) {
		this.comentario.add(c);
		c.setUserComment(u1);
	}
	protected void like(User u) {
		String nome= u.getnome();
		likes.add(nome+" Curtiu este post");
	}
	public List<Comment> getComentariosUser() {
		return this.comentario;
	}
	public String getlikes(){
		return likes.toString();
	}
	
	public String getpost() {
		return this.post_numero;
	}
	public String getmensagem() {
		return this.mensagem;
	}

}
