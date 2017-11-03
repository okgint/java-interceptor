package org.ogin.interceptor;

import java.util.Map;

/**
 * @author ogin
 */
public interface ExecutorRequest<R extends ExecutorResponse> {
    public void setParameters(Map<String, Object> params);

    void setParameter(String name, Object value);

    Map<String, Object> getParameters();

    <V> V getParameter(String name);

    R execute();
}
