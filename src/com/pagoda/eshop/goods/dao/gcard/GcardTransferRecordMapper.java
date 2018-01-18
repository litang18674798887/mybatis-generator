package com.pagoda.eshop.goods.dao.gcard;

import com.pagoda.eshop.goods.entity.gcard.GcardTransferRecord;
import com.pagoda.eshop.goods.entity.gcard.GcardTransferRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GcardTransferRecordMapper {
    /**
     * 根据条件查询计数
     */
    int countByExample(GcardTransferRecordExample example);

    /**
     * 根据条件删除
     */
    int deleteByExample(GcardTransferRecordExample example);

    /**
     * 根据主键删除
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入
     */
    int insert(GcardTransferRecord record);

    /**
     * 插入
     */
    int insertSelective(GcardTransferRecord record);

    /**
     * 根据条件查询
     */
    List<GcardTransferRecord> selectByExample(GcardTransferRecordExample example);

    /**
     * 根据主键查询
     */
    GcardTransferRecord selectByPrimaryKey(Long id);

    /**
     * 根据条件有选择的更新
     */
    int updateByExampleSelective(@Param("record") GcardTransferRecord record, @Param("example") GcardTransferRecordExample example);

    /**
     * 根据条件更新
     */
    int updateByExample(@Param("record") GcardTransferRecord record, @Param("example") GcardTransferRecordExample example);

    /**
     * 根据主键有选择的更新
     */
    int updateByPrimaryKeySelective(GcardTransferRecord record);

    /**
     * 根据主键进行更新
     */
    int updateByPrimaryKey(GcardTransferRecord record);
}