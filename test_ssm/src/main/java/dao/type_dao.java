package dao;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import zz.type;

@Repository
public interface type_dao {

@Select("select * from type")
  public List<type> select();
  @Select("select * from type where id = #{id}")
  public type selectbyid(int id);
  @Select("SELECT * from type WHERE name LIKE '%${txt}%'")
  public List<type> selectbyname(@Param("txt") String name);
  @Select("insert into type(name) values(#{name})")
  public  void insert(type t);
  @Select("update type set name=#{name} where id = #{id}")
  public String update(type t);
  @Select("delete from type where id=#{id}")
  public void delete(type t);
}
