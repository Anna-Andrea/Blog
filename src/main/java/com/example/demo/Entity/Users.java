/**
* @Description:    实体层配置各实体对象的属性以及getter/setter方法
* @Author:         @author lind001
* @CreateDate:     2018-7-11
* @UpdateUser:     @author lind001
* @UpdateDate:     2018-7-12
* @UpdateRemark:   调整并规范了Users类的各个属性的getter与setter方法
* @Version:        2.0 
*/
package com.example.demo.entity;

/**
 * @author lind001
 *
 */
public class Users {
		//@SubScription：login方法所需属性
		private String userName;
		private String password;
		//@SubScription: register方法以及博客项目其他方法所需属性
		private int age;
		private String sex;
		private String remark;
		//...
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public String getRemark() {
			return remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
		
	}
