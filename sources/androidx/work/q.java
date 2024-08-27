package androidx.work;

import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes.dex */
public final class q extends t {

    /* renamed from: a, reason: collision with root package name */
    public final k f2634a;

    public q(k kVar) {
        this.f2634a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            return this.f2634a.equals(((q) obj).f2634a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2634a.hashCode() + (q.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f2634a + UrlTreeKt.componentParamSuffixChar;
    }
}
