package com.mzj.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/18.
 */

    public class Page<T> {
        // 当前页码
        private int currPage = 1;
        // 每页显示个数
        private int pagesize = 5;
        // 起始索引号
        private int startindex;
        // 总记录数
        private int totalNum;
        // 总页数
        private int totalPage;
        // 存放记录集合
        private List<T> list = new ArrayList<T>();

        // 构造时确定起始索引
        public Page(int currPage, int pagesize) {
            this.currPage = currPage;
            this.pagesize = pagesize;
            getStart();
        }

        public Page() {
            getStart();
        }

        public Page(int currPage) {
            this.currPage = currPage;
            getStart();
        }

        // 计算索引号
        public void getStart() {
            this.startindex = (this.currPage - 1) * pagesize;
        }

        public int getStartindex() {
            return startindex;
        }

        // 计算总页数
        public void getToPage() {
            if ((this.totalNum % this.pagesize) == 0) {
                this.totalPage = this.totalNum / this.pagesize;
            } else {
                this.totalPage = (this.totalNum / this.pagesize) + 1;
            }
        }

        public int getCurrPage() {
            return currPage;
        }

        // 设置当前页码时，重算起始索引
        public void setCurrPage(int currPage) {
            this.currPage = currPage;
            getStart();
        }

        public int getPagesize() {
            return pagesize;
        }

        // 设置每页显示个数时，重新计算起始索引和总页数
        public void setPagesize(int pagesize) {
            this.pagesize = pagesize;
            getStart();
            getToPage();
        }

        public int getTotalNum() {
            return totalNum;
        }

        // 设置总记录数时，计算总页数
        public void setTotalNum(int totalNum) {
            this.totalNum = totalNum;
            getToPage();
        }

        public int getTotalPage() {
            return totalPage;
        }

        public List<T> getList() {
            return list;
        }

        public void setList(List<T> list) {
            this.list = list;
        }

    }



