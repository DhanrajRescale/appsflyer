package i;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import dn.c;
import kotlin.jvm.internal.Intrinsics;
import t0.t;
import u7.f;
import ut.g;

/* loaded from: classes.dex */
public final class a implements Drawable.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18772a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f18773b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f18772a = i10;
        this.f18773b = obj;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable d10) {
        long j10;
        switch (this.f18772a) {
            case 0:
                return;
            case 1:
                ((f) this.f18773b).invalidateSelf();
                return;
            default:
                Intrinsics.checkNotNullParameter(d10, "d");
                dn.a aVar = (dn.a) this.f18773b;
                aVar.f14419f.setValue(Integer.valueOf(((Number) aVar.f14419f.getValue()).intValue() + 1));
                dn.a aVar2 = (dn.a) this.f18773b;
                Drawable drawable = aVar2.f14418e;
                g gVar = c.f14423a;
                if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
                    j10 = t.j(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                } else {
                    j10 = m1.f.f27252c;
                }
                aVar2.f14420g.setValue(new m1.f(j10));
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable d10, Runnable what, long j10) {
        switch (this.f18772a) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f18773b;
                if (callback != null) {
                    callback.scheduleDrawable(d10, what, j10);
                    return;
                }
                return;
            case 1:
                ((f) this.f18773b).scheduleSelf(what, j10);
                return;
            default:
                Intrinsics.checkNotNullParameter(d10, "d");
                Intrinsics.checkNotNullParameter(what, "what");
                ((Handler) c.f14423a.getValue()).postAtTime(what, j10);
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable d10, Runnable what) {
        switch (this.f18772a) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f18773b;
                if (callback != null) {
                    callback.unscheduleDrawable(d10, what);
                    return;
                }
                return;
            case 1:
                ((f) this.f18773b).unscheduleSelf(what);
                return;
            default:
                Intrinsics.checkNotNullParameter(d10, "d");
                Intrinsics.checkNotNullParameter(what, "what");
                ((Handler) c.f14423a.getValue()).removeCallbacks(what);
                return;
        }
    }
}
