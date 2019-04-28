package cn.licoy.wdog.common.service;

import com.baomidou.mybatisplus.plugins.Page;

/**
 * @author mjy
 * @version 2018/5/25/13:14
 * @see BaseService 注释配置请参见BaseService
 */
public interface QueryService<E,FD> {

    Page<E> list(FD findDTO);

}
