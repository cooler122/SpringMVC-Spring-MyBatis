package rml.dao;

import java.util.List;

import rml.model.MUser;

public interface MUserMapper {
    /**
     * 增1，添加一条记录，不允许中间有空值
     * @param record
     * @return
     */
    int insert(MUser record);

    /**
     * 增2，添加一条记录，允许中间有空值
     * @param record
     * @return
     */
    int insertSelective(MUser record);

    /**
     * 删，以主键删除某行记录
     * @param id
     * @return
     */
    int deleteByPrimaryKey(String id);

    /**
     * 改1，以主键改掉对象中不为空的值（允许对象中有空值，空值是不会被改到数据库中的）
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(MUser record);

    /**
     * 改2，以主键改掉各个值（对象中最好不要有空值，空值是会被改到数据库中的）
     * @param record
     * @return
     */
    int updateByPrimaryKey(MUser record);

    /**
     * 查1，按主键来查出某一项记录
     * @param id
     * @return
     */
    MUser selectByPrimaryKey(String id);

    /**
     * 查2，查出一个表所有记录
     * @return
     */
    List<MUser> getAll();
}