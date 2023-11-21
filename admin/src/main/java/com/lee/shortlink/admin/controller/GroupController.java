package com.lee.shortlink.admin.controller;

import com.lee.shortlink.admin.common.convention.result.Result;
import com.lee.shortlink.admin.common.convention.result.Results;
import com.lee.shortlink.admin.dto.req.ShortLinkGroupReqDTO;
import com.lee.shortlink.admin.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 短链接分组控制层
 */
@RestController
@RequiredArgsConstructor
public class GroupController {

    private final GroupService groupService;

    @PostMapping("/api/short-link/admin/v1/group")
    public Result<Void> save(@RequestBody ShortLinkGroupReqDTO requestParam) {
        groupService.saveGroup(requestParam.getName());
        return Results.success();
    }
}
