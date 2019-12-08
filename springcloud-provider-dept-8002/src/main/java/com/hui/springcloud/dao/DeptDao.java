package com.hui.springcloud.dao;

import com.hui.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/12/5
 */
@Mapper
@Repository //交给springIoC容器管理
public interface DeptDao {

    //编写增删该查的逻辑

     boolean addDept(Dept dept);

     Dept findById(Long id);

     List<Dept> findAll();


}
