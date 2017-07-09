package boot.service;

import java.util.List;

import boot.model.Topic;

public interface BootService {
	
	public String sayHi(String name);
	
	public List<Topic> getTopics();
	
	public Topic getTopic(int id);
	
	public Topic addTopic(Topic topic);
	
	public Topic updateTopic(Topic topic);
	
	public void deleteTopic(int topic);
}
