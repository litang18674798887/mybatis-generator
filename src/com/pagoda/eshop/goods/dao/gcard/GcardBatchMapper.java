package com.pagoda.eshop.goods.dao.gcard;

import com.pagoda.eshop.goods.entity.gcard.GcardBatch;
import com.pagoda.eshop.goods.entity.gcard.GcardBatchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GcardBatchMapper {
    /**
     * 根据条件查询计数
     */
    int countByExample(GcardBatchExample example);

    /**
     * 根据条件删除
     */
    int deleteByExample(GcardBatchExample example);

    /**
     * 根据主键删除
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入
     */
    int insert(GcardBatch record);

    /**
     * 插入
     */
    int insertSelective(GcardBatch record);

    /**
     * 根据条件查询
     */
    List<GcardBatch> selectByExample(GcardBatchExample example);

    /**
     * 根据主键查询
     */
    GcardBatch selectByPrimaryKey(Long id);

    /**
     * 根据条件有选择的更新
     */
    int updateByExampleSelective(@Param("record") GcardBatch record, @Param("example") GcardBatchExample example);

    /**
     * 根据条件更新
     */
    int updateByExample(@Param("record") GcardBatch record, @Param("example") GcardBatchExample example);

    /**
     * 根据主键有选择的更新
     */
    int updateByPrimaryKeySelective(GcardBatch record);

    /**
     * 根据主键进行更新
     */
    int updateByPrimaryKey(GcardBatch record);
}