package com.lxz.service;

import com.lxz.constant.ServiceNameConstant;
import com.lxz.fallback.MetaDataServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xlx
 * @desription:
 */
@FeignClient(name = ServiceNameConstant.META_DATA,decode404 = true,fallbackFactory = MetaDataServiceFallbackFactory.class)
public interface MetaDataService {

    @GetMapping("/metadata/getMetadata")
    String getMetaData();





}
