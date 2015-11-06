package cn.lcb.cbframework.model;

import java.io.Serializable;
import java.util.Date;

/**
 * m站注册用户
 * */
public class RegisterUser implements Serializable {

	private static final long serialVersionUID = 218601278344979945L;
	
	private Integer userId ;  //用户id
	private String nickName ; //用户名
	private String password ; //登录密码
	private int sex ;  //性别：0为男，1为女
	private String openId ; // 微信open_id
	private String qq ;   // QQ号码
	private String email ;  // 邮箱
	private String phone ;  //  手机号码
	private Date registerTime ;  //注册时间
	private Date updateTime ;   //更新时间
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	
}
