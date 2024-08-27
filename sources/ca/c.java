package ca;

import androidx.lifecycle.a1;
import androidx.lifecycle.e1;
import iu.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yk.g;

/* loaded from: classes.dex */
public final class c extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final ou.b f8074b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f8075c;

    public c(e kClass, Function0 creator) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(creator, "creator");
        this.f8074b = kClass;
        this.f8075c = creator;
    }

    @Override // androidx.lifecycle.e1, androidx.lifecycle.d1
    public final a1 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(g.y(this.f8074b))) {
            Object mo2invoke = this.f8075c.mo2invoke();
            Intrinsics.d(mo2invoke, "null cannot be cast to non-null type T of com.assetgro.stockgro.di.ViewModelProviderFactory.create");
            return (a1) mo2invoke;
        }
        throw new IllegalArgumentException("Unknown class name");
    }
}
