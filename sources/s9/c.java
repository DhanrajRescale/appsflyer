package s9;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import d2.f1;
import j9.b0;
import j9.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m9.u;
import t.o;
import w.k;

/* loaded from: classes.dex */
public final class c extends b {
    public m9.e C;
    public final ArrayList D;
    public final RectF E;
    public final RectF F;
    public final Paint G;
    public boolean H;

    public c(y yVar, e eVar, List list, j9.i iVar) {
        super(yVar, eVar);
        int i10;
        b bVar;
        b cVar;
        this.D = new ArrayList();
        this.E = new RectF();
        this.F = new RectF();
        this.G = new Paint();
        this.H = true;
        q9.a aVar = eVar.f34395s;
        if (aVar != null) {
            m9.e a10 = aVar.a();
            this.C = a10;
            g(a10);
            this.C.a(this);
        } else {
            this.C = null;
        }
        o oVar = new o(iVar.f21174i.size());
        int size = list.size() - 1;
        b bVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            e eVar2 = (e) list.get(size);
            int e10 = k.e(eVar2.f34381e);
            if (e10 != 0) {
                if (e10 != 1) {
                    if (e10 != 2) {
                        if (e10 != 3) {
                            if (e10 != 4) {
                                if (e10 != 5) {
                                    w9.b.b("Unknown layer type ".concat(nn.d.z(eVar2.f34381e)));
                                    cVar = null;
                                } else {
                                    cVar = new j(yVar, eVar2);
                                }
                            } else {
                                cVar = new g(iVar, yVar, this, eVar2);
                            }
                        } else {
                            cVar = new b(yVar, eVar2);
                        }
                    } else {
                        cVar = new d(yVar, eVar2, 0);
                    }
                } else {
                    cVar = new d(yVar, eVar2, 1);
                }
            } else {
                cVar = new c(yVar, eVar2, (List) iVar.f21168c.get(eVar2.f34383g), iVar);
            }
            if (cVar != null) {
                oVar.g(cVar.f34366p.f34380d, cVar);
                if (bVar2 != null) {
                    bVar2.f34369s = cVar;
                    bVar2 = null;
                } else {
                    this.D.add(0, cVar);
                    int e11 = k.e(eVar2.f34397u);
                    if (e11 == 1 || e11 == 2) {
                        bVar2 = cVar;
                    }
                }
            }
            size--;
        }
        for (i10 = 0; i10 < oVar.i(); i10++) {
            b bVar3 = (b) oVar.c(oVar.f(i10));
            if (bVar3 != null && (bVar = (b) oVar.c(bVar3.f34366p.f34382f)) != null) {
                bVar3.f34370t = bVar;
            }
        }
    }

    @Override // s9.b, p9.f
    public final void c(x9.c cVar, Object obj) {
        super.c(cVar, obj);
        if (obj == b0.E) {
            if (cVar == null) {
                m9.e eVar = this.C;
                if (eVar != null) {
                    eVar.k(null);
                    return;
                }
                return;
            }
            u uVar = new u(cVar, null);
            this.C = uVar;
            uVar.a(this);
            g(this.C);
        }
    }

    @Override // s9.b, l9.f
    public final void e(RectF rectF, Matrix matrix, boolean z10) {
        super.e(rectF, matrix, z10);
        ArrayList arrayList = this.D;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.E;
            rectF2.set(s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a);
            ((b) arrayList.get(size)).e(rectF2, this.f34364n, true);
            rectF.union(rectF2);
        }
    }

    @Override // s9.b
    public final void l(Canvas canvas, Matrix matrix, int i10) {
        boolean z10;
        RectF rectF = this.F;
        e eVar = this.f34366p;
        rectF.set(s0.g.f34069a, s0.g.f34069a, eVar.f34391o, eVar.f34392p);
        matrix.mapRect(rectF);
        boolean z11 = this.f34365o.f21242s;
        ArrayList arrayList = this.D;
        if (z11 && arrayList.size() > 1 && i10 != 255) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Paint paint = this.G;
            paint.setAlpha(i10);
            f1 f1Var = w9.f.f38892a;
            canvas.saveLayer(rectF, paint);
            kp.j.M();
        } else {
            canvas.save();
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if ((!this.H && "__container".equals(eVar.f34379c)) || rectF.isEmpty() || canvas.clipRect(rectF)) {
                ((b) arrayList.get(size)).h(canvas, matrix, i10);
            }
        }
        canvas.restore();
        kp.j.M();
    }

    @Override // s9.b
    public final void q(p9.e eVar, int i10, ArrayList arrayList, p9.e eVar2) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = this.D;
            if (i11 < arrayList2.size()) {
                ((b) arrayList2.get(i11)).f(eVar, i10, arrayList, eVar2);
                i11++;
            } else {
                return;
            }
        }
    }

    @Override // s9.b
    public final void r(boolean z10) {
        super.r(z10);
        Iterator it = this.D.iterator();
        while (it.hasNext()) {
            ((b) it.next()).r(z10);
        }
    }

    @Override // s9.b
    public final void s(float f10) {
        super.s(f10);
        m9.e eVar = this.C;
        e eVar2 = this.f34366p;
        if (eVar != null) {
            j9.i iVar = this.f34365o.f21224a;
            f10 = ((((Float) eVar.f()).floatValue() * eVar2.f34378b.f21178m) - eVar2.f34378b.f21176k) / ((iVar.f21177l - iVar.f21176k) + 0.01f);
        }
        if (this.C == null) {
            j9.i iVar2 = eVar2.f34378b;
            f10 -= eVar2.f34390n / (iVar2.f21177l - iVar2.f21176k);
        }
        if (eVar2.f34389m != s0.g.f34069a && !"__container".equals(eVar2.f34379c)) {
            f10 /= eVar2.f34389m;
        }
        ArrayList arrayList = this.D;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((b) arrayList.get(size)).s(f10);
        }
    }
}
