package b0;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class i implements h, j {

    /* renamed from: a, reason: collision with root package name */
    public final float f2871a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2872b;

    /* renamed from: c, reason: collision with root package name */
    public final Function2 f2873c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2874d;

    public i(float f10, boolean z10, Function2 function2) {
        this.f2871a = f10;
        this.f2872b = z10;
        this.f2873c = function2;
        this.f2874d = f10;
    }

    @Override // b0.h, b0.j
    public final float a() {
        return this.f2874d;
    }

    @Override // b0.j
    public final void b(w2.b bVar, int i10, int[] iArr, int[] iArr2) {
        c(bVar, i10, iArr, w2.k.f38799a, iArr2);
    }

    @Override // b0.h
    public final void c(w2.b bVar, int i10, int[] iArr, w2.k kVar, int[] iArr2) {
        boolean z10;
        int i11;
        int i12;
        if (iArr.length == 0) {
            return;
        }
        int m02 = bVar.m0(this.f2871a);
        if (this.f2872b && kVar == w2.k.f38800b) {
            z10 = true;
        } else {
            z10 = false;
        }
        d dVar = n.f2935a;
        if (!z10) {
            int length = iArr.length;
            int i13 = 0;
            i11 = 0;
            i12 = 0;
            int i14 = 0;
            while (i13 < length) {
                int i15 = iArr[i13];
                int min = Math.min(i11, i10 - i15);
                iArr2[i14] = min;
                int min2 = Math.min(m02, (i10 - min) - i15);
                int i16 = iArr2[i14] + i15 + min2;
                i13++;
                i14++;
                i12 = min2;
                i11 = i16;
            }
        } else {
            i11 = 0;
            i12 = 0;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i17 = iArr[length2];
                int min3 = Math.min(i11, i10 - i17);
                iArr2[length2] = min3;
                i12 = Math.min(m02, (i10 - min3) - i17);
                i11 = iArr2[length2] + i17 + i12;
            }
        }
        int i18 = i11 - i12;
        Function2 function2 = this.f2873c;
        if (function2 != null && i18 < i10) {
            int intValue = ((Number) function2.invoke(Integer.valueOf(i10 - i18), kVar)).intValue();
            int length3 = iArr2.length;
            for (int i19 = 0; i19 < length3; i19++) {
                iArr2[i19] = iArr2[i19] + intValue;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return w2.e.a(this.f2871a, iVar.f2871a) && this.f2872b == iVar.f2872b && Intrinsics.a(this.f2873c, iVar.f2873c);
    }

    public final int hashCode() {
        int hashCode;
        int d10 = v.e.d(this.f2872b, Float.hashCode(this.f2871a) * 31, 31);
        Function2 function2 = this.f2873c;
        if (function2 == null) {
            hashCode = 0;
        } else {
            hashCode = function2.hashCode();
        }
        return d10 + hashCode;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.f2872b) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str = "Absolute";
        }
        sb2.append(str);
        sb2.append("Arrangement#spacedAligned(");
        sb2.append((Object) w2.e.b(this.f2871a));
        sb2.append(", ");
        sb2.append(this.f2873c);
        sb2.append(')');
        return sb2.toString();
    }
}
