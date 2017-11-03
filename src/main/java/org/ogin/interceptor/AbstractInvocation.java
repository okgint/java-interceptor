package org.ogin.interceptor;

import java.util.List;

/**
 * @author ogin
 */
public abstract class AbstractInvocation<T> implements Invocation {
    protected T target;
    protected int currentIndex;
    protected List<InvocationInterceptor> interceptorChain;
    protected ExecutorRequest request;

    public AbstractInvocation(T target, ExecutorRequest request, List<InvocationInterceptor> interceptorChain) {
        this.target = target;
        this.request = request;
        this.interceptorChain = interceptorChain;
    }

    public T getTarget() {
        return target;
    }

    public ExecutorRequest getRequest() {
        return request;
    }

    public Object proceed() {
        currentIndex++;
        if (interceptorChain.size() > currentIndex) {
            return interceptorChain.get(currentIndex).handleInvocation(this);
        }
        else {
            return invokeTarget();
        }
    }
    public abstract Object invokeTarget();
}
