package p8;

import bv.b0;
import bv.e0;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class n extends o {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f30755a;

    /* renamed from: b, reason: collision with root package name */
    public final bv.q f30756b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30757c;

    /* renamed from: d, reason: collision with root package name */
    public final Closeable f30758d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f30759e;

    /* renamed from: f, reason: collision with root package name */
    public e0 f30760f;

    public n(b0 b0Var, bv.q qVar, String str, Closeable closeable) {
        this.f30755a = b0Var;
        this.f30756b = qVar;
        this.f30757c = str;
        this.f30758d = closeable;
    }

    @Override // p8.o
    public final yk.j a() {
        return null;
    }

    @Override // p8.o
    public final synchronized bv.l b() {
        if (!this.f30759e) {
            e0 e0Var = this.f30760f;
            if (e0Var != null) {
                return e0Var;
            }
            e0 v10 = hl.f.v(this.f30756b.l(this.f30755a));
            this.f30760f = v10;
            return v10;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f30759e = true;
            e0 e0Var = this.f30760f;
            if (e0Var != null) {
                d9.e.a(e0Var);
            }
            Closeable closeable = this.f30758d;
            if (closeable != null) {
                d9.e.a(closeable);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
