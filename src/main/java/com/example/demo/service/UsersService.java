/**
* @Description:    Dao层依赖注入 
* @Author:         @author lind001
* @CreateDate:     2018-7-11
* @UpdateUser:     @author lind001
* @UpdateDate:     2018-7-12
* @UpdateRemark:   更正了1.0中的bug，添加了@Service与@Autowired注解，添加了doregister()方法  
* @Version:        2.0 
*/
package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UsersDao;
import com.example.demo.entity.Users;

/**
 * @author lind001
 *
 */
@Service 
public class UsersService {
	@Autowired 
	private UsersDao usersDao;
	
	public Users dologin(Users users) {
		users = this.usersDao.login(users.getUserName(), users.getPassword());
		return users;
	}
	
	//@Version1.0 ： ResultType = void 
	public void doregister(Users users) {
		this.usersDao.register(users.getUserName(), users.getPassword(), users.getAge(), users.getSex(), users.getRemark());
	}
	
}

