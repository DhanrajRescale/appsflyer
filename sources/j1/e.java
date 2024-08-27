package j1;

import c2.c2;
import c2.g;
import d2.s;
import g1.n;
import iu.v;
import t.g0;

/* loaded from: classes.dex */
public final class e extends n implements c2, c {

    /* renamed from: n, reason: collision with root package name */
    public c f20625n;

    /* renamed from: o, reason: collision with root package name */
    public c f20626o;

    @Override // g1.n
    public final void J0() {
        this.f20626o = null;
        this.f20625n = null;
    }

    public final boolean Q0(a aVar) {
        if (!this.f16417m) {
            return false;
        }
        if (this.f20626o == null) {
            this.f20626o = (c) s.f13612j.invoke(aVar);
            v vVar = new v();
            g.B(this, new c.g(19, vVar, aVar, this));
            if (!vVar.f20556a && this.f20626o == null) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("DragAndDropTarget self reference must be null at the start of a drag and drop session".toString());
    }

    public final boolean R0(a aVar) {
        c cVar = this.f20625n;
        if (cVar == null) {
            c cVar2 = this.f20626o;
            if (cVar2 != null) {
                return ((e) cVar2).R0(aVar);
            }
            return false;
        }
        return ((e) cVar).R0(aVar);
    }

    public final void S0(a aVar) {
        if (!this.f16405a.f16417m) {
            return;
        }
        g.B(this, new g0(aVar, 22));
        c cVar = this.f20626o;
        if (cVar != null) {
            ((e) cVar).S0(aVar);
        }
        this.f20626o = null;
        this.f20625n = null;
    }

    public final void T0(a aVar) {
        c cVar = this.f20626o;
        if (cVar == null) {
            c cVar2 = this.f20625n;
            if (cVar2 != null) {
                ((e) cVar2).T0(aVar);
                return;
            }
            return;
        }
        ((e) cVar).T0(aVar);
    }

    public final void U0(a aVar) {
        c cVar = this.f20626o;
        if (cVar != null) {
            ((e) cVar).U0(aVar);
        }
        c cVar2 = this.f20625n;
        if (cVar2 != null) {
            ((e) cVar2).U0(aVar);
        }
        this.f20625n = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0121  */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [g1.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V0(j1.a r18) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.e.V0(j1.a):void");
    }

    public final void W0(a aVar) {
        c cVar = this.f20626o;
        if (cVar == null) {
            c cVar2 = this.f20625n;
            if (cVar2 != null) {
                ((e) cVar2).W0(aVar);
                return;
            }
            return;
        }
        ((e) cVar).W0(aVar);
    }

    @Override // c2.c2
    public final Object j() {
        return d.f20624a;
    }
}
