package oo;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import java.util.ArrayList;
import m.k3;

/* loaded from: classes2.dex */
public abstract class m extends Drawable implements Animatable {

    /* renamed from: k */
    public static final k3 f30204k = new k3("growFraction", 14, Float.class);

    /* renamed from: a */
    public final Context f30205a;

    /* renamed from: b */
    public final e f30206b;

    /* renamed from: d */
    public ValueAnimator f30208d;

    /* renamed from: e */
    public ValueAnimator f30209e;

    /* renamed from: f */
    public ArrayList f30210f;

    /* renamed from: g */
    public boolean f30211g;

    /* renamed from: h */
    public float f30212h;

    /* renamed from: j */
    public int f30214j;

    /* renamed from: i */
    public final Paint f30213i = new Paint();

    /* renamed from: c */
    public a f30207c = new Object();

    /* JADX WARN: Type inference failed for: r2v1, types: [oo.a, java.lang.Object] */
    public m(Context context, e eVar) {
        this.f30205a = context;
        this.f30206b = eVar;
        setAlpha(255);
    }

    public final float b() {
        e eVar = this.f30206b;
        if (eVar.f30171e != 0 || eVar.f30172f != 0) {
            return this.f30212h;
        }
        return 1.0f;
    }

    public final boolean c() {
        ValueAnimator valueAnimator = this.f30209e;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        ValueAnimator valueAnimator = this.f30208d;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    public final boolean e(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        a aVar = this.f30207c;
        ContentResolver contentResolver = this.f30205a.getContentResolver();
        aVar.getClass();
        float f10 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (z12 && f10 > s0.g.f34069a) {
            z13 = true;
        } else {
            z13 = false;
        }
        return f(z10, z11, z13);
    }

    public boolean f(boolean z10, boolean z11, boolean z12) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3 = this.f30208d;
        k3 k3Var = f30204k;
        boolean z13 = false;
        if (valueAnimator3 == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, k3Var, s0.g.f34069a, 1.0f);
            this.f30208d = ofFloat;
            ofFloat.setDuration(500L);
            this.f30208d.setInterpolator(vn.a.f38181b);
            ValueAnimator valueAnimator4 = this.f30208d;
            if (valueAnimator4 != null && valueAnimator4.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.f30208d = valueAnimator4;
            valueAnimator4.addListener(new l(this, 0));
        }
        if (this.f30209e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, k3Var, 1.0f, s0.g.f34069a);
            this.f30209e = ofFloat2;
            ofFloat2.setDuration(500L);
            this.f30209e.setInterpolator(vn.a.f38181b);
            ValueAnimator valueAnimator5 = this.f30209e;
            if (valueAnimator5 != null && valueAnimator5.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.f30209e = valueAnimator5;
            valueAnimator5.addListener(new l(this, 1));
        }
        if (!isVisible() && !z10) {
            return false;
        }
        if (z10) {
            valueAnimator = this.f30208d;
        } else {
            valueAnimator = this.f30209e;
        }
        if (z10) {
            valueAnimator2 = this.f30209e;
        } else {
            valueAnimator2 = this.f30208d;
        }
        if (!z12) {
            if (valueAnimator2.isRunning()) {
                boolean z14 = this.f30211g;
                this.f30211g = true;
                valueAnimator2.cancel();
                this.f30211g = z14;
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                boolean z15 = this.f30211g;
                this.f30211g = true;
                valueAnimator.end();
                this.f30211g = z15;
            }
            return super.setVisible(z10, false);
        }
        if (z12 && valueAnimator.isRunning()) {
            return false;
        }
        if (!z10 || super.setVisible(z10, false)) {
            z13 = true;
        }
        e eVar = this.f30206b;
        if (!z10 ? eVar.f30172f != 0 : eVar.f30171e != 0) {
            if (!z11 && valueAnimator.isPaused()) {
                valueAnimator.resume();
            } else {
                valueAnimator.start();
            }
            return z13;
        }
        boolean z16 = this.f30211g;
        this.f30211g = true;
        valueAnimator.end();
        this.f30211g = z16;
        return z13;
    }

    public final void g(c cVar) {
        ArrayList arrayList = this.f30210f;
        if (arrayList != null && arrayList.contains(cVar)) {
            this.f30210f.remove(cVar);
            if (this.f30210f.isEmpty()) {
                this.f30210f = null;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f30214j;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        if (!d() && !c()) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f30214j = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f30213i.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        return e(z10, z11, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        f(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        f(false, true, false);
    }
}
