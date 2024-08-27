package m;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class k3 extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25615a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k3(String str, int i10, Class cls) {
        super(cls, str);
        this.f25615a = i10;
    }

    public final Float a(View view) {
        switch (this.f25615a) {
            case 6:
                return Float.valueOf(t7.y.f35540a.t(view));
            case 7:
            default:
                WeakHashMap weakHashMap = d4.n1.f13788a;
                return Float.valueOf(d4.w0.e(view));
            case 8:
                return Float.valueOf(view.getLayoutParams().width);
            case 9:
                return Float.valueOf(view.getLayoutParams().height);
            case 10:
                WeakHashMap weakHashMap2 = d4.n1.f13788a;
                return Float.valueOf(d4.w0.f(view));
        }
    }

    public final void b(View view, PointF pointF) {
        switch (this.f25615a) {
            case 3:
                t7.y.a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
                return;
            case 4:
                t7.y.a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
                return;
            default:
                int round = Math.round(pointF.x);
                int round2 = Math.round(pointF.y);
                t7.y.a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
                return;
        }
    }

    public final void c(View view, Float f10) {
        switch (this.f25615a) {
            case 6:
                t7.y.f35540a.u(view, f10.floatValue());
                return;
            case 7:
            default:
                WeakHashMap weakHashMap = d4.n1.f13788a;
                d4.w0.k(view, d4.w0.f(view), view.getPaddingTop(), f10.intValue(), view.getPaddingBottom());
                return;
            case 8:
                view.getLayoutParams().width = f10.intValue();
                view.requestLayout();
                return;
            case 9:
                view.getLayoutParams().height = f10.intValue();
                view.requestLayout();
                return;
            case 10:
                int intValue = f10.intValue();
                int paddingTop = view.getPaddingTop();
                WeakHashMap weakHashMap2 = d4.n1.f13788a;
                d4.w0.k(view, intValue, paddingTop, d4.w0.e(view), view.getPaddingBottom());
                return;
        }
    }

    public final void d(oo.h hVar, Float f10) {
        switch (this.f25615a) {
            case 12:
                float floatValue = f10.floatValue();
                hVar.f30189i = floatValue;
                int i10 = (int) (5400.0f * floatValue);
                float[] fArr = (float[]) hVar.f23560b;
                float f11 = floatValue * 1520.0f;
                fArr[0] = (-20.0f) + f11;
                fArr[1] = f11;
                int i11 = 0;
                while (true) {
                    v4.b bVar = hVar.f30186f;
                    if (i11 < 4) {
                        float f12 = 667;
                        float[] fArr2 = (float[]) hVar.f23560b;
                        fArr2[1] = (bVar.getInterpolation((i10 - oo.h.f30179l[i11]) / f12) * 250.0f) + fArr2[1];
                        float f13 = (i10 - oo.h.f30180m[i11]) / f12;
                        float[] fArr3 = (float[]) hVar.f23560b;
                        fArr3[0] = (bVar.getInterpolation(f13) * 250.0f) + fArr3[0];
                        i11++;
                    } else {
                        float[] fArr4 = (float[]) hVar.f23560b;
                        float f14 = fArr4[0];
                        float f15 = fArr4[1];
                        float f16 = ((f15 - f14) * hVar.f30190j) + f14;
                        fArr4[0] = f16;
                        fArr4[0] = f16 / 360.0f;
                        fArr4[1] = f15 / 360.0f;
                        int i12 = 0;
                        while (true) {
                            if (i12 < 4) {
                                float f17 = (i10 - oo.h.f30181n[i12]) / 333;
                                if (f17 >= s0.g.f34069a && f17 <= 1.0f) {
                                    int i13 = i12 + hVar.f30188h;
                                    oo.i iVar = hVar.f30187g;
                                    int[] iArr = iVar.f30169c;
                                    int length = i13 % iArr.length;
                                    int length2 = (length + 1) % iArr.length;
                                    ((int[]) hVar.f23561c)[0] = vn.b.a(bVar.getInterpolation(f17), Integer.valueOf(pn.e.c(iArr[length], ((oo.o) hVar.f23559a).f30214j)), Integer.valueOf(pn.e.c(iVar.f30169c[length2], ((oo.o) hVar.f23559a).f30214j))).intValue();
                                } else {
                                    i12++;
                                }
                            }
                        }
                        ((oo.o) hVar.f23559a).invalidateSelf();
                        return;
                    }
                }
                break;
            default:
                hVar.f30190j = f10.floatValue();
                return;
        }
    }

    public final void e(t7.e eVar, PointF pointF) {
        switch (this.f25615a) {
            case 1:
                eVar.getClass();
                eVar.f35451a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                eVar.f35452b = round;
                int i10 = eVar.f35456f + 1;
                eVar.f35456f = i10;
                if (i10 == eVar.f35457g) {
                    t7.y.a(eVar.f35455e, eVar.f35451a, round, eVar.f35453c, eVar.f35454d);
                    eVar.f35456f = 0;
                    eVar.f35457g = 0;
                    return;
                }
                return;
            default:
                eVar.getClass();
                eVar.f35453c = Math.round(pointF.x);
                int round2 = Math.round(pointF.y);
                eVar.f35454d = round2;
                int i11 = eVar.f35457g + 1;
                eVar.f35457g = i11;
                if (eVar.f35456f == i11) {
                    t7.y.a(eVar.f35455e, eVar.f35451a, eVar.f35452b, eVar.f35453c, round2);
                    eVar.f35456f = 0;
                    eVar.f35457g = 0;
                    return;
                }
                return;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        int i10 = this.f25615a;
        switch (i10) {
            case 0:
                return Float.valueOf(((SwitchCompat) obj).f1106z);
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return null;
            case 6:
                return a((View) obj);
            case 7:
                WeakHashMap weakHashMap = d4.n1.f13788a;
                return d4.x0.a((View) obj);
            case 8:
                return a((View) obj);
            case 9:
                return a((View) obj);
            case 10:
                return a((View) obj);
            case 11:
                return a((View) obj);
            case 12:
                oo.h hVar = (oo.h) obj;
                switch (i10) {
                    case 12:
                        return Float.valueOf(hVar.f30189i);
                    default:
                        return Float.valueOf(hVar.f30190j);
                }
            case 13:
                oo.h hVar2 = (oo.h) obj;
                switch (i10) {
                    case 12:
                        return Float.valueOf(hVar2.f30189i);
                    default:
                        return Float.valueOf(hVar2.f30190j);
                }
            case 14:
                return Float.valueOf(((oo.m) obj).b());
            case 15:
                return Float.valueOf(((oo.q) obj).f30229i);
            default:
                return Float.valueOf(((oo.s) obj).f30241j);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f25615a) {
            case 0:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                return;
            case 1:
                e((t7.e) obj, (PointF) obj2);
                return;
            case 2:
                e((t7.e) obj, (PointF) obj2);
                return;
            case 3:
                b((View) obj, (PointF) obj2);
                return;
            case 4:
                b((View) obj, (PointF) obj2);
                return;
            case 5:
                b((View) obj, (PointF) obj2);
                return;
            case 6:
                c((View) obj, (Float) obj2);
                return;
            case 7:
                WeakHashMap weakHashMap = d4.n1.f13788a;
                d4.x0.c((View) obj, (Rect) obj2);
                return;
            case 8:
                c((View) obj, (Float) obj2);
                return;
            case 9:
                c((View) obj, (Float) obj2);
                return;
            case 10:
                c((View) obj, (Float) obj2);
                return;
            case 11:
                c((View) obj, (Float) obj2);
                return;
            case 12:
                d((oo.h) obj, (Float) obj2);
                return;
            case 13:
                d((oo.h) obj, (Float) obj2);
                return;
            case 14:
                oo.m mVar = (oo.m) obj;
                float floatValue = ((Float) obj2).floatValue();
                if (mVar.f30212h != floatValue) {
                    mVar.f30212h = floatValue;
                    mVar.invalidateSelf();
                    return;
                }
                return;
            case 15:
                oo.q qVar = (oo.q) obj;
                qVar.f30229i = ((Float) obj2).floatValue();
                Object obj3 = qVar.f23560b;
                ((float[]) obj3)[0] = 0.0f;
                float f10 = ((int) (r10 * 333.0f)) / 667;
                float[] fArr = (float[]) obj3;
                v4.b bVar = qVar.f30225e;
                float interpolation = bVar.getInterpolation(f10);
                fArr[2] = interpolation;
                fArr[1] = interpolation;
                float[] fArr2 = (float[]) qVar.f23560b;
                float interpolation2 = bVar.getInterpolation(f10 + 0.49925038f);
                fArr2[4] = interpolation2;
                fArr2[3] = interpolation2;
                float[] fArr3 = (float[]) qVar.f23560b;
                fArr3[5] = 1.0f;
                if (qVar.f30228h && fArr3[3] < 1.0f) {
                    int[] iArr = (int[]) qVar.f23561c;
                    iArr[2] = iArr[1];
                    iArr[1] = iArr[0];
                    iArr[0] = pn.e.c(qVar.f30226f.f30169c[qVar.f30227g], ((oo.o) qVar.f23559a).f30214j);
                    qVar.f30228h = false;
                }
                ((oo.o) qVar.f23559a).invalidateSelf();
                return;
            default:
                oo.s sVar = (oo.s) obj;
                float floatValue2 = ((Float) obj2).floatValue();
                sVar.f30241j = floatValue2;
                int i10 = (int) (floatValue2 * 1800.0f);
                for (int i11 = 0; i11 < 4; i11++) {
                    ((float[]) sVar.f23560b)[i11] = Math.max(s0.g.f34069a, Math.min(1.0f, sVar.f30237f[i11].getInterpolation((i10 - oo.s.f30233m[i11]) / oo.s.f30232l[i11])));
                }
                if (sVar.f30240i) {
                    Arrays.fill((int[]) sVar.f23561c, pn.e.c(sVar.f30238g.f30169c[sVar.f30239h], ((oo.o) sVar.f23559a).f30214j));
                    sVar.f30240i = false;
                }
                ((oo.o) sVar.f23559a).invalidateSelf();
                return;
        }
    }
}
