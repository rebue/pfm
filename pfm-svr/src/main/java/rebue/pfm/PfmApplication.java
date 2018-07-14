package rebue.pfm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.SpringCloudApplication;

//这个注解是为了使该包内的过滤器生效。
@ServletComponentScan("rebue.sbs.smx.filter")
@SpringCloudApplication
public class PfmApplication {

    public static void main(String[] args) {
        SpringApplication.run(PfmApplication.class, args);
    }

}