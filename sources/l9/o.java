package l9;

import android.graphics.Path;
import android.graphics.PointF;
import j9.b0;
import j9.y;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class o implements n, m9.a, l {

    /* renamed from: b, reason: collision with root package name */
    public final String f24320b;

    /* renamed from: c, reason: collision with root package name */
    public final y f24321c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24322d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f24323e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f24324f;

    /* renamed from: g, reason: collision with root package name */
    public final m9.i f24325g;

    /* renamed from: h, reason: collision with root package name */
    public final m9.e f24326h;

    /* renamed from: i, reason: collision with root package name */
    public final m9.i f24327i;

    /* renamed from: j, reason: collision with root package name */
    public final m9.i f24328j;

    /* renamed from: k, reason: collision with root package name */
    public final m9.i f24329k;

    /* renamed from: l, reason: collision with root package name */
    public final m9.i f24330l;

    /* renamed from: m, reason: collision with root package name */
    public final m9.i f24331m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f24333o;

    /* renamed from: a, reason: collision with root package name */
    public final Path f24319a = new Path();

    /* renamed from: n, reason: collision with root package name */
    public final c f24332n = new c(0);

    public o(y yVar, s9.b bVar, r9.h hVar) {
        this.f24321c = yVar;
        this.f24320b = hVar.f33495a;
        int i10 = hVar.f33496b;
        this.f24322d = i10;
        this.f24323e = hVar.f33504j;
        this.f24324f = hVar.f33505k;
        m9.e a10 = hVar.f33497c.a();
        this.f24325g = (m9.i) a10;
        m9.e a11 = hVar.f33498d.a();
        this.f24326h = a11;
        m9.e a12 = hVar.f33499e.a();
        this.f24327i = (m9.i) a12;
        m9.e a13 = hVar.f33501g.a();
        this.f24329k = (m9.i) a13;
        m9.e a14 = hVar.f33503i.a();
        this.f24331m = (m9.i) a14;
        if (i10 == 1) {
            this.f24328j = (m9.i) hVar.f33500f.a();
            this.f24330l = (m9.i) hVar.f33502h.a();
        } else {
            this.f24328j = null;
            this.f24330l = null;
        }
        bVar.g(a10);
        bVar.g(a11);
        bVar.g(a12);
        bVar.g(a13);
        bVar.g(a14);
        if (i10 == 1) {
            bVar.g(this.f24328j);
            bVar.g(this.f24330l);
        }
        a10.a(this);
        a11.a(this);
        a12.a(this);
        a13.a(this);
        a14.a(this);
        if (i10 == 1) {
            this.f24328j.a(this);
            this.f24330l.a(this);
        }
    }

    @Override // m9.a
    public final void a() {
        this.f24333o = false;
        this.f24321c.invalidateSelf();
    }

    @Override // l9.d
    public final void b(List list, List list2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i10 < arrayList.size()) {
                d dVar = (d) arrayList.get(i10);
                if (dVar instanceof u) {
                    u uVar = (u) dVar;
                    if (uVar.f24371c == 1) {
                        this.f24332n.f24251a.add(uVar);
                        uVar.c(this);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // p9.f
    public final void c(x9.c cVar, Object obj) {
        m9.i iVar;
        m9.i iVar2;
        if (obj == b0.f21127w) {
            this.f24325g.k(cVar);
            return;
        }
        if (obj == b0.f21128x) {
            this.f24327i.k(cVar);
            return;
        }
        if (obj == b0.f21118n) {
            this.f24326h.k(cVar);
            return;
        }
        if (obj == b0.f21129y && (iVar2 = this.f24328j) != null) {
            iVar2.k(cVar);
            return;
        }
        if (obj == b0.f21130z) {
            this.f24329k.k(cVar);
            return;
        }
        if (obj == b0.A && (iVar = this.f24330l) != null) {
            iVar.k(cVar);
        } else if (obj == b0.B) {
            this.f24331m.k(cVar);
        }
    }

    @Override // l9.d
    public final String d() {
        return this.f24320b;
    }

    @Override // p9.f
    public final void f(p9.e eVar, int i10, ArrayList arrayList, p9.e eVar2) {
        w9.e.e(eVar, i10, arrayList, eVar2, this);
    }

    @Override // l9.n
    public final Path i() {
        o oVar;
        float f10;
        float f11;
        float cos;
        float f12;
        double d10;
        float f13;
        float f14;
        Path path;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        Path path2;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        float f29;
        m9.e eVar;
        float f30;
        double d11;
        double d12;
        boolean z10 = this.f24333o;
        Path path3 = this.f24319a;
        if (z10) {
            return path3;
        }
        path3.reset();
        if (this.f24323e) {
            this.f24333o = true;
            return path3;
        }
        int e10 = w.k.e(this.f24322d);
        m9.e eVar2 = this.f24326h;
        m9.i iVar = this.f24329k;
        m9.i iVar2 = this.f24331m;
        double d13 = 0.0d;
        m9.i iVar3 = this.f24327i;
        m9.i iVar4 = this.f24325g;
        if (e10 != 0) {
            if (e10 != 1) {
                oVar = this;
            } else {
                int floor = (int) Math.floor(((Float) iVar4.f()).floatValue());
                if (iVar3 == null) {
                    eVar = eVar2;
                } else {
                    eVar = eVar2;
                    d13 = ((Float) iVar3.f()).floatValue();
                }
                double radians = Math.toRadians(d13 - 90.0d);
                double d14 = floor;
                float floatValue = ((Float) iVar2.f()).floatValue() / 100.0f;
                float floatValue2 = ((Float) iVar.f()).floatValue();
                double d15 = floatValue2;
                float cos2 = (float) (Math.cos(radians) * d15);
                float sin = (float) (Math.sin(radians) * d15);
                path3.moveTo(cos2, sin);
                double d16 = (float) (6.283185307179586d / d14);
                double d17 = radians + d16;
                double ceil = Math.ceil(d14);
                int i10 = 0;
                while (i10 < ceil) {
                    float cos3 = (float) (Math.cos(d17) * d15);
                    int i11 = i10;
                    float sin2 = (float) (Math.sin(d17) * d15);
                    if (floatValue != s0.g.f34069a) {
                        double d18 = d15;
                        double atan2 = (float) (Math.atan2(sin, cos2) - 1.5707963267948966d);
                        float cos4 = (float) Math.cos(atan2);
                        float sin3 = (float) Math.sin(atan2);
                        d11 = d17;
                        double atan22 = (float) (Math.atan2(sin2, cos3) - 1.5707963267948966d);
                        float f31 = floatValue2 * floatValue * 0.25f;
                        d12 = d18;
                        f30 = floatValue2;
                        path3.cubicTo(cos2 - (cos4 * f31), sin - (sin3 * f31), cos3 + (((float) Math.cos(atan22)) * f31), (f31 * ((float) Math.sin(atan22))) + sin2, cos3, sin2);
                    } else {
                        f30 = floatValue2;
                        d11 = d17;
                        d12 = d15;
                        path3.lineTo(cos3, sin2);
                    }
                    sin = sin2;
                    floatValue2 = f30;
                    i10 = i11 + 1;
                    d15 = d12;
                    d17 = d11 + d16;
                    cos2 = cos3;
                }
                PointF pointF = (PointF) eVar.f();
                path3.offset(pointF.x, pointF.y);
                path3.close();
                oVar = this;
            }
            path = path3;
        } else {
            float floatValue3 = ((Float) iVar4.f()).floatValue();
            if (iVar3 != null) {
                d13 = ((Float) iVar3.f()).floatValue();
            }
            double radians2 = Math.toRadians(d13 - 90.0d);
            double d19 = floatValue3;
            float f32 = (float) (6.283185307179586d / d19);
            oVar = this;
            if (oVar.f24324f) {
                f32 *= -1.0f;
            }
            float f33 = f32;
            float f34 = f33 / 2.0f;
            float f35 = floatValue3 - ((int) floatValue3);
            if (f35 != s0.g.f34069a) {
                radians2 += (1.0f - f35) * f34;
            }
            float floatValue4 = ((Float) iVar.f()).floatValue();
            float floatValue5 = ((Float) oVar.f24328j.f()).floatValue();
            m9.i iVar5 = oVar.f24330l;
            if (iVar5 != null) {
                f10 = ((Float) iVar5.f()).floatValue() / 100.0f;
            } else {
                f10 = s0.g.f34069a;
            }
            if (iVar2 != null) {
                f11 = ((Float) iVar2.f()).floatValue() / 100.0f;
            } else {
                f11 = s0.g.f34069a;
            }
            if (f35 != s0.g.f34069a) {
                float b10 = nn.d.b(floatValue4, floatValue5, f35, floatValue5);
                double d20 = b10;
                cos = (float) (Math.cos(radians2) * d20);
                f13 = (float) (Math.sin(radians2) * d20);
                path3.moveTo(cos, f13);
                d10 = radians2 + ((f33 * f35) / 2.0f);
                f14 = b10;
                f12 = f34;
            } else {
                double d21 = floatValue4;
                cos = (float) (Math.cos(radians2) * d21);
                float sin4 = (float) (Math.sin(radians2) * d21);
                path3.moveTo(cos, sin4);
                f12 = f34;
                d10 = radians2 + f12;
                f13 = sin4;
                f14 = s0.g.f34069a;
            }
            double ceil2 = Math.ceil(d19) * 2.0d;
            double d22 = d10;
            int i12 = 0;
            boolean z11 = false;
            while (true) {
                double d23 = i12;
                if (d23 >= ceil2) {
                    break;
                }
                if (z11) {
                    f15 = floatValue4;
                } else {
                    f15 = floatValue5;
                }
                if (f14 != s0.g.f34069a && d23 == ceil2 - 2.0d) {
                    f16 = (f33 * f35) / 2.0f;
                } else {
                    f16 = f12;
                }
                if (f14 != s0.g.f34069a && d23 == ceil2 - 1.0d) {
                    f17 = f16;
                    f18 = floatValue5;
                    f20 = floatValue4;
                    f19 = f14;
                } else {
                    f17 = f16;
                    f18 = floatValue5;
                    f19 = f15;
                    f20 = floatValue4;
                }
                double d24 = f19;
                float f36 = f33;
                float f37 = f12;
                float cos5 = (float) (Math.cos(d22) * d24);
                float sin5 = (float) (d24 * Math.sin(d22));
                if (f10 == s0.g.f34069a && f11 == s0.g.f34069a) {
                    path3.lineTo(cos5, sin5);
                    path2 = path3;
                    f21 = sin5;
                    f22 = f14;
                    f29 = f20;
                    f27 = f17;
                    f28 = f18;
                } else {
                    float f38 = f13;
                    double atan23 = (float) (Math.atan2(f13, cos) - 1.5707963267948966d);
                    float cos6 = (float) Math.cos(atan23);
                    float sin6 = (float) Math.sin(atan23);
                    path2 = path3;
                    f21 = sin5;
                    f22 = f14;
                    double atan24 = (float) (Math.atan2(sin5, cos5) - 1.5707963267948966d);
                    float cos7 = (float) Math.cos(atan24);
                    float sin7 = (float) Math.sin(atan24);
                    if (z11) {
                        f23 = f10;
                    } else {
                        f23 = f11;
                    }
                    if (z11) {
                        f24 = f11;
                    } else {
                        f24 = f10;
                    }
                    if (z11) {
                        f25 = f18;
                    } else {
                        f25 = f20;
                    }
                    if (z11) {
                        f26 = f20;
                    } else {
                        f26 = f18;
                    }
                    float f39 = f25 * f23 * 0.47829f;
                    float f40 = cos6 * f39;
                    float f41 = f39 * sin6;
                    float f42 = f26 * f24 * 0.47829f;
                    float f43 = cos7 * f42;
                    float f44 = f42 * sin7;
                    if (f35 != s0.g.f34069a) {
                        if (i12 == 0) {
                            f40 *= f35;
                            f41 *= f35;
                        } else if (d23 == ceil2 - 1.0d) {
                            f43 *= f35;
                            f44 *= f35;
                        }
                    }
                    f27 = f17;
                    f28 = f18;
                    f29 = f20;
                    path2.cubicTo(cos - f40, f38 - f41, f43 + cos5, f21 + f44, cos5, f21);
                }
                d22 += f27;
                z11 = !z11;
                i12++;
                floatValue5 = f28;
                cos = cos5;
                floatValue4 = f29;
                path3 = path2;
                f33 = f36;
                f12 = f37;
                f14 = f22;
                f13 = f21;
            }
            PointF pointF2 = (PointF) eVar2.f();
            path = path3;
            path.offset(pointF2.x, pointF2.y);
            path.close();
        }
        path.close();
        oVar.f24332n.b(path);
        oVar.f24333o = true;
        return path;
    }
}
