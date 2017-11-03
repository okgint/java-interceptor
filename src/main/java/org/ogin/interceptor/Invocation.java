package org.ogin.interceptor;

/**
 * @author ogin
 */
public interface Invocation {
    Object getTarget();
    public ExecutorRequest geInvocationRequest();
    public Object proceed();
}
