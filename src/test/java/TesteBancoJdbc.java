import java.util.List;

import org.junit.Test;

import DAO.FabricanteDAO;
import DAO.FabricanteDAOImpl;
import Entidade.Fabricante;

public class TesteBancoJdbc {
	@Test
	public void iniciaBanco() {
		FabricanteDAOImpl fDAO = new FabricanteDAOImpl();
		Fabricante fab = new Fabricante();

		fab.setCodigo(4);
		fab.setDescricao("Renault");
		fDAO.inserir(fab);
	}

	@Test
	public void listarFabricante() {
		FabricanteDAOImpl fDao = new FabricanteDAOImpl();
		try {
			List<Fabricante> lista = fDao.listarTodos();

			for (Fabricante fabricante : lista) {
				System.out.println(fabricante.getDescricao());
				System.out.println("***************************");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	@Test
//	public void testarUpdate() {
//
//		try {
//			Fabricante fabricante = new Fabricante();
//			FabricanteDAOImpl fDao = new FabricanteDAOImpl();
//			fDao.alterar(fabricante);
//
//			fabricante.setDescricao("Alterado por meio do teste JUnit");
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}

}
