package DAO;

import java.util.List;

import Entidade.Fabricante;

public interface FabricanteDAO {

	public void inserir(Fabricante fabricante);

	public void alterar(Fabricante fabricante);

	public void remover(Fabricante fabricante);

	public Fabricante pesquisar(int codigo);

	public List<Fabricante> listarTodos();

}
