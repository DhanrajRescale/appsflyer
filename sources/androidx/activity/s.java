package androidx.activity;

import android.window.OnBackInvokedCallback;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f870a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f871b;

    public /* synthetic */ s(Function0 function0, int i10) {
        this.f870a = i10;
        this.f871b = function0;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        switch (this.f870a) {
            case 0:
                Function0 onBackInvoked = this.f871b;
                Intrinsics.checkNotNullParameter(onBackInvoked, "$onBackInvoked");
                onBackInvoked.mo2invoke();
                return;
            case 1:
                this.f871b.mo2invoke();
                return;
            default:
                Function0 function0 = this.f871b;
                if (function0 != null) {
                    function0.mo2invoke();
                    return;
                }
                return;
        }
    }
}
