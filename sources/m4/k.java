package m4;

import androidx.lifecycle.g0;
import androidx.lifecycle.s;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class k implements s {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f27481a;

    public k(m mVar) {
        this.f27481a = new WeakReference(mVar);
    }

    @g0(androidx.lifecycle.m.ON_START)
    public void onStart() {
        m mVar = (m) this.f27481a.get();
        if (mVar != null) {
            mVar.d();
        }
    }
}
