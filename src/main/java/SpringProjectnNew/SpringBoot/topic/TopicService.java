package SpringProjectnNew.SpringBoot.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {


  private List<Topic> topics = new ArrayList<>( Arrays.asList(
                new Topic("1","Sumon Sarder","Software Engineer"),
                new Topic("2","Khair","Software Engineer"),
                new Topic("3","Sujit","Software Engineer"),
                new Topic("4","Sumon Sarder","Software Engineer"),
                new Topic("5","Khair","Software Engineer"),
                new Topic("6","Sujit","Software Engineer")
        ));



  //Get Method;
  public List<Topic> getAllTopics()
  {
      return topics;
  }


    public Topic getTopic(String id)
    {
        return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
    }


    //Post Method;
    public void addTopic(Topic topic) {
      topics.add(topic);
    }


    //PUT Method;
    public void updateTopic(String id,Topic topic) {
      for (int i=0;i<topics.size();i++)
      {
        Topic t = topics.get(i);

        if (t.getId().equals(id))
        {
          topics.set(i,topic);
          return;
        }
      }

    }


  //Delete Method;
  public void deleteTopic(String id) {
     topics.removeIf(t->t.getId().equals(id));
  }
}
