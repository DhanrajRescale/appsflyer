package u9;

import android.graphics.Color;

/* loaded from: classes.dex */
public final class f implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f f36995a = new Object();

    @Override // u9.i0
    public final Object i(v9.c cVar, float f10) {
        double d10;
        boolean z10 = true;
        if (cVar.x() != 1) {
            z10 = false;
        }
        if (z10) {
            cVar.a();
        }
        double l10 = cVar.l();
        double l11 = cVar.l();
        double l12 = cVar.l();
        if (cVar.x() == 7) {
            d10 = cVar.l();
        } else {
            d10 = 1.0d;
        }
        if (z10) {
            cVar.c();
        }
        if (l10 <= 1.0d && l11 <= 1.0d && l12 <= 1.0d) {
            l10 *= 255.0d;
            l11 *= 255.0d;
            l12 *= 255.0d;
            if (d10 <= 1.0d) {
                d10 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) d10, (int) l10, (int) l11, (int) l12));
    }
}
