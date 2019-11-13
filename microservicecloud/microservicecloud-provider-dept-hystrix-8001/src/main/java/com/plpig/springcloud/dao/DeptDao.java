package com.plpig.springcloud.dao;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.plpig.springcloud.entities.Dept;

@Mapper
public interface DeptDao
{

	public Dept findById(Long id);

}
