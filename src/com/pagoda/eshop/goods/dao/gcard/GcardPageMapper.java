package com.pagoda.eshop.goods.dao.gcard;

import com.pagoda.eshop.goods.entity.gcard.GcardPage;
import com.pagoda.eshop.goods.entity.gcard.GcardPageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GcardPageMapper {
    /**
     * 根据条件查询计数
     */
    int countByExample(GcardPageExample example);

    /**
     * 根据条件删除
     */
    int deleteByExample(GcardPageExample example);

    /**
     * 根据主键删除
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入
     */
    int insert(GcardPage record);

    /**
     * 插入
     */
    int insertSelective(GcardPage record);

    /**
     * 根据条件查询
     */
    List<GcardPage> selectByExample(GcardPageExample example);

    /**
     * 根据主键查询
     */
    GcardPage selectByPrimaryKey(Long id);

    /**
     * 根据条件有选择的更新
     */
    int updateByExampleSelective(@Param("record") GcardPage record, @Param("example") GcardPageExample example);

    /**
     * 根据条件更新
     */
    int updateByExample(@Param("record") GcardPage record, @Param("example") GcardPageExample example);

    /**
     * 根据主键有选择的更新
     */
    int updateByPrimaryKeySelective(GcardPage record);

    /**
     * 根据主键进行更新
     */
    int updateByPrimaryKey(GcardPage record);
}