package ge;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m.c3;
import qu.h2;
import qu.i0;

/* loaded from: classes.dex */
public final class f implements c3 {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f17312a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.q f17313b;

    /* renamed from: c, reason: collision with root package name */
    public h2 f17314c;

    public f(androidx.lifecycle.o lifecycle, Function1 onDebouncingQueryTextChange) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(onDebouncingQueryTextChange, "onDebouncingQueryTextChange");
        this.f17312a = onDebouncingQueryTextChange;
        this.f17313b = i0.t(lifecycle);
    }
}
