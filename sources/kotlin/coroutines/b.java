package kotlin.coroutines;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class b implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f23359a;

    /* renamed from: b, reason: collision with root package name */
    public final i f23360b;

    public b(i baseKey, Function1 safeCast) {
        Intrinsics.checkNotNullParameter(baseKey, "baseKey");
        Intrinsics.checkNotNullParameter(safeCast, "safeCast");
        this.f23359a = safeCast;
        this.f23360b = baseKey instanceof b ? ((b) baseKey).f23360b : baseKey;
    }
}
