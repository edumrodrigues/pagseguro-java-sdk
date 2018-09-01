package br.com.uol.pagseguro.api.common.domain.xml;

import br.com.uol.pagseguro.api.common.domain.Document;
import br.com.uol.pagseguro.api.common.domain.enums.DocumentType;

import javax.xml.bind.annotation.XmlElement;

public class DocumentXML implements Document {
    private DocumentType type;
    private String value;

    DocumentXML() {
    }

    @Override
    public DocumentType getType() {
        return type;
    }

    @XmlElement(name = "type")
    public void setType(DocumentType type) {
        this.type = type;
    }

    @Override
    public String getValue() {
        return value;
    }

    @XmlElement(name = "value")
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "DocumentXML{" +
                "type='" + type + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

}
