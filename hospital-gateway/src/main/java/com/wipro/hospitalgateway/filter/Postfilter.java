package com.wipro.hospitalgateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletResponse;

public class Postfilter extends ZuulFilter {
  Logger log = LoggerFactory.getLogger(Postfilter.class);
    @Override
    public String filterType() {
        return "Postfilter";
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
        log.info("post filter is"+String.format("response",httpServletResponse.getStatus()) );
        return null;
    }
}
