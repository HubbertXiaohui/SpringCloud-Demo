package com.plpig.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plpig.springcloud.dao.DeptDao;
import com.plpig.springcloud.entities.Dept;
import com.plpig.springcloud.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService
{
	@Autowired
	private DeptDao dao;


	@Override
	public Dept get(Long id)
	{
		return dao.findById(id);
	}

}
