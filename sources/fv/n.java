package fv;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public int f16336a;

    /* renamed from: b, reason: collision with root package name */
    public i f16337b;

    /* renamed from: c, reason: collision with root package name */
    public final h f16338c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f16339d;

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f16340e;

    public n(h dispatchQueue, Function0 function0, Function1 timerCalculation) {
        Intrinsics.e(dispatchQueue, "dispatchQueue");
        Intrinsics.e(timerCalculation, "timerCalculation");
        this.f16338c = dispatchQueue;
        this.f16339d = function0;
        this.f16340e = timerCalculation;
    }

    public final void a() {
        this.f16336a = 0;
        i iVar = this.f16337b;
        if (iVar != null) {
            iVar.f16305a.cancel(true);
        }
        this.f16337b = null;
    }

    public final void b() {
        i iVar = this.f16337b;
        if (iVar != null) {
            iVar.f16305a.cancel(true);
        }
        this.f16337b = null;
        this.f16337b = this.f16338c.a(((Number) this.f16340e.invoke(Integer.valueOf(this.f16336a + 1))).longValue(), TimeUnit.MILLISECONDS, new hj.b(this, 6));
    }
}
