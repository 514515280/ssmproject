package zust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import zust.model.SChicken;
import zust.model.User;
import zust.model.Userinfo;
import zust.service.UserService;
import zust.service.UserinfoService;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    UserinfoService userinfoService;

    @Autowired
    UserService userService;

    @Autowired
    HttpSession session;

    @RequestMapping(value = "/index.do",method = RequestMethod.GET)
    public String welcomeController(){
        return "hello";
    }

    @RequestMapping(value = "/register.do",method = RequestMethod.GET)
    public ModelAndView registerController(String rusername){
        ModelAndView mav = new ModelAndView("register","command",new User());
        mav.addObject("username",rusername);
        return mav;
    }

    @RequestMapping(value = "/register.do",method = RequestMethod.POST)
    public ModelAndView signupController(User user,String gender){
        ModelAndView mav = new ModelAndView("signup");
        user.setUserGender(gender);
        Userinfo userinfo = new Userinfo();
        System.out.println(user.getUserId());
        userService.insertUser(user);
        mav.addObject("user",user);
        session.setAttribute("user",user);
        return mav;
    }

    @RequestMapping(value = "/visit.do",method = RequestMethod.GET)
    public ModelAndView visitController(){
        ModelAndView mav = new ModelAndView("visitpage");
        List<SChicken> sclist = null;
        mav.addObject("sc",sclist);
        return mav;
    }

}
