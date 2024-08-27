package m3;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class e implements k3.c {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f27347a;

    /* renamed from: b, reason: collision with root package name */
    public int f27348b;

    /* renamed from: c, reason: collision with root package name */
    public int f27349c;

    /* renamed from: d, reason: collision with root package name */
    public int f27350d;

    /* renamed from: e, reason: collision with root package name */
    public int f27351e;

    /* renamed from: f, reason: collision with root package name */
    public int f27352f;

    /* renamed from: g, reason: collision with root package name */
    public int f27353g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f27354h;

    public e(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f27354h = constraintLayout;
        this.f27347a = constraintLayout2;
    }

    public static boolean c(int i10, int i11, int i12) {
        if (i10 == i11) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i10);
        View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode2 == 1073741824) {
            if ((mode == Integer.MIN_VALUE || mode == 0) && i12 == size) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // k3.c
    public final void a() {
        ConstraintLayout constraintLayout = this.f27347a;
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            constraintLayout.getChildAt(i10);
        }
        int size = constraintLayout.f1450b.size();
        if (size > 0) {
            for (int i11 = 0; i11 < size; i11++) {
                ((b) constraintLayout.f1450b.get(i11)).getClass();
            }
        }
    }

    @Override // k3.c
    public final void b(j3.d dVar, k3.b bVar) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z16;
        int measuredWidth;
        int baseline;
        int i14;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        int i15;
        boolean z21;
        boolean z22;
        int i16;
        if (dVar == null) {
            return;
        }
        if (dVar.f20865i0 == 8) {
            bVar.f21982e = 0;
            bVar.f21983f = 0;
            bVar.f21984g = 0;
            return;
        }
        if (dVar.V == null) {
            return;
        }
        int i17 = bVar.f21978a;
        int i18 = bVar.f21979b;
        int i19 = bVar.f21980c;
        int i20 = bVar.f21981d;
        int i21 = this.f27348b + this.f27349c;
        int i22 = this.f27350d;
        View view = (View) dVar.f20863h0;
        int e10 = w.k.e(i17);
        j3.c cVar = dVar.M;
        j3.c cVar2 = dVar.K;
        if (e10 != 0) {
            if (e10 != 1) {
                if (e10 != 2) {
                    if (e10 != 3) {
                        makeMeasureSpec = 0;
                    } else {
                        int i23 = this.f27352f;
                        if (cVar2 != null) {
                            i16 = cVar2.f20845g;
                        } else {
                            i16 = 0;
                        }
                        if (cVar != null) {
                            i16 += cVar.f20845g;
                        }
                        makeMeasureSpec = ViewGroup.getChildMeasureSpec(i23, i22 + i16, -1);
                    }
                } else {
                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f27352f, i22, -2);
                    if (dVar.f20884t == 1) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    int i24 = bVar.f21987j;
                    if (i24 == 1 || i24 == 2) {
                        if (view.getMeasuredHeight() == dVar.m()) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        if (bVar.f21987j == 2 || !z21 || ((z21 && z22) || dVar.C())) {
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dVar.s(), 1073741824);
                        }
                    }
                }
            } else {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f27352f, i22, -2);
            }
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
        }
        int e11 = w.k.e(i18);
        if (e11 != 0) {
            if (e11 != 1) {
                if (e11 != 2) {
                    if (e11 != 3) {
                        makeMeasureSpec2 = 0;
                    } else {
                        int i25 = this.f27353g;
                        if (cVar2 != null) {
                            i15 = dVar.L.f20845g;
                        } else {
                            i15 = 0;
                        }
                        if (cVar != null) {
                            i15 += dVar.N.f20845g;
                        }
                        makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i25, i21 + i15, -1);
                    }
                } else {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f27353g, i21, -2);
                    if (dVar.f20885u == 1) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    int i26 = bVar.f21987j;
                    if (i26 == 1 || i26 == 2) {
                        if (view.getMeasuredWidth() == dVar.s()) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        if (bVar.f21987j == 2 || !z19 || ((z19 && z20) || dVar.D())) {
                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dVar.m(), 1073741824);
                        }
                    }
                }
            } else {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f27353g, i21, -2);
            }
        } else {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i20, 1073741824);
        }
        j3.e eVar = (j3.e) dVar.V;
        ConstraintLayout constraintLayout = this.f27354h;
        if (eVar != null && j3.k.b(constraintLayout.f1457i, 256) && view.getMeasuredWidth() == dVar.s() && view.getMeasuredWidth() < eVar.s() && view.getMeasuredHeight() == dVar.m() && view.getMeasuredHeight() < eVar.m() && view.getBaseline() == dVar.f20853c0 && !dVar.B() && c(dVar.I, makeMeasureSpec, dVar.s()) && c(dVar.J, makeMeasureSpec2, dVar.m())) {
            bVar.f21982e = dVar.s();
            bVar.f21983f = dVar.m();
            bVar.f21984g = dVar.f20853c0;
            return;
        }
        if (i17 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i18 == 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i18 != 4 && i18 != 1) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (i17 != 4 && i17 != 1) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (z10 && dVar.Y > s0.g.f34069a) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z11 && dVar.Y > s0.g.f34069a) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (view == null) {
            return;
        }
        d dVar2 = (d) view.getLayoutParams();
        int i27 = bVar.f21987j;
        if (i27 != 1 && i27 != 2 && z10 && dVar.f20884t == 0 && z11 && dVar.f20885u == 0) {
            z16 = false;
            measuredWidth = 0;
            i14 = -1;
            baseline = 0;
            i11 = 0;
        } else {
            if ((view instanceof t) && (dVar instanceof j3.l)) {
                ((t) view).l((j3.l) dVar, makeMeasureSpec, makeMeasureSpec2);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            dVar.I = makeMeasureSpec;
            dVar.J = makeMeasureSpec2;
            dVar.f20860g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i28 = dVar.f20887w;
            if (i28 > 0) {
                i10 = Math.max(i28, measuredWidth2);
            } else {
                i10 = measuredWidth2;
            }
            int i29 = dVar.f20888x;
            if (i29 > 0) {
                i10 = Math.min(i29, i10);
            }
            int i30 = dVar.f20890z;
            if (i30 > 0) {
                i11 = Math.max(i30, measuredHeight);
            } else {
                i11 = measuredHeight;
            }
            int i31 = makeMeasureSpec;
            int i32 = dVar.A;
            if (i32 > 0) {
                i11 = Math.min(i32, i11);
            }
            if (!j3.k.b(constraintLayout.f1457i, 1)) {
                if (z14 && z12) {
                    i10 = (int) ((i11 * dVar.Y) + 0.5f);
                } else if (z15 && z13) {
                    i11 = (int) ((i10 / dVar.Y) + 0.5f);
                }
            }
            if (measuredWidth2 == i10 && measuredHeight == i11) {
                baseline = baseline2;
                measuredWidth = i10;
                z16 = false;
            } else {
                if (measuredWidth2 != i10) {
                    i12 = 1073741824;
                    i13 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
                } else {
                    i12 = 1073741824;
                    i13 = i31;
                }
                if (measuredHeight != i11) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i11, i12);
                }
                view.measure(i13, makeMeasureSpec2);
                dVar.I = i13;
                dVar.J = makeMeasureSpec2;
                z16 = false;
                dVar.f20860g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                i11 = measuredHeight2;
            }
            i14 = -1;
        }
        if (baseline != i14) {
            z17 = true;
        } else {
            z17 = z16;
        }
        if (measuredWidth != bVar.f21980c || i11 != bVar.f21981d) {
            z16 = true;
        }
        bVar.f21986i = z16;
        if (dVar2.f27311c0) {
            z18 = true;
        } else {
            z18 = z17;
        }
        if (z18 && baseline != -1 && dVar.f20853c0 != baseline) {
            bVar.f21986i = true;
        }
        bVar.f21982e = measuredWidth;
        bVar.f21983f = i11;
        bVar.f21985h = z18;
        bVar.f21984g = baseline;
    }
}
