package com.muzimin.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author: 李煌民
 * @date: 2024-05-07 20:24
 **/
@Component
@Slf4j
public class MyGateWayFilter  implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        String uname = exchange.getRequest().getQueryParams().getFirst("uname");
        if (uname == null) {
            log.info("url参数中没有uname参数，过滤器不放行该请求");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }
        //调用下一个过滤器，在这里表示放行
        return chain.filter(exchange);
    }

    /**
     * 定义优先级，值越小，优先级越高
     * @return
     */
    @Override
    public int getOrder() {
        return 0;
    }
}
