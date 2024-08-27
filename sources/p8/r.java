package p8;

import bv.x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r extends o {

    /* renamed from: a, reason: collision with root package name */
    public final yk.j f30764a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f30765b;

    /* renamed from: c, reason: collision with root package name */
    public final bv.l f30766c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f30767d;

    public r(bv.l lVar, p pVar, yk.j jVar) {
        this.f30764a = jVar;
        this.f30766c = lVar;
    }

    @Override // p8.o
    public final yk.j a() {
        return this.f30764a;
    }

    @Override // p8.o
    public final synchronized bv.l b() {
        bv.l lVar;
        try {
            if (!this.f30765b) {
                lVar = this.f30766c;
                if (lVar == null) {
                    x xVar = bv.q.f7389a;
                    Intrinsics.c(null);
                    xVar.l(null);
                    throw null;
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return lVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f30765b = true;
        bv.l lVar = this.f30766c;
        if (lVar != null) {
            d9.e.a(lVar);
        }
    }
}
