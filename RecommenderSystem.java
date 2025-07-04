package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class RecommenderSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
    	System.setProperty("webdriver.edge.driver", "C://Users//YOYO//Downloads//edgedriver_win64//msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/?tag=msndeskabkin-21&ref=pd_sl_8m0512m97v_e&adgrpid=1317216540160148&hvadid=82326299627209&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=158428&hvtargid=kwd-82326918609608:loc-90&hydadcr=5623_2377284&mcid=f13fcffd1964377ea436bb8da9e6f147");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.id("a-autoid-0-announce")).click();
		driver.findElement(By.id("s-result-sort-select_5")).click();
	//	Select select = new Select(driver.findElement(By.id("a-autoid-0-announce")));
	//	select.selectByVisibleText("Best Sellers");		
				

	}

}
