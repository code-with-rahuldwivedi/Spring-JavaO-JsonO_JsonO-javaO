package in.ashokit;

import java.io.File;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		ObjectMapper mapper =new ObjectMapper();
		try {
			Student student =mapper.readValue(new File("data/simple.json"), Student.class);
			System.out.println("Student Id: "+student.getId());
			System.out.println("Student firstName: "+student.getFristName());
			System.out.println("Student lastName: "+student.getLastName());
			
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
