package com.tracer.server.models.message;

public class RequestMessage extends Message {
    public RequestMessage() {
    }

    public RequestMessage(long senderID, long groupID, double latitude, double longitude) {
        super(senderID, groupID, latitude, longitude);
    }
}
