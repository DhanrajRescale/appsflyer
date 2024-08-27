package androidx.activity;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f864a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f865b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f866c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f867d;

    public p(l executor, c reportFullyDrawn) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(reportFullyDrawn, "reportFullyDrawn");
        this.f865b = new Object();
        this.f867d = new ArrayList();
    }

    public final void a() {
        synchronized (this.f865b) {
            try {
                this.f866c = true;
                Iterator it = this.f867d.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).mo2invoke();
                }
                this.f867d.clear();
                Unit unit = Unit.f23355a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
