package async_messaging;

import org.springframework.web.bind.annotation.*;
import java.util.concurrent.CompletableFuture;



@RestController
@RequestMapping(value = "/droid/", consumes = "application/json")
public class DroidFactoryResource {

    private final DroidFactory factory = new DroidFactory();

//    @PostMapping("r2")
//    public ResponseEntity<Droid> produceR2(@RequestBody Droids droid) {
//        return new ResponseEntity<>(factory.produce(droid), HttpStatus.OK);
//    }
//
//    @PostMapping("3po")
//    public ResponseEntity<Droid> produce3PO(@RequestBody Droids droid) {
//        return new ResponseEntity<>(factory.produce(droid), HttpStatus.OK);
//    }


    @PostMapping("r2")
    public CompletableFuture<String> produceR2Async(@RequestBody Droids droid) {
        return CompletableFuture.completedFuture(factory.produce(droid).getName());
    }

    @PostMapping("3po")
    public CompletableFuture<String> produce3POAsync(@RequestBody Droids droid) {
        return  CompletableFuture.completedFuture(factory.produce(droid).getName());
    }

}
