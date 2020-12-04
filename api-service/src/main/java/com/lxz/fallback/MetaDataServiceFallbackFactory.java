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
        return () -> {
            log.error("查询元数据异常:", throwable);
            return "";
        };
    }
}
