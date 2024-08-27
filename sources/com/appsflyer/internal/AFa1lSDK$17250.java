package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\Admin\appsflyer\classes17.dex */
public class AFa1lSDK$17250 {
    private final List<Object> AFInAppEventParameterName;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AFa1lSDK$17250() {
        this.AFInAppEventParameterName = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AFa1lSDK$17250(Collection collection) {
        this();
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                AFInAppEventParameterName(AFa1jSDK$28002.AFInAppEventParameterName(it.next()));
            }
        }
    }

    AFa1lSDK$17250(AFa1hSDK$11276 aFa1hSDK$11276) throws AFa1gSDK$18044 {
        Object valueOf = aFa1hSDK$11276.valueOf();
        if (valueOf instanceof AFa1lSDK$17250) {
            this.AFInAppEventParameterName = ((AFa1lSDK$17250) valueOf).AFInAppEventParameterName;
            return;
        }
        throw AFa1rSDK$8603.AFKeystoreWrapper(valueOf, "AFJsonArray");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AFa1lSDK$17250(String str) throws AFa1gSDK$18044 {
        this(new AFa1hSDK$11276(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AFa1lSDK$17250(Object obj) throws AFa1gSDK$18044 {
        if (!obj.getClass().isArray()) {
            StringBuilder sb2 = new StringBuilder("Not a primitive array: ");
            sb2.append(obj.getClass());
            throw new AFa1gSDK$18044(sb2.toString());
        }
        int length = Array.getLength(obj);
        this.AFInAppEventParameterName = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            AFInAppEventParameterName(AFa1jSDK$28002.AFInAppEventParameterName(Array.get(obj, i10)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AFa1lSDK$17250 AFInAppEventParameterName(Object obj) {
        this.AFInAppEventParameterName.add(obj);
        return this;
    }

    public String toString() {
        try {
            AFa1kSDK$12174 aFa1kSDK$12174 = new AFa1kSDK$12174();
            AFInAppEventParameterName(aFa1kSDK$12174);
            return aFa1kSDK$12174.toString();
        } catch (AFa1gSDK$18044 e10) {
            AFLogger.afErrorLogForExcManagerOnly("AFJsonStringer error", e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void AFInAppEventParameterName(AFa1kSDK$12174 aFa1kSDK$12174) throws AFa1gSDK$18044 {
        aFa1kSDK$12174.AFInAppEventType();
        Iterator<Object> it = this.AFInAppEventParameterName.iterator();
        while (it.hasNext()) {
            aFa1kSDK$12174.AFInAppEventType(it.next());
        }
        aFa1kSDK$12174.values();
    }

    public boolean equals(Object obj) {
        return (obj instanceof AFa1lSDK$17250) && ((AFa1lSDK$17250) obj).AFInAppEventParameterName.equals(this.AFInAppEventParameterName);
    }

    public int hashCode() {
        return this.AFInAppEventParameterName.hashCode();
    }
}
