package jk;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c extends Drawable implements f, Animatable {

    /* renamed from: a, reason: collision with root package name */
    public final b f21422a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f21423b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21424c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21425d;

    /* renamed from: f, reason: collision with root package name */
    public int f21427f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21429h;

    /* renamed from: i, reason: collision with root package name */
    public Paint f21430i;

    /* renamed from: j, reason: collision with root package name */
    public Rect f21431j;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21426e = true;

    /* renamed from: g, reason: collision with root package name */
    public final int f21428g = -1;

    public c(b bVar) {
        if (bVar != null) {
            this.f21422a = bVar;
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    public final void a() {
        al.d.T("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f21425d);
        h hVar = this.f21422a.f21421a;
        if (((wj.e) hVar.f21439a).f39134l.f39110c == 1) {
            invalidateSelf();
            return;
        }
        if (!this.f21423b) {
            this.f21423b = true;
            if (!hVar.f21448j) {
                ArrayList arrayList = hVar.f21441c;
                if (!arrayList.contains(this)) {
                    boolean isEmpty = arrayList.isEmpty();
                    arrayList.add(this);
                    if (isEmpty && !hVar.f21444f) {
                        hVar.f21444f = true;
                        hVar.f21448j = false;
                        hVar.a();
                    }
                    invalidateSelf();
                    return;
                }
                throw new IllegalStateException("Cannot subscribe twice in a row");
            }
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (this.f21425d) {
            return;
        }
        if (this.f21429h) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f21431j == null) {
                this.f21431j = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f21431j);
            this.f21429h = false;
        }
        h hVar = this.f21422a.f21421a;
        e eVar = hVar.f21447i;
        if (eVar != null) {
            bitmap = eVar.f21436g;
        } else {
            bitmap = hVar.f21450l;
        }
        if (this.f21431j == null) {
            this.f21431j = new Rect();
        }
        Rect rect = this.f21431j;
        if (this.f21430i == null) {
            this.f21430i = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f21430i);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f21422a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f21422a.f21421a.f21454p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f21422a.f21421a.f21453o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f21423b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f21429h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.f21430i == null) {
            this.f21430i = new Paint(2);
        }
        this.f21430i.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f21430i == null) {
            this.f21430i = new Paint(2);
        }
        this.f21430i.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        al.d.T("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f21425d);
        this.f21426e = z10;
        if (!z10) {
            this.f21423b = false;
            h hVar = this.f21422a.f21421a;
            ArrayList arrayList = hVar.f21441c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                hVar.f21444f = false;
            }
        } else if (this.f21424c) {
            a();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f21424c = true;
        this.f21427f = 0;
        if (this.f21426e) {
            a();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f21424c = false;
        this.f21423b = false;
        h hVar = this.f21422a.f21421a;
        ArrayList arrayList = hVar.f21441c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            hVar.f21444f = false;
        }
    }
}
