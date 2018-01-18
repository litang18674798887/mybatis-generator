package com.pagoda.eshop.goods.dao.gcard;

import com.pagoda.eshop.goods.entity.gcard.GcardThemeCardRel;
import com.pagoda.eshop.goods.entity.gcard.GcardThemeCardRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GcardThemeCardRelMapper {
    /**
     * 根据条件查询计数
     */
    int countByExample(GcardThemeCardRelExample example);

    /**
     * 根据条件删除
     */
    int deleteByExample(GcardThemeCardRelExample example);

    /**
     * 根据主键删除
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入
     */
    int insert(GcardThemeCardRel record);

    /**
     * 插入
     */
    int insertSelective(GcardThemeCardRel record);

    /**
     * 根据条件查询
     */
    List<GcardThemeCardRel> selectByExample(GcardThemeCardRelExample example);

    /**
     * 根据主键查询
     */
    GcardThemeCardRel selectByPrimaryKey(Long id);

    /**
     * 根据条件有选择的更新
     */
    int updateByExampleSelective(@Param("record") GcardThemeCardRel record, @Param("example") GcardThemeCardRelExample example);

    /**
     * 根据条件更新
     */
    int updateByExample(@Param("record") GcardThemeCardRel record, @Param("example") GcardThemeCardRelExample example);

    /**
     * 根据主键有选择的更新
     */
    int updateByPrimaryKeySelective(GcardThemeCardRel record);

    /**
     * 根据主键进行更新
     */
    int updateByPrimaryKey(GcardThemeCardRel record);
}