package com.wipro.hospitalgateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;


@Component
public class Prefilter extends ZuulFilter {

    Logger log = LoggerFactory.getLogger(Prefilter.class);

    @Override
    public String filterType() {
        return "Prefilter";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        HttpServletResponse httpServletResponse = RequestContext.getCurrentContext().getResponse();
        log.info("prefilter"+String.format("response type is",httpServletResponse.getStatus()));
        return null;
    }
}
