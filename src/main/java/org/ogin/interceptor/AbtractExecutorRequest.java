package org.ogin.interceptor;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ogin
 */
public abstract class AbtractExecutorRequest<R extends ExecutorResponse> implements ExecutorRequest<R> {
    protected Executor executor;

    protected Map<String, Object> requestParameters = new HashMap<String, Object>();

    public AbtractExecutorRequest(Executor executor) {
        this.executor = executor;
    }

    public R execute() {
        return (R) executor.execute(this);
    }
}
