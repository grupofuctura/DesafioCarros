import org.junit.Test;

import DAO.FabricanteDAO;
import Entidade.Fabricante;

public class TesteBancoJdbc {
	@Test
	public void iniciaBanco() {
		FabricanteDAO fDAO = new FabricanteDAO();
		Fabricante fab = new Fabricante();

		fab.setCodigo(3);
		fab.setDescricao("Peugeot");
		fDAO.salvar(fab);
	}

}
