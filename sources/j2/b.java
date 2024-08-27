package j2;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f20655a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20656b;

    /* renamed from: c, reason: collision with root package name */
    public int f20657c;

    /* renamed from: d, reason: collision with root package name */
    public final String f20658d;

    public /* synthetic */ b(Object obj, int i10, int i11, String str, int i12) {
        this((i12 & 8) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str, i10, (i12 & 4) != 0 ? Integer.MIN_VALUE : i11, obj);
    }

    public final d a(int i10) {
        int i11 = this.f20657c;
        if (i11 != Integer.MIN_VALUE) {
            i10 = i11;
        }
        if (i10 != Integer.MIN_VALUE) {
            return new d(this.f20658d, this.f20656b, i10, this.f20655a);
        }
        throw new IllegalStateException("Item.end should be set first".toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.a(this.f20655a, bVar.f20655a) && this.f20656b == bVar.f20656b && this.f20657c == bVar.f20657c && Intrinsics.a(this.f20658d, bVar.f20658d);
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f20655a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return this.f20658d.hashCode() + da.e.f(this.f20657c, da.e.f(this.f20656b, hashCode * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MutableRange(item=");
        sb2.append(this.f20655a);
        sb2.append(", start=");
        sb2.append(this.f20656b);
        sb2.append(", end=");
        sb2.append(this.f20657c);
        sb2.append(", tag=");
        return nn.d.n(sb2, this.f20658d, ')');
    }

    public b(String str, int i10, int i11, Object obj) {
        this.f20655a = obj;
        this.f20656b = i10;
        this.f20657c = i11;
        this.f20658d = str;
    }
}
