package bookcurd_01_01.dao;

import bookcurd_01_01.domain.Admin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @date 2021/12/4 15:32
 */
@Mapper
public interface PlusUserDao extends BaseMapper<Admin> {

}
