package l0;

import android.content.res.ColorStateList;
import android.graphics.Shader;
import android.util.SparseArray;
import d2.j3;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class j implements z5.h {

    /* renamed from: a, reason: collision with root package name */
    public int f23773a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23774b;

    /* renamed from: c, reason: collision with root package name */
    public Object f23775c;

    public /* synthetic */ j(int i10, Object obj, Object obj2) {
        this.f23774b = obj;
        this.f23775c = obj2;
        this.f23773a = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c8, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r2.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static l0.j b(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.j.b(android.content.res.Resources, int, android.content.res.Resources$Theme):l0.j");
    }

    public final void a(int i10, r5.s0 s0Var) {
        boolean z10;
        int i11 = this.f23773a;
        boolean z11 = false;
        Object obj = this.f23774b;
        if (i11 == -1) {
            if (((SparseArray) obj).size() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            yk.j.H0(z10);
            this.f23773a = 0;
        }
        SparseArray sparseArray = (SparseArray) obj;
        if (sparseArray.size() > 0) {
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            if (i10 >= keyAt) {
                z11 = true;
            }
            yk.j.E0(z11);
            if (keyAt == i10) {
                ((e5.d) this.f23775c).b(sparseArray.valueAt(sparseArray.size() - 1));
            }
        }
        sparseArray.append(i10, s0Var);
    }

    public final void c(int i10, b5.v vVar, int i11, Object obj, long j10) {
        d(new r5.s(1, i10, vVar, i11, obj, e5.x.P(j10), -9223372036854775807L));
    }

    public final void d(r5.s sVar) {
        Iterator it = ((CopyOnWriteArrayList) this.f23775c).iterator();
        while (it.hasNext()) {
            r5.a0 a0Var = (r5.a0) it.next();
            e5.x.J(a0Var.f33082a, new androidx.fragment.app.e(7, this, a0Var.f33083b, sVar));
        }
    }

    public final long f(z5.q qVar) {
        Object obj;
        int g10;
        while (true) {
            long c10 = qVar.c();
            long f10 = qVar.f() - 6;
            obj = this.f23774b;
            if (c10 >= f10) {
                break;
            }
            z5.u uVar = (z5.u) obj;
            int i10 = this.f23773a;
            mj.b bVar = (mj.b) this.f23775c;
            long c11 = qVar.c();
            byte[] bArr = new byte[2];
            int i11 = 0;
            qVar.n(bArr, 0, 2);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
                qVar.i();
                qVar.d((int) (c11 - qVar.getPosition()));
            } else {
                e5.p pVar = new e5.p(16);
                System.arraycopy(bArr, 0, pVar.f15036a, 0, 2);
                byte[] bArr2 = pVar.f15036a;
                for (int i12 = 2; i11 < 14 && (g10 = qVar.g(bArr2, i12 + i11, 14 - i11)) != -1; i12 = 2) {
                    i11 += g10;
                }
                pVar.E(i11);
                qVar.i();
                qVar.d((int) (c11 - qVar.getPosition()));
                if (vl.b.f(pVar, uVar, i10, bVar)) {
                    break;
                }
            }
            qVar.d(1);
        }
        if (qVar.c() >= qVar.f() - 6) {
            qVar.d((int) (qVar.f() - qVar.c()));
            return ((z5.u) obj).f42128j;
        }
        return ((mj.b) this.f23775c).f27810a;
    }

    public final Object g(int i10) {
        Object obj;
        if (this.f23773a == -1) {
            this.f23773a = 0;
        }
        while (true) {
            int i11 = this.f23773a;
            obj = this.f23774b;
            if (i11 <= 0 || i10 >= ((SparseArray) obj).keyAt(i11)) {
                break;
            }
            this.f23773a--;
        }
        while (this.f23773a < ((SparseArray) obj).size() - 1 && i10 >= ((SparseArray) obj).keyAt(this.f23773a + 1)) {
            this.f23773a++;
        }
        return ((SparseArray) obj).valueAt(this.f23773a);
    }

    @Override // z5.h
    public final z5.g h(z5.q qVar, long j10) {
        long position = qVar.getPosition();
        long f10 = f(qVar);
        long c10 = qVar.c();
        qVar.d(Math.max(6, ((z5.u) this.f23774b).f42121c));
        long f11 = f(qVar);
        long c11 = qVar.c();
        if (f10 <= j10 && f11 > j10) {
            return new z5.g(0, -9223372036854775807L, c10);
        }
        if (f11 <= j10) {
            return new z5.g(-2, f11, c11);
        }
        return new z5.g(-1, f10, position);
    }

    public final boolean i() {
        if (((Shader) this.f23774b) == null) {
            Object obj = this.f23775c;
            if (((ColorStateList) obj) != null && ((ColorStateList) obj).isStateful()) {
                return true;
            }
        }
        return false;
    }

    public final void j(r5.n nVar, int i10, int i11, b5.v vVar, int i12, Object obj, long j10, long j11) {
        k(nVar, new r5.s(i10, i11, vVar, i12, obj, e5.x.P(j10), e5.x.P(j11)));
    }

    public final void k(r5.n nVar, r5.s sVar) {
        Iterator it = ((CopyOnWriteArrayList) this.f23775c).iterator();
        while (it.hasNext()) {
            r5.a0 a0Var = (r5.a0) it.next();
            e5.x.J(a0Var.f33082a, new r5.y(this, a0Var.f33083b, nVar, sVar, 0));
        }
    }

    public final void l(r5.n nVar, int i10, int i11, b5.v vVar, int i12, Object obj, long j10, long j11) {
        m(nVar, new r5.s(i10, i11, vVar, i12, obj, e5.x.P(j10), e5.x.P(j11)));
    }

    public final void m(r5.n nVar, r5.s sVar) {
        Iterator it = ((CopyOnWriteArrayList) this.f23775c).iterator();
        while (it.hasNext()) {
            r5.a0 a0Var = (r5.a0) it.next();
            e5.x.J(a0Var.f33082a, new r5.y(this, a0Var.f33083b, nVar, sVar, 2));
        }
    }

    public final void n(r5.n nVar, int i10, int i11, b5.v vVar, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
        o(nVar, new r5.s(i10, i11, vVar, i12, obj, e5.x.P(j10), e5.x.P(j11)), iOException, z10);
    }

    public final void o(r5.n nVar, r5.s sVar, IOException iOException, boolean z10) {
        Iterator it = ((CopyOnWriteArrayList) this.f23775c).iterator();
        while (it.hasNext()) {
            r5.a0 a0Var = (r5.a0) it.next();
            e5.x.J(a0Var.f33082a, new i5.x0(this, a0Var.f33083b, nVar, sVar, iOException, z10, 1));
        }
    }

    public final void p(r5.n nVar, int i10, int i11, b5.v vVar, int i12, Object obj, long j10, long j11) {
        q(nVar, new r5.s(i10, i11, vVar, i12, obj, e5.x.P(j10), e5.x.P(j11)));
    }

    public final void q(r5.n nVar, r5.s sVar) {
        Iterator it = ((CopyOnWriteArrayList) this.f23775c).iterator();
        while (it.hasNext()) {
            r5.a0 a0Var = (r5.a0) it.next();
            e5.x.J(a0Var.f33082a, new r5.y(this, a0Var.f33083b, nVar, sVar, 1));
        }
    }

    public final boolean r(int[] iArr) {
        if (i()) {
            ColorStateList colorStateList = (ColorStateList) this.f23775c;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f23773a) {
                this.f23773a = colorForState;
                return true;
            }
        }
        return false;
    }

    public final void s(r5.s sVar) {
        r5.w wVar = (r5.w) this.f23774b;
        wVar.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.f23775c).iterator();
        while (it.hasNext()) {
            r5.a0 a0Var = (r5.a0) it.next();
            e5.x.J(a0Var.f33082a, new r5.z(this, a0Var.f33083b, wVar, sVar, 0));
        }
    }

    public /* synthetic */ j(Object obj, int i10, Serializable serializable) {
        this.f23774b = obj;
        this.f23773a = i10;
        this.f23775c = serializable;
    }

    public j(b5.s0 s0Var) {
        this.f23774b = new SparseArray();
        this.f23775c = s0Var;
        this.f23773a = -1;
    }

    public j(z5.u uVar, int i10) {
        this.f23774b = uVar;
        this.f23773a = i10;
        this.f23775c = new Object();
    }

    public j(CopyOnWriteArrayList copyOnWriteArrayList, int i10, r5.w wVar) {
        this.f23775c = copyOnWriteArrayList;
        this.f23773a = i10;
        this.f23774b = wVar;
    }

    public j(j3 j3Var) {
        this.f23774b = j3Var;
    }

    public j(ak.q qVar) {
        this.f23775c = sk.d.a(150, new t9.c(this, 26));
        this.f23774b = qVar;
    }
}
