package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1907b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final h.c f1908a;

    public g1(h1 store, d1 factory, y4.c defaultCreationExtras) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        this.f1908a = new h.c(store, factory, defaultCreationExtras);
    }

    public final a1 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "<this>");
        return b(iu.a0.a(modelClass));
    }

    public final a1 b(ou.b modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String s7 = qu.i0.s(modelClass);
        if (s7 != null) {
            return this.f1908a.G(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g1(androidx.lifecycle.i1 r4) {
        /*
            r3 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.lifecycle.h1 r1 = r4.getViewModelStore()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r2 = r4 instanceof androidx.lifecycle.i
            if (r2 == 0) goto L18
            r2 = r4
            androidx.lifecycle.i r2 = (androidx.lifecycle.i) r2
            androidx.lifecycle.d1 r2 = r2.getDefaultViewModelProviderFactory()
            goto L1a
        L18:
            z4.b r2 = z4.b.f42008a
        L1a:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r4 instanceof androidx.lifecycle.i
            if (r0 == 0) goto L28
            androidx.lifecycle.i r4 = (androidx.lifecycle.i) r4
            y4.c r4 = r4.getDefaultViewModelCreationExtras()
            goto L2a
        L28:
            y4.a r4 = y4.a.f41149b
        L2a:
            r3.<init>(r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.g1.<init>(androidx.lifecycle.i1):void");
    }
}
