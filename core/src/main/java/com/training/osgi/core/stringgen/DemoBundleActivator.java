package com.training.osgi.core.stringgen;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class DemoBundleActivator implements BundleActivator {

    private Logger logger = LoggerFactory.getLogger(DemoBundleActivator.class);

    @Override
    public void start(BundleContext context) throws Exception {
        logger.error("Starting Activation");
        TimeUnit.SECONDS.sleep(30);
        logger.error("Activation Performed");
    }

    @Override
    public void stop(BundleContext context) throws Exception {

    }
}
