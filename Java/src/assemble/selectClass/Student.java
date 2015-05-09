package assemble.selectClass;

import java.util.HashSet;
import java.util.Set;
/**
 * 这是一个学生类
 * @author asus
 *
 */
public class Student {
	String id;
	String name;
	Set course;
	public Student(String id, String name) {
		this.id = id;
		this.name = name;
		this.course = new HashSet();
	}
}
