package com.appsflyer.internal;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\Admin\appsflyer\classes17.dex */
public class AFa1jSDK$28002 {
    private final LinkedHashMap<String, Object> valueOf;
    static final Object values = new Object() { // from class: com.appsflyer.internal.AFa1jSDK$28002.3
        public final boolean equals(Object obj) {
            return obj == this || obj == null;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "null";
        }
    };
    private static final Double AFInAppEventType = Double.valueOf(-0.0d);

    /* JADX INFO: Access modifiers changed from: package-private */
    public AFa1jSDK$28002() {
        this.valueOf = new LinkedHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AFa1jSDK$28002(Map map) {
        this();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw new NullPointerException("key == null");
            }
            this.valueOf.put(str, AFInAppEventParameterName(entry.getValue()));
        }
    }

    AFa1jSDK$28002(AFa1hSDK$11276 aFa1hSDK$11276) throws AFa1gSDK$18044 {
        Object valueOf = aFa1hSDK$11276.valueOf();
        if (valueOf instanceof AFa1jSDK$28002) {
            this.valueOf = ((AFa1jSDK$28002) valueOf).valueOf;
            return;
        }
        throw AFa1rSDK$8603.AFKeystoreWrapper(valueOf, "AFJsonObject");
    }

    AFa1jSDK$28002(String str) throws AFa1gSDK$18044 {
        this(new AFa1hSDK$11276(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String valueOf(Number number) throws AFa1gSDK$18044 {
        if (number == null) {
            throw new AFa1gSDK$18044("Number must be non-null");
        }
        double doubleValue = number.doubleValue();
        AFa1rSDK$8603.AFKeystoreWrapper(doubleValue);
        if (number.equals(AFInAppEventType)) {
            return "-0";
        }
        long longValue = number.longValue();
        if (doubleValue == longValue) {
            return Long.toString(longValue);
        }
        return number.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object AFInAppEventParameterName(Object obj) {
        if (obj == null) {
            return values;
        }
        if ((obj instanceof AFa1lSDK$17250) || (obj instanceof AFa1jSDK$28002)) {
            return obj;
        }
        if (obj instanceof JSONArray) {
            return new AFa1lSDK$17250(obj.toString());
        }
        if (obj instanceof JSONObject) {
            return new AFa1jSDK$28002(obj.toString());
        }
        if (obj.equals(values)) {
            return obj;
        }
        if (obj instanceof Collection) {
            return new AFa1lSDK$17250((Collection) obj);
        }
        if (obj.getClass().isArray()) {
            return new AFa1lSDK$17250(obj);
        }
        if (obj instanceof Map) {
            return new AFa1jSDK$28002((Map) obj);
        }
        if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
            return obj;
        }
        if (obj.getClass().getPackage().getName().startsWith("java.")) {
            return obj.toString();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AFa1jSDK$28002 AFInAppEventType(String str, boolean z10) throws AFa1gSDK$18044 {
        this.valueOf.put(AFInAppEventParameterName(str), Boolean.valueOf(z10));
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AFa1jSDK$28002 values(String str, Object obj) throws AFa1gSDK$18044 {
        if (obj == null) {
            this.valueOf.remove(str);
            return this;
        }
        if (obj instanceof Number) {
            AFa1rSDK$8603.AFKeystoreWrapper(((Number) obj).doubleValue());
        }
        this.valueOf.put(AFInAppEventParameterName(str), obj);
        return this;
    }

    String AFInAppEventParameterName(String str) throws AFa1gSDK$18044 {
        if (str != null) {
            return str;
        }
        throw new AFa1gSDK$18044("Names must be non-null");
    }

    public String toString() {
        try {
            AFa1kSDK$12174 aFa1kSDK$12174 = new AFa1kSDK$12174();
            valueOf(aFa1kSDK$12174);
            return aFa1kSDK$12174.toString();
        } catch (AFa1gSDK$18044 unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void valueOf(AFa1kSDK$12174 aFa1kSDK$12174) throws AFa1gSDK$18044 {
        aFa1kSDK$12174.valueOf();
        for (Map.Entry<String, Object> entry : this.valueOf.entrySet()) {
            aFa1kSDK$12174.valueOf(entry.getKey()).AFInAppEventType(entry.getValue());
        }
        aFa1kSDK$12174.AFInAppEventParameterName();
    }
}
