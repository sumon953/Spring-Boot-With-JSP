package SpringProjectnNew.SpringBoot.topic;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;


   /* @RequestMapping("/topics")
    public List<Topic> sayHello() {
        return Arrays.asList(
                new Topic("1","Sumon Sarder","Software Engineer"),
                new Topic("2","Khair","Software Engineer"),
                new Topic("3","Sujit","Software Engineer")
        );
    }
*/


    //Get Topics;
    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    //Get Topic;
    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id)
    {
        return topicService.getTopic(id);
    }

    //Post Method;
    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic)
    {
              topicService.addTopic(topic);
    }


    //PUT Method;
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic,@PathVariable String id)
    {
        topicService.updateTopic(id,topic);
    }

    //DELETE Method;
    //Get Topic;
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id)
    {
        topicService.deleteTopic(id);
    }

}


