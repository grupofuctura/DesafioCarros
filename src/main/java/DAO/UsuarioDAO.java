package DAO;

import java.util.List;

import Entidade.Usuarios;

public interface UsuarioDAO {
	public void inserir(Usuarios usuario);

	public void alterar(Usuarios usuario);

	public void remover(Usuarios usuario);

	public Usuarios pesquisar(int codigo);

	public List<Usuarios> listarTodos();

}
