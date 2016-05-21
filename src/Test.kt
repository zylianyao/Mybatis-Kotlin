import org.apache.ibatis.io.Resources
import org.apache.ibatis.session.SqlSessionFactoryBuilder

/**
 * 拿客 www.coderknock.com
 * 三产 创建于 2016年05月12:15:52.
 */
fun main(args: Array<String>) {
    var resource = "mybatis-config.xml";
    var inputStream = Resources.getResourceAsStream(resource);
    var sqlSessionFactory = SqlSessionFactoryBuilder().build(inputStream);
    var session = sqlSessionFactory.openSession();
    try {
        //这句和Java中调用不同注意泛型部分java中使用下面调用
        //  Blog blog = (Blog) session.selectOne("org.mybatis.example.BlogMapper.selectBlog", 101);
        var blog = session.selectOne<Blog>("org.mybatis.example.BlogMapper.selectBlog", 10)
        //blog?会判断blog对象是否为空，如果为空返回null否则菜返回其name属性，防止空指针
        println(blog?.name)
    } finally {
        session.close();
    }
}