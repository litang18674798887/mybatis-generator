package com.pagoda.eshop.goods.dao.gcard;

import com.pagoda.eshop.goods.entity.gcard.GcardCover;
import com.pagoda.eshop.goods.entity.gcard.GcardCoverExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GcardCoverMapper {
    /**
     * 根据条件查询计数
     */
    int countByExample(GcardCoverExample example);

    /**
     * 根据条件删除
     */
    int deleteByExample(GcardCoverExample example);

    /**
     * 根据主键删除
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入
     */
    int insert(GcardCover record);

    /**
     * 插入
     */
    int insertSelective(GcardCover record);

    /**
     * 根据条件查询
     */
    List<GcardCover> selectByExample(GcardCoverExample example);

    /**
     * 根据主键查询
     */
    GcardCover selectByPrimaryKey(Long id);

    /**
     * 根据条件有选择的更新
     */
    int updateByExampleSelective(@Param("record") GcardCover record, @Param("example") GcardCoverExample example);

    /**
     * 根据条件更新
     */
    int updateByExample(@Param("record") GcardCover record, @Param("example") GcardCoverExample example);

    /**
     * 根据主键有选择的更新
     */
    int updateByPrimaryKeySelective(GcardCover record);

    /**
     * 根据主键进行更新
     */
    int updateByPrimaryKey(GcardCover record);
}