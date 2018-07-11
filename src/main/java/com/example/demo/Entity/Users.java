/**
* @Description:    实体层配置各实体对象的属性以及getter/setter方法
* @Author:         
* @CreateDate:    
* @UpdateUser:     
* @UpdateDate:    
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
package com.example.demo.Entity;

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
		public void setPassword(String password) {
			this.password = password;
		}
		
	}
