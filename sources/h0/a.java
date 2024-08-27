package h0;

import n1.m0;
import n1.n0;
import n1.o0;
import n1.x0;
import t0.t;
import w2.k;

/* loaded from: classes.dex */
public abstract class a implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final b f17794a;

    /* renamed from: b, reason: collision with root package name */
    public final b f17795b;

    /* renamed from: c, reason: collision with root package name */
    public final b f17796c;

    /* renamed from: d, reason: collision with root package name */
    public final b f17797d;

    public a(b bVar, b bVar2, b bVar3, b bVar4) {
        this.f17794a = bVar;
        this.f17795b = bVar2;
        this.f17796c = bVar3;
        this.f17797d = bVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [h0.g, h0.a] */
    /* JADX WARN: Type inference failed for: r3v2, types: [h0.b] */
    public static g a(a aVar, e eVar, b bVar, b bVar2, int i10) {
        b bVar3;
        e eVar2 = eVar;
        if ((i10 & 1) != 0) {
            eVar2 = aVar.f17794a;
        }
        if ((i10 & 2) != 0) {
            bVar3 = aVar.f17795b;
        } else {
            bVar3 = null;
        }
        if ((i10 & 4) != 0) {
            bVar = aVar.f17796c;
        }
        if ((i10 & 8) != 0) {
            bVar2 = aVar.f17797d;
        }
        ((g) aVar).getClass();
        return new a(eVar2, bVar3, bVar, bVar2);
    }

    @Override // n1.x0
    public final o0 d(long j10, k kVar, w2.b bVar) {
        float f10;
        float f11;
        float a10 = this.f17794a.a(j10, bVar);
        float a11 = this.f17795b.a(j10, bVar);
        float a12 = this.f17796c.a(j10, bVar);
        float a13 = this.f17797d.a(j10, bVar);
        float d10 = m1.f.d(j10);
        float f12 = a10 + a13;
        if (f12 > d10) {
            float f13 = d10 / f12;
            a10 *= f13;
            a13 *= f13;
        }
        float f14 = a11 + a12;
        if (f14 > d10) {
            float f15 = d10 / f14;
            a11 *= f15;
            a12 *= f15;
        }
        if (a10 >= s0.g.f34069a && a11 >= s0.g.f34069a && a12 >= s0.g.f34069a && a13 >= s0.g.f34069a) {
            if (a10 + a11 + a12 + a13 == s0.g.f34069a) {
                return new m0(t.F0(j10));
            }
            m1.d F0 = t.F0(j10);
            k kVar2 = k.f38799a;
            if (kVar == kVar2) {
                f10 = a10;
            } else {
                f10 = a11;
            }
            long a14 = t.a(f10, f10);
            if (kVar == kVar2) {
                a10 = a11;
            }
            long a15 = t.a(a10, a10);
            if (kVar == kVar2) {
                f11 = a12;
            } else {
                f11 = a13;
            }
            long a16 = t.a(f11, f11);
            if (kVar != kVar2) {
                a13 = a12;
            }
            return new n0(new m1.e(F0.f27239a, F0.f27240b, F0.f27241c, F0.f27242d, a14, a15, a16, t.a(a13, a13)));
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + a10 + ", topEnd = " + a11 + ", bottomEnd = " + a12 + ", bottomStart = " + a13 + ")!").toString());
    }
}
