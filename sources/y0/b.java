package y0;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class b implements Map.Entry, ju.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f41013a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f41014b;

    public b(Object obj, Object obj2) {
        this.f41013a = obj;
        this.f41014b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        if (obj instanceof Map.Entry) {
            entry = (Map.Entry) obj;
        } else {
            entry = null;
        }
        if (entry == null || !Intrinsics.a(entry.getKey(), this.f41013a) || !Intrinsics.a(entry.getValue(), getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f41013a;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f41014b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int i10;
        int i11 = 0;
        Object obj = this.f41013a;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        Object value = getValue();
        if (value != null) {
            i11 = value.hashCode();
        }
        return i11 ^ i10;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f41013a);
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
