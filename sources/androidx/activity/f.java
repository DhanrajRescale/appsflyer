package androidx.activity;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f851a;

    public f(m mVar) {
        this.f851a = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            super/*android.app.Activity*/.onBackPressed();
        } catch (IllegalStateException e10) {
            if (TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
            } else {
                throw e10;
            }
        }
    }
}
