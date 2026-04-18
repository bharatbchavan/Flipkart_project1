package All_test_related_pkg;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import All_pages_related_pkg.Product_page;

import Utilites.Base_class;
import Utilites.Listner_logic;
import Utilites.Retry_logic;
@Listeners(Listner_logic.class)
public class Test_case_3 extends Base_class {

@Test(retryAnalyzer = Retry_logic.class)
	
	public void validcredentials4() {
		
	Product_page g5=new Product_page(driver);
	g5.clickoncrossbutton();
	g5.searchfield3();
	g5.clickonfirstproduct();
	}
}

