package com.pagoda.eshop.goods.dao.gcard;

import com.pagoda.eshop.goods.entity.gcard.Gcard;
import com.pagoda.eshop.goods.entity.gcard.GcardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GcardMapper {
    /**
     * 根据条件查询计数
     */
    int countByExample(GcardExample example);

    /**
     * 根据条件删除
     */
    int deleteByExample(GcardExample example);

    /**
     * 根据主键删除
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入
     */
    int insert(Gcard record);

    /**
     * 插入
     */
    int insertSelective(Gcard record);

    /**
     * 根据条件查询
     */
    List<Gcard> selectByExample(GcardExample example);

    /**
     * 根据主键查询
     */
    Gcard selectByPrimaryKey(Long id);

    /**
     * 根据条件有选择的更新
     */
    int updateByExampleSelective(@Param("record") Gcard record, @Param("example") GcardExample example);

    /**
     * 根据条件更新
     */
    int updateByExample(@Param("record") Gcard record, @Param("example") GcardExample example);

    /**
     * 根据主键有选择的更新
     */
    int updateByPrimaryKeySelective(Gcard record);

    /**
     * 根据主键进行更新
     */
    int updateByPrimaryKey(Gcard record);
}