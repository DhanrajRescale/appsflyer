package b0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f2927a;

    /* renamed from: b, reason: collision with root package name */
    public final h f2928b;

    /* renamed from: c, reason: collision with root package name */
    public final j f2929c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2930d;

    /* renamed from: e, reason: collision with root package name */
    public final e f2931e;

    /* renamed from: f, reason: collision with root package name */
    public final List f2932f;

    /* renamed from: g, reason: collision with root package name */
    public final a2.a1[] f2933g;

    /* renamed from: h, reason: collision with root package name */
    public final n1[] f2934h;

    public m1(int i10, h hVar, j jVar, float f10, e eVar, List list, a2.a1[] a1VarArr) {
        this.f2927a = i10;
        this.f2928b = hVar;
        this.f2929c = jVar;
        this.f2930d = f10;
        this.f2931e = eVar;
        this.f2932f = list;
        this.f2933g = a1VarArr;
        int size = list.size();
        n1[] n1VarArr = new n1[size];
        for (int i11 = 0; i11 < size; i11++) {
            n1VarArr[i11] = androidx.compose.foundation.layout.a.k((a2.q) this.f2932f.get(i11));
        }
        this.f2934h = n1VarArr;
    }

    public final int a(a2.a1 a1Var) {
        if (this.f2927a == 1) {
            return a1Var.f29a;
        }
        return a1Var.f30b;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final b0.k1 b(a2.o0 r27, long r28, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.m1.b(a2.o0, long, int, int):b0.k1");
    }

    public final void c(a2.z0 z0Var, k1 k1Var, int i10, w2.k kVar) {
        n1 n1Var;
        e eVar;
        int i11;
        w2.k kVar2;
        for (int i12 = k1Var.f2912c; i12 < k1Var.f2913d; i12++) {
            a2.a1 a1Var = this.f2933g[i12];
            Intrinsics.c(a1Var);
            Object a10 = ((a2.l0) this.f2932f.get(i12)).a();
            if (a10 instanceof n1) {
                n1Var = (n1) a10;
            } else {
                n1Var = null;
            }
            if (n1Var == null || (eVar = n1Var.f2956c) == null) {
                eVar = this.f2931e;
            }
            int i13 = this.f2927a;
            if (i13 == 1) {
                i11 = a1Var.f30b;
            } else {
                i11 = a1Var.f29a;
            }
            int i14 = k1Var.f2910a - i11;
            if (i13 == 1) {
                kVar2 = w2.k.f38799a;
            } else {
                kVar2 = kVar;
            }
            int a11 = eVar.a(i14, kVar2) + i10;
            int i15 = k1Var.f2912c;
            int[] iArr = k1Var.f2914e;
            if (i13 == 1) {
                int i16 = iArr[i12 - i15];
                z0Var.getClass();
                a2.z0.c(a1Var, i16, a11, s0.g.f34069a);
            } else {
                int i17 = iArr[i12 - i15];
                z0Var.getClass();
                a2.z0.c(a1Var, a11, i17, s0.g.f34069a);
            }
        }
    }
}
