package com.lxz.controller;

import com.lxz.service.IMetaDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xlx
 * @desription:
 */
@RestController
@RefreshScope
public class MetaDataController {

    @Autowired
    private IMetaDataService iMetaDataService;
    @Value("${da}")
    private String did;

    @GetMapping("/getMetadata")
    public String getMetaData(){
        System.out.println("dataSourceId" + this.did);
        return iMetaDataService.getMetaData();
    }

}
