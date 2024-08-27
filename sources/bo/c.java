package bo;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.button.MaterialButton;
import d4.n1;
import d4.w0;
import java.util.WeakHashMap;
import pn.e;
import to.h;
import to.l;
import to.w;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f7209a;

    /* renamed from: b, reason: collision with root package name */
    public l f7210b;

    /* renamed from: c, reason: collision with root package name */
    public int f7211c;

    /* renamed from: d, reason: collision with root package name */
    public int f7212d;

    /* renamed from: e, reason: collision with root package name */
    public int f7213e;

    /* renamed from: f, reason: collision with root package name */
    public int f7214f;

    /* renamed from: g, reason: collision with root package name */
    public int f7215g;

    /* renamed from: h, reason: collision with root package name */
    public int f7216h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f7217i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f7218j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f7219k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f7220l;

    /* renamed from: m, reason: collision with root package name */
    public h f7221m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7225q;

    /* renamed from: s, reason: collision with root package name */
    public RippleDrawable f7227s;

    /* renamed from: t, reason: collision with root package name */
    public int f7228t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7222n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7223o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7224p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7226r = true;

    public c(MaterialButton materialButton, l lVar) {
        this.f7209a = materialButton;
        this.f7210b = lVar;
    }

    public final w a() {
        RippleDrawable rippleDrawable = this.f7227s;
        if (rippleDrawable != null && rippleDrawable.getNumberOfLayers() > 1) {
            if (this.f7227s.getNumberOfLayers() > 2) {
                return (w) this.f7227s.getDrawable(2);
            }
            return (w) this.f7227s.getDrawable(1);
        }
        return null;
    }

    public final h b(boolean z10) {
        RippleDrawable rippleDrawable = this.f7227s;
        if (rippleDrawable != null && rippleDrawable.getNumberOfLayers() > 0) {
            return (h) ((LayerDrawable) ((InsetDrawable) this.f7227s.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0);
        }
        return null;
    }

    public final void c(l lVar) {
        this.f7210b = lVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(lVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(lVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(lVar);
        }
    }

    public final void d(int i10, int i11) {
        WeakHashMap weakHashMap = n1.f13788a;
        MaterialButton materialButton = this.f7209a;
        int f10 = w0.f(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int e10 = w0.e(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        int i12 = this.f7213e;
        int i13 = this.f7214f;
        this.f7214f = i11;
        this.f7213e = i10;
        if (!this.f7223o) {
            e();
        }
        w0.k(materialButton, f10, (paddingTop + i10) - i12, e10, (paddingBottom + i11) - i13);
    }

    public final void e() {
        int i10;
        h hVar = new h(this.f7210b);
        MaterialButton materialButton = this.f7209a;
        hVar.k(materialButton.getContext());
        v3.b.h(hVar, this.f7218j);
        PorterDuff.Mode mode = this.f7217i;
        if (mode != null) {
            v3.b.i(hVar, mode);
        }
        float f10 = this.f7216h;
        ColorStateList colorStateList = this.f7219k;
        hVar.f36253a.f36241k = f10;
        hVar.invalidateSelf();
        hVar.r(colorStateList);
        h hVar2 = new h(this.f7210b);
        hVar2.setTint(0);
        float f11 = this.f7216h;
        if (this.f7222n) {
            i10 = e.k(materialButton, R.attr.colorSurface);
        } else {
            i10 = 0;
        }
        hVar2.f36253a.f36241k = f11;
        hVar2.invalidateSelf();
        hVar2.r(ColorStateList.valueOf(i10));
        h hVar3 = new h(this.f7210b);
        this.f7221m = hVar3;
        v3.b.g(hVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(ro.a.c(this.f7220l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{hVar2, hVar}), this.f7211c, this.f7213e, this.f7212d, this.f7214f), this.f7221m);
        this.f7227s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        h b10 = b(false);
        if (b10 != null) {
            b10.m(this.f7228t);
            b10.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        int i10 = 0;
        h b10 = b(false);
        h b11 = b(true);
        if (b10 != null) {
            float f10 = this.f7216h;
            ColorStateList colorStateList = this.f7219k;
            b10.f36253a.f36241k = f10;
            b10.invalidateSelf();
            b10.r(colorStateList);
            if (b11 != null) {
                float f11 = this.f7216h;
                if (this.f7222n) {
                    i10 = e.k(this.f7209a, R.attr.colorSurface);
                }
                b11.f36253a.f36241k = f11;
                b11.invalidateSelf();
                b11.r(ColorStateList.valueOf(i10));
            }
        }
    }
}
