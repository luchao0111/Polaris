package com.nepxion.polaris.component.nacos.context;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nepxion.polaris.component.common.constant.PolarisConstant;
import com.nepxion.polaris.component.common.exception.PolarisException;
import com.nepxion.polaris.component.env.processor.PolarisEnvProcessor;

public class NacosEnvApplicationContextInitializer extends PolarisEnvProcessor implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    private static final Logger LOG = LoggerFactory.getLogger(NacosEnvApplicationContextInitializer.class);

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        if (!(applicationContext instanceof AnnotationConfigApplicationContext)) {
            try {
                LOG.info("Initialize {} env...", getName());

                process();
            } catch (Exception e) {
                LOG.error("Initialize {} env failed", getName(), e);

                throw new PolarisException(e);
            }
        }
    }

    @Override
    public String getName() {
        return PolarisConstant.NACOS_NAME;
    }
}