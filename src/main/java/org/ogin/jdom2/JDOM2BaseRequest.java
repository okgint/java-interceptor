package org.ogin.jdom2;

import org.ogin.interceptor.ExecutorRequest;
import org.ogin.interceptor.ExecutorResponse;

/**
 * @author ogin
 */
public interface JDOM2BaseRequest<R extends ExecutorResponse> extends ExecutorRequest<R> {
    String PARAM_NAME_CHANNEL = "channel";
    String PARAM_NAME_LINK = "link";
    String PARAM_NAME_NAMESPACE = "atom";

}
