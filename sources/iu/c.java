package iu;

import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class c implements ou.a, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public transient ou.a f20538a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f20539b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f20540c;

    /* renamed from: d, reason: collision with root package name */
    public final String f20541d;

    /* renamed from: e, reason: collision with root package name */
    public final String f20542e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f20543f;

    public c() {
        this(b.f20537a, null, null, null, false);
    }

    public abstract ou.a a();

    public final d d() {
        Class cls = this.f20540c;
        if (cls == null) {
            return null;
        }
        if (this.f20543f) {
            a0.f20536a.getClass();
            return new p(cls);
        }
        return a0.a(cls);
    }

    public c(Object obj, Class cls, String str, String str2, boolean z10) {
        this.f20539b = obj;
        this.f20540c = cls;
        this.f20541d = str;
        this.f20542e = str2;
        this.f20543f = z10;
    }
}
