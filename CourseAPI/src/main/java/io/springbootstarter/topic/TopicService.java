package io.springbootstarter.topic;


import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
            new Topic("Spring", "Spring Framework", "Spring Framework Description"),
            new Topic("Java", "Core Java", "Core Java Description"),
            new Topic("JavaScript", "Core JavaScript", "Core JavaScript Description")

        );

    public List<Topic> getAllTopics(){
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

}
