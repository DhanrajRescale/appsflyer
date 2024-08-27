package wt;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f implements Map.Entry, ju.a {

    /* renamed from: a, reason: collision with root package name */
    public final d f39475a;

    /* renamed from: b, reason: collision with root package name */
    public final int f39476b;

    public f(d map, int i10) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f39475a = map;
        this.f39476b = i10;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (Intrinsics.a(entry.getKey(), getKey()) && Intrinsics.a(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f39475a.f39461a[this.f39476b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Object[] objArr = this.f39475a.f39462b;
        Intrinsics.c(objArr);
        return objArr[this.f39476b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int i10;
        Object key = getKey();
        int i11 = 0;
        if (key != null) {
            i10 = key.hashCode();
        } else {
            i10 = 0;
        }
        Object value = getValue();
        if (value != null) {
            i11 = value.hashCode();
        }
        return i10 ^ i11;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        d dVar = this.f39475a;
        dVar.c();
        Object[] objArr = dVar.f39462b;
        if (objArr == null) {
            int length = dVar.f39461a.length;
            if (length >= 0) {
                objArr = new Object[length];
                dVar.f39462b = objArr;
            } else {
                throw new IllegalArgumentException("capacity must be non-negative.".toString());
            }
        }
        int i10 = this.f39476b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
