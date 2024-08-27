package m9;

import android.graphics.Matrix;
import android.graphics.PointF;
import j9.b0;
import java.util.Collections;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f27678a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f27679b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f27680c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f27681d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f27682e;

    /* renamed from: f, reason: collision with root package name */
    public e f27683f;

    /* renamed from: g, reason: collision with root package name */
    public e f27684g;

    /* renamed from: h, reason: collision with root package name */
    public e f27685h;

    /* renamed from: i, reason: collision with root package name */
    public e f27686i;

    /* renamed from: j, reason: collision with root package name */
    public e f27687j;

    /* renamed from: k, reason: collision with root package name */
    public i f27688k;

    /* renamed from: l, reason: collision with root package name */
    public i f27689l;

    /* renamed from: m, reason: collision with root package name */
    public e f27690m;

    /* renamed from: n, reason: collision with root package name */
    public e f27691n;

    public t(q9.d dVar) {
        e a10;
        e a11;
        e a12;
        e a13;
        i iVar;
        i iVar2;
        q9.b bVar = dVar.f31870a;
        if (bVar == null) {
            a10 = null;
        } else {
            a10 = bVar.a();
        }
        this.f27683f = a10;
        q9.e eVar = dVar.f31871b;
        if (eVar == null) {
            a11 = null;
        } else {
            a11 = eVar.a();
        }
        this.f27684g = a11;
        bk.c cVar = dVar.f31872c;
        if (cVar == null) {
            a12 = null;
        } else {
            a12 = cVar.a();
        }
        this.f27685h = a12;
        q9.a aVar = dVar.f31873d;
        if (aVar == null) {
            a13 = null;
        } else {
            a13 = aVar.a();
        }
        this.f27686i = a13;
        q9.a aVar2 = dVar.f31875f;
        if (aVar2 == null) {
            iVar = null;
        } else {
            iVar = (i) aVar2.a();
        }
        this.f27688k = iVar;
        if (iVar != null) {
            this.f27679b = new Matrix();
            this.f27680c = new Matrix();
            this.f27681d = new Matrix();
            this.f27682e = new float[9];
        } else {
            this.f27679b = null;
            this.f27680c = null;
            this.f27681d = null;
            this.f27682e = null;
        }
        q9.a aVar3 = dVar.f31876g;
        if (aVar3 == null) {
            iVar2 = null;
        } else {
            iVar2 = (i) aVar3.a();
        }
        this.f27689l = iVar2;
        bk.c cVar2 = dVar.f31874e;
        if (cVar2 != null) {
            this.f27687j = cVar2.a();
        }
        q9.a aVar4 = dVar.f31877h;
        if (aVar4 != null) {
            this.f27690m = aVar4.a();
        } else {
            this.f27690m = null;
        }
        q9.a aVar5 = dVar.f31878i;
        if (aVar5 != null) {
            this.f27691n = aVar5.a();
        } else {
            this.f27691n = null;
        }
    }

    public final void a(s9.b bVar) {
        bVar.g(this.f27687j);
        bVar.g(this.f27690m);
        bVar.g(this.f27691n);
        bVar.g(this.f27683f);
        bVar.g(this.f27684g);
        bVar.g(this.f27685h);
        bVar.g(this.f27686i);
        bVar.g(this.f27688k);
        bVar.g(this.f27689l);
    }

    public final void b(a aVar) {
        e eVar = this.f27687j;
        if (eVar != null) {
            eVar.a(aVar);
        }
        e eVar2 = this.f27690m;
        if (eVar2 != null) {
            eVar2.a(aVar);
        }
        e eVar3 = this.f27691n;
        if (eVar3 != null) {
            eVar3.a(aVar);
        }
        e eVar4 = this.f27683f;
        if (eVar4 != null) {
            eVar4.a(aVar);
        }
        e eVar5 = this.f27684g;
        if (eVar5 != null) {
            eVar5.a(aVar);
        }
        e eVar6 = this.f27685h;
        if (eVar6 != null) {
            eVar6.a(aVar);
        }
        e eVar7 = this.f27686i;
        if (eVar7 != null) {
            eVar7.a(aVar);
        }
        i iVar = this.f27688k;
        if (iVar != null) {
            iVar.a(aVar);
        }
        i iVar2 = this.f27689l;
        if (iVar2 != null) {
            iVar2.a(aVar);
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [m9.e, m9.i] */
    /* JADX WARN: Type inference failed for: r5v6, types: [m9.e, m9.i] */
    public final boolean c(x9.c cVar, Object obj) {
        if (obj == b0.f21110f) {
            e eVar = this.f27683f;
            if (eVar == null) {
                this.f27683f = new u(cVar, new PointF());
                return true;
            }
            eVar.k(cVar);
            return true;
        }
        if (obj == b0.f21111g) {
            e eVar2 = this.f27684g;
            if (eVar2 == null) {
                this.f27684g = new u(cVar, new PointF());
                return true;
            }
            eVar2.k(cVar);
            return true;
        }
        if (obj == b0.f21112h) {
            e eVar3 = this.f27684g;
            if (eVar3 instanceof q) {
                q qVar = (q) eVar3;
                x9.c cVar2 = qVar.f27673m;
                if (cVar2 != null) {
                    cVar2.f40139c = null;
                }
                qVar.f27673m = cVar;
                if (cVar != null) {
                    cVar.f40139c = qVar;
                    return true;
                }
                return true;
            }
        }
        if (obj == b0.f21113i) {
            e eVar4 = this.f27684g;
            if (eVar4 instanceof q) {
                q qVar2 = (q) eVar4;
                x9.c cVar3 = qVar2.f27674n;
                if (cVar3 != null) {
                    cVar3.f40139c = null;
                }
                qVar2.f27674n = cVar;
                if (cVar != null) {
                    cVar.f40139c = qVar2;
                    return true;
                }
                return true;
            }
        }
        if (obj == b0.f21119o) {
            e eVar5 = this.f27685h;
            if (eVar5 == null) {
                this.f27685h = new u(cVar, new x9.d());
                return true;
            }
            eVar5.k(cVar);
            return true;
        }
        if (obj == b0.f21120p) {
            e eVar6 = this.f27686i;
            if (eVar6 == null) {
                this.f27686i = new u(cVar, Float.valueOf(s0.g.f34069a));
                return true;
            }
            eVar6.k(cVar);
            return true;
        }
        if (obj == b0.f21107c) {
            e eVar7 = this.f27687j;
            if (eVar7 == null) {
                this.f27687j = new u(cVar, 100);
                return true;
            }
            eVar7.k(cVar);
            return true;
        }
        if (obj == b0.C) {
            e eVar8 = this.f27690m;
            if (eVar8 == null) {
                this.f27690m = new u(cVar, Float.valueOf(100.0f));
                return true;
            }
            eVar8.k(cVar);
            return true;
        }
        if (obj == b0.D) {
            e eVar9 = this.f27691n;
            if (eVar9 == null) {
                this.f27691n = new u(cVar, Float.valueOf(100.0f));
                return true;
            }
            eVar9.k(cVar);
            return true;
        }
        if (obj == b0.f21121q) {
            if (this.f27688k == null) {
                this.f27688k = new e(Collections.singletonList(new x9.a(Float.valueOf(s0.g.f34069a))));
            }
            this.f27688k.k(cVar);
            return true;
        }
        if (obj == b0.f21122r) {
            if (this.f27689l == null) {
                this.f27689l = new e(Collections.singletonList(new x9.a(Float.valueOf(s0.g.f34069a))));
            }
            this.f27689l.k(cVar);
            return true;
        }
        return false;
    }

    public final void d() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.f27682e[i10] = 0.0f;
        }
    }

    public final Matrix e() {
        PointF pointF;
        float cos;
        float sin;
        float l10;
        PointF pointF2;
        Matrix matrix = this.f27678a;
        matrix.reset();
        e eVar = this.f27684g;
        if (eVar != null && (pointF2 = (PointF) eVar.f()) != null) {
            float f10 = pointF2.x;
            if (f10 != s0.g.f34069a || pointF2.y != s0.g.f34069a) {
                matrix.preTranslate(f10, pointF2.y);
            }
        }
        e eVar2 = this.f27686i;
        if (eVar2 != null) {
            if (eVar2 instanceof u) {
                l10 = ((Float) eVar2.f()).floatValue();
            } else {
                l10 = ((i) eVar2).l();
            }
            if (l10 != s0.g.f34069a) {
                matrix.preRotate(l10);
            }
        }
        if (this.f27688k != null) {
            if (this.f27689l == null) {
                cos = 0.0f;
            } else {
                cos = (float) Math.cos(Math.toRadians((-r4.l()) + 90.0f));
            }
            if (this.f27689l == null) {
                sin = 1.0f;
            } else {
                sin = (float) Math.sin(Math.toRadians((-r6.l()) + 90.0f));
            }
            float tan = (float) Math.tan(Math.toRadians(r1.l()));
            d();
            float[] fArr = this.f27682e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f11 = -sin;
            fArr[3] = f11;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.f27679b;
            matrix2.setValues(fArr);
            d();
            fArr[0] = 1.0f;
            fArr[3] = tan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.f27680c;
            matrix3.setValues(fArr);
            d();
            fArr[0] = cos;
            fArr[1] = f11;
            fArr[3] = sin;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.f27681d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        e eVar3 = this.f27685h;
        if (eVar3 != null) {
            x9.d dVar = (x9.d) eVar3.f();
            float f12 = dVar.f40141a;
            if (f12 != 1.0f || dVar.f40142b != 1.0f) {
                matrix.preScale(f12, dVar.f40142b);
            }
        }
        e eVar4 = this.f27683f;
        if (eVar4 != null && (((pointF = (PointF) eVar4.f()) != null && pointF.x != s0.g.f34069a) || pointF.y != s0.g.f34069a)) {
            matrix.preTranslate(-pointF.x, -pointF.y);
        }
        return matrix;
    }

    public final Matrix f(float f10) {
        PointF pointF;
        x9.d dVar;
        float f11;
        e eVar = this.f27684g;
        PointF pointF2 = null;
        if (eVar == null) {
            pointF = null;
        } else {
            pointF = (PointF) eVar.f();
        }
        e eVar2 = this.f27685h;
        if (eVar2 == null) {
            dVar = null;
        } else {
            dVar = (x9.d) eVar2.f();
        }
        Matrix matrix = this.f27678a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f10, pointF.y * f10);
        }
        if (dVar != null) {
            double d10 = f10;
            matrix.preScale((float) Math.pow(dVar.f40141a, d10), (float) Math.pow(dVar.f40142b, d10));
        }
        e eVar3 = this.f27686i;
        if (eVar3 != null) {
            float floatValue = ((Float) eVar3.f()).floatValue();
            e eVar4 = this.f27683f;
            if (eVar4 != null) {
                pointF2 = (PointF) eVar4.f();
            }
            float f12 = floatValue * f10;
            float f13 = s0.g.f34069a;
            if (pointF2 == null) {
                f11 = 0.0f;
            } else {
                f11 = pointF2.x;
            }
            if (pointF2 != null) {
                f13 = pointF2.y;
            }
            matrix.preRotate(f12, f11, f13);
        }
        return matrix;
    }
}
