package Mybatis;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String resource="Mybatis/config.xml";
		Reader reader=Resources.getResourceAsReader(resource);
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
		SqlSession session=sqlSessionFactory.openSession();
		String statement="Mybatis.userMapper"+".getUser";
		User user=session.selectOne(statement,2);
		System.out.println(user);
     
	}

}
