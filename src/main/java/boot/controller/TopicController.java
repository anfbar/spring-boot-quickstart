package boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import boot.model.Topic;
import boot.service.BootService;

@RestController
public class TopicController {
	
	@Autowired()
	@Qualifier("topic")
	private BootService myServ;
	
	@RequestMapping("/")
	public String sayHi(@RequestParam(name="name", defaultValue="User") String param) {
		return myServ.sayHi(param);
	}
	
	@GetMapping("/topic/all")
	public List<Topic> getAllTopics() {
		return myServ.getTopics();
	}
	
	@GetMapping("/topic/{id}")
	public Topic getTopic(@PathVariable int id) {
		return myServ.getTopic(id);
	}
	
	@PostMapping("/topic/add")
	public Topic addTopic(@RequestBody Topic topic) {
		return myServ.addTopic(topic);
	}
	
	@PostMapping("/topic/update")
	public Topic updTopic(@RequestBody Topic topic) {
		return myServ.updateTopic(topic);
	}
	
	@GetMapping("/topic/delete/{id}")
	public void delTopic(@PathVariable int id) {
		myServ.deleteTopic(id);
	}

}
