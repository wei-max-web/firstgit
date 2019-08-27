package service.Impl;

import java.util.List;

import zz.type;

public interface type_service {
	  public List<type> select();
	  public type selectbyid(int id);
	  public List<type> selectbyname(String name);
	  public void insert(type t);
	  public void update(type t);
	  public void delete(type t);

}
