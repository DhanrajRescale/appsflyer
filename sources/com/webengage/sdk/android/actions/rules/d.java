package com.webengage.sdk.android.actions.rules;

import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private String f12440a;

    /* renamed from: b, reason: collision with root package name */
    private String f12441b;

    /* renamed from: c, reason: collision with root package name */
    private String f12442c;

    /* renamed from: d, reason: collision with root package name */
    private String f12443d;

    /* renamed from: e, reason: collision with root package name */
    private com.webengage.sdk.android.actions.rules.k.d f12444e;

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private String f12445a;

        /* renamed from: b, reason: collision with root package name */
        private String f12446b;

        /* renamed from: c, reason: collision with root package name */
        private String f12447c;

        /* renamed from: d, reason: collision with root package name */
        private String f12448d;

        /* renamed from: e, reason: collision with root package name */
        private com.webengage.sdk.android.actions.rules.k.d f12449e;

        public b a(com.webengage.sdk.android.actions.rules.k.d dVar) {
            this.f12449e = dVar;
            return this;
        }

        public b b(String str) {
            this.f12448d = str;
            return this;
        }

        public b c(String str) {
            this.f12446b = str;
            return this;
        }

        public b d(String str) {
            this.f12445a = str;
            return this;
        }

        public b a(String str) {
            this.f12447c = str;
            return this;
        }

        public d a() {
            return new d(this);
        }
    }

    private d(b bVar) {
        this.f12440a = bVar.f12445a;
        this.f12441b = bVar.f12446b;
        this.f12442c = bVar.f12447c;
        this.f12443d = bVar.f12448d;
        this.f12444e = bVar.f12449e;
    }

    public String a() {
        return this.f12442c;
    }

    public String b() {
        return this.f12443d;
    }

    public com.webengage.sdk.android.actions.rules.k.d c() {
        return this.f12444e;
    }

    public String d() {
        return this.f12441b;
    }

    public String e() {
        return this.f12440a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return ((d) obj).e().equals(e());
    }

    public int hashCode() {
        return e().hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(d.class.getName() + " Object { " + property);
        StringBuilder sb3 = new StringBuilder(" Id : ");
        sb3.append(e());
        sb3.append(property);
        sb2.append(sb3.toString());
        sb2.append(" Function : " + d().toString() + property);
        sb2.append(" Attribute : " + a() + property);
        sb2.append(" Attribute Category : " + b() + property);
        StringBuilder sb4 = new StringBuilder(" Rule : ");
        sb4.append(c().toString());
        sb2.append(sb4.toString());
        sb2.append(UrlTreeKt.componentParamSuffix);
        return sb2.toString();
    }
}
