package org.main;
import org.domain.User;
public class Hello{
	public void info() {
		System.out.println("Hello de info");
	}
	public static void main (String[] args){
         Class<Hello> cls = Hello.class;
         Module mod = cls.getModule();
		System.out.println(mod.getName());
		new Hello().info();
		System.out.println(new User().sayHi("will "));
	} 
}