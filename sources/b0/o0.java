package b0;

import com.google.android.gms.common.api.Api;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o0 implements a2.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final h f2959a;

    /* renamed from: b, reason: collision with root package name */
    public final j f2960b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2961c;

    /* renamed from: d, reason: collision with root package name */
    public final e f2962d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2963e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2964f;

    /* renamed from: g, reason: collision with root package name */
    public final n0 f2965g;

    /* renamed from: h, reason: collision with root package name */
    public final n0 f2966h;

    /* renamed from: i, reason: collision with root package name */
    public final n0 f2967i;

    public o0(i iVar, float f10, d0 d0Var, float f11) {
        f fVar = n.f2937c;
        this.f2959a = iVar;
        this.f2960b = fVar;
        this.f2961c = f10;
        this.f2962d = d0Var;
        this.f2963e = f11;
        this.f2964f = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f2965g = n0.f2942b;
        this.f2966h = n0.f2943c;
        this.f2967i = n0.f2944d;
    }

    @Override // a2.m0
    public final a2.n0 a(a2.o0 o0Var, List list, long j10) {
        Pair pair;
        Integer num;
        Integer num2;
        a2.n0 n0;
        Pair pair2;
        Integer num3;
        Integer num4;
        a2.a1[] a1VarArr;
        Integer num5;
        int i10;
        a2.n0 n02;
        List list2 = list;
        if (list.isEmpty()) {
            n02 = o0Var.n0(0, 0, vt.p0.d(), q.f2977e);
            return n02;
        }
        a2.a1[] a1VarArr2 = new a2.a1[list.size()];
        m1 m1Var = new m1(1, this.f2959a, this.f2960b, this.f2961c, this.f2962d, list, a1VarArr2);
        long i11 = androidx.compose.foundation.layout.a.i(j10, 1);
        v0.h hVar = new v0.h(new k1[16]);
        int h10 = w2.a.h(i11);
        int j11 = w2.a.j(i11);
        int ceil = (int) Math.ceil(o0Var.c0(r15));
        long b10 = hl.f.b(j11, h10, 0, w2.a.g(i11));
        a2.l0 l0Var = (a2.l0) vt.g0.x(0, list2);
        if (l0Var != null) {
            pair = m0.b(l0Var, b10, new t.g0(a1VarArr2, 8));
        } else {
            pair = null;
        }
        if (pair != null) {
            num = (Integer) pair.f23353a;
        } else {
            num = null;
        }
        if (pair != null) {
            num2 = (Integer) pair.f23354b;
        } else {
            num2 = null;
        }
        Integer[] numArr = new Integer[list.size()];
        Integer[] numArr2 = new Integer[list.size()];
        Integer num6 = num2;
        int size = list.size();
        int i12 = h10;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i13 < size) {
            Intrinsics.c(num);
            int intValue = num.intValue();
            Intrinsics.c(num6);
            int i18 = size;
            int intValue2 = num6.intValue();
            v0.h hVar2 = hVar;
            int i19 = i17 + intValue;
            int max = Math.max(i14, intValue2);
            i12 -= intValue;
            int i20 = i13 + 1;
            a2.l0 l0Var2 = (a2.l0) vt.g0.x(i20, list2);
            if (l0Var2 != null) {
                pair2 = m0.b(l0Var2, b10, new k0(a1VarArr2, i13));
            } else {
                pair2 = null;
            }
            if (pair2 != null) {
                num3 = Integer.valueOf(((Number) pair2.f23353a).intValue() + ceil);
            } else {
                num3 = null;
            }
            if (pair2 != null) {
                num4 = Integer.valueOf(((Number) pair2.f23354b).intValue());
            } else {
                num4 = 0;
            }
            if (i20 < list.size()) {
                a1VarArr = a1VarArr2;
                if (i20 - i15 < this.f2964f) {
                    if (num3 != null) {
                        i10 = num3.intValue();
                    } else {
                        i10 = 0;
                    }
                    if (i12 - i10 >= 0) {
                        num5 = num3;
                        list2 = list;
                        i13 = i20;
                        i14 = max;
                        size = i18;
                        Integer num7 = num4;
                        num = num5;
                        a1VarArr2 = a1VarArr;
                        i17 = i19;
                        hVar = hVar2;
                        num6 = num7;
                    }
                }
            } else {
                a1VarArr = a1VarArr2;
            }
            int min = Math.min(Math.max(j11, i19), h10);
            numArr[i16] = Integer.valueOf(i20);
            numArr2[i16] = Integer.valueOf(max);
            i16++;
            if (num3 != null) {
                num5 = Integer.valueOf(num3.intValue() - ceil);
            } else {
                num5 = null;
            }
            j11 = min;
            i15 = i20;
            i12 = h10;
            max = 0;
            i19 = 0;
            list2 = list;
            i13 = i20;
            i14 = max;
            size = i18;
            Integer num72 = num4;
            num = num5;
            a1VarArr2 = a1VarArr;
            i17 = i19;
            hVar = hVar2;
            num6 = num72;
        }
        v0.h hVar3 = hVar;
        int i21 = 0;
        long j12 = androidx.compose.foundation.layout.a.j(b10, j11, 0, 14);
        Integer num8 = (Integer) vt.v.s(0, numArr);
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        while (num8 != null) {
            Integer num9 = numArr2[i24];
            Intrinsics.c(num9);
            k1 b11 = m1Var.b(o0Var, androidx.compose.foundation.layout.a.z(androidx.compose.foundation.layout.a.j(j12, i21, num9.intValue(), 7), 1), i22, num8.intValue());
            i23 += b11.f2910a;
            j11 = Math.max(j11, b11.f2911b);
            hVar3.b(b11);
            i22 = num8.intValue();
            i24++;
            num8 = (Integer) vt.v.s(i24, numArr);
            numArr2 = numArr2;
            i21 = 0;
        }
        p0 p0Var = new p0(Math.max(j11, w2.a.j(i11)), Math.max(i23, w2.a.i(i11)), hVar3);
        int i25 = hVar3.f37655c;
        int[] iArr = new int[i25];
        for (int i26 = 0; i26 < i25; i26++) {
            iArr[i26] = ((k1) hVar3.f37653a[i26]).f2910a;
        }
        int[] iArr2 = new int[i25];
        int m02 = ((hVar3.f37655c - 1) * o0Var.m0(this.f2963e)) + p0Var.f2972b;
        j jVar = this.f2960b;
        if (jVar != null) {
            jVar.b(o0Var, m02, iArr, iArr2);
            n0 = o0Var.n0(hl.f.L(p0Var.f2971a, j10), hl.f.K(m02, j10), vt.p0.d(), new w.a(p0Var, m1Var, iArr2, o0Var, 3));
            return n0;
        }
        throw new IllegalArgumentException("null verticalArrangement".toString());
    }

    @Override // a2.m0
    public final int b(c2.i1 i1Var, List list, int i10) {
        return m0.a(list, this.f2967i, this.f2966h, i10, i1Var.m0(this.f2961c), i1Var.m0(this.f2963e), this.f2964f);
    }

    @Override // a2.m0
    public final int c(c2.i1 i1Var, List list, int i10) {
        return g(i10, i1Var.m0(this.f2961c), i1Var.m0(this.f2963e), list);
    }

    @Override // a2.m0
    public final int d(c2.i1 i1Var, List list, int i10) {
        return f(i10, i1Var.m0(this.f2961c), list);
    }

    @Override // a2.m0
    public final int e(c2.i1 i1Var, List list, int i10) {
        return m0.a(list, this.f2967i, this.f2966h, i10, i1Var.m0(this.f2961c), i1Var.m0(this.f2963e), this.f2964f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        o0Var.getClass();
        return Intrinsics.a(this.f2959a, o0Var.f2959a) && Intrinsics.a(this.f2960b, o0Var.f2960b) && w2.e.a(this.f2961c, o0Var.f2961c) && Intrinsics.a(this.f2962d, o0Var.f2962d) && w2.e.a(this.f2963e, o0Var.f2963e) && this.f2964f == o0Var.f2964f;
    }

    public final int f(int i10, int i11, List list) {
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i12 < size) {
            int intValue = ((Number) this.f2965g.b((a2.q) list.get(i12), Integer.valueOf(i12), Integer.valueOf(i10))).intValue() + i11;
            int i16 = i12 + 1;
            if (i16 - i14 != this.f2964f && i16 != list.size()) {
                i15 += intValue;
            } else {
                i13 = Math.max(i13, (i15 + intValue) - i11);
                i15 = 0;
                i14 = i12;
            }
            i12 = i16;
        }
        return i13;
    }

    public final int g(int i10, int i11, int i12, List list) {
        int i13 = this.f2964f;
        int size = list.size();
        int[] iArr = new int[size];
        for (int i14 = 0; i14 < size; i14++) {
            iArr[i14] = 0;
        }
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        for (int i15 = 0; i15 < size2; i15++) {
            iArr2[i15] = 0;
        }
        int size3 = list.size();
        for (int i16 = 0; i16 < size3; i16++) {
            a2.q qVar = (a2.q) list.get(i16);
            int intValue = ((Number) this.f2967i.b(qVar, Integer.valueOf(i16), Integer.valueOf(i10))).intValue();
            iArr[i16] = intValue;
            iArr2[i16] = ((Number) this.f2966h.b(qVar, Integer.valueOf(i16), Integer.valueOf(intValue))).intValue();
        }
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i17 = 0;
        for (int i18 = 0; i18 < size; i18++) {
            i17 += iArr[i18];
        }
        if (size2 != 0) {
            int i19 = iArr2[0];
            Intrinsics.checkNotNullParameter(iArr2, "<this>");
            nu.f it = new kotlin.ranges.c(1, size2 - 1, 1).iterator();
            while (it.f29173c) {
                int i20 = iArr2[it.b()];
                if (i19 < i20) {
                    i19 = i20;
                }
            }
            if (size != 0) {
                int i21 = iArr[0];
                Intrinsics.checkNotNullParameter(iArr, "<this>");
                nu.f it2 = new kotlin.ranges.c(1, size - 1, 1).iterator();
                while (it2.f29173c) {
                    int i22 = iArr[it2.b()];
                    if (i21 < i22) {
                        i21 = i22;
                    }
                }
                int i23 = i21;
                int i24 = i17;
                while (i23 < i24 && i19 != i10) {
                    int i25 = (i23 + i24) / 2;
                    int i26 = i24;
                    i19 = m0.a(list, new l0(iArr, 0), new l0(iArr2, 1), i25, i11, i12, i13);
                    if (i19 == i10) {
                        return i25;
                    }
                    if (i19 > i10) {
                        i23 = i25 + 1;
                        i17 = i25;
                        i24 = i26;
                    } else {
                        i24 = i25 - 1;
                        i17 = i25;
                    }
                }
                return i17;
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    public final int hashCode() {
        int hashCode;
        int e10 = w.k.e(1) * 31;
        int i10 = 0;
        h hVar = this.f2959a;
        if (hVar == null) {
            hashCode = 0;
        } else {
            hashCode = hVar.hashCode();
        }
        int i11 = (e10 + hashCode) * 31;
        j jVar = this.f2960b;
        if (jVar != null) {
            i10 = jVar.hashCode();
        }
        return Integer.hashCode(this.f2964f) + v.e.a(this.f2963e, (this.f2962d.hashCode() + ((w.k.e(1) + v.e.a(this.f2961c, (i11 + i10) * 31, 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlowMeasurePolicy(orientation=");
        sb2.append(a3.a.B(1));
        sb2.append(", horizontalArrangement=");
        sb2.append(this.f2959a);
        sb2.append(", verticalArrangement=");
        sb2.append(this.f2960b);
        sb2.append(", mainAxisArrangementSpacing=");
        sb2.append((Object) w2.e.b(this.f2961c));
        sb2.append(", crossAxisSize=");
        sb2.append(a3.a.C(1));
        sb2.append(", crossAxisAlignment=");
        sb2.append(this.f2962d);
        sb2.append(", crossAxisArrangementSpacing=");
        sb2.append((Object) w2.e.b(this.f2963e));
        sb2.append(", maxItemsInMainAxis=");
        return a3.a.i(sb2, this.f2964f, ')');
    }
}
