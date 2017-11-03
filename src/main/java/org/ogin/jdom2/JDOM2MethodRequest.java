package org.ogin.jdom2;

/**
 * @author ogin
 */
public interface JDOM2MethodRequest<R extends JDOM2Response> extends JDOM2BaseRequest<R> {
    void get();
}
