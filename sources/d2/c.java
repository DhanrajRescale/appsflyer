package d2;

import java.text.BreakIterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: d, reason: collision with root package name */
    public static c f13377d;

    /* renamed from: c, reason: collision with root package name */
    public BreakIterator f13378c;

    @Override // d2.g
    public final int[] a(int i10) {
        int length = d().length();
        if (length <= 0 || i10 >= length) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        do {
            BreakIterator breakIterator = this.f13378c;
            if (breakIterator != null) {
                if (!breakIterator.isBoundary(i10)) {
                    BreakIterator breakIterator2 = this.f13378c;
                    if (breakIterator2 != null) {
                        i10 = breakIterator2.following(i10);
                    } else {
                        Intrinsics.k("impl");
                        throw null;
                    }
                } else {
                    BreakIterator breakIterator3 = this.f13378c;
                    if (breakIterator3 != null) {
                        int following = breakIterator3.following(i10);
                        if (following == -1) {
                            return null;
                        }
                        return c(i10, following);
                    }
                    Intrinsics.k("impl");
                    throw null;
                }
            } else {
                Intrinsics.k("impl");
                throw null;
            }
        } while (i10 != -1);
        return null;
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
        do {
            BreakIterator breakIterator = this.f13378c;
            if (breakIterator != null) {
                if (!breakIterator.isBoundary(i10)) {
                    BreakIterator breakIterator2 = this.f13378c;
                    if (breakIterator2 != null) {
                        i10 = breakIterator2.preceding(i10);
                    } else {
                        Intrinsics.k("impl");
                        throw null;
                    }
                } else {
                    BreakIterator breakIterator3 = this.f13378c;
                    if (breakIterator3 != null) {
                        int preceding = breakIterator3.preceding(i10);
                        if (preceding == -1) {
                            return null;
                        }
                        return c(preceding, i10);
                    }
                    Intrinsics.k("impl");
                    throw null;
                }
            } else {
                Intrinsics.k("impl");
                throw null;
            }
        } while (i10 != -1);
        return null;
    }

    public final void e(String str) {
        this.f13361a = str;
        BreakIterator breakIterator = this.f13378c;
        if (breakIterator != null) {
            breakIterator.setText(str);
        } else {
            Intrinsics.k("impl");
            throw null;
        }
    }
}
