package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public n f1970a;

    /* renamed from: b, reason: collision with root package name */
    public r f1971b;

    public final void a(t tVar, m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        n a10 = event.a();
        n state1 = this.f1970a;
        Intrinsics.checkNotNullParameter(state1, "state1");
        if (a10.compareTo(state1) < 0) {
            state1 = a10;
        }
        this.f1970a = state1;
        this.f1971b.c(tVar, event);
        this.f1970a = a10;
    }
}
