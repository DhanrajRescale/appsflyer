package g7;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q3 extends s3 {

    /* renamed from: b, reason: collision with root package name */
    public final Object f17022b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(Object key, boolean z10, int i10) {
        super(i10);
        Intrinsics.checkNotNullParameter(key, "key");
        this.f17022b = key;
    }

    @Override // g7.s3
    public final Object a() {
        return this.f17022b;
    }
}
