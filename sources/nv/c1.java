package nv;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class c1 implements ParameterizedType {

    /* renamed from: a, reason: collision with root package name */
    public final Type f29192a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f29193b;

    /* renamed from: c, reason: collision with root package name */
    public final Type[] f29194c;

    public c1(Type type, Type type2, Type... typeArr) {
        boolean z10;
        if (type2 instanceof Class) {
            if (type == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != (((Class) type2).getEnclosingClass() == null)) {
                throw new IllegalArgumentException();
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            e1.a(type3);
        }
        this.f29192a = type;
        this.f29193b = type2;
        this.f29194c = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ParameterizedType) && e1.b(this, (ParameterizedType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f29194c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f29192a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f29193b;
    }

    public final int hashCode() {
        int i10;
        int hashCode = Arrays.hashCode(this.f29194c) ^ this.f29193b.hashCode();
        Type type = this.f29192a;
        if (type != null) {
            i10 = type.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        Type[] typeArr = this.f29194c;
        int length = typeArr.length;
        Type type = this.f29193b;
        if (length == 0) {
            return e1.n(type);
        }
        StringBuilder sb2 = new StringBuilder((typeArr.length + 1) * 30);
        sb2.append(e1.n(type));
        sb2.append(UrlTreeKt.configurablePathSegmentPrefix);
        sb2.append(e1.n(typeArr[0]));
        for (int i10 = 1; i10 < typeArr.length; i10++) {
            sb2.append(", ");
            sb2.append(e1.n(typeArr[i10]));
        }
        sb2.append(UrlTreeKt.configurablePathSegmentSuffix);
        return sb2.toString();
    }
}
