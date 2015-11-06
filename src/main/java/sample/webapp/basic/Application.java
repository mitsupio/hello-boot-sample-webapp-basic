package sample.webapp.basic;

import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.MessageFormat;

/**
 * Created by myokoyama on 2015/11/04.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        String springProfilesActive = System.getProperty("spring.profiles.active");
        if(!StringUtils.equals(springProfilesActive, "product")
                && !StringUtils.equals(springProfilesActive, "develop")) {
            throw new UnsupportedOperationException(MessageFormat.format("JVMの起動時引数 -Dspring.profiles.active で develop か product を指定してください（ -Dspring.profiles.active={0} ） 。", springProfilesActive));
        }
        SpringApplication.run(Application.class, args);
    }
}
