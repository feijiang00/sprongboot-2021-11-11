package bookcurd_01_01;

import bookcurd_01_01.dao.BookDao;
import bookcurd_01_01.dao.PlusUserDao;
import bookcurd_01_01.dao.UserDao;
import bookcurd_01_01.domain.Admin;
import bookcurd_01_01.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 注入我们要测试的对象
 * 执行对象中要测试的方法
 */
@SpringBootTest
class BookCurd0101ApplicationTests {

    //注入要测试的内容
    @Autowired
    private BookDao bookDao;

    @Autowired
    private UserDao userDao;

    @Autowired
    private PlusUserDao plusUserDao;

    @Test
    void contextLoads() {
//        bookDao.save();
        User user = userDao.getById(1);
        System.out.println(user);
    }

    /**
     *Mybatis-plus自动为我们做好了映射比如 实体类Admin中 是userName，但是数据库是user_name
     * 其次，Mybatis-plus自动给我们写了很多的查询语句，plus永远的神！
     */
    @Test
    public void MybatisPlus(){
        Admin admin = plusUserDao.selectById(1);
        System.out.println(admin);
    }

}
