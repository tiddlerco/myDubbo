package org.provider.impl;

import interceface.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @Author tiddler
 * @Date 2023/10/28 20:15
 */
@DubboService
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
