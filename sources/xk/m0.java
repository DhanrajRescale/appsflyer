package xk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f40438a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40439b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f40440c;

    /* renamed from: d, reason: collision with root package name */
    public long f40441d;

    public m0(boolean z10, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f40438a = z10;
        this.f40439b = key;
    }

    public final boolean a() {
        Boolean bool = this.f40440c;
        if (bool == null) {
            return this.f40438a;
        }
        return bool.booleanValue();
    }
}
