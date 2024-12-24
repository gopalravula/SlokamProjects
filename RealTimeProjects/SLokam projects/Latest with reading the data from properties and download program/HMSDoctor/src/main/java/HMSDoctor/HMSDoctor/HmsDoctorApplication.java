package 
HMSDoctor.HMSDoctor;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.builders.PathSelectors;






@SpringBootApplication
@ComponentScan("com.doc.*")
@EntityScan("com.doc.entity")
@EnableJpaRepositories("com.doc.repo")
@EnableAspectJAutoProxy

public class HmsDoctorApplication {

	public static void main(String[] args) {
		SpringApplication.run(HmsDoctorApplication.class, args);
	}

	@Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
	
	
	
}
