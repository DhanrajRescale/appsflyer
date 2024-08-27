package bv;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l0 extends n0 {
    @Override // bv.n0
    public final n0 deadlineNanoTime(long j10) {
        return this;
    }

    @Override // bv.n0
    public final void throwIfReached() {
    }

    @Override // bv.n0
    public final n0 timeout(long j10, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return this;
    }
}
