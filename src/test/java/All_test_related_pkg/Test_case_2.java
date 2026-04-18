package All_test_related_pkg;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import All_pages_related_pkg.Searchfield_page;
import Utilites.Base_class;
import Utilites.Listner_logic;
import Utilites.Retry_logic;
@Listeners(Listner_logic.class)
public class Test_case_2  extends Base_class {

@Test(retryAnalyzer = Retry_logic.class)
	
	public void validcredentials4() {
		
	Searchfield_page g4=new Searchfield_page(driver);
	g4.clickoncrossbutton();
	g4.searchfield3();
	}
}
