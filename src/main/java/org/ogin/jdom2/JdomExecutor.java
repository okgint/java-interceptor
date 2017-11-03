package org.ogin.jdom2;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.input.sax.SAXEngine;
import org.ogin.interceptor.AbstractExecutor;

import java.io.IOException;

/**
 * @author ogin
 */
public class JdomExecutor<Q extends JDOM2BaseRequest<R>, R extends JDOM2Response> extends AbstractExecutor<JDOM2BaseRequest> {
    Element element;

    public JdomExecutor(String document) {
        super();
        element = createElement(document);
    }

    protected Element createElement(String document) {
        SAXBuilder jdomBuilder = new SAXBuilder();
        Element element = null;
        try {
            Document jdomDocument = jdomBuilder.build(document);
            element = jdomDocument.getRootElement();
        } catch (JDOMException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return element;
    }

    public JDOM2BaseRequest createRequest() {
        return null;
    }

    public R execute(JDOM2BaseRequest request) {
        JDOM2
    }
}
