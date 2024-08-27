package h;

import android.window.OnBackInvokedCallback;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17758a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17759b;

    public /* synthetic */ w(Object obj, int i10) {
        this.f17758a = i10;
        this.f17759b = obj;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        switch (this.f17758a) {
            case 0:
                ((e0) this.f17759b).D();
                return;
            default:
                ((Runnable) this.f17759b).run();
                return;
        }
    }
}
