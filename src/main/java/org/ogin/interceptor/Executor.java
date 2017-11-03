package org.ogin.interceptor;

import java.util.List;

/**
 * @author ogin
 */
public interface Executor<Q extends ExecutorRequest<?>> {
    public Q createRequest();

    public List<InvocationInterceptor> getRequestInterceptor();

    public ExecutorResponse execute(Q request);

}
