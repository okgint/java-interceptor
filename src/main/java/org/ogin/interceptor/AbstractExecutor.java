package org.ogin.interceptor;

import java.util.LinkedList;
import java.util.List;

/**
 * @author ogin
 */
public abstract class AbstractExecutor<Q extends ExecutorRequest> implements Executor<Q> {
    protected List<InvocationInterceptor> requestInterceptors = new LinkedList<InvocationInterceptor>();

    public List<InvocationInterceptor> getRequestInterceptor() {
        return this.requestInterceptors;
    }
}
