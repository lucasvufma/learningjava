package produtopackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class ProdutoDAO {
	private Connection conn;
	private String url = "jdbc:mysql://localhost:3306/Estoque";
	public ProdutoDAO() {
		try {
			this.conn=DriverManager.getConnection(url,"root","idnt123");
			Statement statement = conn.createStatement();
			statement.execute("CREATE TABLE IF NOT EXISTS produto (Nome VARCHAR(30),Preço DOUBLE(10,2),Categoria VARCHAR(30),Usado BOOLEAN)");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void insertProduto(Produto p) {
		String sql= "INSERT INTO produto (Nome,Preço,Categoria,Usado) VALUES (?,?,?,?)";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1,p.getNome());
			stmt.setDouble(2,p.getPreço());
			stmt.setString(3,p.getCategoria());
			stmt.setBoolean(4,p.isUsado());
			stmt.execute();
			stmt.close();
		}
		catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	public List<Produto> selectProduto(){
		List<Produto> listaprod = new LinkedList<Produto>();
		String sql = "select * from produto";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs= stmt.executeQuery();
			while (rs.next()) {
				Produto prodQUERY = new Produto();
				prodQUERY.setNome(rs.getString("Nome"));
				prodQUERY.setPreço(rs.getDouble("Preço"));
				prodQUERY.setCategoria(rs.getString("Categoria"));
				prodQUERY.setUsado(rs.getBoolean("Usado"));
				listaprod.add(prodQUERY);
			}
			stmt.close();
		}
		catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return listaprod;
	}

}
