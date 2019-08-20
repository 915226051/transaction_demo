package transaction.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import transaction.service.BookService;
import transaction.vo.Book;

import java.util.Date;

@Controller
@RequestMapping("/ctrl")
public class IndexController {

    @Autowired
    BookService bookService;

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
    @RequestMapping("/add")
    public String add(){
        Book book = new Book();
        book.setId(1);
        book.setPrice(3.1415);
        book.setPublishDate(new Date());
        book.setTitle("啥啊");
        try {
            bookService.add(book);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "success";
    }
}
