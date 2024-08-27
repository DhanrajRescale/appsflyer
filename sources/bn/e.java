package bn;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import b4.l;
import java.util.ArrayList;
import java.util.List;
import um.n;
import um.o;

/* loaded from: classes2.dex */
public final class e extends l {

    /* renamed from: c, reason: collision with root package name */
    public Paint f7152c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f7153d;

    /* renamed from: e, reason: collision with root package name */
    public tm.e f7154e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f7155f;

    /* renamed from: g, reason: collision with root package name */
    public Paint.FontMetrics f7156g;

    /* renamed from: h, reason: collision with root package name */
    public Path f7157h;

    public final void h(um.g gVar) {
        int size;
        boolean z10;
        float c10;
        float f10;
        float f11;
        Paint paint;
        float f12;
        float f13;
        ArrayList arrayList;
        int i10;
        float f14;
        boolean z11;
        float c11;
        float f15;
        float f16;
        String str;
        tm.e eVar = this.f7154e;
        eVar.getClass();
        ArrayList arrayList2 = this.f7155f;
        arrayList2.clear();
        for (int i11 = 0; i11 < gVar.c(); i11++) {
            ym.b b10 = gVar.b(i11);
            um.h hVar = (um.h) b10;
            List list = hVar.f37257a;
            int size2 = hVar.f37272p.size();
            if (b10 instanceof um.b) {
                um.b bVar = (um.b) b10;
                if (bVar.f37240v > 1) {
                    for (int i12 = 0; i12 < list.size() && i12 < bVar.f37240v; i12++) {
                        String[] strArr = bVar.f37244z;
                        arrayList2.add(new tm.f(strArr[i12 % strArr.length], hVar.f37263g, hVar.f37264h, hVar.f37265i, hVar.f37266j, ((Integer) list.get(i12)).intValue()));
                    }
                    if (bVar.f37259c != null) {
                        arrayList2.add(new tm.f(hVar.f37259c, 1, Float.NaN, Float.NaN, null, 1122867));
                    }
                }
            }
            if (b10 instanceof n) {
                n nVar = (n) b10;
                for (int i13 = 0; i13 < list.size() && i13 < size2; i13++) {
                    arrayList2.add(new tm.f(((o) nVar.g(i13)).f37289d, hVar.f37263g, hVar.f37264h, hVar.f37265i, hVar.f37266j, ((Integer) list.get(i13)).intValue()));
                }
                if (nVar.f37259c != null) {
                    arrayList2.add(new tm.f(hVar.f37259c, 1, Float.NaN, Float.NaN, null, 1122867));
                }
            } else {
                for (int i14 = 0; i14 < list.size() && i14 < size2; i14++) {
                    if (i14 < list.size() - 1 && i14 < size2 - 1) {
                        str = null;
                    } else {
                        str = ((um.h) gVar.b(i11)).f37259c;
                    }
                    arrayList2.add(new tm.f(str, hVar.f37263g, hVar.f37264h, hVar.f37265i, hVar.f37266j, ((Integer) list.get(i14)).intValue()));
                }
            }
        }
        eVar.f36187f = (tm.f[]) arrayList2.toArray(new tm.f[arrayList2.size()]);
        Paint paint2 = this.f7152c;
        paint2.setTextSize(eVar.f36183d);
        paint2.setColor(eVar.f36184e);
        cn.i iVar = (cn.i) this.f3178b;
        float c12 = cn.h.c(eVar.f36194m);
        float c13 = cn.h.c(eVar.f36199r);
        float f17 = eVar.f36198q;
        float c14 = cn.h.c(f17);
        float c15 = cn.h.c(eVar.f36196o);
        float c16 = cn.h.c(eVar.f36197p);
        boolean z12 = eVar.f36204w;
        tm.f[] fVarArr = eVar.f36187f;
        int length = fVarArr.length;
        cn.h.c(f17);
        tm.f[] fVarArr2 = eVar.f36187f;
        float f18 = s0.g.f34069a;
        float f19 = s0.g.f34069a;
        for (tm.f fVar : fVarArr2) {
            if (Float.isNaN(fVar.f36210c)) {
                f16 = eVar.f36194m;
            } else {
                f16 = fVar.f36210c;
            }
            float c17 = cn.h.c(f16);
            if (c17 > f19) {
                f19 = c17;
            }
            String str2 = fVar.f36208a;
            if (str2 != null) {
                float measureText = (int) paint2.measureText(str2);
                if (measureText > f18) {
                    f18 = measureText;
                }
            }
        }
        tm.f[] fVarArr3 = eVar.f36187f;
        float f20 = s0.g.f34069a;
        for (tm.f fVar2 : fVarArr3) {
            String str3 = fVar2.f36208a;
            if (str3 != null) {
                float a10 = cn.h.a(paint2, str3);
                if (a10 > f20) {
                    f20 = a10;
                }
            }
        }
        eVar.f36203v = f20;
        int e10 = w.k.e(eVar.f36190i);
        if (e10 != 0) {
            if (e10 == 1) {
                Paint.FontMetrics fontMetrics = cn.h.f8269f;
                paint2.getFontMetrics(fontMetrics);
                float f21 = fontMetrics.descent - fontMetrics.ascent;
                float f22 = s0.g.f34069a;
                float f23 = s0.g.f34069a;
                float f24 = s0.g.f34069a;
                int i15 = 0;
                boolean z13 = false;
                while (i15 < length) {
                    tm.f fVar3 = fVarArr[i15];
                    float f25 = c12;
                    if (fVar3.f36209b != 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    float f26 = fVar3.f36210c;
                    if (Float.isNaN(f26)) {
                        c11 = f25;
                    } else {
                        c11 = cn.h.c(f26);
                    }
                    if (!z13) {
                        f24 = s0.g.f34069a;
                    }
                    if (z11) {
                        if (z13) {
                            f24 += c13;
                        }
                        f24 += c11;
                    }
                    if (fVar3.f36208a != null) {
                        if (z11 && !z13) {
                            f15 = f24 + c14;
                        } else if (z13) {
                            f22 = Math.max(f22, f24);
                            f23 += f21 + c16;
                            f15 = s0.g.f34069a;
                            z13 = false;
                        } else {
                            f15 = f24;
                        }
                        float measureText2 = f15 + ((int) paint2.measureText(r14));
                        if (i15 < length - 1) {
                            f23 = f21 + c16 + f23;
                        }
                        f24 = measureText2;
                    } else {
                        f24 += c11;
                        if (i15 < length - 1) {
                            f24 += c13;
                        }
                        z13 = true;
                    }
                    f22 = Math.max(f22, f24);
                    i15++;
                    c12 = f25;
                }
                eVar.f36201t = f22;
                eVar.f36202u = f23;
            }
        } else {
            Paint.FontMetrics fontMetrics2 = cn.h.f8269f;
            paint2.getFontMetrics(fontMetrics2);
            float f27 = fontMetrics2.descent - fontMetrics2.ascent;
            Paint.FontMetrics fontMetrics3 = cn.h.f8269f;
            paint2.getFontMetrics(fontMetrics3);
            float f28 = (fontMetrics3.ascent - fontMetrics3.top) + fontMetrics3.bottom + c16;
            float width = iVar.f8275b.width() * eVar.f36200s;
            ArrayList arrayList3 = eVar.f36206y;
            arrayList3.clear();
            ArrayList arrayList4 = eVar.f36205x;
            arrayList4.clear();
            ArrayList arrayList5 = eVar.f36207z;
            arrayList5.clear();
            float f29 = s0.g.f34069a;
            int i16 = -1;
            float f30 = s0.g.f34069a;
            int i17 = 0;
            float f31 = s0.g.f34069a;
            while (i17 < length) {
                float f32 = f30;
                tm.f fVar4 = fVarArr[i17];
                tm.f[] fVarArr4 = fVarArr;
                ArrayList arrayList6 = arrayList5;
                if (fVar4.f36209b != 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                float f33 = fVar4.f36210c;
                if (Float.isNaN(f33)) {
                    f10 = f27;
                    c10 = c12;
                } else {
                    c10 = cn.h.c(f33);
                    f10 = f27;
                }
                arrayList3.add(Boolean.FALSE);
                if (i16 == -1) {
                    f11 = s0.g.f34069a;
                } else {
                    f11 = f31 + c13;
                }
                String str4 = fVar4.f36208a;
                if (str4 != null) {
                    arrayList4.add(cn.h.b(paint2, str4));
                    if (z10) {
                        f14 = c10 + c14;
                    } else {
                        f14 = s0.g.f34069a;
                    }
                    paint = paint2;
                    f31 = f11 + f14 + ((cn.b) arrayList4.get(i17)).f8241b;
                } else {
                    paint = paint2;
                    arrayList4.add(cn.b.b(s0.g.f34069a, s0.g.f34069a));
                    if (!z10) {
                        c10 = s0.g.f34069a;
                    }
                    f31 = f11 + c10;
                    if (i16 == -1) {
                        i16 = i17;
                    }
                }
                if (str4 == null && i17 != length - 1) {
                    f13 = f32;
                    arrayList = arrayList6;
                    f27 = f10;
                } else {
                    if (f29 == s0.g.f34069a) {
                        f12 = 0.0f;
                    } else {
                        f12 = c15;
                    }
                    if (!z12 || f29 == s0.g.f34069a || width - f29 >= f12 + f31) {
                        f13 = f32;
                        arrayList = arrayList6;
                        f27 = f10;
                        f29 = f12 + f31 + f29;
                    } else {
                        f27 = f10;
                        arrayList = arrayList6;
                        arrayList.add(cn.b.b(f29, f27));
                        float max = Math.max(f32, f29);
                        if (i16 > -1) {
                            i10 = i16;
                        } else {
                            i10 = i17;
                        }
                        arrayList3.set(i10, Boolean.TRUE);
                        f13 = max;
                        f29 = f31;
                    }
                    if (i17 == length - 1) {
                        arrayList.add(cn.b.b(f29, f27));
                        f13 = Math.max(f13, f29);
                    }
                }
                if (str4 != null) {
                    i16 = -1;
                }
                i17++;
                f30 = f13;
                arrayList5 = arrayList;
                fVarArr = fVarArr4;
                paint2 = paint;
            }
            ArrayList arrayList7 = arrayList5;
            eVar = eVar;
            eVar.f36201t = f30;
            float size3 = f27 * arrayList7.size();
            if (arrayList7.size() == 0) {
                size = 0;
            } else {
                size = arrayList7.size() - 1;
            }
            eVar.f36202u = (f28 * size) + size3;
        }
        eVar.f36202u += eVar.f36182c;
        eVar.f36201t += eVar.f36181b;
    }

    public final void i(Canvas canvas, float f10, float f11, tm.f fVar, tm.e eVar) {
        int i10 = fVar.f36213f;
        if (i10 != 1122868 && i10 != 1122867 && i10 != 0) {
            int save = canvas.save();
            int i11 = fVar.f36209b;
            if (i11 == 3) {
                i11 = eVar.f36193l;
            }
            Paint paint = this.f7153d;
            paint.setColor(fVar.f36213f);
            float f12 = fVar.f36210c;
            if (Float.isNaN(f12)) {
                f12 = eVar.f36194m;
            }
            float c10 = cn.h.c(f12);
            float f13 = c10 / 2.0f;
            int e10 = w.k.e(i11);
            if (e10 != 2) {
                if (e10 != 3) {
                    if (e10 != 4) {
                        if (e10 == 5) {
                            float f14 = fVar.f36211d;
                            if (Float.isNaN(f14)) {
                                f14 = eVar.f36195n;
                            }
                            float c11 = cn.h.c(f14);
                            DashPathEffect dashPathEffect = fVar.f36212e;
                            if (dashPathEffect == null) {
                                eVar.getClass();
                                dashPathEffect = null;
                            }
                            paint.setStyle(Paint.Style.STROKE);
                            paint.setStrokeWidth(c11);
                            paint.setPathEffect(dashPathEffect);
                            Path path = this.f7157h;
                            path.reset();
                            path.moveTo(f10, f11);
                            path.lineTo(f10 + c10, f11);
                            canvas.drawPath(path, paint);
                        }
                    }
                } else {
                    paint.setStyle(Paint.Style.FILL);
                    canvas.drawRect(f10, f11 - f13, f10 + c10, f11 + f13, paint);
                }
                canvas.restoreToCount(save);
            }
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(f10 + f13, f11, f13, paint);
            canvas.restoreToCount(save);
        }
    }

    public final void j(Canvas canvas) {
        Paint paint;
        float f10;
        float f11;
        float f12;
        boolean z10;
        float c10;
        boolean z11;
        int i10;
        ArrayList arrayList;
        float f13;
        tm.f[] fVarArr;
        Paint paint2;
        Canvas canvas2;
        String str;
        int i11;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        boolean z12;
        float c11;
        int i12;
        float f20;
        float f21;
        int i13;
        float f22;
        Paint paint3;
        float f23;
        float f24;
        float f25;
        float f26;
        float width;
        float f27;
        double d10;
        float f28;
        e eVar = this;
        tm.e eVar2 = eVar.f7154e;
        if (!eVar2.f36180a) {
            return;
        }
        Paint paint4 = eVar.f7152c;
        paint4.setTextSize(eVar2.f36183d);
        paint4.setColor(eVar2.f36184e);
        Paint.FontMetrics fontMetrics = eVar.f7156g;
        DisplayMetrics displayMetrics = cn.h.f8264a;
        paint4.getFontMetrics(fontMetrics);
        float f29 = fontMetrics.descent - fontMetrics.ascent;
        paint4.getFontMetrics(fontMetrics);
        float c12 = cn.h.c(eVar2.f36197p) + (fontMetrics.ascent - fontMetrics.top) + fontMetrics.bottom;
        float a10 = f29 - (cn.h.a(paint4, "ABC") / 2.0f);
        tm.f[] fVarArr2 = eVar2.f36187f;
        float c13 = cn.h.c(eVar2.f36198q);
        float c14 = cn.h.c(eVar2.f36196o);
        int i14 = eVar2.f36190i;
        int i15 = eVar2.f36188g;
        int i16 = eVar2.f36189h;
        int i17 = eVar2.f36192k;
        float c15 = cn.h.c(eVar2.f36194m);
        float c16 = cn.h.c(eVar2.f36199r);
        float f30 = eVar2.f36182c;
        float f31 = c16;
        float f32 = eVar2.f36181b;
        float f33 = c14;
        int e10 = w.k.e(i15);
        if (e10 != 0) {
            if (e10 != 1) {
                if (e10 != 2) {
                    paint = paint4;
                    f10 = f29;
                    f11 = c13;
                    f12 = 0.0f;
                } else {
                    if (i14 == 2) {
                        f28 = ((cn.i) eVar.f3178b).f8276c;
                    } else {
                        f28 = ((cn.i) eVar.f3178b).f8275b.right;
                    }
                    f12 = f28 - f32;
                    if (i17 == 1) {
                        f12 -= eVar2.f36201t;
                    }
                    paint = paint4;
                    f10 = f29;
                    f11 = c13;
                }
            } else {
                if (i14 == 2) {
                    width = ((cn.i) eVar.f3178b).f8276c / 2.0f;
                } else {
                    RectF rectF = ((cn.i) eVar.f3178b).f8275b;
                    width = (rectF.width() / 2.0f) + rectF.left;
                }
                if (i17 == 1) {
                    f27 = f32;
                } else {
                    f27 = -f32;
                }
                f12 = width + f27;
                if (i14 == 2) {
                    double d11 = f12;
                    if (i17 == 1) {
                        paint = paint4;
                        f11 = c13;
                        f10 = f29;
                        d10 = ((-eVar2.f36201t) / 2.0d) + f32;
                    } else {
                        paint = paint4;
                        f11 = c13;
                        f10 = f29;
                        d10 = (eVar2.f36201t / 2.0d) - f32;
                    }
                    f12 = (float) (d11 + d10);
                }
                paint = paint4;
                f10 = f29;
                f11 = c13;
            }
        } else {
            paint = paint4;
            f10 = f29;
            f11 = c13;
            if (i14 != 2) {
                f32 += ((cn.i) eVar.f3178b).f8275b.left;
            }
            if (i17 == 2) {
                f12 = f32 + eVar2.f36201t;
            } else {
                f12 = f32;
            }
        }
        int e11 = w.k.e(i14);
        if (e11 != 0) {
            if (e11 == 1) {
                int e12 = w.k.e(i16);
                if (e12 != 0) {
                    if (e12 != 1) {
                        if (e12 != 2) {
                            f19 = 0.0f;
                        } else {
                            if (i15 == 2) {
                                f26 = ((cn.i) eVar.f3178b).f8277d;
                            } else {
                                f26 = ((cn.i) eVar.f3178b).f8275b.bottom;
                            }
                            f19 = f26 - (eVar2.f36202u + f30);
                        }
                    } else {
                        f19 = ((((cn.i) eVar.f3178b).f8277d / 2.0f) - (eVar2.f36202u / 2.0f)) + eVar2.f36182c;
                    }
                } else {
                    if (i15 == 2) {
                        f18 = 0.0f;
                    } else {
                        f18 = ((cn.i) eVar.f3178b).f8275b.top;
                    }
                    f19 = f18 + f30;
                }
                float f34 = f19;
                float f35 = 0.0f;
                boolean z13 = false;
                int i18 = 0;
                while (i18 < fVarArr2.length) {
                    tm.f fVar = fVarArr2[i18];
                    if (fVar.f36209b != 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    float f36 = fVar.f36210c;
                    if (Float.isNaN(f36)) {
                        c11 = c15;
                    } else {
                        c11 = cn.h.c(f36);
                    }
                    if (z12) {
                        if (i17 == 1) {
                            f25 = f12 + f35;
                        } else {
                            f25 = f12 - (c11 - f35);
                        }
                        f22 = f25;
                        f20 = f31;
                        f21 = a10;
                        i13 = i17;
                        i(canvas, f22, f34 + a10, fVar, eVar.f7154e);
                        i12 = 1;
                        if (i13 == 1) {
                            f22 += c11;
                        }
                    } else {
                        i12 = 1;
                        f20 = f31;
                        f21 = a10;
                        i13 = i17;
                        f22 = f12;
                    }
                    String str2 = fVar.f36208a;
                    if (str2 != null) {
                        if (z12 && !z13) {
                            if (i13 == i12) {
                                f24 = f11;
                                f23 = f24;
                            } else {
                                f23 = f11;
                                f24 = -f23;
                            }
                            f22 += f24;
                        } else {
                            f23 = f11;
                            if (z13) {
                                f22 = f12;
                            }
                        }
                        paint3 = paint;
                        if (i13 == 2) {
                            f22 -= (int) paint3.measureText(str2);
                        }
                        float f37 = f22;
                        if (!z13) {
                            canvas.drawText(str2, f37, f34 + f10, paint3);
                        } else {
                            f34 += f10 + c12;
                            canvas.drawText(str2, f37, f34 + f10, paint3);
                        }
                        f34 = f10 + c12 + f34;
                        f35 = 0.0f;
                    } else {
                        paint3 = paint;
                        f23 = f11;
                        f35 = c11 + f20 + f35;
                        z13 = true;
                    }
                    i18++;
                    paint = paint3;
                    i17 = i13;
                    f11 = f23;
                    a10 = f21;
                    f31 = f20;
                }
                return;
            }
            return;
        }
        float f38 = f11;
        Paint paint5 = paint;
        ArrayList arrayList2 = eVar2.f36207z;
        ArrayList arrayList3 = eVar2.f36205x;
        ArrayList arrayList4 = eVar2.f36206y;
        int e13 = w.k.e(i16);
        if (e13 != 0) {
            if (e13 != 1) {
                if (e13 != 2) {
                    f30 = 0.0f;
                } else {
                    f30 = (((cn.i) eVar.f3178b).f8277d - f30) - eVar2.f36202u;
                }
            } else {
                f30 += (((cn.i) eVar.f3178b).f8277d - eVar2.f36202u) / 2.0f;
            }
        }
        int length = fVarArr2.length;
        float f39 = f12;
        int i19 = 0;
        int i20 = 0;
        while (i20 < length) {
            Paint paint6 = paint5;
            tm.f fVar2 = fVarArr2[i20];
            int i21 = length;
            if (fVar2.f36209b != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            float f40 = fVar2.f36210c;
            if (Float.isNaN(f40)) {
                c10 = c15;
            } else {
                c10 = cn.h.c(f40);
            }
            if (i20 < arrayList4.size() && ((Boolean) arrayList4.get(i20)).booleanValue()) {
                f30 = f10 + c12 + f30;
                f39 = f12;
            }
            if (f39 == f12 && i15 == 2 && i19 < arrayList2.size()) {
                if (i17 == 2) {
                    f17 = ((cn.b) arrayList2.get(i19)).f8241b;
                } else {
                    f17 = -((cn.b) arrayList2.get(i19)).f8241b;
                }
                f39 = (f17 / 2.0f) + f39;
                i19++;
            }
            float f41 = f39;
            int i22 = i19;
            float f42 = f41;
            String str3 = fVar2.f36208a;
            if (str3 == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                if (i17 == 2) {
                    f42 -= c10;
                }
                float f43 = f42;
                tm.e eVar3 = eVar.f7154e;
                i10 = i20;
                arrayList = arrayList2;
                f13 = f12;
                canvas2 = canvas;
                str = str3;
                fVarArr = fVarArr2;
                paint2 = paint6;
                i11 = i15;
                i(canvas, f43, f30 + a10, fVar2, eVar3);
                if (i17 == 1) {
                    f42 = f43 + c10;
                } else {
                    f42 = f43;
                }
            } else {
                i10 = i20;
                arrayList = arrayList2;
                f13 = f12;
                fVarArr = fVarArr2;
                paint2 = paint6;
                canvas2 = canvas;
                str = str3;
                i11 = i15;
            }
            if (!z11) {
                if (z10) {
                    if (i17 == 2) {
                        f16 = -f38;
                    } else {
                        f16 = f38;
                    }
                    f42 += f16;
                }
                if (i17 == 2) {
                    f42 -= ((cn.b) arrayList3.get(i10)).f8241b;
                }
                canvas2.drawText(str, f42, f30 + f10, paint2);
                if (i17 == 1) {
                    f42 += ((cn.b) arrayList3.get(i10)).f8241b;
                }
                f14 = f33;
                if (i17 == 2) {
                    f15 = -f14;
                } else {
                    f15 = f14;
                }
            } else {
                f14 = f33;
                if (i17 == 2) {
                    f15 = -f31;
                } else {
                    f15 = f31;
                }
            }
            float f44 = f42 + f15;
            int i23 = i10 + 1;
            eVar = this;
            f33 = f14;
            i20 = i23;
            paint5 = paint2;
            length = i21;
            i15 = i11;
            fVarArr2 = fVarArr;
            arrayList2 = arrayList;
            f12 = f13;
            f39 = f44;
            i19 = i22;
        }
    }
}
