package fd;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qu.f0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f16040a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f16041b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f16042c;

    /* renamed from: d, reason: collision with root package name */
    public final b f16043d;

    public c(String name, Long l10, f0 coroutineScope, Function1 action) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f16040a = 0L;
        this.f16041b = l10;
        this.f16042c = new AtomicBoolean(true);
        this.f16043d = new b(action, null);
    }

    public final void a() {
        this.f16042c.set(false);
    }
}
