package com.nepxion.polaris.component.jaeger.context;

import org.springframework.core.env.ConfigurableEnvironment;

import com.nepxion.polaris.component.common.constant.PolarisConstant;
import com.nepxion.polaris.component.env.context.PolarisEnvPostProcessor;

public class JaegerEnvProcessor extends PolarisEnvPostProcessor {
    @Override
    public void process(ConfigurableEnvironment environment) throws Exception {
        super.process(environment);

        System.setProperty(PolarisConstant.JAEGER_VERSION_NAME, PolarisConstant.JAEGER_VERSION_VALUE);
    }

    @Override
    public String getName() {
        return PolarisConstant.JAEGER_NAME;
    }
}