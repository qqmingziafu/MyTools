package org.cyj.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.cyj.entity.test_user;


public interface Test_User_Mapper {

    @Select("select * from test_user where name =#{name} ")
    test_user findByName(@Param("name") String name);
    @Insert("insert into test_user(name,sex,age) values (#{name},#{sex},#{age})")
    int insert(@Param("name") String name,@Param("sex") String sex,@Param("age") String age);

}
