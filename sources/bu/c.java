package bu;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import zq.f;

/* loaded from: classes2.dex */
public final class c implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Class f7317a;

    public c(Enum[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Class<?> componentType = entries.getClass().getComponentType();
        Intrinsics.c(componentType);
        this.f7317a = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.f7317a.getEnumConstants();
        Intrinsics.checkNotNullExpressionValue(enumConstants, "getEnumConstants(...)");
        return f.E((Enum[]) enumConstants);
    }
}
