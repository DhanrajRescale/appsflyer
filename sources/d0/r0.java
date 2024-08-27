package d0;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes.dex */
public final class r0 implements w {

    /* renamed from: a, reason: collision with root package name */
    public final t.y f13210a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f13211b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13212c;

    public r0(IntRange intRange, bl.j jVar) {
        p0 E = jVar.E();
        int i10 = intRange.f23381a;
        if (i10 >= 0) {
            int min = Math.min(intRange.f23382b, E.f13199b - 1);
            if (min < i10) {
                t.y yVar = t.e0.f34851a;
                Intrinsics.d(yVar, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
                this.f13210a = yVar;
                this.f13211b = new Object[0];
                this.f13212c = 0;
                return;
            }
            int i11 = (min - i10) + 1;
            this.f13211b = new Object[i11];
            this.f13212c = i10;
            t.y yVar2 = new t.y(i11);
            q0 q0Var = new q0(i10, min, yVar2, this);
            E.b(i10);
            E.b(min);
            if (min >= i10) {
                v0.h hVar = E.f13198a;
                int I = al.d.I(i10, hVar);
                int i12 = ((f) hVar.f37653a[I]).f13157a;
                while (i12 <= min) {
                    f fVar = (f) hVar.f37653a[I];
                    q0Var.invoke(fVar);
                    i12 += fVar.f13158b;
                    I++;
                }
                this.f13210a = yVar2;
                return;
            }
            throw new IllegalArgumentException(("toIndex (" + min + ") should be not smaller than fromIndex (" + i10 + ')').toString());
        }
        throw new IllegalStateException("negative nearestRange.first".toString());
    }

    @Override // d0.w
    public final Object a(int i10) {
        int i11 = i10 - this.f13212c;
        if (i11 >= 0) {
            Object[] objArr = this.f13211b;
            if (i11 <= vt.v.r(objArr)) {
                return objArr[i11];
            }
        }
        return null;
    }

    @Override // d0.w
    public final int b(Object obj) {
        t.y yVar = this.f13210a;
        int d10 = yVar.d(obj);
        if (d10 >= 0) {
            return yVar.f34927c[d10];
        }
        return -1;
    }
}
