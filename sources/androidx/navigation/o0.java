package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o0 extends s0 {

    /* renamed from: m, reason: collision with root package name */
    public final Class f2274m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(Class type) {
        super(true);
        Intrinsics.checkNotNullParameter(type, "type");
        if (Parcelable.class.isAssignableFrom(type)) {
            try {
                this.f2274m = Class.forName("[L" + type.getName() + ';');
                return;
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }
        throw new IllegalArgumentException((type + " does not implement Parcelable.").toString());
    }

    @Override // androidx.navigation.s0
    public final Object a(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        return (Parcelable[]) bundle.get(key);
    }

    @Override // androidx.navigation.s0
    public final String b() {
        String name = this.f2274m.getName();
        Intrinsics.checkNotNullExpressionValue(name, "arrayType.name");
        return name;
    }

    @Override // androidx.navigation.s0
    public final Object c(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    @Override // androidx.navigation.s0
    public final void e(Bundle bundle, String key, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f2274m.cast(parcelableArr);
        bundle.putParcelableArray(key, parcelableArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Intrinsics.a(o0.class, obj.getClass())) {
            return Intrinsics.a(this.f2274m, ((o0) obj).f2274m);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2274m.hashCode();
    }
}
