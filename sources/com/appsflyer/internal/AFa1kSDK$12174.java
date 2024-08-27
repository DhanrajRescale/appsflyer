package com.appsflyer.internal;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\Admin\appsflyer\classes17.dex */
public class AFa1kSDK$12174 {
    final StringBuilder valueOf = new StringBuilder();
    private final List<AFa1ySDK> AFKeystoreWrapper = new ArrayList();
    private final String values = null;

    /* loaded from: classes.dex */
    public enum AFa1ySDK {
        EMPTY_ARRAY,
        NONEMPTY_ARRAY,
        EMPTY_OBJECT,
        DANGLING_KEY,
        NONEMPTY_OBJECT,
        NULL
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AFa1kSDK$12174 AFInAppEventType() throws AFa1gSDK$18044 {
        return AFInAppEventType(AFa1ySDK.EMPTY_ARRAY, "[");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AFa1kSDK$12174 values() throws AFa1gSDK$18044 {
        return AFInAppEventType(AFa1ySDK.EMPTY_ARRAY, AFa1ySDK.NONEMPTY_ARRAY, "]");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AFa1kSDK$12174 valueOf() throws AFa1gSDK$18044 {
        return AFInAppEventType(AFa1ySDK.EMPTY_OBJECT, UrlTreeKt.componentParamPrefix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AFa1kSDK$12174 AFInAppEventParameterName() throws AFa1gSDK$18044 {
        return AFInAppEventType(AFa1ySDK.EMPTY_OBJECT, AFa1ySDK.NONEMPTY_OBJECT, UrlTreeKt.componentParamSuffix);
    }

    AFa1kSDK$12174 AFInAppEventType(AFa1ySDK aFa1ySDK, String str) throws AFa1gSDK$18044 {
        if (this.AFKeystoreWrapper.isEmpty() && this.valueOf.length() > 0) {
            throw new AFa1gSDK$18044("Nesting problem: multiple top-level roots");
        }
        e();
        this.AFKeystoreWrapper.add(aFa1ySDK);
        this.valueOf.append(str);
        return this;
    }

    AFa1kSDK$12174 AFInAppEventType(AFa1ySDK aFa1ySDK, AFa1ySDK aFa1ySDK2, String str) throws AFa1gSDK$18044 {
        AFa1ySDK AFKeystoreWrapper = AFKeystoreWrapper();
        if (AFKeystoreWrapper != aFa1ySDK2 && AFKeystoreWrapper != aFa1ySDK) {
            throw new AFa1gSDK$18044("Nesting problem");
        }
        this.AFKeystoreWrapper.remove(r3.size() - 1);
        this.valueOf.append(str);
        return this;
    }

    private AFa1ySDK AFKeystoreWrapper() throws AFa1gSDK$18044 {
        if (this.AFKeystoreWrapper.isEmpty()) {
            throw new AFa1gSDK$18044("Nesting problem");
        }
        return this.AFKeystoreWrapper.get(r0.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AFa1kSDK$12174 AFInAppEventType(Object obj) throws AFa1gSDK$18044 {
        if (this.AFKeystoreWrapper.isEmpty()) {
            throw new AFa1gSDK$18044("Nesting problem");
        }
        if (obj instanceof AFa1lSDK$17250) {
            ((AFa1lSDK$17250) obj).AFInAppEventParameterName(this);
            return this;
        }
        if (obj instanceof AFa1jSDK$28002) {
            ((AFa1jSDK$28002) obj).valueOf(this);
            return this;
        }
        e();
        if (obj == null || (obj instanceof Boolean) || obj == AFa1jSDK$28002.values) {
            this.valueOf.append(obj);
        } else if (obj instanceof Number) {
            this.valueOf.append(AFa1jSDK$28002.valueOf((Number) obj));
        } else {
            AFInAppEventParameterName(obj.toString());
        }
        return this;
    }

    private void AFInAppEventParameterName(String str) {
        this.valueOf.append("\"");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt != '\f') {
                if (charAt != '\r') {
                    if (charAt == '\"' || charAt == '/' || charAt == '\\') {
                        StringBuilder sb2 = this.valueOf;
                        sb2.append('\\');
                        sb2.append(charAt);
                    } else {
                        switch (charAt) {
                            case '\b':
                                this.valueOf.append("\\b");
                                break;
                            case '\t':
                                this.valueOf.append("\\t");
                                break;
                            case '\n':
                                this.valueOf.append("\\n");
                                break;
                            default:
                                if (charAt <= 31) {
                                    this.valueOf.append(String.format("\\u%04x", Integer.valueOf(charAt)));
                                    break;
                                } else {
                                    this.valueOf.append(charAt);
                                    break;
                                }
                        }
                    }
                } else {
                    this.valueOf.append("\\r");
                }
            } else {
                this.valueOf.append("\\f");
            }
        }
        this.valueOf.append("\"");
    }

    private void e() throws AFa1gSDK$18044 {
        if (this.AFKeystoreWrapper.isEmpty()) {
            return;
        }
        AFa1ySDK AFKeystoreWrapper = AFKeystoreWrapper();
        if (AFKeystoreWrapper == AFa1ySDK.EMPTY_ARRAY) {
            AFa1ySDK aFa1ySDK = AFa1ySDK.NONEMPTY_ARRAY;
            this.AFKeystoreWrapper.set(r1.size() - 1, aFa1ySDK);
        } else {
            if (AFKeystoreWrapper == AFa1ySDK.NONEMPTY_ARRAY) {
                this.valueOf.append(',');
                return;
            }
            if (AFKeystoreWrapper == AFa1ySDK.DANGLING_KEY) {
                this.valueOf.append(":");
                AFa1ySDK aFa1ySDK2 = AFa1ySDK.NONEMPTY_OBJECT;
                this.AFKeystoreWrapper.set(r1.size() - 1, aFa1ySDK2);
                return;
            }
            if (AFKeystoreWrapper != AFa1ySDK.NULL) {
                throw new AFa1gSDK$18044("Nesting problem");
            }
        }
    }

    public String toString() {
        if (this.valueOf.length() == 0) {
            return null;
        }
        return this.valueOf.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AFa1kSDK$12174 valueOf(String str) throws AFa1gSDK$18044 {
        if (str == null) {
            throw new AFa1gSDK$18044("Names must be non-null");
        }
        AFa1ySDK AFKeystoreWrapper = AFKeystoreWrapper();
        if (AFKeystoreWrapper == AFa1ySDK.NONEMPTY_OBJECT) {
            this.valueOf.append(',');
        } else if (AFKeystoreWrapper != AFa1ySDK.EMPTY_OBJECT) {
            throw new AFa1gSDK$18044("Nesting problem");
        }
        AFa1ySDK aFa1ySDK = AFa1ySDK.DANGLING_KEY;
        this.AFKeystoreWrapper.set(r1.size() - 1, aFa1ySDK);
        AFInAppEventParameterName(str);
        return this;
    }
}
