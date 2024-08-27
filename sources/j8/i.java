package j8;

import androidx.work.g0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public String f21065a;

    /* renamed from: b, reason: collision with root package name */
    public g0 f21066b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f21066b != iVar.f21066b) {
            return false;
        }
        return this.f21065a.equals(iVar.f21065a);
    }

    public final int hashCode() {
        return this.f21066b.hashCode() + (this.f21065a.hashCode() * 31);
    }
}
