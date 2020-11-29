package com.lxz.service;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xlx
 * @desription:
 */
public interface MetaDataService {

    @GetMapping("/metadata")
    String getMetaData();

}
