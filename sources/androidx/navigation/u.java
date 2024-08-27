package androidx.navigation;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u implements d1 {
    @Override // androidx.lifecycle.d1
    public final a1 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return new NavControllerViewModel();
    }
}
