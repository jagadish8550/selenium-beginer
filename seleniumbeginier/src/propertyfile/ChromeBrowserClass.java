package propertyfile;

import java.util.ArrayList;
import java.util.List;

public class ChromeBrowserClass {
	public static void main(String[] args) {
		String s="Nikhil Anil Kumar".toLowerCase();
//		List al=new ArrayList();
//		for (int i = 0; i < s.length(); i++) {
//			if(!(al.contains(s.charAt(i)))) {
//				al.add(s.charAt(i));
//			}
//		}
//		for (Object object : al) {
//			System.out.print(object);
//		}
		String s2="";
		for (int i = 0; i < s.length(); i++) {
			String temp=s.charAt(i)+"";
			if(!(s2.contains(temp))) {
				s2=s2+s.charAt(i);
			}
		}
		System.out.println(s2);
	}
}
