package androidx.work;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f2564a = new HashSet();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            return this.f2564a.equals(((g) obj).f2564a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2564a.hashCode();
    }
}
