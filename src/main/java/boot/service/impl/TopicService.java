package boot.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import boot.model.Topic;
import boot.repository.TopicRepo;
import boot.service.BootService;

@Service("topic")
public class TopicService implements BootService {
	
	@Autowired
	private TopicRepo repo;

	@Override
	public String sayHi(String name) {
		return String.format("Welcome to topics section %s!", name);
	}

	@Override
	public List<Topic> getTopics() {
		List<Topic> topics = new ArrayList<>();
		repo.findAll().forEach(topics::add);
		return topics;
	}
	
	@Override
	public Topic getTopic(int id) {
		return repo.findOne(id);
	}

	@Override
	public Topic addTopic(Topic topic) {
		return repo.save(topic);
	}

	@Override
	public Topic updateTopic(Topic topic) {
		return repo.save(topic);
	}

	@Override
	public void deleteTopic(int id) {
		repo.delete(id);
	}
	
}
