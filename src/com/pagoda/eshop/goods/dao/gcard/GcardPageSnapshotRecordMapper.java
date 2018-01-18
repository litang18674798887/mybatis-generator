package com.pagoda.eshop.goods.dao.gcard;

import com.pagoda.eshop.goods.entity.gcard.GcardPageSnapshotRecord;
import com.pagoda.eshop.goods.entity.gcard.GcardPageSnapshotRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GcardPageSnapshotRecordMapper {
    /**
     * 根据条件查询计数
     */
    int countByExample(GcardPageSnapshotRecordExample example);

    /**
     * 根据条件删除
     */
    int deleteByExample(GcardPageSnapshotRecordExample example);

    /**
     * 根据主键删除
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入
     */
    int insert(GcardPageSnapshotRecord record);

    /**
     * 插入
     */
    int insertSelective(GcardPageSnapshotRecord record);

    /**
     * 根据条件查询
     */
    List<GcardPageSnapshotRecord> selectByExampleWithBLOBs(GcardPageSnapshotRecordExample example);

    /**
     * 根据条件查询
     */
    List<GcardPageSnapshotRecord> selectByExample(GcardPageSnapshotRecordExample example);

    /**
     * 根据主键查询
     */
    GcardPageSnapshotRecord selectByPrimaryKey(Long id);

    /**
     * 根据条件有选择的更新
     */
    int updateByExampleSelective(@Param("record") GcardPageSnapshotRecord record, @Param("example") GcardPageSnapshotRecordExample example);

    /**
     * 根据条件更新
     */
    int updateByExampleWithBLOBs(@Param("record") GcardPageSnapshotRecord record, @Param("example") GcardPageSnapshotRecordExample example);

    /**
     * 根据条件更新
     */
    int updateByExample(@Param("record") GcardPageSnapshotRecord record, @Param("example") GcardPageSnapshotRecordExample example);

    /**
     * 根据主键有选择的更新
     */
    int updateByPrimaryKeySelective(GcardPageSnapshotRecord record);

    /**
     * 根据主键进行更新
     */
    int updateByPrimaryKeyWithBLOBs(GcardPageSnapshotRecord record);

    /**
     * 根据主键进行更新
     */
    int updateByPrimaryKey(GcardPageSnapshotRecord record);
}