package com.lee.shortlink.project.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.lee.shortlink.project.dao.entity.ShortLinkDO;
import com.lee.shortlink.project.dto.req.RecycleBinSaveReqDTO;

/**
 * 回收站管理接口层
 */
public interface RecycleBinService extends IService<ShortLinkDO> {

    /**
     * 保存回收站
     *
     * @param requestParam 请求参数
     */
    void saveRecycleBin(RecycleBinSaveReqDTO requestParam);

}