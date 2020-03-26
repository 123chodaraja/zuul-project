package com.wipro.hospitalgateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Errorfilter extends ZuulFilter {
    Logger log = LoggerFactory.getLogger(Errorfilter.class);
    @Override
    public String filterType() {
        return "Error";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() throws ZuulException {
        return null;
    }
}
