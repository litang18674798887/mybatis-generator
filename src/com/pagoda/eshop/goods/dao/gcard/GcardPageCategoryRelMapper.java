package com.pagoda.eshop.goods.dao.gcard;

import com.pagoda.eshop.goods.entity.gcard.GcardPageCategoryRel;
import com.pagoda.eshop.goods.entity.gcard.GcardPageCategoryRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GcardPageCategoryRelMapper {
    /**
     * 根据条件查询计数
     */
    int countByExample(GcardPageCategoryRelExample example);

    /**
     * 根据条件删除
     */
    int deleteByExample(GcardPageCategoryRelExample example);

    /**
     * 根据主键删除
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入
     */
    int insert(GcardPageCategoryRel record);

    /**
     * 插入
     */
    int insertSelective(GcardPageCategoryRel record);

    /**
     * 根据条件查询
     */
    List<GcardPageCategoryRel> selectByExample(GcardPageCategoryRelExample example);

    /**
     * 根据主键查询
     */
    GcardPageCategoryRel selectByPrimaryKey(Long id);

    /**
     * 根据条件有选择的更新
     */
    int updateByExampleSelective(@Param("record") GcardPageCategoryRel record, @Param("example") GcardPageCategoryRelExample example);

    /**
     * 根据条件更新
     */
    int updateByExample(@Param("record") GcardPageCategoryRel record, @Param("example") GcardPageCategoryRelExample example);

    /**
     * 根据主键有选择的更新
     */
    int updateByPrimaryKeySelective(GcardPageCategoryRel record);

    /**
     * 根据主键进行更新
     */
    int updateByPrimaryKey(GcardPageCategoryRel record);
}