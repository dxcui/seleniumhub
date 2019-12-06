import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class hub {
    @Test
    public void test(){
        clearBrowserCookies();
        Configuration.remote="http://localhost:5001/wd/hub";
        open("http://www.baidu.com");
        screenshot("百度");

        sleep(20000);
    }

    @Test
    public void test1(){
        clearBrowserCookies();
        Configuration.remote="http://localhost:5001/wd/hub";
        open("http://qq.com");
        screenshot("百度");
        sleep(20000);
    }
}
