package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class e1 implements d1 {

    /* renamed from: a, reason: collision with root package name */
    public static e1 f1902a;

    @Override // androidx.lifecycle.d1
    public a1 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return zq.f.D(modelClass);
    }

    @Override // androidx.lifecycle.d1
    public final a1 b(ou.b modelClass, y4.e extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return c(yk.g.y(modelClass), extras);
    }

    @Override // androidx.lifecycle.d1
    public a1 c(Class modelClass, y4.e extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return a(modelClass);
    }
}
