package Mybatis;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.aspectj.runtime.reflect.Factory;
import  org.junit.Test;
import org.springframework.core.io.Resource;

public class Test2 {
	
	public void testAdd() throws IOException {
		String resource="Mybatis/Config.xml";
		Reader reader=Resources.getResourceAsReader(resource);
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(reader);
		//默认手动
		SqlSession session=sessionFactory.openSession();
		
		String statement="Mybatis.userMapper.addUser";
		User user=new User();
		user.setName("vic");
		user.setAge(23);
		int i=session.insert(statement,user);
		//提交
		session.commit();
		session.close();
		System.out.println(i);
	}
	@Test
	public void testGetAll() throws IOException {
		String resource="Mybatis/config.xml";
		Reader reader=Resources.getResourceAsReader(resource);
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(reader);
		SqlSession session=sessionFactory.openSession(true);
		String statement="Mybatis.userMapper.selectAll";
		List<User> users=session.selectList(statement);
		for(User u:users) {
			System.out.println(u);
		}
		session.close();
	}
	

}
