package com.callenled.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @Author: callenled
 * @Date: 19-8-16 上午10:57
 */
@Mapper
public interface BaseMapper {

    /**
     * 通用的插入
     *
     * @param map 参数键值对
     */
    void add(Map<String, Object> map);

    /**
     * 通用的批量插入
     *
     * @param map 参数键值对
     */
    void addList(Map<String, Object> map);

    /**
     * 通用的更新
     *
     * @param map 参数键值对
     */
    void update(Map<String, Object> map);

    /**
     * 精准的查询
     *
     * @param map 参数键值对
     * @return 结果（map形式）
     */
    Map<String, Object> queryOne(Map<String, Object> map);

    /**
     * 通用的删除
     *
     * @param map 参数键值对
     */
    void delete(Map<String, Object> map);

    /**
     * 通用的查询
     *
     * @param map 参数键值对
     * @return 结果集（map形式）
     */
    List<Map<String, Object>> query(Map<String, Object> map);

    /**
     * 查询列表的数量 与 query方法搭配使用
     *
     * @param map 参数键值对
     * @return 结果集数量
     */
    Integer queryCount(Map<String, Object> map);
}
