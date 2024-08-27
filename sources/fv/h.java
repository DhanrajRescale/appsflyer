package fv;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public ScheduledThreadPoolExecutor f16304a;

    public final i a(long j10, TimeUnit unit, hj.b bVar) {
        Intrinsics.e(unit, "unit");
        ScheduledFuture<?> scheduledFuture = this.f16304a.schedule(new gs.a(bVar, 2), j10, unit);
        Intrinsics.b(scheduledFuture, "scheduledFuture");
        return new i(scheduledFuture);
    }
}
