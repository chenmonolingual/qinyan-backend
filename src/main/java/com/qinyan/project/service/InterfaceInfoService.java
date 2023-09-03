package com.qinyan.project.service;

import com.qinyan.project.model.entity.InterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author chen
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-09-03 09:36:45
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    void validInterfaceInfo(InterfaceInfo post, boolean add);
}
