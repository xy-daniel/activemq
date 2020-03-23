package org.javaboy.activemq;

import java.io.Serializable;
import java.util.Date;

/**
 * @author daniel
 * @version 1.0.0
 * @date 2020/3/23 22:14
 */
public class Message implements Serializable {

    private String content;
    private Date sendDate;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    @Override
    public String toString() {
        return "Message{" +
                "content='" + content + '\'' +
                ", sendDate=" + sendDate +
                '}';
    }
}
