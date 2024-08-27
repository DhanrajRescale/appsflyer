package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class h0 extends f0 {

    /* renamed from: d, reason: collision with root package name */
    public final SeekBar f25530d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f25531e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f25532f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f25533g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f25534h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f25535i;

    public h0(SeekBar seekBar) {
        super(seekBar);
        this.f25532f = null;
        this.f25533g = null;
        this.f25534h = false;
        this.f25535i = false;
        this.f25530d = seekBar;
    }

    @Override // m.f0
    public final void a(AttributeSet attributeSet, int i10) {
        super.a(attributeSet, R.attr.seekBarStyle);
        SeekBar seekBar = this.f25530d;
        Context context = seekBar.getContext();
        int[] iArr = g.a.f16355g;
        h.c N = h.c.N(context, attributeSet, iArr, R.attr.seekBarStyle);
        d4.n1.m(seekBar, seekBar.getContext(), iArr, attributeSet, (TypedArray) N.f17584c, R.attr.seekBarStyle);
        Drawable w10 = N.w(0);
        if (w10 != null) {
            seekBar.setThumb(w10);
        }
        Drawable v10 = N.v(1);
        Drawable drawable = this.f25531e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f25531e = v10;
        if (v10 != null) {
            v10.setCallback(seekBar);
            v3.c.b(v10, d4.w0.d(seekBar));
            if (v10.isStateful()) {
                v10.setState(seekBar.getDrawableState());
            }
            c();
        }
        seekBar.invalidate();
        if (N.H(3)) {
            this.f25533g = q1.c(N.z(3, -1), this.f25533g);
            this.f25535i = true;
        }
        if (N.H(2)) {
            this.f25532f = N.r(2);
            this.f25534h = true;
        }
        N.R();
        c();
    }

    public final void c() {
        Drawable drawable = this.f25531e;
        if (drawable != null) {
            if (this.f25534h || this.f25535i) {
                Drawable mutate = drawable.mutate();
                this.f25531e = mutate;
                if (this.f25534h) {
                    v3.b.h(mutate, this.f25532f);
                }
                if (this.f25535i) {
                    v3.b.i(this.f25531e, this.f25533g);
                }
                if (this.f25531e.isStateful()) {
                    this.f25531e.setState(this.f25530d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        int i10;
        if (this.f25531e != null) {
            int max = this.f25530d.getMax();
            int i11 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f25531e.getIntrinsicWidth();
                int intrinsicHeight = this.f25531e.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i10 = intrinsicWidth / 2;
                } else {
                    i10 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i11 = intrinsicHeight / 2;
                }
                this.f25531e.setBounds(-i10, -i11, i10, i11);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f25531e.draw(canvas);
                    canvas.translate(width, s0.g.f34069a);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
