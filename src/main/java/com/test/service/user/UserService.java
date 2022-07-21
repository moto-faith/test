package com.test.service.user;

import com.test.core.model.PageData;
import com.test.core.model.PageWrap;
import com.test.dao.user.model.User;
import java.util.List;

/**
 * 示例Service定义
 * @author 155****3572
 * @date 2022/07/21 16:43
 */
public interface UserService {

    /**
     * 创建
     * @author 155****3572
     * @date 2022/07/21 16:43
     */
    Integer create(User user);

    /**
     * 主键删除
     * @author 155****3572
     * @date 2022/07/21 16:43
     */
    void deleteById(Integer id);

    /**
     * 批量主键删除
     * @author 155****3572
     * @date 2022/07/21 16:43
     */
    void deleteByIdInBatch(List<Integer> ids);

    /**
     * 主键更新
     * @author 155****3572
     * @date 2022/07/21 16:43
     */
    void updateById(User user);

    /**
     * 批量主键更新
     * @author 155****3572
     * @date 2022/07/21 16:43
     */
    void updateByIdInBatch(List<User> users);

    /**
     * 主键查询
     * @author 155****3572
     * @date 2022/07/21 16:43
     */
    User findById(Integer id);

    /**
     * 条件查询单条记录
     * @author 155****3572
     * @date 2022/07/21 16:43
     */
    User findOne(User user);

    /**
     * 条件查询
     * @author 155****3572
     * @date 2022/07/21 16:43
     */
    List<User> findList(User user);

    /**
     * 分页查询
     * @author 155****3572
     * @date 2022/07/21 16:43
     */
    PageData<User> findPage(PageWrap<User> pageWrap);
    /**
     * 条件统计
     * @author 155****3572
     * @date 2022/07/21 16:43
     */
    long count(User user);
}
