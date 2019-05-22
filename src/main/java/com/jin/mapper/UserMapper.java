package com.jin.mapper;


import com.jin.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserMapper {

    User Sel(int id);
}
