package com.webengage.sdk.android;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
class o {

    /* renamed from: a, reason: collision with root package name */
    Map<String, String> f12636a;

    public o() {
        this.f12636a = null;
        HashMap hashMap = new HashMap();
        this.f12636a = hashMap;
        hashMap.put("utm_campaign", q0.B.toString());
        this.f12636a.put("utm_source", q0.C.toString());
        this.f12636a.put("utm_medium", q0.D.toString());
        this.f12636a.put("utm_term", q0.E.toString());
        this.f12636a.put("utm_content", q0.F.toString());
        this.f12636a.put("gclid", q0.G.toString());
    }

    public Map<String, Object> a(String str) {
        HashMap hashMap = new HashMap();
        for (String str2 : str.split("&")) {
            String[] split = str2.split("=");
            if (this.f12636a.containsKey(split[0]) && split.length > 1) {
                hashMap.put(this.f12636a.get(split[0]), split[1]);
            }
        }
        return hashMap;
    }
}
