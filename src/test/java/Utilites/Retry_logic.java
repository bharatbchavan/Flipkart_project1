package Utilites;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_logic implements IRetryAnalyzer {

	int retrycount=1;
	int retryincount=0;
	
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(retryincount<retrycount) {
			retryincount++;
			return true;
		}
			
			
		return false;
	}

}
