
import calculo.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class UsuarioTest {
    
    public UsuarioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
   @Test
      public void testlogin(){
          Usuario.login("nombreUser", "abdn");
      }
   
    @Test
      public void testSolicitudCalc(){
          Usuario.solicitarCalc("Jorge", "alumno",15);
      }

   @Test 
     public void testSolicitudCalcAlumno(){
         Usuario.solicitarCalc("Manuel", "alumno", 4);
     }
}
