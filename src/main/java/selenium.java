import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {

    //Test the search button of the Google
    //Steps:
    //1.Open a certain browser , eg: Chrome
    //2. Navigate to google search engine:
    //3. Type "ahihihihihi" in the search box
    //4. Click the search button {or enter}
    // Nếu tình huống này làm  = tay => manual testing
    // Nếu tình huống này làm tự động hoá = selenium => test automation
    // Mọi thứ trong java là object, ngay cả cái trình duyệt cũng là object
    // Muốn có object cần class và new...

    public static void testSearchGoogle() {
        //Cần cbi: báo đường dẫn đường trỏ đến Driver.ext => sang real browser
        String driverPath = "chromedriver.exe"; // mặc định tìm ở thư mục app của mình
        System.setProperty("webdriver.chrome.driver",driverPath); //đăng kí với máy ảo java cbi kết nối bên ngoài hệ thống
                                                                //tải driver điều khiển trình duyêt

        WebDriver myBrowser = new ChromeDriver();
        myBrowser.get("https://google.com");
        WebElement searchBox = myBrowser.findElement(By.name("q"));
        searchBox.sendKeys("zingnews.vn");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        searchBox.submit();
    }

    public static void main(String[] args) {

        testSearchGoogle();
    }
}