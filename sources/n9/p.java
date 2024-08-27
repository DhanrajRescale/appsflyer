package n9;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p implements r {

    /* renamed from: a, reason: collision with root package name */
    public final String f28526a;

    public /* synthetic */ p(String str) {
        this.f28526a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        if (!Intrinsics.a(this.f28526a, ((p) obj).f28526a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f28526a.hashCode();
    }

    public final String toString() {
        return "Asset(assetName=" + this.f28526a + ')';
    }
}
