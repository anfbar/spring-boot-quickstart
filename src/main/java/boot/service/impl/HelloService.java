package boot.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import boot.model.Topic;
import boot.service.BootService;

@Service("hello")
public class HelloService implements BootService {

	@Override
	public String sayHi(String name) {
		return String.format("Hello %s! Methods here not yet implemented", name);
	}

	@Override
	public List<Topic> getTopics() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Topic getTopic(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Topic addTopic(Topic topic) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Topic updateTopic(Topic topic) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteTopic(int topic) {
		// TODO Auto-generated method stub
	}

}
