package androidx.lifecycle;

import android.os.Bundle;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final kq.e f1972a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final kq.e f1973b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final kq.e f1974c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final x2.c f1975d = new Object();

    public static final void a(a1 viewModel, o7.d registry, o lifecycle) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        s0 s0Var = (s0) viewModel.c("androidx.lifecycle.savedstate.vm.tag");
        if (s0Var != null && !s0Var.f1969c) {
            s0Var.a(lifecycle, registry);
            g(lifecycle, registry);
        }
    }

    public static final s0 b(o7.d registry, o lifecycle, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Bundle a10 = registry.a(str);
        Class[] clsArr = r0.f1961f;
        s0 s0Var = new s0(str, mt.p.r(a10, bundle));
        s0Var.a(lifecycle, registry);
        g(lifecycle, registry);
        return s0Var;
    }

    public static final r0 c(y4.e eVar) {
        v0 v0Var;
        Bundle bundle;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        o7.f fVar = (o7.f) eVar.a(f1972a);
        if (fVar != null) {
            i1 i1Var = (i1) eVar.a(f1973b);
            if (i1Var != null) {
                Bundle bundle2 = (Bundle) eVar.a(f1974c);
                String key = (String) eVar.a(z4.d.f42013a);
                if (key != null) {
                    Intrinsics.checkNotNullParameter(fVar, "<this>");
                    o7.c b10 = fVar.getSavedStateRegistry().b();
                    if (b10 instanceof v0) {
                        v0Var = (v0) b10;
                    } else {
                        v0Var = null;
                    }
                    if (v0Var != null) {
                        SavedStateHandlesVM e10 = e(i1Var);
                        r0 r0Var = (r0) e10.f1873b.get(key);
                        if (r0Var == null) {
                            Class[] clsArr = r0.f1961f;
                            Intrinsics.checkNotNullParameter(key, "key");
                            v0Var.b();
                            Bundle bundle3 = v0Var.f1987c;
                            if (bundle3 != null) {
                                bundle = bundle3.getBundle(key);
                            } else {
                                bundle = null;
                            }
                            Bundle bundle4 = v0Var.f1987c;
                            if (bundle4 != null) {
                                bundle4.remove(key);
                            }
                            Bundle bundle5 = v0Var.f1987c;
                            if (bundle5 != null && bundle5.isEmpty()) {
                                v0Var.f1987c = null;
                            }
                            r0 r10 = mt.p.r(bundle, bundle2);
                            e10.f1873b.put(key, r10);
                            return r10;
                        }
                        return r0Var;
                    }
                    throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    public static final void d(o7.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        n b10 = fVar.getLifecycle().b();
        if (b10 != n.f1948b && b10 != n.f1949c) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (fVar.getSavedStateRegistry().b() == null) {
            v0 v0Var = new v0(fVar.getSavedStateRegistry(), (i1) fVar);
            fVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", v0Var);
            fVar.getLifecycle().a(new d(v0Var));
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.lifecycle.d1, java.lang.Object] */
    public static final SavedStateHandlesVM e(i1 owner) {
        y4.c defaultCreationExtras;
        Intrinsics.checkNotNullParameter(owner, "<this>");
        ?? factory = new Object();
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(factory, "factory");
        h1 store = owner.getViewModelStore();
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (owner instanceof i) {
            defaultCreationExtras = ((i) owner).getDefaultViewModelCreationExtras();
        } else {
            defaultCreationExtras = y4.a.f41149b;
        }
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c cVar = new h.c(store, (d1) factory, defaultCreationExtras);
        Intrinsics.checkNotNullParameter("androidx.lifecycle.internal.SavedStateHandlesVM", "key");
        Intrinsics.checkNotNullParameter(SavedStateHandlesVM.class, "modelClass");
        Intrinsics.checkNotNullParameter(SavedStateHandlesVM.class, "<this>");
        return (SavedStateHandlesVM) cVar.G(iu.a0.a(SavedStateHandlesVM.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final z4.a f(a1 a1Var) {
        z4.a aVar;
        CoroutineContext coroutineContext;
        Intrinsics.checkNotNullParameter(a1Var, "<this>");
        synchronized (f1975d) {
            aVar = (z4.a) a1Var.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (aVar == null) {
                try {
                    xu.e eVar = qu.r0.f32255a;
                    coroutineContext = ((ru.d) vu.u.f38408a).f34006f;
                } catch (IllegalStateException unused) {
                    coroutineContext = kotlin.coroutines.k.f23369a;
                } catch (ut.j unused2) {
                    coroutineContext = kotlin.coroutines.k.f23369a;
                }
                z4.a aVar2 = new z4.a(coroutineContext.l(el.l.l()));
                a1Var.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", aVar2);
                aVar = aVar2;
            }
        }
        return aVar;
    }

    public static void g(o oVar, o7.d dVar) {
        n b10 = oVar.b();
        if (b10 != n.f1948b && !b10.a(n.f1950d)) {
            oVar.a(new g(oVar, dVar));
        } else {
            dVar.d();
        }
    }
}
