package org.ogin.interceptor;

import java.util.Map;

/**
 * @author ogin
 */
public interface ExecutorResponse {
    Map<String, Object> getResponseParameters();

    <V> V getResponseParameter(String name);
}
