package hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

@Controller
public class MyController {
	
	@GetMapping(value="/")
	public String home() {
		return "index";
	}
	
	@GetMapping(value="/myservice")
	public String metodo(@RequestParam String nome, @RequestParam String cognome) {
		return "result";
	}
	
	@GetMapping(value="/m", produces= {"application/json"})
	public ResponseEntity m(@RequestParam(name="nome") String n, @RequestParam String cognome) {	
		return new ResponseEntity(10, HttpStatus.OK);
	}
	
	@GetMapping(value="/mon", produces= {"plain/text"})
	public ResponseEntity mon() {
		MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://ds046549.mlab.com:46549"));
		DB database = mongoClient.getDB("baudo2048");
		//boolean auth = database.authenticate("username", "pwd".toCharArray());
		
		DBCollection collection = database.getCollection("TheCollectionName");
		
		mongoClient.close();
		return new ResponseEntity("ok", HttpStatus.OK);
	}
}
