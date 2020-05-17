package DAO;

import java.util.List;

import Entidade.Pecas;

public interface PecasDAO {
	public void inserir(Pecas peca);

	public void alterar(Pecas peca);

	public void remover(Pecas peca);

	public Pecas pesquisar(int codigo);

	public List<Pecas> listarTodos();

}
