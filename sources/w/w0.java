package w;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w0 implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final v0 f38722a;

    public w0(v0 v0Var) {
        this.f38722a = v0Var;
    }

    @Override // w.c0, w.n
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final i2 a(y1 y1Var) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i10;
        v0 v0Var = this.f38722a;
        t.s sVar = new t.s(v0Var.f38726b.f34903e + 2);
        t.t tVar = v0Var.f38726b;
        t.t tVar2 = new t.t(tVar.f34903e);
        int[] iArr3 = tVar.f34900b;
        Object[] objArr3 = tVar.f34901c;
        long[] jArr = tVar.f34899a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j10 & 255) < 128) {
                            int i15 = (i11 << 3) + i14;
                            int i16 = iArr3[i15];
                            u0 u0Var = (u0) objArr3[i15];
                            sVar.a(i16);
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            tVar2.k(i16, new h2((t) y1Var.f38734a.invoke(u0Var.f38680a), u0Var.f38681b, u0Var.f38686c));
                            i10 = 8;
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i10 = i12;
                        }
                        j10 >>= i10;
                        i14++;
                        i12 = i10;
                        iArr3 = iArr2;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i13 != i12) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!tVar.b(0)) {
            sVar.b(0, 0);
        }
        if (!tVar.b(v0Var.f38725a)) {
            sVar.a(v0Var.f38725a);
        }
        int[] iArr4 = sVar.f34897a;
        int i17 = sVar.f34898b;
        Intrinsics.checkNotNullParameter(iArr4, "<this>");
        Arrays.sort(iArr4, 0, i17);
        return new i2(sVar, tVar2, v0Var.f38725a, e0.f38472c);
    }
}
