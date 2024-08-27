package oo;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

/* loaded from: classes2.dex */
public final class k extends m {

    /* renamed from: q, reason: collision with root package name */
    public static final j f30196q = new j(0);

    /* renamed from: l, reason: collision with root package name */
    public final n f30197l;

    /* renamed from: m, reason: collision with root package name */
    public final p4.l f30198m;

    /* renamed from: n, reason: collision with root package name */
    public final p4.k f30199n;

    /* renamed from: o, reason: collision with root package name */
    public float f30200o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f30201p;

    public k(Context context, e eVar, n nVar) {
        super(context, eVar);
        this.f30201p = false;
        this.f30197l = nVar;
        nVar.f30216b = this;
        p4.l lVar = new p4.l();
        this.f30198m = lVar;
        lVar.a();
        lVar.b(50.0f);
        p4.k kVar = new p4.k(this, f30196q);
        this.f30199n = kVar;
        kVar.f30660t = lVar;
        if (this.f30212h != 1.0f) {
            this.f30212h = 1.0f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            n nVar = this.f30197l;
            Rect bounds = getBounds();
            float b10 = b();
            nVar.f30215a.a();
            nVar.a(canvas, bounds, b10);
            n nVar2 = this.f30197l;
            Paint paint = this.f30213i;
            nVar2.c(canvas, paint);
            this.f30197l.b(canvas, paint, s0.g.f34069a, this.f30200o, pn.e.c(this.f30206b.f30169c[0], this.f30214j));
            canvas.restore();
        }
    }

    @Override // oo.m
    public final boolean f(boolean z10, boolean z11, boolean z12) {
        boolean f10 = super.f(z10, z11, z12);
        a aVar = this.f30207c;
        ContentResolver contentResolver = this.f30205a.getContentResolver();
        aVar.getClass();
        float f11 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f11 == s0.g.f34069a) {
            this.f30201p = true;
        } else {
            this.f30201p = false;
            this.f30198m.b(50.0f / f11);
        }
        return f10;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f30197l.d();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f30197l.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f30199n.g();
        this.f30200o = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        boolean z10 = this.f30201p;
        p4.k kVar = this.f30199n;
        if (z10) {
            kVar.g();
            this.f30200o = i10 / 10000.0f;
            invalidateSelf();
        } else {
            kVar.f30646b = this.f30200o * 10000.0f;
            kVar.f30647c = true;
            kVar.f(i10);
        }
        return true;
    }
}
