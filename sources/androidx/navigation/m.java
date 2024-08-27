package androidx.navigation;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.d1;
import androidx.lifecycle.h1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2253a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2254b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj, int i10) {
        super(0);
        this.f2253a = i10;
        this.f2254b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.navigation.l, androidx.lifecycle.d1, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        Object obj;
        int i10 = this.f2253a;
        Application application = null;
        Object obj2 = this.f2254b;
        switch (i10) {
            case 0:
                n owner = (n) obj2;
                if (owner.f2266j) {
                    if (owner.f2264h.f1978d != androidx.lifecycle.n.f1947a) {
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        ?? factory = new Object();
                        factory.f2244a = owner.f2265i.f29766b;
                        factory.f2245b = owner.f2264h;
                        factory.f2246c = null;
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        h1 store = owner.getViewModelStore();
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        y4.c defaultCreationExtras = owner.getDefaultViewModelCreationExtras();
                        Intrinsics.checkNotNullParameter(store, "store");
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
                        h.c cVar = new h.c(store, (d1) factory, defaultCreationExtras);
                        Intrinsics.checkNotNullParameter(NavBackStackEntry$SavedStateViewModel.class, "modelClass");
                        iu.e b10 = a3.a.b(NavBackStackEntry$SavedStateViewModel.class, "<this>", NavBackStackEntry$SavedStateViewModel.class, "modelClass", "modelClass");
                        String s7 = qu.i0.s(b10);
                        if (s7 != null) {
                            return ((NavBackStackEntry$SavedStateViewModel) cVar.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7))).f2145b;
                        }
                        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
                    }
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.".toString());
                }
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
            case 1:
                n nVar = (n) obj2;
                Context context = nVar.f2257a;
                if (context != null) {
                    obj = context.getApplicationContext();
                } else {
                    obj = null;
                }
                if (obj instanceof Application) {
                    application = (Application) obj;
                }
                return new androidx.lifecycle.w0(application, nVar, nVar.a());
            default:
                t tVar = (t) obj2;
                tVar.getClass();
                return new i0(tVar.f2304a, tVar.f2324u);
        }
    }
}
