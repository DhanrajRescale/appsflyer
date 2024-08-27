package kotlin.coroutines;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class g {
    public static CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (context != k.f23369a) {
            return (CoroutineContext) context.R(coroutineContext, j.f23368a);
        }
        return coroutineContext;
    }
}
