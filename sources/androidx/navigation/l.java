package androidx.navigation;

import android.os.Bundle;
import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.f1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l extends f1 implements d1 {

    /* renamed from: a, reason: collision with root package name */
    public o7.d f2244a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.lifecycle.o f2245b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f2246c;

    @Override // androidx.lifecycle.d1
    public final a1 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String key = modelClass.getCanonicalName();
        if (key != null) {
            if (this.f2245b != null) {
                o7.d dVar = this.f2244a;
                Intrinsics.c(dVar);
                androidx.lifecycle.o oVar = this.f2245b;
                Intrinsics.c(oVar);
                androidx.lifecycle.s0 b10 = androidx.lifecycle.u0.b(dVar, oVar, key, this.f2246c);
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                androidx.lifecycle.r0 handle = b10.f1968b;
                Intrinsics.checkNotNullParameter(handle, "handle");
                NavBackStackEntry$SavedStateViewModel navBackStackEntry$SavedStateViewModel = new NavBackStackEntry$SavedStateViewModel(handle);
                navBackStackEntry$SavedStateViewModel.a("androidx.lifecycle.savedstate.vm.tag", b10);
                return navBackStackEntry$SavedStateViewModel;
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.d1
    public final a1 c(Class modelClass, y4.e extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String key = (String) extras.a(z4.d.f42013a);
        if (key != null) {
            o7.d dVar = this.f2244a;
            if (dVar != null) {
                Intrinsics.c(dVar);
                androidx.lifecycle.o oVar = this.f2245b;
                Intrinsics.c(oVar);
                androidx.lifecycle.s0 b10 = androidx.lifecycle.u0.b(dVar, oVar, key, this.f2246c);
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                androidx.lifecycle.r0 handle = b10.f1968b;
                Intrinsics.checkNotNullParameter(handle, "handle");
                NavBackStackEntry$SavedStateViewModel navBackStackEntry$SavedStateViewModel = new NavBackStackEntry$SavedStateViewModel(handle);
                navBackStackEntry$SavedStateViewModel.a("androidx.lifecycle.savedstate.vm.tag", b10);
                return navBackStackEntry$SavedStateViewModel;
            }
            androidx.lifecycle.r0 handle2 = androidx.lifecycle.u0.c(extras);
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(handle2, "handle");
            return new NavBackStackEntry$SavedStateViewModel(handle2);
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.f1
    public final void d(a1 viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        o7.d dVar = this.f2244a;
        if (dVar != null) {
            androidx.lifecycle.o oVar = this.f2245b;
            Intrinsics.c(oVar);
            androidx.lifecycle.u0.a(viewModel, dVar, oVar);
        }
    }
}
