package hello;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/ddd")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
    
    @GetMapping(value="/user",produces= {"application/json"})
    public ResponseEntity m(@RequestParam(name="n") String n) {
    	return new ResponseEntity(new User(n), HttpStatus.OK);
    }
    
    @GetMapping(value="c")
    public String c(Model m) {
    	ArrayList<User> lista = new ArrayList<User>();
    	lista.add(new User("mario"));
    	lista.add(new User("giuseppe"));
    	
    	m.addAttribute("ll", lista);
    	m.addAttribute("test", false);
    	m.addAttribute("n",10);
 
    	
    	return "result";
    }
}
