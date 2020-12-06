package com.lxz.controller;

import com.lxz.service.MetaDataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xlx
 * @desription:
 */
@RestController
@Slf4j
public class DataStandardController {

    @Lazy
    @Autowired
   private MetaDataService metaDataService;

    @GetMapping("/getMetaData")
    public String getMetaData() {
        return metaDataService.getMetaData();
    }

}
