package service;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * BaseService接口
 * Created by  Yu  on  2017/9/21.
 */
public interface BaseService<Record,Example> {

    //按条件求和
    int countByExample(Example example);

    //按条件删除
    int deleteByExample(Example example);

    //按主键删除
    int deleteByPrimaryKey(Integer id);

    //直接插入
    int insert(Record record);

    //选择性插入，判断属性是否为空
    int insertSelective(Record record);

    //按条件查询
    List<Record> selectByExample(Example example);

    //按条件查询返回第一个数据
    Record selectFirstByExample(Example example);

    //按主键查询
    Record selectByPrimaryKey(Integer id);

    //选择性更新
    int updateByExampleSelective(@Param("record") Record record, @Param("example") Example example);

    //直接更新
    int updateByExample(@Param("record") Record record, @Param("example") Example example);

    //按主键选择性更新
    int updateByPrimaryKeySelective(Record record);

    //直接更新
    int updateByPrimaryKey(Record record);

    //删除主键
    int deleteByPrimaryKeys(String ids);

    void initMapper();
}
