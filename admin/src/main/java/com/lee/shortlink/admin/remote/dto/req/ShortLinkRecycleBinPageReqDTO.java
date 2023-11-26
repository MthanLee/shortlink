package com.lee.shortlink.admin.remote.dto.req;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

/**
 * 回收站短链接分页请求参数
 */
@Data
public class ShortLinkRecycleBinPageReqDTO extends Page {

//    /**
//     * 分组标识
//     */
//    private List<String> gidList;


    /**
     * 分组标识
     */
    private String gid;
}
