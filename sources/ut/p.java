package ut;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f37400a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f37401b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f37402c;

    public p(Object obj, Object obj2, Object obj3) {
        this.f37400a = obj;
        this.f37401b = obj2;
        this.f37402c = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.a(this.f37400a, pVar.f37400a) && Intrinsics.a(this.f37401b, pVar.f37401b) && Intrinsics.a(this.f37402c, pVar.f37402c);
    }

    public final int hashCode() {
        Object obj = this.f37400a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f37401b;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f37402c;
        return hashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f37400a + ", " + this.f37401b + ", " + this.f37402c + ')';
    }
}
