package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w0 extends f1 implements d1 {

    /* renamed from: a, reason: collision with root package name */
    public final Application f1990a;

    /* renamed from: b, reason: collision with root package name */
    public final c1 f1991b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f1992c;

    /* renamed from: d, reason: collision with root package name */
    public final o f1993d;

    /* renamed from: e, reason: collision with root package name */
    public final o7.d f1994e;

    public w0(Application application, o7.f owner, Bundle bundle) {
        c1 c1Var;
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f1994e = owner.getSavedStateRegistry();
        this.f1993d = owner.getLifecycle();
        this.f1992c = bundle;
        this.f1990a = application;
        if (application != null) {
            Intrinsics.checkNotNullParameter(application, "application");
            if (c1.f1896c == null) {
                Intrinsics.checkNotNullParameter(application, "application");
                c1.f1896c = new c1(application);
            }
            c1Var = c1.f1896c;
            Intrinsics.c(c1Var);
        } else {
            c1Var = new c1(null);
        }
        this.f1991b = c1Var;
    }

    @Override // androidx.lifecycle.d1
    public final a1 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return e(modelClass, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.d1
    public final a1 c(Class modelClass, y4.e extras) {
        Constructor a10;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.a(z4.d.f42013a);
        if (str != null) {
            if (extras.a(u0.f1972a) != null && extras.a(u0.f1973b) != null) {
                Application application = (Application) extras.a(c1.f1897d);
                boolean isAssignableFrom = AndroidViewModel.class.isAssignableFrom(modelClass);
                if (isAssignableFrom && application != null) {
                    a10 = x0.a(modelClass, x0.f1997a);
                } else {
                    a10 = x0.a(modelClass, x0.f1998b);
                }
                if (a10 == null) {
                    return this.f1991b.c(modelClass, extras);
                }
                if (isAssignableFrom && application != null) {
                    return x0.b(modelClass, a10, application, u0.c(extras));
                }
                return x0.b(modelClass, a10, u0.c(extras));
            }
            if (this.f1993d != null) {
                return e(modelClass, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.f1
    public final void d(a1 viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        o oVar = this.f1993d;
        if (oVar != null) {
            o7.d dVar = this.f1994e;
            Intrinsics.c(dVar);
            u0.a(viewModel, dVar, oVar);
        }
    }

    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, androidx.lifecycle.e1] */
    public final a1 e(Class modelClass, String key) {
        Constructor a10;
        a1 b10;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        o oVar = this.f1993d;
        if (oVar != null) {
            boolean isAssignableFrom = AndroidViewModel.class.isAssignableFrom(modelClass);
            Application application = this.f1990a;
            if (isAssignableFrom && application != null) {
                a10 = x0.a(modelClass, x0.f1997a);
            } else {
                a10 = x0.a(modelClass, x0.f1998b);
            }
            if (a10 == null) {
                if (application != null) {
                    return this.f1991b.a(modelClass);
                }
                if (e1.f1902a == null) {
                    e1.f1902a = new Object();
                }
                e1 e1Var = e1.f1902a;
                Intrinsics.c(e1Var);
                return e1Var.a(modelClass);
            }
            o7.d dVar = this.f1994e;
            Intrinsics.c(dVar);
            s0 b11 = u0.b(dVar, oVar, key, this.f1992c);
            r0 r0Var = b11.f1968b;
            if (isAssignableFrom && application != null) {
                b10 = x0.b(modelClass, a10, application, r0Var);
            } else {
                b10 = x0.b(modelClass, a10, r0Var);
            }
            b10.a("androidx.lifecycle.savedstate.vm.tag", b11);
            return b10;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }
}
