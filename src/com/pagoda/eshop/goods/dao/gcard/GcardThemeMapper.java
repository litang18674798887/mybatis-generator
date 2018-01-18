package com.pagoda.eshop.goods.dao.gcard;

import com.pagoda.eshop.goods.entity.gcard.GcardTheme;
import com.pagoda.eshop.goods.entity.gcard.GcardThemeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GcardThemeMapper {
    /**
     * 根据条件查询计数
     */
    int countByExample(GcardThemeExample example);

    /**
     * 根据条件删除
     */
    int deleteByExample(GcardThemeExample example);

    /**
     * 根据主键删除
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入
     */
    int insert(GcardTheme record);

    /**
     * 插入
     */
    int insertSelective(GcardTheme record);

    /**
     * 根据条件查询
     */
    List<GcardTheme> selectByExample(GcardThemeExample example);

    /**
     * 根据主键查询
     */
    GcardTheme selectByPrimaryKey(Long id);

    /**
     * 根据条件有选择的更新
     */
    int updateByExampleSelective(@Param("record") GcardTheme record, @Param("example") GcardThemeExample example);

    /**
     * 根据条件更新
     */
    int updateByExample(@Param("record") GcardTheme record, @Param("example") GcardThemeExample example);

    /**
     * 根据主键有选择的更新
     */
    int updateByPrimaryKeySelective(GcardTheme record);

    /**
     * 根据主键进行更新
     */
    int updateByPrimaryKey(GcardTheme record);
}