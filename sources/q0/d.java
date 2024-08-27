package q0;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m0.t1;
import m0.u1;

/* loaded from: classes.dex */
public final class d extends z {

    /* renamed from: u, reason: collision with root package name */
    public final t.z f31477u;

    public d(a0.k kVar, boolean z10, float f10, t1 t1Var, u1 u1Var) {
        super(kVar, z10, f10, t1Var, u1Var);
        this.f31477u = new t.z();
    }

    @Override // g1.n
    public final void J0() {
        this.f31477u.a();
    }

    @Override // q0.z
    public final void Q0(a0.n nVar) {
        m1.c cVar;
        t.z zVar = this.f31477u;
        Object[] objArr = zVar.f34932b;
        Object[] objArr2 = zVar.f34933c;
        long[] jArr = zVar.f34931a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj = objArr[i13];
                            q qVar = (q) objArr2[i13];
                            qVar.f31534k.setValue(Boolean.TRUE);
                            qVar.f31532i.Z(Unit.f23355a);
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        boolean z10 = this.f31557o;
        if (z10) {
            cVar = new m1.c(nVar.f18a);
        } else {
            cVar = null;
        }
        q qVar2 = new q(cVar, this.f31562t, z10);
        zVar.l(nVar, qVar2);
        yk.g.H(E0(), null, null, new c(qVar2, this, nVar, null), 3);
        c2.g.s(this);
    }

    @Override // q0.z
    public final void R0(p1.h hVar) {
        float f10;
        long[] jArr;
        Object[] objArr;
        Object[] objArr2;
        float f11;
        long[] jArr2;
        Object[] objArr3;
        Object[] objArr4;
        int i10;
        float floatValue;
        d dVar = this;
        float f12 = ((i) dVar.f31560r.mo2invoke()).f31503d;
        if (f12 != s0.g.f34069a) {
            t.z zVar = dVar.f31477u;
            Object[] objArr5 = zVar.f34932b;
            Object[] objArr6 = zVar.f34933c;
            long[] jArr3 = zVar.f34931a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j10 = jArr3[i11];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8;
                        int i13 = 8 - ((~(i11 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((255 & j10) < 128) {
                                int i15 = (i11 << 3) + i14;
                                Object obj = objArr5[i15];
                                q qVar = (q) objArr6[i15];
                                long c10 = n1.t.c(dVar.f31559q.a(), f12);
                                if (qVar.f31527d == null) {
                                    long d10 = hVar.d();
                                    float f13 = r.f31535a;
                                    qVar.f31527d = Float.valueOf(Math.max(m1.f.e(d10), m1.f.c(d10)) * 0.3f);
                                }
                                if (qVar.f31524a == null) {
                                    f11 = f12;
                                    qVar.f31524a = new m1.c(hVar.p0());
                                } else {
                                    f11 = f12;
                                }
                                if (qVar.f31528e == null) {
                                    qVar.f31528e = new m1.c(t0.t.g(m1.f.e(hVar.d()) / 2.0f, m1.f.c(hVar.d()) / 2.0f));
                                }
                                if (((Boolean) qVar.f31534k.getValue()).booleanValue() && !((Boolean) qVar.f31533j.getValue()).booleanValue()) {
                                    floatValue = 1.0f;
                                } else {
                                    floatValue = ((Number) qVar.f31529f.d()).floatValue();
                                }
                                Float f14 = qVar.f31527d;
                                Intrinsics.c(f14);
                                jArr2 = jArr3;
                                float z02 = hl.f.z0(f14.floatValue(), qVar.f31525b, ((Number) qVar.f31530g.d()).floatValue());
                                m1.c cVar = qVar.f31524a;
                                Intrinsics.c(cVar);
                                float d11 = m1.c.d(cVar.f27237a);
                                m1.c cVar2 = qVar.f31528e;
                                Intrinsics.c(cVar2);
                                objArr3 = objArr5;
                                float d12 = m1.c.d(cVar2.f27237a);
                                w.d dVar2 = qVar.f31531h;
                                objArr4 = objArr6;
                                float z03 = hl.f.z0(d11, d12, ((Number) dVar2.d()).floatValue());
                                m1.c cVar3 = qVar.f31524a;
                                Intrinsics.c(cVar3);
                                i10 = length;
                                float e10 = m1.c.e(cVar3.f27237a);
                                m1.c cVar4 = qVar.f31528e;
                                Intrinsics.c(cVar4);
                                long g10 = t0.t.g(z03, hl.f.z0(e10, m1.c.e(cVar4.f27237a), ((Number) dVar2.d()).floatValue()));
                                long c11 = n1.t.c(c10, n1.t.e(c10) * floatValue);
                                if (qVar.f31526c) {
                                    float e11 = m1.f.e(hVar.d());
                                    float c12 = m1.f.c(hVar.d());
                                    p1.b f02 = hVar.f0();
                                    long b10 = f02.b();
                                    f02.a().h();
                                    f02.f30498a.f30504a.a().q(s0.g.f34069a, s0.g.f34069a, e11, c12, 1);
                                    p1.h.T(hVar, c11, z02, g10, 120);
                                    f02.a().s();
                                    f02.c(b10);
                                } else {
                                    p1.h.T(hVar, c11, z02, g10, 120);
                                }
                            } else {
                                f11 = f12;
                                jArr2 = jArr3;
                                objArr3 = objArr5;
                                objArr4 = objArr6;
                                i10 = length;
                            }
                            j10 >>= 8;
                            i14++;
                            f12 = f11;
                            objArr5 = objArr3;
                            jArr3 = jArr2;
                            length = i10;
                            objArr6 = objArr4;
                            i12 = 8;
                            dVar = this;
                        }
                        f10 = f12;
                        jArr = jArr3;
                        objArr2 = objArr6;
                        int i16 = length;
                        int i17 = i12;
                        objArr = objArr5;
                        if (i13 == i17) {
                            length = i16;
                        } else {
                            return;
                        }
                    } else {
                        f10 = f12;
                        jArr = jArr3;
                        objArr = objArr5;
                        objArr2 = objArr6;
                    }
                    if (i11 != length) {
                        i11++;
                        dVar = this;
                        f12 = f10;
                        objArr5 = objArr;
                        jArr3 = jArr;
                        objArr6 = objArr2;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // q0.z
    public final void S0(a0.n nVar) {
        q qVar = (q) this.f31477u.f(nVar);
        if (qVar != null) {
            qVar.f31534k.setValue(Boolean.TRUE);
            qVar.f31532i.Z(Unit.f23355a);
        }
    }
}
