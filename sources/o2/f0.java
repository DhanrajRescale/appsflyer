package o2;

import android.os.Build;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final de.d f29481a;

    public f0() {
        de.d dVar;
        if (Build.VERSION.SDK_INT >= 28) {
            dVar = new de.d(0);
        } else {
            dVar = new de.d(1);
        }
        this.f29481a = dVar;
    }
}
