package l4;

import android.graphics.Rect;
import e4.m;
import java.util.Comparator;
import mt.p;

/* loaded from: classes.dex */
public final class c implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f23949a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final Rect f23950b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23951c;

    /* renamed from: d, reason: collision with root package name */
    public final p f23952d;

    public c(boolean z10, p pVar) {
        this.f23951c = z10;
        this.f23952d = pVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f23952d.getClass();
        Rect rect = this.f23949a;
        ((m) obj).f(rect);
        Rect rect2 = this.f23950b;
        ((m) obj2).f(rect2);
        int i10 = rect.top;
        int i11 = rect2.top;
        if (i10 < i11) {
            return -1;
        }
        if (i10 > i11) {
            return 1;
        }
        int i12 = rect.left;
        int i13 = rect2.left;
        boolean z10 = this.f23951c;
        if (i12 < i13) {
            if (!z10) {
                return -1;
            }
            return 1;
        }
        if (i12 > i13) {
            if (z10) {
                return -1;
            }
            return 1;
        }
        int i14 = rect.bottom;
        int i15 = rect2.bottom;
        if (i14 < i15) {
            return -1;
        }
        if (i14 > i15) {
            return 1;
        }
        int i16 = rect.right;
        int i17 = rect2.right;
        if (i16 < i17) {
            if (!z10) {
                return -1;
            }
            return 1;
        }
        if (i16 > i17) {
            if (z10) {
                return -1;
            }
            return 1;
        }
        return 0;
    }
}
