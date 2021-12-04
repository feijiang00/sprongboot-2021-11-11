package bookcurd_01_01.dao.impl;

import bookcurd_01_01.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @author 15847
 * @title: BookDaoImpl
 * @projectName spirngbootDemo
 * @description: TODO
 * @date 2021/11/1213:25
 */
@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("test");
    }
}
