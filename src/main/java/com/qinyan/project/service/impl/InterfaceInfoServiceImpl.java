package com.qinyan.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qinyan.project.common.ErrorCode;
import com.qinyan.project.exception.BusinessException;
import com.qinyan.project.mapper.InterfaceInfoMapper;
import com.qinyan.project.model.entity.InterfaceInfo;
import com.qinyan.project.service.InterfaceInfoService;
import org.springframework.stereotype.Service;

/**
* @author chen
* @description 针对表【interface_info(接口信息)】的数据库操作Service实现
* @createDate 2023-09-02 16:18:08
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService {

    @Override
    public void validInterfaceInfo(InterfaceInfo post, boolean add) {
            if (post == null) {
                throw new BusinessException(ErrorCode.PARAMS_ERROR);
            }

        String name = post.getName();
            if (name == null){
                throw new BusinessException(ErrorCode.PARAMS_ERROR, "名称不存在");
            }
    }
}




