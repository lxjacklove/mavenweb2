package com.me.action;

import com.me.dto.UserDTO;
import com.me.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Mr Li
 * @create 2019
 */
@Controller
public class UserAction {
    //依赖服务层，自动注入
    @Autowired
    private UserService userService;
    @RequestMapping("/addUser.do")
    public String addUser(UserDTO dto){
        userService.addUser(dto);
        return "forward:/listUser.do";//默认先找了页面
    }
    @RequestMapping("/listUser.do")
    public ModelAndView listUser(HttpServletRequest request){
        ModelAndView mv=new ModelAndView();
       /* String id=request.getParameter("id");
        if(!StringUtils.isEmpty(id)){
            UserDTO dto=userService.getUser(Integer.parseInt(id));
            mv.addObject("dto",dto);
        }*/
        UserDTO byId=userService.getUser(2);
        mv.addObject("dto",byId);
        mv.setViewName("userlist");//逻辑视图
        return mv;
    }
}
