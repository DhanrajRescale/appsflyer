package r0;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f32396a;

    public f1(Map map) {
        this.f32396a = map;
    }

    public final Object a(float f10) {
        Object next;
        Iterator it = this.f32396a.entrySet().iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                float abs = Math.abs(f10 - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    Object next2 = it.next();
                    float abs2 = Math.abs(f10 - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    if (Float.compare(abs, abs2) > 0) {
                        next = next2;
                        abs = abs2;
                    }
                } while (it.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public final Object b(float f10, boolean z10) {
        Object next;
        float f11;
        float f12;
        Iterator it = this.f32396a.entrySet().iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                float floatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                if (z10) {
                    f11 = floatValue - f10;
                } else {
                    f11 = f10 - floatValue;
                }
                if (f11 < s0.g.f34069a) {
                    f11 = Float.POSITIVE_INFINITY;
                }
                do {
                    Object next2 = it.next();
                    float floatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    if (z10) {
                        f12 = floatValue2 - f10;
                    } else {
                        f12 = f10 - floatValue2;
                    }
                    if (f12 < s0.g.f34069a) {
                        f12 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f11, f12) > 0) {
                        next = next2;
                        f11 = f12;
                    }
                } while (it.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public final float c(Object obj) {
        Float f10 = (Float) this.f32396a.get(obj);
        if (f10 != null) {
            return f10.floatValue();
        }
        return Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        return Intrinsics.a(this.f32396a, ((f1) obj).f32396a);
    }

    public final int hashCode() {
        return this.f32396a.hashCode() * 31;
    }

    public final String toString() {
        return "MapDraggableAnchors(" + this.f32396a + ')';
    }
}
