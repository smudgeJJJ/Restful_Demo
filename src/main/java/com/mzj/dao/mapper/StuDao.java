package com.mzj.dao.mapper;

import com.mzj.dao.pojo.PageVO;
import com.mzj.dao.pojo.Stu;
import com.mzj.utils.Page;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/11/21.
 */
@Repository
public interface StuDao {
    public int save(Stu stu) throws Exception;

    public int del(Stu stu) throws Exception;

    public int update(Stu stu) throws Exception;

    public Stu findById(Integer id) throws Exception;

    public List<Stu> findAll() throws Exception;

    public List<Stu> findByPage(PageVO pageVO) throws Exception;
}
