package com.kd.sb.starter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	public TopicService topicService;
	
	@RequestMapping("/")
	public String root() {
		return "<marquee><b>Welcome to the Home Page</b></marquee>";
	}
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return topicService.getTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/topics")
	public String addTopic(@RequestBody Topic topic) {
		return topicService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT , value="/topics/{foo}")
	public String updateTopic(@RequestBody Topic topic, @PathVariable("foo") String id) {
		return topicService.updateTopic(topic, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE , value="/topics/{foo}")
	public String deleteTopic( @PathVariable("foo") String id) {
		return topicService.deleteTopic(id);
	}

}
