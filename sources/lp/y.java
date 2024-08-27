package lp;

import java.util.Map;

/* loaded from: classes2.dex */
public final class y extends s {

    /* renamed from: a, reason: collision with root package name */
    public final Object f25082a;

    /* renamed from: b, reason: collision with root package name */
    public int f25083b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f25084c;

    public y(a0 a0Var, int i10) {
        this.f25084c = a0Var;
        Object obj = a0.f24949j;
        this.f25082a = a0Var.i()[i10];
        this.f25083b = i10;
    }

    public final void a() {
        int i10 = this.f25083b;
        Object obj = this.f25082a;
        a0 a0Var = this.f25084c;
        if (i10 != -1 && i10 < a0Var.size()) {
            if (pn.e.g(obj, a0Var.i()[this.f25083b])) {
                return;
            }
        }
        Object obj2 = a0.f24949j;
        this.f25083b = a0Var.d(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f25082a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a0 a0Var = this.f25084c;
        Map b10 = a0Var.b();
        if (b10 != null) {
            return b10.get(this.f25082a);
        }
        a();
        int i10 = this.f25083b;
        if (i10 == -1) {
            return null;
        }
        return a0Var.j()[i10];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a0 a0Var = this.f25084c;
        Map b10 = a0Var.b();
        Object obj2 = this.f25082a;
        if (b10 != null) {
            return b10.put(obj2, obj);
        }
        a();
        int i10 = this.f25083b;
        if (i10 == -1) {
            a0Var.put(obj2, obj);
            return null;
        }
        Object obj3 = a0Var.j()[i10];
        a0Var.j()[this.f25083b] = obj;
        return obj3;
    }
}
