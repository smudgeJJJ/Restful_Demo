package com.mzj.service.impl;

import com.mzj.dao.mapper.StuDao;
import com.mzj.dao.pojo.PageVO;
import com.mzj.dao.pojo.Stu;
import com.mzj.service.iservice.IStuService;
import com.mzj.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/21.
 */
@Service("stuSer")
public class StuServiceImpl implements IStuService {
    @Autowired
    private StuDao stuDao;

    public StuDao getStuDao() {
        return stuDao;
    }

    public void setStuDao(StuDao stuDao) {
        this.stuDao = stuDao;
    }

    @Transactional
    @Override
    public boolean save(Stu stu) {
        int n = 0;
        try {
            n = stuDao.save(stu);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (n > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Transactional
    @Override
    public boolean del(Stu stu) {
        int n = 0;
        try {
            n = stuDao.del(stu);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (n > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Transactional
    @Override
    public boolean update(Stu stu) {
        int n = 0;
        try {
            n = stuDao.update(stu);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (n > 0) {
            return true;
        } else {
            return false;
        }

    }

    @Transactional
    @Override
    public Stu findById(Integer id) {
        Stu stu = new Stu();
        try {
            stu = stuDao.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stu;
    }

    @Transactional
    @Override
    public List<Stu> findAll() {
        List<Stu> list = new ArrayList<>();
        try {
            list = stuDao.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Transactional
    @Override
    public Page<Stu> findByPage(Integer curr, Integer size) {
        Page<Stu> page = new Page<>();
        List<Stu> list = findAll();
        page.setTotalNum(list.size());
        Integer current = 1;
        Integer psize = 5;
        Integer totalPage = page.getTotalPage();
        current = curr;
        page.setCurrPage(current);

        if (size <= 0 || size == null) {
            psize = size;
        }
        PageVO vo = new PageVO(page.getStartindex(), psize);
        List<Stu> stus = new ArrayList<>();
        try {
            stus = stuDao.findByPage(vo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(stus);
        page.setList(stus);
        return page;
    }
}
