package com.mzj.action;

import com.mzj.dao.pojo.Stu;
import com.mzj.service.iservice.IStuService;
import com.mzj.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/21.
 */
@Controller
@RequestMapping("stu")
public class StuAction {
    @Autowired
    @Qualifier("stuSer")
    private IStuService iStuService;

    public IStuService getiStuService() {
        return iStuService;
    }

    public void setiStuService(IStuService iStuService) {
        this.iStuService = iStuService;
    }

    @RequestMapping(value = "save.do", method = RequestMethod.POST)

    public String save(Stu stu) {
        boolean b = iStuService.save(stu);
        if (b) {
            return "redirect:/index.html";
        } else {
            return "redirect:/index.html";
        }
    }

    @RequestMapping(value = "del.do/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String del(@PathVariable Integer id) {
        Stu stu = new Stu();
        stu.setSid(id);
        boolean b = iStuService.del(stu);
        if (b) {
            return "success";
        } else {
            return "error";
        }
    }

    @RequestMapping(value = "update.do/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public String update(@RequestBody Stu stu, @PathVariable Integer id) {
        stu.setSid(id);
        boolean b = iStuService.update(stu);
        if (b) {
            return "success";
        } else {
            return "error";
        }
    }

    @RequestMapping(value = "findById.do/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Stu findById(@PathVariable Integer id) {
        Stu stu = new Stu();
        stu = iStuService.findById(id);
        return stu;
    }

    @RequestMapping(value = "findAll.do", method = RequestMethod.GET)
    @ResponseBody
    public List<Stu> findAll() {
        List<Stu> list = new ArrayList<>();
        list = iStuService.findAll();
        return list;
    }

    @RequestMapping(value = "findByPage.do/{curr}", method = RequestMethod.GET)
    @ResponseBody
    public Page<Stu> findByPage(@PathVariable Integer curr) {
        Page<Stu> page = iStuService.findByPage(curr,5);
        return page;
    }


}
