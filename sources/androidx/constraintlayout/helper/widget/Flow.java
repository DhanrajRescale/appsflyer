package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import j3.d;
import j3.g;
import j3.l;
import m3.r;
import m3.t;

/* loaded from: classes.dex */
public class Flow extends t {

    /* renamed from: j, reason: collision with root package name */
    public g f1444j;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // m3.t, m3.b
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        this.f1444j = new g();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f27457b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f1444j.X0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar = this.f1444j;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar.f20929u0 = dimensionPixelSize;
                    gVar.f20930v0 = dimensionPixelSize;
                    gVar.f20931w0 = dimensionPixelSize;
                    gVar.f20932x0 = dimensionPixelSize;
                } else if (index == 18) {
                    g gVar2 = this.f1444j;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.f20931w0 = dimensionPixelSize2;
                    gVar2.f20933y0 = dimensionPixelSize2;
                    gVar2.f20934z0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f1444j.f20932x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f1444j.f20933y0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f1444j.f20929u0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f1444j.f20934z0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f1444j.f20930v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f1444j.V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f1444j.F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f1444j.G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f1444j.H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f1444j.J0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f1444j.I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f1444j.K0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f1444j.L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f1444j.N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f1444j.P0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f1444j.O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f1444j.Q0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f1444j.M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f1444j.T0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f1444j.U0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f1444j.R0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f1444j.S0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f1444j.W0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f27301d = this.f1444j;
        k();
    }

    @Override // m3.b
    public final void i(d dVar, boolean z10) {
        g gVar = this.f1444j;
        int i10 = gVar.f20931w0;
        if (i10 > 0 || gVar.f20932x0 > 0) {
            if (z10) {
                gVar.f20933y0 = gVar.f20932x0;
                gVar.f20934z0 = i10;
            } else {
                gVar.f20933y0 = i10;
                gVar.f20934z0 = gVar.f20932x0;
            }
        }
    }

    @Override // m3.t
    public final void l(l lVar, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (lVar != null) {
            lVar.Y(mode, size, mode2, size2);
            setMeasuredDimension(lVar.B0, lVar.C0);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    @Override // m3.b, android.view.View
    public final void onMeasure(int i10, int i11) {
        l(this.f1444j, i10, i11);
    }

    public void setFirstHorizontalBias(float f10) {
        this.f1444j.N0 = f10;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.f1444j.H0 = i10;
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.f1444j.O0 = f10;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.f1444j.I0 = i10;
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.f1444j.T0 = i10;
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.f1444j.L0 = f10;
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.f1444j.R0 = i10;
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.f1444j.F0 = i10;
        requestLayout();
    }

    public void setLastHorizontalBias(float f10) {
        this.f1444j.P0 = f10;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i10) {
        this.f1444j.J0 = i10;
        requestLayout();
    }

    public void setLastVerticalBias(float f10) {
        this.f1444j.Q0 = f10;
        requestLayout();
    }

    public void setLastVerticalStyle(int i10) {
        this.f1444j.K0 = i10;
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.f1444j.W0 = i10;
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.f1444j.X0 = i10;
        requestLayout();
    }

    public void setPadding(int i10) {
        g gVar = this.f1444j;
        gVar.f20929u0 = i10;
        gVar.f20930v0 = i10;
        gVar.f20931w0 = i10;
        gVar.f20932x0 = i10;
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.f1444j.f20930v0 = i10;
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.f1444j.f20933y0 = i10;
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.f1444j.f20934z0 = i10;
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.f1444j.f20929u0 = i10;
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.f1444j.U0 = i10;
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.f1444j.M0 = f10;
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.f1444j.S0 = i10;
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.f1444j.G0 = i10;
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.f1444j.V0 = i10;
        requestLayout();
    }
}
