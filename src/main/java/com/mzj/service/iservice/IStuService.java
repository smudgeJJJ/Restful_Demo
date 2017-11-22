package com.mzj.service.iservice;

import com.mzj.dao.pojo.Stu;
import com.mzj.utils.Page;

import java.util.List;

/**
 * Created by Administrator on 2017/11/21.
 */
public interface IStuService {
    public boolean save(Stu stu);

    public boolean del(Stu stu);

    public boolean update(Stu stu);

    public Stu findById(Integer id);

    public List<Stu> findAll();

    public Page<Stu> findByPage(Integer curr, Integer size);
}
