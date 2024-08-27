package os;

import android.view.View;

/* loaded from: classes2.dex */
public final class j0 extends c0 {

    /* renamed from: f, reason: collision with root package name */
    public boolean f30343f;

    @Override // os.k0
    public final void a(View view) {
        boolean z10;
        if (view != null && !this.f30343f) {
            d(view);
        }
        if (view != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f30343f = z10;
    }

    @Override // os.k0
    public final void b() {
    }
}
