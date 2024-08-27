package androidx.navigation;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n0 extends r0 {

    /* renamed from: n, reason: collision with root package name */
    public final Class f2269n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(Class type) {
        super(type, 0);
        Intrinsics.checkNotNullParameter(type, "type");
        if (type.isEnum()) {
            this.f2269n = type;
            return;
        }
        throw new IllegalArgumentException((type + " is not an Enum type.").toString());
    }

    @Override // androidx.navigation.r0, androidx.navigation.s0
    public final String b() {
        String name = this.f2269n.getName();
        Intrinsics.checkNotNullExpressionValue(name, "type.name");
        return name;
    }

    @Override // androidx.navigation.r0
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Enum c(String value) {
        Object obj;
        Intrinsics.checkNotNullParameter(value, "value");
        Class cls = this.f2269n;
        Object[] enumConstants = cls.getEnumConstants();
        Intrinsics.checkNotNullExpressionValue(enumConstants, "type.enumConstants");
        int length = enumConstants.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                obj = enumConstants[i10];
                if (kotlin.text.s.j(((Enum) obj).name(), value, true)) {
                    break;
                }
                i10++;
            } else {
                obj = null;
                break;
            }
        }
        Enum r42 = (Enum) obj;
        if (r42 != null) {
            return r42;
        }
        StringBuilder s7 = da.e.s("Enum value ", value, " not found for type ");
        s7.append(cls.getName());
        s7.append('.');
        throw new IllegalArgumentException(s7.toString());
    }
}
