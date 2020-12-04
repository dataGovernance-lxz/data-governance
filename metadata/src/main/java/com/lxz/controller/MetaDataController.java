package com.lxz.controller;

import com.lxz.service.IMetaDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xlx
 * @desription:
 */
@RestController
public class MetaDataController {

    @Autowired
    private IMetaDataService iMetaDataService;

    @GetMapping("/getMetadata")
    public String getMetaData(){
        return iMetaDataService.getMetaData();
    }

}
