package boot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import boot.model.Topic;

@Repository
public interface TopicRepo extends CrudRepository<Topic, Integer>{

}
