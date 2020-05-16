package ConexaoJDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

	private static String url = "jdbc:mysql://localhost:3306/veiculosdb";
	private static String user = "root";
	private static String password = "Leo246810";
	private static Connection conexao = null;

	static {
		conectar();
	}

	public Conexao() {
		conectar();
	}

	private static void conectar() {
		try {
			if (conexao == null) {
				Class.forName("com.mysql.jdbc.Driver");
				conexao = DriverManager.getConnection(url, user, password);
				conexao.setAutoCommit(false);
				System.out.println("Conectou com sucesso!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static Connection getConexao() {
		return conexao;
	}

}
