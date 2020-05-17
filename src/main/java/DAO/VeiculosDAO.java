package DAO;

import java.util.List;

import Entidade.Veiculos;

public interface VeiculosDAO {
	public void inserir(Veiculos veiculo);

	public void alterar(Veiculos veiculo);

	public void remover(Veiculos veiculo);

	public Veiculos pesquisar(int codigo);

	public List<Veiculos> listarTodos();

}
