package com.webengage.sdk.android.actions.rules;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.webengage.sdk.android.utils.WebEngageConstant;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private com.webengage.sdk.android.actions.rules.k.d f12450a;

    /* renamed from: b, reason: collision with root package name */
    private com.webengage.sdk.android.actions.rules.k.d f12451b;

    /* renamed from: c, reason: collision with root package name */
    private com.webengage.sdk.android.actions.rules.k.d f12452c;

    /* renamed from: d, reason: collision with root package name */
    private com.webengage.sdk.android.actions.rules.k.d f12453d;

    public e(String str) {
        this.f12450a = null;
        this.f12451b = null;
        this.f12452c = null;
        this.f12453d = null;
        this.f12453d = new com.webengage.sdk.android.actions.rules.k.d(str);
    }

    public com.webengage.sdk.android.actions.rules.k.d a() {
        return this.f12453d;
    }

    public com.webengage.sdk.android.actions.rules.k.d b() {
        return this.f12452c;
    }

    public WebEngageConstant.c c() {
        return b().toString().equalsIgnoreCase("true") ? WebEngageConstant.c.PAGE_RULE : WebEngageConstant.c.EVENT_RULE;
    }

    public com.webengage.sdk.android.actions.rules.k.d d() {
        return this.f12451b;
    }

    public com.webengage.sdk.android.actions.rules.k.d e() {
        return this.f12450a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return eVar.f12450a.equals(this.f12450a) && eVar.f12451b.equals(this.f12451b) && eVar.f12452c.equals(this.f12452c);
    }

    public int hashCode() {
        return (this.f12450a.toString() + this.f12451b.toString() + this.f12452c.toString()).hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(e.class.getName() + " Object { " + property);
        StringBuilder sb3 = new StringBuilder(" Session Rule : ");
        sb3.append(e());
        sb3.append(property);
        sb2.append(sb3.toString());
        sb2.append(" Page Rule : " + d() + property);
        sb2.append(" Event Rule : " + b() + property);
        sb2.append(UrlTreeKt.componentParamSuffix);
        return sb2.toString();
    }

    public e(String str, String str2, String str3) {
        this.f12450a = null;
        this.f12451b = null;
        this.f12452c = null;
        this.f12453d = null;
        this.f12450a = new com.webengage.sdk.android.actions.rules.k.d(str);
        this.f12451b = new com.webengage.sdk.android.actions.rules.k.d(str2);
        this.f12452c = new com.webengage.sdk.android.actions.rules.k.d(str3);
    }
}
