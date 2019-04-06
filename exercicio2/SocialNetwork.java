package exercicio2;
import java.util.ArrayList;
import java.util.List;
public class SocialNetwork {
	
	List<User> lista= new ArrayList<User>();
	
	
	public void addUser(User u) {
	lista.add(u);
	}
	public void addFriendly(String id1, String id2) {
		for(User i : lista) {
			if (i.getid().equalsIgnoreCase(id1)) {
				for(User j: lista) {
					if (j.getid().equalsIgnoreCase(id2)) {
						i.addFriend(j);
						j.addFriend(i);
					}
				}
			}
		}
	}
	public void addPost(String id,Post p){
		for(User i : lista) {
			if (i.getid().equalsIgnoreCase(id)) {
				i.posts.add(p);
				}
			}									
		}
	// id1 é o usuario que vai comentar, id2 o usuario dono do post.
	
	public void addComment(String id1, String id2,String post_numero,Comment comment){
		for(User i: lista) {
			if(i.getid().equalsIgnoreCase(id2)) {
				for(Post j: i.getUserPosts()) {
					if(j.getpost().equalsIgnoreCase(post_numero)){
						for(User k: lista) {
							if(k.getid().equalsIgnoreCase(id1)) {
								j.addPostComment(k, comment);
								
							}
						}
						
					}
					
				}
			}
		}
		
	}
	public void liked(String id1, String id2, String post_numero){
		for(User i: lista) {
			if(i.getid().equalsIgnoreCase(id2)) {
				for(Post j: i.getUserPosts()) {
					if(j.getpost().equalsIgnoreCase(post_numero)){
						for(User k: lista) {
							if(k.getid().equalsIgnoreCase(id1)) {
								j.like(k);
							}
						}
					}
				}
			}
		}
	}
	public void printUpdates() {
		for(User i: lista) {
				for(Post j: i.getUserPosts()) {
					System.out.print("\nPost do Usuario: "+i.getnome()+"\n");
					System.out.println("Post ID: "+j.getpost());
					System.out.println(j.getmensagem());
					for(Comment c : j.getComentariosUser()) {
						System.out.println(c.getUserComment()+": "+c.getComentarioString());
					}
					if(j.getlikes() != "[]") {
						System.out.println(j.getlikes());
					}
				}
		}
	}
}
	
	

