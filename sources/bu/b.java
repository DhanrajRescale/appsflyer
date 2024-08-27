package bu;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import vt.d;
import vt.v;

/* loaded from: classes2.dex */
public final class b extends d implements a, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Enum[] f7316b;

    public b(Enum[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f7316b = entries;
    }

    private final Object writeReplace() {
        return new c(this.f7316b);
    }

    @Override // vt.b
    public final int b() {
        return this.f7316b.length;
    }

    @Override // vt.b, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        if (((Enum) v.s(element.ordinal(), this.f7316b)) != element) {
            return false;
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        d.Companion companion = d.INSTANCE;
        Enum[] enumArr = this.f7316b;
        int length = enumArr.length;
        companion.getClass();
        d.Companion.a(i10, length);
        return enumArr[i10];
    }

    @Override // vt.d, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        int ordinal = element.ordinal();
        if (((Enum) v.s(ordinal, this.f7316b)) != element) {
            return -1;
        }
        return ordinal;
    }

    @Override // vt.d, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return indexOf(element);
    }
}
