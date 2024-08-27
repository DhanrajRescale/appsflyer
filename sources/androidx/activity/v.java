package androidx.activity;

import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v implements a {

    /* renamed from: a, reason: collision with root package name */
    public final q f877a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f878b;

    public v(w wVar, q onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.f878b = wVar;
        this.f877a = onBackPressedCallback;
    }

    @Override // androidx.activity.a
    public final void cancel() {
        w wVar = this.f878b;
        vt.q qVar = wVar.f880b;
        q qVar2 = this.f877a;
        qVar.remove(qVar2);
        qVar2.removeCancellable(this);
        if (Build.VERSION.SDK_INT >= 33) {
            qVar2.setEnabledChangedCallback$activity_release(null);
            wVar.d();
        }
    }
}
