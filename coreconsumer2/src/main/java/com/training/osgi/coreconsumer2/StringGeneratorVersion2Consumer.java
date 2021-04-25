package com.training.osgi.coreconsumer2;


import com.training.osgi.core.stringgen.StringGenerator;

public class StringGeneratorVersion2Consumer {

    public String invokeGenerator() {
        return new StringGenerator().generateString();
    }}
