package com.pagoda.eshop.goods.dao.gcard;

import com.pagoda.eshop.goods.entity.gcard.GcardThemeCoverRel;
import com.pagoda.eshop.goods.entity.gcard.GcardThemeCoverRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GcardThemeCoverRelMapper {
    /**
     * 根据条件查询计数
     */
    int countByExample(GcardThemeCoverRelExample example);

    /**
     * 根据条件删除
     */
    int deleteByExample(GcardThemeCoverRelExample example);

    /**
     * 根据主键删除
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入
     */
    int insert(GcardThemeCoverRel record);

    /**
     * 插入
     */
    int insertSelective(GcardThemeCoverRel record);

    /**
     * 根据条件查询
     */
    List<GcardThemeCoverRel> selectByExample(GcardThemeCoverRelExample example);

    /**
     * 根据主键查询
     */
    GcardThemeCoverRel selectByPrimaryKey(Long id);

    /**
     * 根据条件有选择的更新
     */
    int updateByExampleSelective(@Param("record") GcardThemeCoverRel record, @Param("example") GcardThemeCoverRelExample example);

    /**
     * 根据条件更新
     */
    int updateByExample(@Param("record") GcardThemeCoverRel record, @Param("example") GcardThemeCoverRelExample example);

    /**
     * 根据主键有选择的更新
     */
    int updateByPrimaryKeySelective(GcardThemeCoverRel record);

    /**
     * 根据主键进行更新
     */
    int updateByPrimaryKey(GcardThemeCoverRel record);
}