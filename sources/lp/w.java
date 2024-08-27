package lp;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class w extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25069a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f25070b;

    public /* synthetic */ w(a0 a0Var, int i10) {
        this.f25069a = i10;
        this.f25070b = a0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i10 = this.f25069a;
        a0 a0Var = this.f25070b;
        switch (i10) {
            case 0:
                a0Var.clear();
                return;
            default:
                a0Var.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i10 = this.f25069a;
        a0 a0Var = this.f25070b;
        switch (i10) {
            case 0:
                Map b10 = a0Var.b();
                if (b10 != null) {
                    return b10.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int d10 = a0Var.d(entry.getKey());
                    if (d10 != -1 && pn.e.g(a0Var.j()[d10], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return a0Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i10 = this.f25069a;
        a0 a0Var = this.f25070b;
        switch (i10) {
            case 0:
                Map b10 = a0Var.b();
                if (b10 != null) {
                    return b10.entrySet().iterator();
                }
                return new v(a0Var, 1);
            default:
                Map b11 = a0Var.b();
                if (b11 != null) {
                    return b11.keySet().iterator();
                }
                return new v(a0Var, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i10 = this.f25069a;
        a0 a0Var = this.f25070b;
        switch (i10) {
            case 0:
                Map b10 = a0Var.b();
                if (b10 != null) {
                    return b10.entrySet().remove(obj);
                }
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (a0Var.f()) {
                    return false;
                }
                int c10 = a0Var.c();
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = a0Var.f24950a;
                Objects.requireNonNull(obj2);
                int V = kp.j.V(key, value, c10, obj2, a0Var.h(), a0Var.i(), a0Var.j());
                if (V == -1) {
                    return false;
                }
                a0Var.e(V, c10);
                a0Var.f24955f--;
                a0Var.f24954e += 32;
                return true;
            default:
                Map b11 = a0Var.b();
                if (b11 != null) {
                    return b11.keySet().remove(obj);
                }
                if (a0Var.g(obj) == a0.f24949j) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i10 = this.f25069a;
        a0 a0Var = this.f25070b;
        switch (i10) {
            case 0:
                return a0Var.size();
            default:
                return a0Var.size();
        }
    }
}
