package com.orm.auth;

import java.util.Map;

public class AppSession {
    public static final ThreadLocal<Map<String, Object>> attributes = new ThreadLocal<>();


    public static Long getUserId() {
        return (Long) attributes.get().get("userId");
    }

}
