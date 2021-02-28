package com.java.javareact.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
@Mapper
public interface MemberDao {

    public Map<String,Object> login(Map<String,Object> param);

}
