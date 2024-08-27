package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class h {
    public static CoroutineContext.Element a(CoroutineContext.Element element, i key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!Intrinsics.a(element.getKey(), key)) {
            return null;
        }
        return element;
    }

    public static CoroutineContext b(CoroutineContext.Element element, i key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (Intrinsics.a(element.getKey(), key)) {
            return k.f23369a;
        }
        return element;
    }
}
