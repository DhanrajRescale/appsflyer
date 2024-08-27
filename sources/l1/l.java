package l1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements iu.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f23912a = h.f23893b;

    @Override // iu.f
    public final ut.d b() {
        return this.f23912a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l) || !(obj instanceof iu.f)) {
            return false;
        }
        return Intrinsics.a(this.f23912a, ((iu.f) obj).b());
    }

    public final int hashCode() {
        return this.f23912a.hashCode();
    }
}
