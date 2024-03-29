package com.ibatis.base;

import java.util.List;

/**
 * @Author: ibatis
 * @Date: 19-8-16 下午4:35
 */

public interface BaseMapper<T> extends com.baomidou.mybatisplus.core.mapper.BaseMapper<T> {

    /**
     * 逻辑删除(修改updateTime)
     *
     * @param id 主键id
     */
    void deleteByIdWithFill(Long id);

    /**
     * 批量逻辑删除(修改updateTime)
     *
     * @param ids 主键ids列表
     */
    void deleteBatchByIdsWithFill(List<Long> ids);
}
