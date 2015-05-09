package assemble.selectClass;

import java.util.ArrayList;
import java.util.List;

/**
 * 备选课程类
 * @author asus
 *
 */
public class ListTest {
	/**
	 * 用于存放备选课程的List
	 */
	List coursesToSelect;

	public ListTest() {
		this.coursesToSelect = new ArrayList();
	}
	
	//用于往coursesToSelect中添加课程
	public void addTest(){
		Course cr = new Course("1", "数据结构");
		coursesToSelect.add(cr);
		Course temp = (Course) coursesToSelect.get(0);
		System.out.println("你添加了课程:"+temp.id+" --> "+temp.name);
	}
	
	public static void main(String[] args) {
		ListTest lt = new ListTest();
		lt.addTest();
	}
}
