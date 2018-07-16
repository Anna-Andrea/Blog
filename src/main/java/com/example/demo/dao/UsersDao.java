/**
* @Description:    java类作用描述
* @Author:         @author lind001
* @CreateDate:     2018-7-11
* @UpdateUser:     @author lind001
* @UpdateDate:     2018-7-12
* @UpdateRemark:   修正了@Version1.0中的错误，添加了@Mapper和@Repository注解 
* @Version:        2.0 
*/
package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Users;
/**
 * @author lind001
 *
 */
@Mapper
@Repository
public interface UsersDao {
	public Users login(String userName,String password);
	public Users register(String userName,String password,int age,String sex,String remark);
	
}
