package bookcurd_01_01.dao;

import bookcurd_01_01.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @date 2021/12/4 14:40
 */
@Mapper
public interface UserDao {

    @Select("select * from admin where id = #{id}")
    public User getById(Integer id);
}
