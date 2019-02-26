package com.ocbcnisp.api.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ocbcnisp.api.models.Topic;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(new Topic("spring", "Spring Framework", "Spring Framework Description"),
			new Topic("java", "Java core", "Core Java Description"),
			new Topic("javascript", "JQuery", "Java Framework Description")));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equalsIgnoreCase(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(Topic topic, String id) {
		for(int i =0; i< topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
		
	}

	public void deleteTopic(String id) {
		topics.removeIf(t-> t.getId().equalsIgnoreCase(id));
		
	}
}
