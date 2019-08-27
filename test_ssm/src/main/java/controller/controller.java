package controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import service.Impl.type_service;
import zz.type;

@Controller
public class controller {
	@Autowired
	type_service bll;
	@RequestMapping("index")
	public  String index(ModelMap m) {
		m.put("list", bll.select());
		return "index";
	}
	@RequestMapping("select2")
	public  String select(String txt,ModelMap m) {
		m.put("list", bll.selectbyname(txt));
		return "index";
	}
	@RequestMapping("insert")
	public String insert(type t,ModelMap m) {
		 bll.insert(t);
		return index(m);
	}
	@RequestMapping("update")
	public String update(type t,ModelMap m) {
		bll.update(t);
		return index(m);
	}
	@RequestMapping("update2")
	public String update(int id ,ModelMap m) {
		m.put("info",  bll.selectbyid(id));
		 return "edit";
	}
	@RequestMapping("delete")
	public String delete(type t,ModelMap m) {
		 bll.delete(t);
		return index(m);
	}

}
