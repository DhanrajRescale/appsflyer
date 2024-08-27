package z5;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f42033a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f42034b;

    /* renamed from: c, reason: collision with root package name */
    public final int f42035c;

    /* renamed from: d, reason: collision with root package name */
    public final int f42036d;

    public a0(int i10, byte[] bArr, int i11, int i12) {
        this.f42033a = i10;
        this.f42034b = bArr;
        this.f42035c = i11;
        this.f42036d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a0.class != obj.getClass()) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.f42033a == a0Var.f42033a && this.f42035c == a0Var.f42035c && this.f42036d == a0Var.f42036d && Arrays.equals(this.f42034b, a0Var.f42034b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f42034b) + (this.f42033a * 31)) * 31) + this.f42035c) * 31) + this.f42036d;
    }
}
