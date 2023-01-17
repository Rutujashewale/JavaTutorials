package com.rutuja.SpringDemo.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	public List<TopicsData> topicsData = new ArrayList<>(Arrays.asList(
			new TopicsData ("Spring", "Spring framework" , "Spring Description"),
			new TopicsData ("Java", "java framework" , "java Description"), 
			new TopicsData ("PHP", "PHP framework" , "PHP Description")));


	public List<TopicsData> getAllTopics(){
		return topicsData;
	}


	public TopicsData getTopic(String id) {

		for(int i=0;i<topicsData.size();i++) {
			TopicsData tData=topicsData.get(i);
			if(id.equals(tData.getId())) {
				return tData;
			}
		}
		return null;

	}
	
		public void addTopic(TopicsData topicData) {
		topicsData.add(topicData);
		
	}


	public void updateTopic(String id, TopicsData topicData) {

		for(int i=0;i<topicsData.size();i++) {
			TopicsData tData=topicsData.get(i);
			if(id.equals(tData.getId())) {
				topicsData.set(i, topicData);
				return;
			}
		}
	}


	public void deleteTopic(String id) {
		for(int i=0;i<topicsData.size();i++) {
			TopicsData tData=topicsData.get(i);
			if(id.equals(tData.getId())) {
				topicsData.remove(tData);
			}
	}
	}
}


	



