package y3;

import android.os.LocaleList;

/* loaded from: classes.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    public final LocaleList f41147a;

    public n(Object obj) {
        this.f41147a = (LocaleList) obj;
    }

    @Override // y3.m
    public final Object a() {
        return this.f41147a;
    }

    public final boolean equals(Object obj) {
        return this.f41147a.equals(((m) obj).a());
    }

    public final int hashCode() {
        return this.f41147a.hashCode();
    }

    public final String toString() {
        return this.f41147a.toString();
    }
}
