package bookcurd_01_01;

import bookcurd_01_01.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookCurd0101ApplicationTests {

    //注入要测试的内容
    @Autowired
    private BookDao bookDao;

    @Test
    void contextLoads() {

    }

}
