package d4;

import android.os.Build;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class p2 {

    /* renamed from: a, reason: collision with root package name */
    public o2 f13805a;

    public p2(int i10, Interpolator interpolator, long j10) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f13805a = new n2(com.appsflyer.internal.k.k(i10, interpolator, j10));
        } else {
            this.f13805a = new o2(i10, interpolator, j10);
        }
    }
}
