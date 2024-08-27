package androidx.work.impl;

import android.content.Context;
import com.google.firebase.messaging.t;
import eb.f;
import j8.c;
import j8.m;
import java.util.HashMap;
import l7.a;
import l7.k;
import m.c0;
import p7.d;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f2586t = 0;

    /* renamed from: m, reason: collision with root package name */
    public volatile m f2587m;

    /* renamed from: n, reason: collision with root package name */
    public volatile c f2588n;

    /* renamed from: o, reason: collision with root package name */
    public volatile c f2589o;

    /* renamed from: p, reason: collision with root package name */
    public volatile h.c f2590p;

    /* renamed from: q, reason: collision with root package name */
    public volatile c f2591q;

    /* renamed from: r, reason: collision with root package name */
    public volatile t f2592r;

    /* renamed from: s, reason: collision with root package name */
    public volatile c f2593s;

    @Override // l7.s
    public final k d() {
        return new k(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, eb.f] */
    /* JADX WARN: Type inference failed for: r2v1, types: [p7.b, java.lang.Object] */
    @Override // l7.s
    public final d e(a aVar) {
        ?? obj = new Object();
        obj.f15309b = this;
        obj.f15308a = 12;
        c0 c0Var = new c0(aVar, (f) obj);
        Context context = aVar.f24107b;
        if (context != null) {
            ?? obj2 = new Object();
            obj2.f30720a = context;
            obj2.f30721b = aVar.f24108c;
            obj2.f30722c = c0Var;
            obj2.f30723d = false;
            return aVar.f24106a.g(obj2);
        }
        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c i() {
        c cVar;
        if (this.f2588n != null) {
            return this.f2588n;
        }
        synchronized (this) {
            try {
                if (this.f2588n == null) {
                    this.f2588n = new c(this, 0);
                }
                cVar = this.f2588n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c j() {
        c cVar;
        if (this.f2593s != null) {
            return this.f2593s;
        }
        synchronized (this) {
            try {
                if (this.f2593s == null) {
                    this.f2593s = new c(this, 1);
                }
                cVar = this.f2593s;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final h.c k() {
        h.c cVar;
        if (this.f2590p != null) {
            return this.f2590p;
        }
        synchronized (this) {
            try {
                if (this.f2590p == null) {
                    this.f2590p = new h.c(this);
                }
                cVar = this.f2590p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c l() {
        c cVar;
        if (this.f2591q != null) {
            return this.f2591q;
        }
        synchronized (this) {
            try {
                if (this.f2591q == null) {
                    this.f2591q = new c(this, 2);
                }
                cVar = this.f2591q;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final t m() {
        t tVar;
        if (this.f2592r != null) {
            return this.f2592r;
        }
        synchronized (this) {
            try {
                if (this.f2592r == null) {
                    this.f2592r = new t(this);
                }
                tVar = this.f2592r;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final m n() {
        m mVar;
        if (this.f2587m != null) {
            return this.f2587m;
        }
        synchronized (this) {
            try {
                if (this.f2587m == null) {
                    this.f2587m = new m(this);
                }
                mVar = this.f2587m;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final c o() {
        c cVar;
        if (this.f2589o != null) {
            return this.f2589o;
        }
        synchronized (this) {
            try {
                if (this.f2589o == null) {
                    this.f2589o = new c(this, 3);
                }
                cVar = this.f2589o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }
}
