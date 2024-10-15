package com.taosdata.jdbc.ws.stmt.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.taosdata.jdbc.utils.UInt64Serializer;
import com.taosdata.jdbc.ws.entity.Payload;

public class SetTagReq extends Payload {
    @JsonProperty("stmt_id")
    @JsonSerialize(using = UInt64Serializer.class)
    private long stmtId;
    private Object[] tags;

    public long getStmtId() {
        return stmtId;
    }

    public void setStmtId(long stmtId) {
        this.stmtId = stmtId;
    }

    public Object[] getTags() {
        return tags;
    }

    public void setTags(Object[] tags) {
        this.tags = tags;
    }
}
