/**
* @Description:    从request对象中接收用户post的数据，交由Module-Service层处理，并将结果返回session对象
* @Author:         @author lind001
* @CreateDate:     2018-7-11
* @UpdateUser:     @author lind001
* @UpdateDate:     2018-7-12
* @UpdateRemark:   更正了1.0中的错误，添加了@Controller和@Autowired注解，添加了login()方法
* @Version:        2.0
*/
package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Users;
import com.example.demo.service.UsersService;

/**
 * @author lind001
 *
 */
@Controller
public class UsersController {
	//注入Service层依赖
	@Autowired 
	private UsersService usersService;
	
    @RequestMapping("/tologin.action")
    public String index() {
        return "login";
    }

    @RequestMapping(value = "login.action")
    public ModelAndView login(Users users, HttpServletRequest request, HttpSession session) {
        ModelAndView mav = new ModelAndView();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        users.setUserName(username);
        users.setPassword(password);
        users = this.usersService.dologin(users);
        if (users != null) {
            session.setAttribute("users", users);
            //@Subscription:Set a view name for this ModelAndView, to be resolved by the DispatcherServlet via a ViewResolver. Will override any pre-existing view name or View.
            mav.setViewName("detail");
            return mav;
        } else {
            session.setAttribute("errormsg", "账号或密码错误!请重新输入");
        }
        mav.setViewName("login");
        return mav;
    }
	
}
