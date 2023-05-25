package com.tobuv.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tobuv.project.model.entity.InterfaceInfo;

/**
* @author chengsongren
* @description 针对表【interface_info(接口信息表)】的数据库操作Service
* @createDate 2023-05-24 22:12:44
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
