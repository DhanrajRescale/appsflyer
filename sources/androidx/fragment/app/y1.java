package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes.dex */
public final class y1 implements androidx.lifecycle.i, o7.f, androidx.lifecycle.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f1860a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.h1 f1861b;

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f1862c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.lifecycle.d1 f1863d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.lifecycle.v f1864e = null;

    /* renamed from: f, reason: collision with root package name */
    public o7.e f1865f = null;

    public y1(g0 g0Var, androidx.lifecycle.h1 h1Var, androidx.activity.b bVar) {
        this.f1860a = g0Var;
        this.f1861b = h1Var;
        this.f1862c = bVar;
    }

    public final void a(androidx.lifecycle.m mVar) {
        this.f1864e.f(mVar);
    }

    public final void b() {
        if (this.f1864e == null) {
            this.f1864e = new androidx.lifecycle.v(this);
            o7.e m10 = x2.c.m(this);
            this.f1865f = m10;
            m10.a();
            this.f1862c.run();
        }
    }

    @Override // androidx.lifecycle.i
    public final y4.c getDefaultViewModelCreationExtras() {
        Application application;
        g0 g0Var = this.f1860a;
        Context applicationContext = g0Var.requireContext().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        y4.e eVar = new y4.e(0);
        if (application != null) {
            eVar.b(androidx.lifecycle.c1.f1897d, application);
        }
        eVar.b(androidx.lifecycle.u0.f1972a, g0Var);
        eVar.b(androidx.lifecycle.u0.f1973b, this);
        if (g0Var.getArguments() != null) {
            eVar.b(androidx.lifecycle.u0.f1974c, g0Var.getArguments());
        }
        return eVar;
    }

    @Override // androidx.lifecycle.i
    public final androidx.lifecycle.d1 getDefaultViewModelProviderFactory() {
        Application application;
        g0 g0Var = this.f1860a;
        androidx.lifecycle.d1 defaultViewModelProviderFactory = g0Var.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(g0Var.mDefaultFactory)) {
            this.f1863d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f1863d == null) {
            Context applicationContext = g0Var.requireContext().getApplicationContext();
            while (true) {
                if (applicationContext instanceof ContextWrapper) {
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    }
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                } else {
                    application = null;
                    break;
                }
            }
            this.f1863d = new androidx.lifecycle.w0(application, g0Var, g0Var.getArguments());
        }
        return this.f1863d;
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.o getLifecycle() {
        b();
        return this.f1864e;
    }

    @Override // o7.f
    public final o7.d getSavedStateRegistry() {
        b();
        return this.f1865f.f29766b;
    }

    @Override // androidx.lifecycle.i1
    public final androidx.lifecycle.h1 getViewModelStore() {
        b();
        return this.f1861b;
    }
}
