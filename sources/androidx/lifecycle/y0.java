package androidx.lifecycle;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import d4.n1;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2000a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2001b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2002c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2003d;

    public y0(v registry, m event) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(event, "event");
        this.f2002c = registry;
        this.f2003d = event;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ek.h0 h0Var;
        int i10 = this.f2000a;
        Object obj = this.f2002c;
        Object obj2 = this.f2003d;
        switch (i10) {
            case 0:
                if (!this.f2001b) {
                    ((v) obj).f((m) obj2);
                    this.f2001b = true;
                    return;
                }
                return;
            default:
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) obj2;
                l4.e eVar = swipeDismissBehavior.f11159a;
                if (eVar != null && eVar.g()) {
                    WeakHashMap weakHashMap = n1.f13788a;
                    d4.v0.m((View) obj, this);
                    return;
                } else {
                    if (this.f2001b && (h0Var = swipeDismissBehavior.f11160b) != null) {
                        h0Var.p((View) obj);
                        return;
                    }
                    return;
                }
        }
    }

    public y0(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z10) {
        this.f2003d = swipeDismissBehavior;
        this.f2002c = view;
        this.f2001b = z10;
    }
}
