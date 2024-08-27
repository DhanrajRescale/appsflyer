package to;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;

/* loaded from: classes2.dex */
public class h extends Drawable implements w {

    /* renamed from: w, reason: collision with root package name */
    public static final Paint f36252w;

    /* renamed from: a, reason: collision with root package name */
    public g f36253a;

    /* renamed from: b, reason: collision with root package name */
    public final u[] f36254b;

    /* renamed from: c, reason: collision with root package name */
    public final u[] f36255c;

    /* renamed from: d, reason: collision with root package name */
    public final BitSet f36256d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f36257e;

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f36258f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f36259g;

    /* renamed from: h, reason: collision with root package name */
    public final Path f36260h;

    /* renamed from: i, reason: collision with root package name */
    public final RectF f36261i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f36262j;

    /* renamed from: k, reason: collision with root package name */
    public final Region f36263k;

    /* renamed from: l, reason: collision with root package name */
    public final Region f36264l;

    /* renamed from: m, reason: collision with root package name */
    public l f36265m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f36266n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f36267o;

    /* renamed from: p, reason: collision with root package name */
    public final so.a f36268p;

    /* renamed from: q, reason: collision with root package name */
    public final ek.u f36269q;

    /* renamed from: r, reason: collision with root package name */
    public final n f36270r;

    /* renamed from: s, reason: collision with root package name */
    public PorterDuffColorFilter f36271s;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f36272t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f36273u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f36274v;

    static {
        Paint paint = new Paint(1);
        f36252w = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public h() {
        this(new l());
    }

    public void a() {
        invalidateSelf();
    }

    public final void b(RectF rectF, Path path) {
        n nVar = this.f36270r;
        g gVar = this.f36253a;
        nVar.a(gVar.f36231a, gVar.f36240j, rectF, this.f36269q, path);
        if (this.f36253a.f36239i != 1.0f) {
            Matrix matrix = this.f36258f;
            matrix.reset();
            float f10 = this.f36253a.f36239i;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f36273u, true);
    }

    public final PorterDuffColorFilter c(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        PorterDuffColorFilter porterDuffColorFilter;
        int color;
        int d10;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z10) {
                colorForState = d(colorForState);
            }
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (z10 && (d10 = d((color = paint.getColor()))) != color) {
            porterDuffColorFilter = new PorterDuffColorFilter(d10, PorterDuff.Mode.SRC_IN);
        } else {
            porterDuffColorFilter = null;
        }
        return porterDuffColorFilter;
    }

    public final int d(int i10) {
        g gVar = this.f36253a;
        float f10 = gVar.f36244n + gVar.f36245o + gVar.f36243m;
        io.a aVar = gVar.f36232b;
        if (aVar != null) {
            return aVar.a(i10, f10);
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d4, code lost:
    
        if (r1 < 29) goto L24;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: to.h.draw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas) {
        if (this.f36256d.cardinality() > 0) {
            Log.w("h", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i10 = this.f36253a.f36248r;
        Path path = this.f36259g;
        so.a aVar = this.f36268p;
        if (i10 != 0) {
            canvas.drawPath(path, aVar.f34727a);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            u uVar = this.f36254b[i11];
            int i12 = this.f36253a.f36247q;
            Matrix matrix = u.f36320b;
            uVar.a(matrix, aVar, i12, canvas);
            this.f36255c[i11].a(matrix, aVar, this.f36253a.f36247q, canvas);
        }
        if (this.f36274v) {
            g gVar = this.f36253a;
            int sin = (int) (Math.sin(Math.toRadians(gVar.f36249s)) * gVar.f36248r);
            g gVar2 = this.f36253a;
            int cos = (int) (Math.cos(Math.toRadians(gVar2.f36249s)) * gVar2.f36248r);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f36252w);
            canvas.translate(sin, cos);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, l lVar, RectF rectF) {
        if (lVar.e(rectF)) {
            float a10 = lVar.f36284f.a(rectF) * this.f36253a.f36240j;
            canvas.drawRoundRect(rectF, a10, a10, paint);
        } else {
            canvas.drawPath(path, paint);
        }
    }

    public void g(Canvas canvas) {
        float f10;
        Paint paint = this.f36267o;
        Path path = this.f36260h;
        l lVar = this.f36265m;
        RectF rectF = this.f36262j;
        rectF.set(h());
        if (j()) {
            f10 = paint.getStrokeWidth() / 2.0f;
        } else {
            f10 = s0.g.f34069a;
        }
        rectF.inset(f10, f10);
        f(canvas, paint, path, lVar, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f36253a.f36242l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f36253a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f36253a.f36246p == 2) {
            return;
        }
        if (l()) {
            outline.setRoundRect(getBounds(), i() * this.f36253a.f36240j);
        } else {
            RectF h10 = h();
            Path path = this.f36259g;
            b(h10, path);
            dp.b.J1(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f36253a.f36238h;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f36263k;
        region.set(bounds);
        RectF h10 = h();
        Path path = this.f36259g;
        b(h10, path);
        Region region2 = this.f36264l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        RectF rectF = this.f36261i;
        rectF.set(getBounds());
        return rectF;
    }

    public final float i() {
        return this.f36253a.f36231a.f36283e.a(h());
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f36257e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        if (!super.isStateful() && (((colorStateList = this.f36253a.f36236f) == null || !colorStateList.isStateful()) && (((colorStateList2 = this.f36253a.f36235e) == null || !colorStateList2.isStateful()) && (((colorStateList3 = this.f36253a.f36234d) == null || !colorStateList3.isStateful()) && ((colorStateList4 = this.f36253a.f36233c) == null || !colorStateList4.isStateful()))))) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        Paint.Style style = this.f36253a.f36251u;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f36267o.getStrokeWidth() > s0.g.f34069a) {
            return true;
        }
        return false;
    }

    public final void k(Context context) {
        this.f36253a.f36232b = new io.a(context);
        u();
    }

    public final boolean l() {
        return this.f36253a.f36231a.e(h());
    }

    public final void m(float f10) {
        g gVar = this.f36253a;
        if (gVar.f36244n != f10) {
            gVar.f36244n = f10;
            u();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f36253a = new g(this.f36253a);
        return this;
    }

    public final void n(ColorStateList colorStateList) {
        g gVar = this.f36253a;
        if (gVar.f36233c != colorStateList) {
            gVar.f36233c = colorStateList;
            onStateChange(getState());
        }
    }

    public final void o(float f10) {
        g gVar = this.f36253a;
        if (gVar.f36240j != f10) {
            gVar.f36240j = f10;
            this.f36257e = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f36257e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, mo.y
    public boolean onStateChange(int[] iArr) {
        boolean z10;
        boolean s7 = s(iArr);
        boolean t10 = t();
        if (!s7 && !t10) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    public final void p() {
        this.f36268p.a(-12303292);
        this.f36253a.f36250t = false;
        super.invalidateSelf();
    }

    public final void q() {
        g gVar = this.f36253a;
        if (gVar.f36246p != 2) {
            gVar.f36246p = 2;
            super.invalidateSelf();
        }
    }

    public final void r(ColorStateList colorStateList) {
        g gVar = this.f36253a;
        if (gVar.f36234d != colorStateList) {
            gVar.f36234d = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean s(int[] iArr) {
        boolean z10;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f36253a.f36233c != null && color2 != (colorForState2 = this.f36253a.f36233c.getColorForState(iArr, (color2 = (paint2 = this.f36266n).getColor())))) {
            paint2.setColor(colorForState2);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f36253a.f36234d != null && color != (colorForState = this.f36253a.f36234d.getColorForState(iArr, (color = (paint = this.f36267o).getColor())))) {
            paint.setColor(colorForState);
            return true;
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        g gVar = this.f36253a;
        if (gVar.f36242l != i10) {
            gVar.f36242l = i10;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f36253a.getClass();
        super.invalidateSelf();
    }

    @Override // to.w
    public final void setShapeAppearanceModel(l lVar) {
        this.f36253a.f36231a = lVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f36253a.f36236f = colorStateList;
        t();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        g gVar = this.f36253a;
        if (gVar.f36237g != mode) {
            gVar.f36237g = mode;
            t();
            super.invalidateSelf();
        }
    }

    public final boolean t() {
        PorterDuffColorFilter porterDuffColorFilter = this.f36271s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f36272t;
        g gVar = this.f36253a;
        this.f36271s = c(gVar.f36236f, gVar.f36237g, this.f36266n, true);
        g gVar2 = this.f36253a;
        this.f36272t = c(gVar2.f36235e, gVar2.f36237g, this.f36267o, false);
        g gVar3 = this.f36253a;
        if (gVar3.f36250t) {
            this.f36268p.a(gVar3.f36236f.getColorForState(getState(), 0));
        }
        if (!c4.c.a(porterDuffColorFilter, this.f36271s) || !c4.c.a(porterDuffColorFilter2, this.f36272t)) {
            return true;
        }
        return false;
    }

    public final void u() {
        g gVar = this.f36253a;
        float f10 = gVar.f36244n + gVar.f36245o;
        gVar.f36247q = (int) Math.ceil(0.75f * f10);
        this.f36253a.f36248r = (int) Math.ceil(f10 * 0.25f);
        t();
        super.invalidateSelf();
    }

    public h(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(l.c(context, attributeSet, i10, i11).a());
    }

    public h(l lVar) {
        this(new g(lVar));
    }

    public h(g gVar) {
        n nVar;
        this.f36254b = new u[4];
        this.f36255c = new u[4];
        this.f36256d = new BitSet(8);
        this.f36258f = new Matrix();
        this.f36259g = new Path();
        this.f36260h = new Path();
        this.f36261i = new RectF();
        this.f36262j = new RectF();
        this.f36263k = new Region();
        this.f36264l = new Region();
        Paint paint = new Paint(1);
        this.f36266n = paint;
        Paint paint2 = new Paint(1);
        this.f36267o = paint2;
        this.f36268p = new so.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            nVar = m.f36291a;
        } else {
            nVar = new n();
        }
        this.f36270r = nVar;
        this.f36273u = new RectF();
        this.f36274v = true;
        this.f36253a = gVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        t();
        s(getState());
        this.f36269q = new ek.u(this, 11);
    }
}
