package rebue.pfm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.SpringCloudApplication;
@ServletComponentScan("rebue.sbs.smx.filter")
@SpringCloudApplication
public class PfmApplication {

	public static void main(String[] args) {
		SpringApplication.run(PfmApplication.class, args);
	}

}