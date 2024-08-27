package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p0 extends s0 {

    /* renamed from: m, reason: collision with root package name */
    public final Class f2277m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(Class type) {
        super(true);
        Intrinsics.checkNotNullParameter(type, "type");
        if (!Parcelable.class.isAssignableFrom(type) && !Serializable.class.isAssignableFrom(type)) {
            throw new IllegalArgumentException((type + " does not implement Parcelable or Serializable.").toString());
        }
        this.f2277m = type;
    }

    @Override // androidx.navigation.s0
    public final Object a(Bundle bundle, String key) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.get(key);
    }

    @Override // androidx.navigation.s0
    public final String b() {
        String name = this.f2277m.getName();
        Intrinsics.checkNotNullExpressionValue(name, "type.name");
        return name;
    }

    @Override // androidx.navigation.s0
    public final Object c(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // androidx.navigation.s0
    public final void e(Bundle bundle, String key, Object obj) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f2277m.cast(obj);
        if (obj != null && !(obj instanceof Parcelable)) {
            if (obj instanceof Serializable) {
                bundle.putSerializable(key, (Serializable) obj);
                return;
            }
            return;
        }
        bundle.putParcelable(key, (Parcelable) obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Intrinsics.a(p0.class, obj.getClass())) {
            return Intrinsics.a(this.f2277m, ((p0) obj).f2277m);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2277m.hashCode();
    }
}
