package y3;

import java.util.Locale;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final l f41145b = new l(new n(k.a(new Locale[0])));

    /* renamed from: a, reason: collision with root package name */
    public final m f41146a;

    public l(n nVar) {
        this.f41146a = nVar;
    }

    public static l a(String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",", -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i10 = 0; i10 < length; i10++) {
                localeArr[i10] = j.a(split[i10]);
            }
            return new l(new n(k.a(localeArr)));
        }
        return f41145b;
    }

    public final boolean b() {
        return ((n) this.f41146a).f41147a.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            if (this.f41146a.equals(((l) obj).f41146a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f41146a.hashCode();
    }

    public final String toString() {
        return this.f41146a.toString();
    }
}
