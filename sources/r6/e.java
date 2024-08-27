package r6;

import androidx.media3.common.ParserException;
import e5.x;
import z5.p;
import z5.q;
import z5.r;

/* loaded from: classes.dex */
public final class e implements p {

    /* renamed from: a, reason: collision with root package name */
    public r f33365a;

    /* renamed from: b, reason: collision with root package name */
    public j f33366b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f33367c;

    public final boolean a(q qVar) {
        g gVar = new g();
        if (gVar.a(qVar, true) && (gVar.f33373a & 2) == 2) {
            int min = Math.min(gVar.f33377e, 8);
            e5.p pVar = new e5.p(min);
            qVar.n(pVar.f15036a, 0, min);
            pVar.F(0);
            if (pVar.a() >= 5 && pVar.u() == 127 && pVar.v() == 1179402563) {
                this.f33366b = new j();
            } else {
                pVar.F(0);
                try {
                    if (e5.a.u(1, pVar, true)) {
                        this.f33366b = new j();
                    }
                } catch (ParserException unused) {
                }
                pVar.F(0);
                if (i.e(pVar, i.f33380o)) {
                    this.f33366b = new j();
                }
            }
            return true;
        }
        return false;
    }

    @Override // z5.p
    public final void d(r rVar) {
        this.f33365a = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0176  */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, r6.h] */
    @Override // z5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(z5.q r21, mj.b r22) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.e.e(z5.q, mj.b):int");
    }

    @Override // z5.p
    public final void f(long j10, long j11) {
        j jVar = this.f33366b;
        if (jVar != null) {
            f fVar = jVar.f33383a;
            g gVar = fVar.f33368a;
            gVar.f33373a = 0;
            gVar.f33374b = 0L;
            gVar.f33375c = 0;
            gVar.f33376d = 0;
            gVar.f33377e = 0;
            fVar.f33369b.C(0);
            fVar.f33370c = -1;
            fVar.f33372e = false;
            if (j10 == 0) {
                jVar.d(!jVar.f33394l);
                return;
            }
            if (jVar.f33390h != 0) {
                long j12 = (jVar.f33391i * j11) / 1000000;
                jVar.f33387e = j12;
                h hVar = jVar.f33386d;
                int i10 = x.f15050a;
                hVar.z(j12);
                jVar.f33390h = 2;
            }
        }
    }

    @Override // z5.p
    public final boolean g(q qVar) {
        try {
            return a(qVar);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // z5.p
    public final void release() {
    }
}
