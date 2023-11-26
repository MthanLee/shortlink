package com.lee.shortlink.project.dto.req;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lee.shortlink.project.dao.entity.ShortLinkDO;
import lombok.Data;

/**
 * 回收站短链接分页请求参数
 */
@Data
public class ShortLinkRecycleBinPageReqDTO extends Page<ShortLinkDO> {

//    /**
//     * 分组标识
//     */
//    private List<String> gidList;

    /**
     * 分组标识
     */
    private String gid;
}
