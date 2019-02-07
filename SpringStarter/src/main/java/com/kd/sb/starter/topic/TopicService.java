package com.kd.sb.starter.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service 
public class TopicService {
	
	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(new Topic("1","Java","Infy"),new Topic("2","JavaScript","HCL"),new Topic("3","CSS","Genpact")));

	public List<Topic> getTopics() {
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public String addTopic(Topic topic) {
		topics.add(topic);
		return topic.getId();
	}
	
	public String updateTopic(Topic topic,String id ) {
		for(int i=0; i<topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return id;
			}
		}
		return id;
	}
	
	public String deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
		return id;
	}
	
}
