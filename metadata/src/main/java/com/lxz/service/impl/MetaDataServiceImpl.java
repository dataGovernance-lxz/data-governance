package com.lxz.service.impl;

import com.lxz.service.IMetaDataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author xlx
 * @desription:  元数据对外暴露接口
 */
@Slf4j
@Service
public class MetaDataServiceImpl implements IMetaDataService {


    @Override
    public String getMetaData() {
        return "hello";
    }
}
