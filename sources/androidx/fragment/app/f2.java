package androidx.fragment.app;

import android.util.Log;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class f2 {

    /* renamed from: a, reason: collision with root package name */
    public e2 f1696a;

    /* renamed from: b, reason: collision with root package name */
    public d2 f1697b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f1698c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1699d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f1700e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1701f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1702g;

    public f2(e2 finalState, d2 lifecycleImpact, g0 fragment, y3.g cancellationSignal) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
        this.f1696a = finalState;
        this.f1697b = lifecycleImpact;
        this.f1698c = fragment;
        this.f1699d = new ArrayList();
        this.f1700e = new LinkedHashSet();
        cancellationSignal.a(new b3.t(this, 3));
    }

    public final void a() {
        if (this.f1701f) {
            return;
        }
        this.f1701f = true;
        if (this.f1700e.isEmpty()) {
            b();
            return;
        }
        for (y3.g gVar : vt.g0.U(this.f1700e)) {
            synchronized (gVar) {
                try {
                    if (!gVar.f41139a) {
                        gVar.f41139a = true;
                        gVar.f41141c = true;
                        y3.f fVar = gVar.f41140b;
                        if (fVar != null) {
                            try {
                                fVar.a();
                            } catch (Throwable th2) {
                                synchronized (gVar) {
                                    gVar.f41141c = false;
                                    gVar.notifyAll();
                                    throw th2;
                                }
                            }
                        }
                        synchronized (gVar) {
                            gVar.f41141c = false;
                            gVar.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public abstract void b();

    public final void c(e2 finalState, d2 lifecycleImpact) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
        int ordinal = lifecycleImpact.ordinal();
        e2 e2Var = e2.f1678a;
        g0 g0Var = this.f1698c;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + g0Var + " mFinalState = " + this.f1696a + " -> REMOVED. mLifecycleImpact  = " + this.f1697b + " to REMOVING.");
                    }
                    this.f1696a = e2Var;
                    this.f1697b = d2.f1672c;
                    return;
                }
                return;
            }
            if (this.f1696a == e2Var) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + g0Var + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f1697b + " to ADDING.");
                }
                this.f1696a = e2.f1679b;
                this.f1697b = d2.f1671b;
                return;
            }
            return;
        }
        if (this.f1696a != e2Var) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + g0Var + " mFinalState = " + this.f1696a + " -> " + finalState + '.');
            }
            this.f1696a = finalState;
        }
    }

    public abstract void d();

    public final String toString() {
        StringBuilder s7 = da.e.s("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        s7.append(this.f1696a);
        s7.append(" lifecycleImpact = ");
        s7.append(this.f1697b);
        s7.append(" fragment = ");
        s7.append(this.f1698c);
        s7.append(UrlTreeKt.componentParamSuffixChar);
        return s7.toString();
    }
}
