package com.google.protobuf;

/* loaded from: classes2.dex */
public abstract class r extends a {

    /* renamed from: a, reason: collision with root package name */
    public final t f11974a;

    /* renamed from: b, reason: collision with root package name */
    public t f11975b;

    public r(t tVar) {
        this.f11974a = tVar;
        if (!tVar.q()) {
            this.f11975b = (t) tVar.m(4);
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    public static void j(t tVar, t tVar2) {
        w0 w0Var = w0.f11993c;
        w0Var.getClass();
        w0Var.a(tVar.getClass()).a(tVar, tVar2);
    }

    public final Object clone() {
        r rVar = (r) this.f11974a.m(5);
        rVar.f11975b = h();
        return rVar;
    }

    public final t g() {
        t h10 = h();
        h10.getClass();
        if (t.p(h10, true)) {
            return h10;
        }
        throw new RuntimeException("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final t h() {
        if (!this.f11975b.q()) {
            return this.f11975b;
        }
        t tVar = this.f11975b;
        tVar.getClass();
        w0 w0Var = w0.f11993c;
        w0Var.getClass();
        w0Var.a(tVar.getClass()).b(tVar);
        tVar.r();
        return this.f11975b;
    }

    public final void i() {
        if (!this.f11975b.q()) {
            t tVar = (t) this.f11974a.m(4);
            j(tVar, this.f11975b);
            this.f11975b = tVar;
        }
    }
}
