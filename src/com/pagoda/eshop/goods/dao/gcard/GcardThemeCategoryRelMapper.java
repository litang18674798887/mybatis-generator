package com.pagoda.eshop.goods.dao.gcard;

import com.pagoda.eshop.goods.entity.gcard.GcardThemeCategoryRel;
import com.pagoda.eshop.goods.entity.gcard.GcardThemeCategoryRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GcardThemeCategoryRelMapper {
    /**
     * 根据条件查询计数
     */
    int countByExample(GcardThemeCategoryRelExample example);

    /**
     * 根据条件删除
     */
    int deleteByExample(GcardThemeCategoryRelExample example);

    /**
     * 根据主键删除
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入
     */
    int insert(GcardThemeCategoryRel record);

    /**
     * 插入
     */
    int insertSelective(GcardThemeCategoryRel record);

    /**
     * 根据条件查询
     */
    List<GcardThemeCategoryRel> selectByExample(GcardThemeCategoryRelExample example);

    /**
     * 根据主键查询
     */
    GcardThemeCategoryRel selectByPrimaryKey(Long id);

    /**
     * 根据条件有选择的更新
     */
    int updateByExampleSelective(@Param("record") GcardThemeCategoryRel record, @Param("example") GcardThemeCategoryRelExample example);

    /**
     * 根据条件更新
     */
    int updateByExample(@Param("record") GcardThemeCategoryRel record, @Param("example") GcardThemeCategoryRelExample example);

    /**
     * 根据主键有选择的更新
     */
    int updateByPrimaryKeySelective(GcardThemeCategoryRel record);

    /**
     * 根据主键进行更新
     */
    int updateByPrimaryKey(GcardThemeCategoryRel record);
}