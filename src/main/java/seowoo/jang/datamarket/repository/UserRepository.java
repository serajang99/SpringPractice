package seowoo.jang.datamarket.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import seowoo.jang.datamarket.model.UserDto;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface UserRepository {
    public UserDto findById(@Param("id") Integer id);

    public List<UserDto> findAll();

    public Integer insertUser(@Param("user") UserDto user);
}
