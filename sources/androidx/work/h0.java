package androidx.work;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.HashSet;
import java.util.UUID;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public UUID f2576a;

    /* renamed from: b, reason: collision with root package name */
    public g0 f2577b;

    /* renamed from: c, reason: collision with root package name */
    public k f2578c;

    /* renamed from: d, reason: collision with root package name */
    public HashSet f2579d;

    /* renamed from: e, reason: collision with root package name */
    public k f2580e;

    /* renamed from: f, reason: collision with root package name */
    public int f2581f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h0.class != obj.getClass()) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (this.f2581f != h0Var.f2581f || !this.f2576a.equals(h0Var.f2576a) || this.f2577b != h0Var.f2577b || !this.f2578c.equals(h0Var.f2578c) || !this.f2579d.equals(h0Var.f2579d)) {
            return false;
        }
        return this.f2580e.equals(h0Var.f2580e);
    }

    public final int hashCode() {
        return ((this.f2580e.hashCode() + ((this.f2579d.hashCode() + ((this.f2578c.hashCode() + ((this.f2577b.hashCode() + (this.f2576a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f2581f;
    }

    public final String toString() {
        return "WorkInfo{mId='" + this.f2576a + "', mState=" + this.f2577b + ", mOutputData=" + this.f2578c + ", mTags=" + this.f2579d + ", mProgress=" + this.f2580e + UrlTreeKt.componentParamSuffixChar;
    }
}
