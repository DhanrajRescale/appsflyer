package c7;

import q6.l;
import z5.b0;
import z5.p;
import z5.q;
import z5.r;

/* loaded from: classes.dex */
public final class d implements p {

    /* renamed from: a, reason: collision with root package name */
    public r f8037a;

    /* renamed from: b, reason: collision with root package name */
    public b0 f8038b;

    /* renamed from: e, reason: collision with root package name */
    public b f8041e;

    /* renamed from: c, reason: collision with root package name */
    public int f8039c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f8040d = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f8042f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f8043g = -1;

    @Override // z5.p
    public final void d(r rVar) {
        this.f8037a = rVar;
        this.f8038b = rVar.f(0, 1);
        rVar.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a5  */
    /* JADX WARN: Type inference failed for: r1v3, types: [k3.o, java.lang.Object] */
    @Override // z5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(z5.q r21, mj.b r22) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.d.e(z5.q, mj.b):int");
    }

    @Override // z5.p
    public final void f(long j10, long j11) {
        int i10;
        if (j10 == 0) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        this.f8039c = i10;
        b bVar = this.f8041e;
        if (bVar != null) {
            bVar.a(j11);
        }
    }

    @Override // z5.p
    public final boolean g(q qVar) {
        return l.f(qVar);
    }

    @Override // z5.p
    public final void release() {
    }
}
