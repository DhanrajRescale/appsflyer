package xk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: d, reason: collision with root package name */
    public static final androidx.work.u f40433d = new androidx.work.u(12, 0);

    /* renamed from: e, reason: collision with root package name */
    public static m f40434e;

    /* renamed from: a, reason: collision with root package name */
    public final a5.b f40435a;

    /* renamed from: b, reason: collision with root package name */
    public final j f40436b;

    /* renamed from: c, reason: collision with root package name */
    public i f40437c;

    public m(a5.b localBroadcastManager, j authenticationTokenCache) {
        Intrinsics.checkNotNullParameter(localBroadcastManager, "localBroadcastManager");
        Intrinsics.checkNotNullParameter(authenticationTokenCache, "authenticationTokenCache");
        this.f40435a = localBroadcastManager;
        this.f40436b = authenticationTokenCache;
    }
}
