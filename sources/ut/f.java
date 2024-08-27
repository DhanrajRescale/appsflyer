package ut;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lut/f;", HttpUrl.FRAGMENT_ENCODE_SET, "b", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class f implements Comparable<f> {

    /* renamed from: c, reason: collision with root package name */
    public static final f f37390c = new f();

    /* renamed from: a, reason: collision with root package name */
    public final int f37391a = 131072;

    @Override // java.lang.Comparable
    public final int compareTo(f fVar) {
        f other = fVar;
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f37391a - other.f37391a;
    }

    public final boolean equals(Object obj) {
        f fVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            fVar = (f) obj;
        } else {
            fVar = null;
        }
        if (fVar != null && this.f37391a == fVar.f37391a) {
            return true;
        }
        return false;
    }

    /* renamed from: hashCode, reason: from getter */
    public final int getF37391a() {
        return this.f37391a;
    }

    public final String toString() {
        return "2.0.0";
    }
}
