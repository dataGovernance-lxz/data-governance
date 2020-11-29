package com.lxz.feign;

import com.lxz.service.MetaDataService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author xlx
 * @desription:
 */
@FeignClient("metadata/metadata")
public interface MetaDataFeign extends MetaDataService {
}
