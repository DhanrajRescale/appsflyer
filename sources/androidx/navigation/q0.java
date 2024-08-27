package androidx.navigation;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q0 extends s0 {

    /* renamed from: m, reason: collision with root package name */
    public final Class f2286m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(Class type) {
        super(true);
        Intrinsics.checkNotNullParameter(type, "type");
        if (Serializable.class.isAssignableFrom(type)) {
            try {
                this.f2286m = Class.forName("[L" + type.getName() + ';');
                return;
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }
        throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
    }

    @Override // androidx.navigation.s0
    public final Object a(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        return (Serializable[]) bundle.get(key);
    }

    @Override // androidx.navigation.s0
    public final String b() {
        String name = this.f2286m.getName();
        Intrinsics.checkNotNullExpressionValue(name, "arrayType.name");
        return name;
    }

    @Override // androidx.navigation.s0
    public final Object c(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.io.Serializable[], java.io.Serializable] */
    @Override // androidx.navigation.s0
    public final void e(Bundle bundle, String key, Object obj) {
        ?? r42 = (Serializable[]) obj;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f2286m.cast(r42);
        bundle.putSerializable(key, r42);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Intrinsics.a(q0.class, obj.getClass())) {
            return Intrinsics.a(this.f2286m, ((q0) obj).f2286m);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2286m.hashCode();
    }
}
