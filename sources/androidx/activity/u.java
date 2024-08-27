package androidx.activity;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u implements androidx.lifecycle.r, a {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.o f873a;

    /* renamed from: b, reason: collision with root package name */
    public final q f874b;

    /* renamed from: c, reason: collision with root package name */
    public v f875c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f876d;

    public u(w wVar, androidx.lifecycle.o lifecycle, q onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.f876d = wVar;
        this.f873a = lifecycle;
        this.f874b = onBackPressedCallback;
        lifecycle.a(this);
    }

    @Override // androidx.lifecycle.r
    public final void c(androidx.lifecycle.t source, androidx.lifecycle.m event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == androidx.lifecycle.m.ON_START) {
            this.f875c = this.f876d.b(this.f874b);
            return;
        }
        if (event == androidx.lifecycle.m.ON_STOP) {
            v vVar = this.f875c;
            if (vVar != null) {
                vVar.cancel();
                return;
            }
            return;
        }
        if (event == androidx.lifecycle.m.ON_DESTROY) {
            cancel();
        }
    }

    @Override // androidx.activity.a
    public final void cancel() {
        this.f873a.c(this);
        this.f874b.removeCancellable(this);
        v vVar = this.f875c;
        if (vVar != null) {
            vVar.cancel();
        }
        this.f875c = null;
    }
}
