package com.lxz.fallback;

import com.lxz.service.MetaDataService;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author xlx
 * @desription:
 */
@Component
@Slf4j
public class MetaDataServiceFallbackFactory implements FallbackFactory<MetaDataService> {
    @Override
    public MetaDataService create(Throwable throwable) {
       return new MetaDataService() {
           @Override

           public String getMetaData() {
               log.error("fail to get metaData,throwable:{}",throwable);
               return "";
           }
       };
    }
}
