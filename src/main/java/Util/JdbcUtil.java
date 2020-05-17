package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {

	public static Connection getConnection() throws SQLException {

		Connection conexao = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conexao = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/veiculosdb?useTimezone=true&ampserverTimezone=UTC​​&relaxAutoCommit=true",
					"root", "Leo246810");
			System.out.println("Conectado!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Teste de conexão");
		}
		return conexao;
	}

//	private static EntityManagerFactory factory;
//
//	static {
//		factory = Persistence.createEntityManagerFactory("desafio");
//	}
//
//	public static EntityManager getEntityManager() {
//		return factory.createEntityManager();
//	}
//
//	public static void close() {
//		factory.close();
//	}
}