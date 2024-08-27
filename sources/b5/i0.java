package b5;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public String f3350a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f3351b;

    /* renamed from: c, reason: collision with root package name */
    public int f3352c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3353d;

    /* renamed from: e, reason: collision with root package name */
    public Serializable f3354e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3355f;

    /* renamed from: g, reason: collision with root package name */
    public Serializable f3356g;

    public i0(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f3353d = hashSet;
        this.f3354e = new HashSet();
        this.f3351b = 0;
        this.f3352c = 0;
        this.f3356g = new HashSet();
        hashSet.add(bq.p.a(cls));
        for (Class cls2 : clsArr) {
            if (cls2 != null) {
                ((Set) this.f3353d).add(bq.p.a(cls2));
            } else {
                throw new NullPointerException("Null interface");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [b5.j0, b5.h0] */
    public static h0 a(i0 i0Var) {
        return new j0(i0Var);
    }

    public final void b(bq.j jVar) {
        if (!((Set) this.f3353d).contains(jVar.f7260a)) {
            ((Set) this.f3354e).add(jVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public final bq.a c() {
        boolean z10;
        if (((bq.d) this.f3355f) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new bq.a(this.f3350a, new HashSet((Set) this.f3353d), new HashSet((Set) this.f3354e), this.f3351b, this.f3352c, (bq.d) this.f3355f, (Set) this.f3356g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public final void d(int i10) {
        boolean z10;
        if (this.f3351b == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f3351b = i10;
            return;
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
