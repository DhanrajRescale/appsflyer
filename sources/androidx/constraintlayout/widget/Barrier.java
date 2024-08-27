package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import j3.a;
import j3.d;
import java.util.HashMap;
import m3.b;
import m3.r;

/* loaded from: classes.dex */
public class Barrier extends b {

    /* renamed from: h, reason: collision with root package name */
    public int f1445h;

    /* renamed from: i, reason: collision with root package name */
    public int f1446i;

    /* renamed from: j, reason: collision with root package name */
    public a f1447j;

    public Barrier(Context context) {
        super(context);
        this.f27298a = new int[32];
        this.f27304g = new HashMap();
        this.f27300c = context;
        h(null);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.f1447j.f20819v0;
    }

    public int getMargin() {
        return this.f1447j.f20820w0;
    }

    public int getType() {
        return this.f1445h;
    }

    @Override // m3.b
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        this.f1447j = new a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f27457b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 26) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.f1447j.f20819v0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.f1447j.f20820w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f27301d = this.f1447j;
        k();
    }

    @Override // m3.b
    public final void i(d dVar, boolean z10) {
        int i10 = this.f1445h;
        this.f1446i = i10;
        if (z10) {
            if (i10 == 5) {
                this.f1446i = 1;
            } else if (i10 == 6) {
                this.f1446i = 0;
            }
        } else if (i10 == 5) {
            this.f1446i = 0;
        } else if (i10 == 6) {
            this.f1446i = 1;
        }
        if (dVar instanceof a) {
            ((a) dVar).f20818u0 = this.f1446i;
        }
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f1447j.f20819v0 = z10;
    }

    public void setDpMargin(int i10) {
        this.f1447j.f20820w0 = (int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i10) {
        this.f1447j.f20820w0 = i10;
    }

    public void setType(int i10) {
        this.f1445h = i10;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
