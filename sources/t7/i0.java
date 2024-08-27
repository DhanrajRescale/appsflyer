package t7;

import android.view.View;
import android.view.WindowId;

/* loaded from: classes.dex */
public final class i0 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final WindowId f35484a;

    public i0(View view) {
        this.f35484a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof i0) && ((i0) obj).f35484a.equals(this.f35484a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f35484a.hashCode();
    }
}
