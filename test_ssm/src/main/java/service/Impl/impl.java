package service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.type_dao;
import zz.type;

@Service
public class impl implements type_service {
	@Autowired
	type_dao dao;

	public List<type> select() {
		
		return dao.select();
	}

	public void insert(type t) {
		dao.insert(t);
	}

	public void delete(type t) {
		 dao.delete(t);
	}

	public void update(type t) {
		dao.update(t);
		
	}

	public type selectbyid(int id) {
		return dao.selectbyid(id);
	}
	public List<type> selectbyname(String name) {
		return dao.selectbyname(name);
	}


}
