package com.nepxion.polaris.component.env.context;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nepxion.polaris.component.common.exception.PolarisException;

public abstract class PolarisEnvApplicationContextInitializer extends PolarisEnvProcessor implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    private static final Logger LOG = LoggerFactory.getLogger(PolarisEnvApplicationContextInitializer.class);

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        if (!(applicationContext instanceof AnnotationConfigApplicationContext)) {
            try {
                boolean isEnvLogShown = isEnvLogShown();
                if (isEnvLogShown) {
                    LOG.info("Initialize {} env...", getName());
                } else {
                    System.out.println("Initialize " + getName() + " env...");
                }

                process(applicationContext.getEnvironment());
            } catch (Exception e) {

                throw new PolarisException(e);
            }
        }
    }
}