package com.pagoda.eshop.goods.dao.gcard;

import com.pagoda.eshop.goods.entity.gcard.GcardCode;
import com.pagoda.eshop.goods.entity.gcard.GcardCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GcardCodeMapper {
    /**
     * 根据条件查询计数
     */
    int countByExample(GcardCodeExample example);

    /**
     * 根据条件删除
     */
    int deleteByExample(GcardCodeExample example);

    /**
     * 根据主键删除
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入
     */
    int insert(GcardCode record);

    /**
     * 插入
     */
    int insertSelective(GcardCode record);

    /**
     * 根据条件查询
     */
    List<GcardCode> selectByExample(GcardCodeExample example);

    /**
     * 根据主键查询
     */
    GcardCode selectByPrimaryKey(Long id);

    /**
     * 根据条件有选择的更新
     */
    int updateByExampleSelective(@Param("record") GcardCode record, @Param("example") GcardCodeExample example);

    /**
     * 根据条件更新
     */
    int updateByExample(@Param("record") GcardCode record, @Param("example") GcardCodeExample example);

    /**
     * 根据主键有选择的更新
     */
    int updateByPrimaryKeySelective(GcardCode record);

    /**
     * 根据主键进行更新
     */
    int updateByPrimaryKey(GcardCode record);
}