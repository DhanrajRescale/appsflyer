package xn;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.assetgro.stockgro.prod.R;
import d4.n1;
import d4.w0;
import in.i;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;
import mo.c0;
import mo.y;
import mo.z;
import okhttp3.HttpUrl;
import qo.d;
import to.h;
import to.l;

/* loaded from: classes2.dex */
public final class a extends Drawable implements y {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f40489a;

    /* renamed from: b, reason: collision with root package name */
    public final h f40490b;

    /* renamed from: c, reason: collision with root package name */
    public final z f40491c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f40492d;

    /* renamed from: e, reason: collision with root package name */
    public final c f40493e;

    /* renamed from: f, reason: collision with root package name */
    public float f40494f;

    /* renamed from: g, reason: collision with root package name */
    public float f40495g;

    /* renamed from: h, reason: collision with root package name */
    public final int f40496h;

    /* renamed from: i, reason: collision with root package name */
    public float f40497i;

    /* renamed from: j, reason: collision with root package name */
    public float f40498j;

    /* renamed from: k, reason: collision with root package name */
    public float f40499k;

    /* renamed from: l, reason: collision with root package name */
    public WeakReference f40500l;

    /* renamed from: m, reason: collision with root package name */
    public WeakReference f40501m;

    public a(Context context, b bVar) {
        int intValue;
        int intValue2;
        FrameLayout frameLayout;
        d dVar;
        WeakReference weakReference = new WeakReference(context);
        this.f40489a = weakReference;
        c0.c(context, c0.f27904b, "Theme.MaterialComponents");
        this.f40492d = new Rect();
        z zVar = new z(this);
        this.f40491c = zVar;
        TextPaint textPaint = zVar.f27974a;
        textPaint.setTextAlign(Paint.Align.CENTER);
        c cVar = new c(context, bVar);
        this.f40493e = cVar;
        boolean a10 = cVar.a();
        b bVar2 = cVar.f40526b;
        if (a10) {
            intValue = bVar2.f40508g.intValue();
        } else {
            intValue = bVar2.f40506e.intValue();
        }
        if (cVar.a()) {
            intValue2 = bVar2.f40509h.intValue();
        } else {
            intValue2 = bVar2.f40507f.intValue();
        }
        h hVar = new h(l.a(context, intValue, intValue2).a());
        this.f40490b = hVar;
        e();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && zVar.f27979f != (dVar = new d(context2, bVar2.f40505d.intValue()))) {
            zVar.b(dVar, context2);
            textPaint.setColor(bVar2.f40504c.intValue());
            invalidateSelf();
            g();
            invalidateSelf();
        }
        this.f40496h = ((int) Math.pow(10.0d, bVar2.f40512k - 1.0d)) - 1;
        zVar.f27977d = true;
        g();
        invalidateSelf();
        zVar.f27977d = true;
        e();
        g();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(bVar2.f40503b.intValue());
        if (hVar.f36253a.f36233c != valueOf) {
            hVar.n(valueOf);
            invalidateSelf();
        }
        textPaint.setColor(bVar2.f40504c.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.f40500l;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.f40500l.get();
            WeakReference weakReference3 = this.f40501m;
            if (weakReference3 != null) {
                frameLayout = (FrameLayout) weakReference3.get();
            } else {
                frameLayout = null;
            }
            f(view, frameLayout);
        }
        g();
        setVisible(bVar2.f40518q.booleanValue(), false);
    }

    @Override // mo.y
    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        int d10 = d();
        int i10 = this.f40496h;
        c cVar = this.f40493e;
        if (d10 <= i10) {
            return NumberFormat.getInstance(cVar.f40526b.f40513l).format(d());
        }
        Context context = (Context) this.f40489a.get();
        if (context == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return String.format(cVar.f40526b.f40513l, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f40496h), "+");
    }

    public final CharSequence c() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        c cVar = this.f40493e;
        boolean a10 = cVar.a();
        b bVar = cVar.f40526b;
        if (a10) {
            if (bVar.f40515n == 0 || (context = (Context) this.f40489a.get()) == null) {
                return null;
            }
            int d10 = d();
            int i10 = this.f40496h;
            if (d10 <= i10) {
                return context.getResources().getQuantityString(bVar.f40515n, d(), Integer.valueOf(d()));
            }
            return context.getString(bVar.f40516o, Integer.valueOf(i10));
        }
        return bVar.f40514m;
    }

    public final int d() {
        c cVar = this.f40493e;
        if (cVar.a()) {
            return cVar.f40526b.f40511j;
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f40490b.draw(canvas);
            if (this.f40493e.a()) {
                Rect rect = new Rect();
                String b10 = b();
                z zVar = this.f40491c;
                zVar.f27974a.getTextBounds(b10, 0, b10.length(), rect);
                canvas.drawText(b10, this.f40494f, this.f40495g + (rect.height() / 2), zVar.f27974a);
            }
        }
    }

    public final void e() {
        int intValue;
        int intValue2;
        Context context = (Context) this.f40489a.get();
        if (context == null) {
            return;
        }
        c cVar = this.f40493e;
        boolean a10 = cVar.a();
        b bVar = cVar.f40526b;
        if (a10) {
            intValue = bVar.f40508g.intValue();
        } else {
            intValue = bVar.f40506e.intValue();
        }
        if (cVar.a()) {
            intValue2 = bVar.f40509h.intValue();
        } else {
            intValue2 = bVar.f40507f.intValue();
        }
        this.f40490b.setShapeAppearanceModel(l.a(context, intValue, intValue2).a());
        invalidateSelf();
    }

    public final void f(View view, FrameLayout frameLayout) {
        this.f40500l = new WeakReference(view);
        this.f40501m = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        g();
        invalidateSelf();
    }

    public final void g() {
        View view;
        float f10;
        float f11;
        float f12;
        int intValue;
        int intValue2;
        float f13;
        float f14;
        int i10;
        Context context = (Context) this.f40489a.get();
        WeakReference weakReference = this.f40500l;
        ViewGroup viewGroup = null;
        if (weakReference != null) {
            view = (View) weakReference.get();
        } else {
            view = null;
        }
        if (context != null && view != null) {
            Rect rect = new Rect();
            Rect rect2 = this.f40492d;
            rect.set(rect2);
            Rect rect3 = new Rect();
            view.getDrawingRect(rect3);
            WeakReference weakReference2 = this.f40501m;
            if (weakReference2 != null) {
                viewGroup = (ViewGroup) weakReference2.get();
            }
            if (viewGroup != null) {
                viewGroup.offsetDescendantRectToMyCoords(view, rect3);
            }
            c cVar = this.f40493e;
            if (!cVar.a()) {
                f10 = cVar.f40527c;
            } else {
                f10 = cVar.f40528d;
            }
            this.f40497i = f10;
            if (f10 != -1.0f) {
                this.f40499k = f10;
                this.f40498j = f10;
            } else {
                if (!cVar.a()) {
                    f11 = cVar.f40530f;
                } else {
                    f11 = cVar.f40532h;
                }
                this.f40499k = Math.round(f11 / 2.0f);
                if (!cVar.a()) {
                    f12 = cVar.f40529e;
                } else {
                    f12 = cVar.f40531g;
                }
                this.f40498j = Math.round(f12 / 2.0f);
            }
            if (d() > 9) {
                this.f40498j = Math.max(this.f40498j, (this.f40491c.a(b()) / 2.0f) + cVar.f40533i);
            }
            boolean a10 = cVar.a();
            b bVar = cVar.f40526b;
            if (a10) {
                intValue = bVar.f40522u.intValue();
            } else {
                intValue = bVar.f40520s.intValue();
            }
            int i11 = cVar.f40536l;
            if (i11 == 0) {
                intValue -= Math.round(this.f40499k);
            }
            int intValue3 = bVar.f40524w.intValue() + intValue;
            int intValue4 = bVar.f40517p.intValue();
            if (intValue4 != 8388691 && intValue4 != 8388693) {
                this.f40495g = rect3.top + intValue3;
            } else {
                this.f40495g = rect3.bottom - intValue3;
            }
            if (cVar.a()) {
                intValue2 = bVar.f40521t.intValue();
            } else {
                intValue2 = bVar.f40519r.intValue();
            }
            if (i11 == 1) {
                if (cVar.a()) {
                    i10 = cVar.f40535k;
                } else {
                    i10 = cVar.f40534j;
                }
                intValue2 += i10;
            }
            int intValue5 = bVar.f40523v.intValue() + intValue2;
            int intValue6 = bVar.f40517p.intValue();
            if (intValue6 != 8388659 && intValue6 != 8388691) {
                WeakHashMap weakHashMap = n1.f13788a;
                if (w0.d(view) == 0) {
                    f14 = (rect3.right + this.f40498j) - intValue5;
                } else {
                    f14 = (rect3.left - this.f40498j) + intValue5;
                }
                this.f40494f = f14;
            } else {
                WeakHashMap weakHashMap2 = n1.f13788a;
                if (w0.d(view) == 0) {
                    f13 = (rect3.left - this.f40498j) + intValue5;
                } else {
                    f13 = (rect3.right + this.f40498j) - intValue5;
                }
                this.f40494f = f13;
            }
            float f15 = this.f40494f;
            float f16 = this.f40495g;
            float f17 = this.f40498j;
            float f18 = this.f40499k;
            rect2.set((int) (f15 - f17), (int) (f16 - f18), (int) (f15 + f17), (int) (f16 + f18));
            float f19 = this.f40497i;
            h hVar = this.f40490b;
            if (f19 != -1.0f) {
                i f20 = hVar.f36253a.f36231a.f();
                f20.c(f19);
                hVar.setShapeAppearanceModel(f20.a());
            }
            if (!rect.equals(rect2)) {
                hVar.setBounds(rect2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f40493e.f40526b.f40510i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f40492d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f40492d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, mo.y
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        c cVar = this.f40493e;
        cVar.f40525a.f40510i = i10;
        cVar.f40526b.f40510i = i10;
        this.f40491c.f27974a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
