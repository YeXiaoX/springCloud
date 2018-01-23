package example;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
/**
 * Created by yexiaoxin on 2018/1/23.
 */
@RestController
public class HelloController {
    @RequestMapping("/index")
    public String index(){
        return "welcome";
    }
}