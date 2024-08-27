package nv;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* loaded from: classes2.dex */
public final class d1 implements WildcardType {

    /* renamed from: a, reason: collision with root package name */
    public final Type f29197a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f29198b;

    public d1(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length <= 1) {
            if (typeArr.length == 1) {
                if (typeArr2.length == 1) {
                    typeArr2[0].getClass();
                    e1.a(typeArr2[0]);
                    if (typeArr[0] == Object.class) {
                        this.f29198b = typeArr2[0];
                        this.f29197a = Object.class;
                        return;
                    }
                    throw new IllegalArgumentException();
                }
                typeArr[0].getClass();
                e1.a(typeArr[0]);
                this.f29198b = null;
                this.f29197a = typeArr[0];
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof WildcardType) && e1.b(this, (WildcardType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f29198b;
        return type != null ? new Type[]{type} : e1.f29202a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f29197a};
    }

    public final int hashCode() {
        int i10;
        Type type = this.f29198b;
        if (type != null) {
            i10 = type.hashCode() + 31;
        } else {
            i10 = 1;
        }
        return i10 ^ (this.f29197a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f29198b;
        if (type != null) {
            return "? super " + e1.n(type);
        }
        Type type2 = this.f29197a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + e1.n(type2);
    }
}
