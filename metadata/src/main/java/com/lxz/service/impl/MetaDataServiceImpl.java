package com.lxz.service.impl;

import com.lxz.service.MetaDataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xlx
 * @desription:
 */
@Slf4j
@RestController
public class MetaDataServiceImpl implements MetaDataService {

    @Override
    @GetMapping("/metadata")
    public String getMetaData() {
        return "测试";
    }
}
