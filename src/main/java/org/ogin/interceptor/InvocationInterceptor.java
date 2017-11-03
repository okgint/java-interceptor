package org.ogin.interceptor;

/**
 * @author ogin
 */
public interface InvocationInterceptor {
    Object handleInvocation(Invocation invoocation);
}
