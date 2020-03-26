package com.wipro.hospitalgateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletResponse;

public class Routefilter extends ZuulFilter {

    Logger log = LoggerFactory.getLogger(Routefilter.class);
    @Override
    public String filterType() {
        return "Route";
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
        HttpServletResponse httpServletResponse = RequestContext.getCurrentContext().getResponse();
        log.info("Route"+String.format("response type is",httpServletResponse.getStatus()));
        return null;
    }
}
