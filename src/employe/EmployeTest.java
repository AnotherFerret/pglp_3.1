package employe;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmployeTest {

	Employe e;
	
	@Before
	public void setUp() throws Exception {
		 e = new Employe("name", "name2");
	}

	@Test
	public void testGetAll() {
		assertEquals(e.getAll(), "name name2 ");
	}
	
	@Test
	public void testCalculSalaire()
	{
		assertEquals(e.CalculSalaire(), 500);
	}

}
