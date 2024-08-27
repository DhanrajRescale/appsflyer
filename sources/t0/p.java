package t0;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class p extends v {

    /* renamed from: a, reason: collision with root package name */
    public final int f35117a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f35118b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f35119c;

    /* renamed from: d, reason: collision with root package name */
    public HashSet f35120d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f35121e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public final n1 f35122f = t.n0(b1.g.f3082g, g2.f35024a);

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r f35123g;

    public p(r rVar, int i10, boolean z10, boolean z11, d9.j jVar) {
        this.f35123g = rVar;
        this.f35117a = i10;
        this.f35118b = z10;
        this.f35119c = z11;
    }

    @Override // t0.v
    public final void a(e0 e0Var, b1.c cVar) {
        this.f35123g.f35167b.a(e0Var, cVar);
    }

    @Override // t0.v
    public final void b() {
        r rVar = this.f35123g;
        rVar.f35191z--;
    }

    @Override // t0.v
    public final boolean c() {
        return this.f35123g.f35167b.c();
    }

    @Override // t0.v
    public final boolean d() {
        return this.f35118b;
    }

    @Override // t0.v
    public final boolean e() {
        return this.f35119c;
    }

    @Override // t0.v
    public final r1 f() {
        return (r1) this.f35122f.getValue();
    }

    @Override // t0.v
    public final int g() {
        return this.f35117a;
    }

    @Override // t0.v
    public final CoroutineContext h() {
        return this.f35123g.f35167b.h();
    }

    @Override // t0.v
    public final void i() {
    }

    @Override // t0.v
    public final void j(e0 e0Var) {
        r rVar = this.f35123g;
        rVar.f35167b.j(rVar.f35172g);
        rVar.f35167b.j(e0Var);
    }

    @Override // t0.v
    public final b1 k(c1 c1Var) {
        return this.f35123g.f35167b.k(c1Var);
    }

    @Override // t0.v
    public final void l(Set set) {
        HashSet hashSet = this.f35120d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f35120d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // t0.v
    public final void m(r rVar) {
        this.f35121e.add(rVar);
    }

    @Override // t0.v
    public final void n(e0 e0Var) {
        this.f35123g.f35167b.n(e0Var);
    }

    @Override // t0.v
    public final void o() {
        this.f35123g.f35191z++;
    }

    @Override // t0.v
    public final void p(r rVar) {
        HashSet hashSet = this.f35120d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Set) it.next()).remove(rVar.f35168c);
            }
        }
        zq.f.u(this.f35121e).remove(rVar);
    }

    @Override // t0.v
    public final void q(e0 e0Var) {
        this.f35123g.f35167b.q(e0Var);
    }

    public final void r() {
        LinkedHashSet<r> linkedHashSet = this.f35121e;
        if (!linkedHashSet.isEmpty()) {
            HashSet hashSet = this.f35120d;
            if (hashSet != null) {
                for (r rVar : linkedHashSet) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((Set) it.next()).remove(rVar.f35168c);
                    }
                }
            }
            linkedHashSet.clear();
        }
    }
}
