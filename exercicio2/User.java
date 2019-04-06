package exercicio2;
import java.util.ArrayList;
import java.util.List;

public class User {
	private String id;
	private String nome;
	protected List<User> friends;
	protected List<Post> posts;
	
	public User(String id, String nome) {
		this.id=id;
		this.nome=nome;
		friends=new ArrayList<User>();
		posts= new ArrayList<Post>();
	}
	
	public String getid() {
		return this.id;
	}
	public String getnome(){
		return this.nome;
	}
	public void addFriend(User u){
		friends.add(u);
	}
	public List<Post> getUserPosts() {
		return this.posts;
	}
}
