package ashwini.kafkaguide.springboot.controller;

import ashwini.kafkaguide.springboot.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {

    @Autowired
    JSONMessageController jsonMessageController;

    @GetMapping("/")
    public String index(){
    return "index";
    }

    @PostMapping("/register")
    public String userRegistration(@ModelAttribute User user){
        System.out.println(user.toString());
        jsonMessageController.publish(user);
        return "welcome";
    }
}
