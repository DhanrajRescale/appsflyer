package lp;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes2.dex */
public abstract class s0 implements Map, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public transient l1 f25051a;

    /* renamed from: b, reason: collision with root package name */
    public transient m1 f25052b;

    /* renamed from: c, reason: collision with root package name */
    public transient n1 f25053c;

    public static q0 a() {
        return new q0(4);
    }

    public static s0 b(Map map) {
        int i10;
        if ((map instanceof s0) && !(map instanceof SortedMap)) {
            s0 s0Var = (s0) map;
            s0Var.getClass();
            return s0Var;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        boolean z10 = entrySet instanceof Collection;
        if (z10) {
            i10 = entrySet.size();
        } else {
            i10 = 4;
        }
        q0 q0Var = new q0(i10);
        if (z10) {
            int size = entrySet.size() * 2;
            Object[] objArr = q0Var.f25042a;
            if (size > objArr.length) {
                q0Var.f25042a = Arrays.copyOf(objArr, bl.j.z(objArr.length, size));
            }
        }
        for (Map.Entry entry : entrySet) {
            q0Var.b(entry.getKey(), entry.getValue());
        }
        return q0Var.a();
    }

    @Override // java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final v0 entrySet() {
        l1 l1Var = this.f25051a;
        if (l1Var == null) {
            o1 o1Var = (o1) this;
            l1 l1Var2 = new l1(o1Var, o1Var.f25028e, o1Var.f25029f);
            this.f25051a = l1Var2;
            return l1Var2;
        }
        return l1Var;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final i0 values() {
        n1 n1Var = this.f25053c;
        if (n1Var == null) {
            o1 o1Var = (o1) this;
            n1 n1Var2 = new n1(o1Var.f25028e, 1, o1Var.f25029f);
            this.f25053c = n1Var2;
            return n1Var2;
        }
        return n1Var;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return kp.j.O(obj, this);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return g0.h(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((o1) this).f25029f == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        m1 m1Var = this.f25052b;
        if (m1Var == null) {
            o1 o1Var = (o1) this;
            m1 m1Var2 = new m1(o1Var, new n1(o1Var.f25028e, 0, o1Var.f25029f));
            this.f25052b = m1Var2;
            return m1Var2;
        }
        return m1Var;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int i10 = ((o1) this).f25029f;
        kp.j.A(i10, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(i10 * 8, 1073741824L));
        sb2.append(UrlTreeKt.componentParamPrefixChar);
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append(UrlTreeKt.componentParamSuffixChar);
        return sb2.toString();
    }

    public Object writeReplace() {
        return new r0(this);
    }
}
