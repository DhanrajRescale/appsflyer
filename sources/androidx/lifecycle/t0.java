package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t0 implements d1 {
    @Override // androidx.lifecycle.d1
    public final a1 c(Class modelClass, y4.e extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return new SavedStateHandlesVM();
    }
}
