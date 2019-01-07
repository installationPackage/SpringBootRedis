package springboot_mongodb.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springboot_mongodb.entity.Student;

@Controller
public class StudentController {
    @Autowired
    private MongoOperations mongoOperations;
    @RequestMapping("/addStudent")
    @ResponseBody
    public String addStudent(){
         Student student = new Student("王二麻子",12);
         mongoOperations.save(student);
         return "SUCCEED";
    }

}
