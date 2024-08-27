package m0;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes.dex */
public final class r2 implements z2.t {

    /* renamed from: a, reason: collision with root package name */
    public final long f26720a;

    /* renamed from: b, reason: collision with root package name */
    public final w2.b f26721b;

    /* renamed from: c, reason: collision with root package name */
    public final Function2 f26722c;

    public r2(long j10, w2.b bVar, Function2 function2) {
        this.f26720a = j10;
        this.f26721b = bVar;
        this.f26722c = function2;
    }

    @Override // z2.t
    public final long a(w2.i iVar, long j10, w2.k kVar, long j11) {
        int i10;
        Sequence n10;
        Object obj;
        Object obj2;
        float f10 = a4.f25869b;
        w2.b bVar = this.f26721b;
        int m02 = bVar.m0(f10);
        long j12 = this.f26720a;
        int m03 = bVar.m0(w2.f.a(j12));
        w2.k kVar2 = w2.k.f38799a;
        if (kVar == kVar2) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i11 = m03 * i10;
        int m04 = bVar.m0(w2.f.b(j12));
        int i12 = iVar.f38794a + i11;
        int i13 = (int) (j11 >> 32);
        int i14 = iVar.f38796c;
        int i15 = (i14 - i13) + i11;
        int i16 = (int) (j10 >> 32);
        int i17 = i16 - i13;
        if (kVar == kVar2) {
            Integer[] elements = new Integer[3];
            elements[0] = Integer.valueOf(i12);
            elements[1] = Integer.valueOf(i15);
            if (iVar.f38794a < 0) {
                i17 = 0;
            }
            elements[2] = Integer.valueOf(i17);
            Intrinsics.checkNotNullParameter(elements, "elements");
            n10 = vt.v.n(elements);
        } else {
            Integer[] elements2 = new Integer[3];
            elements2[0] = Integer.valueOf(i15);
            elements2[1] = Integer.valueOf(i12);
            if (i14 <= i16) {
                i17 = 0;
            }
            elements2[2] = Integer.valueOf(i17);
            Intrinsics.checkNotNullParameter(elements2, "elements");
            n10 = vt.v.n(elements2);
        }
        Iterator it = n10.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                int intValue = ((Number) obj).intValue();
                if (intValue >= 0 && intValue + i13 <= i16) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Integer num = (Integer) obj;
        if (num != null) {
            i15 = num.intValue();
        }
        int max = Math.max(iVar.f38797d + m04, m02);
        int i18 = (int) (j11 & 4294967295L);
        int i19 = iVar.f38795b;
        int i20 = (i19 - i18) + m04;
        int i21 = (i19 - (i18 / 2)) + m04;
        int i22 = (int) (j10 & 4294967295L);
        Integer[] elements3 = {Integer.valueOf(max), Integer.valueOf(i20), Integer.valueOf(i21), Integer.valueOf((i22 - i18) - m02)};
        Intrinsics.checkNotNullParameter(elements3, "elements");
        Iterator it2 = vt.v.n(elements3).iterator();
        while (true) {
            if (it2.hasNext()) {
                obj2 = it2.next();
                int intValue2 = ((Number) obj2).intValue();
                if (intValue2 >= m02 && intValue2 + i18 <= i22 - m02) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        Integer num2 = (Integer) obj2;
        if (num2 != null) {
            i20 = num2.intValue();
        }
        this.f26722c.invoke(iVar, new w2.i(i15, i20, i13 + i15, i18 + i20));
        return hl.f.j(i15, i20);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj;
        long j10 = r2Var.f26720a;
        int i10 = w2.f.f38785c;
        if (this.f26720a == j10 && Intrinsics.a(this.f26721b, r2Var.f26721b) && Intrinsics.a(this.f26722c, r2Var.f26722c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = w2.f.f38785c;
        return this.f26722c.hashCode() + ((this.f26721b.hashCode() + (Long.hashCode(this.f26720a) * 31)) * 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) w2.f.c(this.f26720a)) + ", density=" + this.f26721b + ", onPositionCalculated=" + this.f26722c + ')';
    }
}
