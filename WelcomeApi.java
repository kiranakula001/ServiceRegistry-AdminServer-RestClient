package microservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeApi {
	
	@GetMapping("/welcome")
	public String getWelcome()
	{
		return "Successfully Created Client for the Servers!!";
	}

}
