package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import Entidade.Fabricante;
import Util.JdbcUtil;

public class FabricanteDAOImpl implements FabricanteDAO {

	private List<Fabricante> listaFabricantes;

	@Override
	public void inserir(Fabricante fabricante) {
		String sql = "insert into FABRICANTE (CODIGO, DESCRICAO) values (?, ?)";

		Connection conexao;
		try {
			conexao = JdbcUtil.getConnection();

			PreparedStatement ps = conexao.prepareStatement(sql);

			ps.setInt(1, fabricante.getCodigo());
			ps.setString(2, fabricante.getDescricao());

			ps.execute();
			ps.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void alterar(Fabricante fabricante) {
		String sql = "UPDATE FABRICANTE SET DESCRICAO = ? where CODIGO = ?";

		Connection conexao;
		try {
			conexao = JdbcUtil.getConnection();

			PreparedStatement ps = conexao.prepareStatement(sql);

			ps.setString(1, fabricante.getDescricao());
			ps.setInt(2, fabricante.getCodigo());
			ps.execute();
			ps.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void remover(Fabricante fabricante) {
		String sql = "DELETE FROM FABRICANTE WHERE CODIGO = ?";

		Connection conexao;
		try {
			conexao = JdbcUtil.getConnection();

			PreparedStatement ps = conexao.prepareStatement(sql);

			ps.setInt(1, fabricante.getCodigo());

			ps.execute();
			ps.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Fabricante pesquisar(int codigo) {
		String sql = "select F.DESCRICAO from FABRICANTE F where CODIGO = ?";

		Fabricante fabricante = null;

		Connection conexao;
		try {
			conexao = JdbcUtil.getConnection();

			PreparedStatement ps = conexao.prepareStatement(sql);

			ps.setInt(1, codigo);

			ResultSet res = ps.executeQuery();

			while (res.next()) {
				fabricante = new Fabricante();
				fabricante.setCodigo(res.getInt("CODIGO"));
				fabricante.setDescricao(res.getString("DESCRICAO"));
			}

			ps.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return fabricante;
	}

	@Override
	public List<Fabricante> listarTodos() {
		String sql = "select F.CODIGO, F.DESCRICAO from FABRICANTE F";

		listaFabricantes = null;

		Connection conexao;
		try {
			conexao = JdbcUtil.getConnection();

			PreparedStatement ps = conexao.prepareStatement(sql);

			ResultSet res = ps.executeQuery();

			while (res.next()) {

				Fabricante fabricante = new Fabricante();
				fabricante.setCodigo(res.getInt("CODIGO"));
				fabricante.setDescricao(res.getString("DESCRICAO"));

				listaFabricantes.add(fabricante);
			}

			ps.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listaFabricantes;
	}

}
