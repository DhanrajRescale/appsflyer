package d2;

import java.text.BreakIterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends b {

    /* renamed from: d, reason: collision with root package name */
    public static h f13424d;

    /* renamed from: c, reason: collision with root package name */
    public BreakIterator f13425c;

    @Override // d2.g
    public final int[] a(int i10) {
        if (d().length() <= 0 || i10 >= d().length()) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        while (!g(i10) && (!g(i10) || (i10 != 0 && g(i10 - 1)))) {
            BreakIterator breakIterator = this.f13425c;
            if (breakIterator != null) {
                i10 = breakIterator.following(i10);
                if (i10 == -1) {
                    return null;
                }
            } else {
                Intrinsics.k("impl");
                throw null;
            }
        }
        BreakIterator breakIterator2 = this.f13425c;
        if (breakIterator2 != null) {
            int following = breakIterator2.following(i10);
            if (following == -1 || !f(following)) {
                return null;
            }
            return c(i10, following);
        }
        Intrinsics.k("impl");
        throw null;
    }

    @Override // d2.g
    public final int[] b(int i10) {
        int length = d().length();
        if (length <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > length) {
            i10 = length;
        }
        while (i10 > 0 && !g(i10 - 1) && !f(i10)) {
            BreakIterator breakIterator = this.f13425c;
            if (breakIterator != null) {
                i10 = breakIterator.preceding(i10);
                if (i10 == -1) {
                    return null;
                }
            } else {
                Intrinsics.k("impl");
                throw null;
            }
        }
        BreakIterator breakIterator2 = this.f13425c;
        if (breakIterator2 != null) {
            int preceding = breakIterator2.preceding(i10);
            if (preceding == -1 || !g(preceding) || (preceding != 0 && g(preceding - 1))) {
                return null;
            }
            return c(preceding, i10);
        }
        Intrinsics.k("impl");
        throw null;
    }

    public final void e(String str) {
        this.f13361a = str;
        BreakIterator breakIterator = this.f13425c;
        if (breakIterator != null) {
            breakIterator.setText(str);
        } else {
            Intrinsics.k("impl");
            throw null;
        }
    }

    public final boolean f(int i10) {
        if (i10 > 0 && g(i10 - 1) && (i10 == d().length() || !g(i10))) {
            return true;
        }
        return false;
    }

    public final boolean g(int i10) {
        if (i10 >= 0 && i10 < d().length()) {
            return Character.isLetterOrDigit(d().codePointAt(i10));
        }
        return false;
    }
}
