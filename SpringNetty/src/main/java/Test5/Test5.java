package Test5;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import Mybatis.Classes;

public class Test5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String source="Test5/configuration.xml";
		Reader reader=Resources.getResourceAsReader(source);
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(reader);
		SqlSession session=sessionFactory.openSession(true);
		String statement="Test5.teacherMap.getClass";
		Classes classes=session.selectOne(statement,1);
        System.out.println(classes);
        session.close();
	}

}
