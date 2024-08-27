package lp;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class b0 extends i1 implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Comparator f24961a;

    public b0(t0.s sVar) {
        this.f24961a = sVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f24961a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            return this.f24961a.equals(((b0) obj).f24961a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24961a.hashCode();
    }

    public final String toString() {
        return this.f24961a.toString();
    }
}
