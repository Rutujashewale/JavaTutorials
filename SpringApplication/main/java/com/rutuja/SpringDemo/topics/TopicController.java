package com.rutuja.SpringDemo.topics;

import java.util.Arrays;
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
	private TopicService topicService;

	@RequestMapping("/topics")

	public List<TopicsData> getTopics() {
		return topicService.getAllTopics();

	}

	@RequestMapping("/topics/{id}")
	public TopicsData getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}

	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addTopic(@RequestBody TopicsData topicData)
	{
		topicService.addTopic(topicData);
	}

	@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
	public void updateTopic(@RequestBody TopicsData topicsData,@PathVariable String id)
	{
		topicService.updateTopic(id,topicsData);
	}

	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
}