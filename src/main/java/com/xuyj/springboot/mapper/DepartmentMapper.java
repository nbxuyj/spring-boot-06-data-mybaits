package com.xuyj.springboot.mapper;

import com.xuyj.springboot.bean.Department;
import org.apache.ibatis.annotations.*;

@Mapper
public interface DepartmentMapper {
    @Select("select * from department where id=#(id)")
    public Department getDepById(Integer id);


    @Delete("delete from department where id=#{id}")
    public int deleteDeptById(Integer id);

    @Insert("insert into department（departmentName）values(#（departmentMane）)")
    public int InsertDept(Department department);

    @Update("")
    public int updateDept(Department dept);

}
