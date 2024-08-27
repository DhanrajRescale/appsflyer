package nv;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class b1 implements GenericArrayType {

    /* renamed from: a, reason: collision with root package name */
    public final Type f29182a;

    public b1(Type type) {
        this.f29182a = type;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof GenericArrayType) && e1.b(this, (GenericArrayType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f29182a;
    }

    public final int hashCode() {
        return this.f29182a.hashCode();
    }

    public final String toString() {
        return e1.n(this.f29182a) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }
}
