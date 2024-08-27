package iu;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class p implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Class f20554a;

    public p(Class jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(HttpUrl.FRAGMENT_ENCODE_SET, "moduleName");
        this.f20554a = jClass;
    }

    @Override // iu.d
    public final Class a() {
        return this.f20554a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            if (Intrinsics.a(this.f20554a, ((p) obj).f20554a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f20554a.hashCode();
    }

    public final String toString() {
        return this.f20554a.toString() + " (Kotlin reflection is not available)";
    }
}
