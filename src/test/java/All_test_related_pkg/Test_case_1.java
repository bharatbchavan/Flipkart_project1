package All_test_related_pkg;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import All_pages_related_pkg.Home_page;
import Utilites.Base_class;
import Utilites.Listner_logic;
import Utilites.Retry_logic;
@Listeners(Listner_logic.class)
public class Test_case_1 extends Base_class{
	
	@Test(retryAnalyzer = Retry_logic.class)
	
	public void validcredentials1() {
		
		Home_page b= new Home_page(driver);
		b.clickoncrossbutton();
		
		
	}

}
