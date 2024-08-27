package d9;

import android.content.Context;
import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final y8.c f14220a = new y8.c();

    public static final boolean a(y8.j jVar) {
        int ordinal = jVar.f41370i.ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                if (jVar.L.f41317b != null || !(jVar.B instanceof z8.c)) {
                    return false;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }

    public static final Drawable b(y8.j jVar, Drawable drawable, Integer num, Drawable drawable2) {
        if (drawable == null) {
            if (num != null) {
                if (num.intValue() == 0) {
                    return null;
                }
                Context context = jVar.f41362a;
                int intValue = num.intValue();
                Drawable m10 = iu.j.m(context, intValue);
                if (m10 != null) {
                    return m10;
                }
                throw new IllegalStateException(jr.h.n("Invalid resource ID: ", intValue).toString());
            }
            return drawable2;
        }
        return drawable;
    }
}
