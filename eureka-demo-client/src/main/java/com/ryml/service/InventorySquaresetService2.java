package com.ryml.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * description:
 *
 * @author 刘一博
 * @version V1.0
 * @date 2019/11/5 11:00
 */
@FeignClient(name = "myEurekaDemo1",fallback = InventorySquaresetService2.FeignServiceFallback2.class)
public interface InventorySquaresetService2 {

  @RequestMapping("/user/{id}")
  Integer findById(@RequestParam("id") Long id);


  @RequestMapping("/squareset/hello")
  String findAll();


  /**
   * 这边采取了和Spring Cloud官方文档相同的做法，将fallback类作为内部类放入Feign的接口中，当然也可以单独写一个fallback类。
   * @author len
   */
  @Slf4j
  @Component
  class FeignServiceFallback2 implements InventorySquaresetService2 {

    @Override
    public Integer findById(Long id) {
        return 0;
    }

    @Override
    public String findAll() {
        return "0";
    }
  }
}