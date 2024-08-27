package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class KeysMap {
    private final Map<String, String> keys = new HashMap();
    private final int maxEntries;
    private final int maxEntryLength;

    public KeysMap(int i10, int i11) {
        this.maxEntries = i10;
        this.maxEntryLength = i11;
    }

    private String sanitizeKey(String str) {
        if (str != null) {
            return sanitizeString(str, this.maxEntryLength);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public static String sanitizeString(String str, int i10) {
        if (str != null) {
            String trim = str.trim();
            if (trim.length() > i10) {
                return trim.substring(0, i10);
            }
            return trim;
        }
        return str;
    }

    @NonNull
    public synchronized Map<String, String> getKeys() {
        return Collections.unmodifiableMap(new HashMap(this.keys));
    }

    public synchronized boolean setKey(String str, String str2) {
        String sanitizeKey = sanitizeKey(str);
        if (this.keys.size() >= this.maxEntries && !this.keys.containsKey(sanitizeKey)) {
            Logger.getLogger().w("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.maxEntries);
            return false;
        }
        String sanitizeString = sanitizeString(str2, this.maxEntryLength);
        if (CommonUtils.nullSafeEquals(this.keys.get(sanitizeKey), sanitizeString)) {
            return false;
        }
        Map<String, String> map = this.keys;
        if (str2 == null) {
            sanitizeString = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        map.put(sanitizeKey, sanitizeString);
        return true;
    }

    public synchronized void setKeys(Map<String, String> map) {
        String sanitizeString;
        try {
            int i10 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String sanitizeKey = sanitizeKey(entry.getKey());
                if (this.keys.size() >= this.maxEntries && !this.keys.containsKey(sanitizeKey)) {
                    i10++;
                }
                String value = entry.getValue();
                Map<String, String> map2 = this.keys;
                if (value == null) {
                    sanitizeString = HttpUrl.FRAGMENT_ENCODE_SET;
                } else {
                    sanitizeString = sanitizeString(value, this.maxEntryLength);
                }
                map2.put(sanitizeKey, sanitizeString);
            }
            if (i10 > 0) {
                Logger.getLogger().w("Ignored " + i10 + " entries when adding custom keys. Maximum allowable: " + this.maxEntries);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
