package async_messaging;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/messages/", consumes = "application/json")
public class InboxResource {
	
	InboxClient inboxClient = new InboxClient();
	DroidFactory droidFactory = new DroidFactory();
	@PostMapping("r2")
	public ResponseEntity<String> R2Messages(@RequestBody Droids droids) {
		return new  ResponseEntity<String>(droidFactory.produce(droids).getName(), HttpStatus.OK);
	}
	
	@PostMapping("3po")
	public ResponseEntity<String> produce3PO(@RequestBody Droids droid) {
		return new ResponseEntity<>(droidFactory.produce(droid).getName(), HttpStatus.OK);
	}
}
