package com.training.osgi.coreconsumer1;


import com.training.osgi.core.stringgen.StringGenerator;
import com.training.osgi.core.stringgen.StringGeneratorImpl;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(service = StringGeneratorVersion1Consumer.class)
public class StringGeneratorVersion1Consumer {

    @Reference
    StringGenerator stringGenerator;

    public String invokeGenerator() {
        return stringGenerator.generateString();
    }}
