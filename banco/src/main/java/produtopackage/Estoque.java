package produtopackage;

import java.util.List;

public class Estoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto prod = new Produto("Farinha","Alimenticio",5.99,false);
		ProdutoDAO dao = new ProdutoDAO();
		dao.insertProduto(prod);
		System.out.println("teste");
		List<Produto> p = dao.selectProduto();
		for(Produto d : p) {
			System.out.println(d.toString());
		}
	}
}