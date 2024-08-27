package g7;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final c3 f16706a;

    /* renamed from: b, reason: collision with root package name */
    public final q.h f16707b;

    public d1(qu.f0 scope, c3 parent) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f16706a = parent;
        this.f16707b = new q.h(parent.f16693a, scope);
    }
}
