package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import ConexaoJDBC.Conexao;
import Entidade.Fabricante;

public class FabricanteDAO {

	private Connection connection;

	public FabricanteDAO() {
		connection = Conexao.getConexao();
	}

	public void salvar(Fabricante fabricante) {
		try {
			String sql = "insert into fabricante (codigo, descricao) values (?, ?)";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setLong(1, fabricante.getCodigo());
			ps.setString(2, fabricante.getDescricao());
			ps.execute();
			connection.commit(); // Salvando registro teste

		} catch (Exception e) {
			try {
				connection.rollback(); // Reverte alteração
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			e.printStackTrace();
		}
	}

}
