package m5;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f27509a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27510b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27511c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27512d;

    public b(String str, String str2, int i10, int i11) {
        this.f27509a = str;
        this.f27510b = str2;
        this.f27511c = i10;
        this.f27512d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f27511c == bVar.f27511c && this.f27512d == bVar.f27512d && pn.e.g(this.f27509a, bVar.f27509a) && pn.e.g(this.f27510b, bVar.f27510b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f27509a, this.f27510b, Integer.valueOf(this.f27511c), Integer.valueOf(this.f27512d)});
    }
}
