package transaction.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ctrl")
public class IndexController {
    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "sss";
    }
    @RequestMapping("/demo")
    public ModelAndView demo(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }
}
