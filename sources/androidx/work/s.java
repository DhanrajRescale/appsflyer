package androidx.work;

import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes.dex */
public final class s extends t {

    /* renamed from: a, reason: collision with root package name */
    public final k f2635a;

    public s(k kVar) {
        this.f2635a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.class == obj.getClass()) {
            return this.f2635a.equals(((s) obj).f2635a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2635a.hashCode() + (s.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f2635a + UrlTreeKt.componentParamSuffixChar;
    }
}
