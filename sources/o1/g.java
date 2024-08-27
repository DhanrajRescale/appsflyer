package o1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: e, reason: collision with root package name */
    public final r f29399e;

    /* renamed from: f, reason: collision with root package name */
    public final r f29400f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f29401g;

    public g(r rVar, r rVar2, int i10) {
        super(rVar2, rVar, rVar2, null);
        float[] k02;
        this.f29399e = rVar;
        this.f29400f = rVar2;
        t tVar = rVar2.f29425d;
        t tVar2 = rVar.f29425d;
        boolean E = t0.t.E(tVar2, tVar);
        float[] fArr = rVar.f29430i;
        float[] fArr2 = rVar2.f29431j;
        if (E) {
            k02 = t0.t.k0(fArr2, fArr);
        } else {
            float[] a10 = tVar2.a();
            t tVar3 = rVar2.f29425d;
            float[] a11 = tVar3.a();
            t tVar4 = k.f29408b;
            boolean E2 = t0.t.E(tVar2, tVar4);
            float[] fArr3 = k.f29411e;
            a aVar = b.f29368b;
            if (!E2) {
                float[] copyOf = Arrays.copyOf(fArr3, 3);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
                fArr = t0.t.k0(t0.t.B(aVar.f29369a, a10, copyOf), fArr);
            }
            if (!t0.t.E(tVar3, tVar4)) {
                float[] copyOf2 = Arrays.copyOf(fArr3, 3);
                Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, size)");
                fArr2 = t0.t.X(t0.t.k0(t0.t.B(aVar.f29369a, a11, copyOf2), rVar2.f29430i));
            }
            k02 = t0.t.k0(fArr2, i10 == 3 ? t0.t.l0(new float[]{a10[0] / a11[0], a10[1] / a11[1], a10[2] / a11[2]}, fArr) : fArr);
        }
        this.f29401g = k02;
    }

    @Override // o1.h
    public final long a(long j10) {
        float i10 = n1.t.i(j10);
        float h10 = n1.t.h(j10);
        float f10 = n1.t.f(j10);
        float e10 = n1.t.e(j10);
        r rVar = this.f29399e;
        float h11 = (float) rVar.f29437p.h(i10);
        n nVar = rVar.f29437p;
        float h12 = (float) nVar.h(h10);
        float h13 = (float) nVar.h(f10);
        float[] fArr = this.f29401g;
        float f11 = (fArr[6] * h13) + (fArr[3] * h12) + (fArr[0] * h11);
        float f12 = (fArr[7] * h13) + (fArr[4] * h12) + (fArr[1] * h11);
        float f13 = (fArr[8] * h13) + (fArr[5] * h12) + (fArr[2] * h11);
        r rVar2 = this.f29400f;
        float h14 = (float) rVar2.f29434m.h(f11);
        double d10 = f12;
        n nVar2 = rVar2.f29434m;
        return androidx.compose.ui.graphics.a.b(h14, (float) nVar2.h(d10), (float) nVar2.h(f13), e10, rVar2);
    }
}
