package x;

import android.os.Build;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final g1.o f39705a;

    static {
        g1.o oVar;
        if (Build.VERSION.SDK_INT >= 31) {
            oVar = androidx.compose.ui.layout.a.h(androidx.compose.ui.layout.a.h(g1.l.f16404b, r.f39700b), r.f39701c);
        } else {
            oVar = g1.l.f16404b;
        }
        f39705a = oVar;
    }
}
