package com.pagoda.eshop.goods.dao.gcard;

import com.pagoda.eshop.goods.entity.gcard.GcardCategory;
import com.pagoda.eshop.goods.entity.gcard.GcardCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GcardCategoryMapper {
    /**
     * 根据条件查询计数
     */
    int countByExample(GcardCategoryExample example);

    /**
     * 根据条件删除
     */
    int deleteByExample(GcardCategoryExample example);

    /**
     * 根据主键删除
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入
     */
    int insert(GcardCategory record);

    /**
     * 插入
     */
    int insertSelective(GcardCategory record);

    /**
     * 根据条件查询
     */
    List<GcardCategory> selectByExample(GcardCategoryExample example);

    /**
     * 根据主键查询
     */
    GcardCategory selectByPrimaryKey(Long id);

    /**
     * 根据条件有选择的更新
     */
    int updateByExampleSelective(@Param("record") GcardCategory record, @Param("example") GcardCategoryExample example);

    /**
     * 根据条件更新
     */
    int updateByExample(@Param("record") GcardCategory record, @Param("example") GcardCategoryExample example);

    /**
     * 根据主键有选择的更新
     */
    int updateByPrimaryKeySelective(GcardCategory record);

    /**
     * 根据主键进行更新
     */
    int updateByPrimaryKey(GcardCategory record);
}