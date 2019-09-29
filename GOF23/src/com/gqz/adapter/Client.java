package com.gqz.adapter;

/**
 *  客户端类
 * (相当于例子中的笔记本，只有USB接口)
 * 
* @ClassName: Client
* @Description: TODO(这里用一句话描述这个类的作用)
* @author ganquanzhong
* @date 2019年7月22日 下午3:11:57
 */
public class Client {
	
	public void test1(Target t){
		t.handleReq();
	}
	
	public static void main(String[] args) {
		Client  c = new Client();
		
		Adaptee a = new Adaptee();
		
		//使用类适配器
//		Target t = new Adapter();

		//使用对象适配器方式
		Target t = new Adapter2(a);
		
		c.test1(t);
		
	}
	
}
