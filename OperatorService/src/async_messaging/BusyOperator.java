package async_messaging;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
@SpringBootApplication
public class BusyOperator {

	private final DroidFactoryClient factoryClient = new DroidFactoryClient();
	private final InboxClient inboxClient = new InboxClient();

	public static void main(String[] args) {
		SpringApplication.run(BusyOperator.class, args);
		BusyOperator busyOperator = new BusyOperator();
		busyOperator.execute();

	}

	public void execute() {
		/*factoryClient.produceR2Async(inboxClient);
		inboxClient.printMessages();
		factoryClient.produce3POAsync(inboxClient);
		factoryClient.produceR2Async(inboxClient);
		inboxClient.printMessages();*/

	}

}
