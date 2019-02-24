import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.cn.pojo.Dept;


public class Test {
	public static void main(String[] args) throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sql = new SqlSessionFactoryBuilder().build(inputStream);
		// 获取session
	 	SqlSession session = sql.openSession();
	 	List<Dept> list = session.selectList("deptmapper.findAll");
	 	for (Dept dept : list) {
			System.out.println(dept);
		}
	 	List<Dept> list1 = session.selectList("deptmapper.findAll");
	 	for (Dept dept : list1) {
	 		System.out.println(dept);
	 	}
	 	/*Dept dept = session.selectOne("deptmapper.findById",2);
	 	System.out.println(dept);*/
	 	/*Map<String, Object> map = new HashMap<>();
	 	map.put("name", "P");
	 	map.put("bz", "JSP");
	 	List<Dept> list = session.selectList("deptmapper.likeByName1",map);
	 	for (Dept dept : list) {
			System.out.println(dept);
		}*/
//	 	Dept dept = new Dept(0,"采购部","2018-3-18","无");
//	 	int count = session.insert("deptmapper.add",dept);
//	 	session.commit();
//	 	System.out.println(count>0 ?"成功":"失败");
//	 	System.out.println(dept);
//	 	Dept dept=new Dept(5, "VV", null, null);
//	 	int count=session.update("deptmapper.update", dept);
//	 	session.commit();
//	 	System.out.println(count>0 ?"成功":"失败");
//	 	System.out.println(dept);
	 	
	 	/*session.delete("deptmapper.delete",5);
	 	session.commit();*/
	}
}
