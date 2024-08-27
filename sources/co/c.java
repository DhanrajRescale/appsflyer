package co;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.card.MaterialCardView;
import d4.n1;
import d4.w0;
import d7.e;
import in.i;
import java.util.WeakHashMap;
import s0.g;
import to.d;
import to.h;
import to.k;
import to.l;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: y, reason: collision with root package name */
    public static final double f8289y = Math.cos(Math.toRadians(45.0d));

    /* renamed from: z, reason: collision with root package name */
    public static final ColorDrawable f8290z;

    /* renamed from: a, reason: collision with root package name */
    public final MaterialCardView f8291a;

    /* renamed from: c, reason: collision with root package name */
    public final h f8293c;

    /* renamed from: d, reason: collision with root package name */
    public final h f8294d;

    /* renamed from: e, reason: collision with root package name */
    public int f8295e;

    /* renamed from: f, reason: collision with root package name */
    public int f8296f;

    /* renamed from: g, reason: collision with root package name */
    public int f8297g;

    /* renamed from: h, reason: collision with root package name */
    public int f8298h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f8299i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f8300j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f8301k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f8302l;

    /* renamed from: m, reason: collision with root package name */
    public l f8303m;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f8304n;

    /* renamed from: o, reason: collision with root package name */
    public RippleDrawable f8305o;

    /* renamed from: p, reason: collision with root package name */
    public LayerDrawable f8306p;

    /* renamed from: q, reason: collision with root package name */
    public h f8307q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f8309s;

    /* renamed from: t, reason: collision with root package name */
    public ValueAnimator f8310t;

    /* renamed from: u, reason: collision with root package name */
    public final TimeInterpolator f8311u;

    /* renamed from: v, reason: collision with root package name */
    public final int f8312v;

    /* renamed from: w, reason: collision with root package name */
    public final int f8313w;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f8292b = new Rect();

    /* renamed from: r, reason: collision with root package name */
    public boolean f8308r = false;

    /* renamed from: x, reason: collision with root package name */
    public float f8314x = g.f34069a;

    static {
        ColorDrawable colorDrawable;
        if (Build.VERSION.SDK_INT <= 28) {
            colorDrawable = new ColorDrawable();
        } else {
            colorDrawable = null;
        }
        f8290z = colorDrawable;
    }

    public c(MaterialCardView materialCardView, AttributeSet attributeSet) {
        this.f8291a = materialCardView;
        h hVar = new h(materialCardView.getContext(), attributeSet, R.attr.materialCardViewStyle, 2132083898);
        this.f8293c = hVar;
        hVar.k(materialCardView.getContext());
        hVar.p();
        i f10 = hVar.f36253a.f36231a.f();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, un.a.f37296g, R.attr.materialCardViewStyle, R.style.CardView);
        if (obtainStyledAttributes.hasValue(3)) {
            f10.c(obtainStyledAttributes.getDimension(3, g.f34069a));
        }
        this.f8294d = new h();
        h(f10.a());
        this.f8311u = dp.b.F1(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, vn.a.f38180a);
        this.f8312v = dp.b.E1(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.f8313w = dp.b.E1(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        obtainStyledAttributes.recycle();
    }

    public static float b(vl.b bVar, float f10) {
        if (bVar instanceof k) {
            return (float) ((1.0d - f8289y) * f10);
        }
        if (bVar instanceof d) {
            return f10 / 2.0f;
        }
        return g.f34069a;
    }

    public final float a() {
        vl.b bVar = this.f8303m.f36279a;
        h hVar = this.f8293c;
        return Math.max(Math.max(b(bVar, hVar.i()), b(this.f8303m.f36280b, hVar.f36253a.f36231a.f36284f.a(hVar.h()))), Math.max(b(this.f8303m.f36281c, hVar.f36253a.f36231a.f36285g.a(hVar.h())), b(this.f8303m.f36282d, hVar.f36253a.f36231a.f36286h.a(hVar.h()))));
    }

    public final LayerDrawable c() {
        if (this.f8305o == null) {
            int[] iArr = ro.a.f33965a;
            this.f8307q = new h(this.f8303m);
            this.f8305o = new RippleDrawable(this.f8301k, null, this.f8307q);
        }
        if (this.f8306p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f8305o, this.f8294d, this.f8300j});
            this.f8306p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f8306p;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.graphics.drawable.InsetDrawable, co.b] */
    public final b d(Drawable drawable) {
        int i10;
        int i11;
        float f10;
        MaterialCardView materialCardView = this.f8291a;
        if (materialCardView.getUseCompatPadding()) {
            float maxCardElevation = materialCardView.getMaxCardElevation() * 1.5f;
            boolean i12 = i();
            float f11 = g.f34069a;
            if (i12) {
                f10 = a();
            } else {
                f10 = 0.0f;
            }
            int ceil = (int) Math.ceil(maxCardElevation + f10);
            float maxCardElevation2 = materialCardView.getMaxCardElevation();
            if (i()) {
                f11 = a();
            }
            i10 = (int) Math.ceil(maxCardElevation2 + f11);
            i11 = ceil;
        } else {
            i10 = 0;
            i11 = 0;
        }
        return new InsetDrawable(drawable, i10, i11, i10, i11);
    }

    public final void e(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        float f10;
        if (this.f8306p != null) {
            MaterialCardView materialCardView = this.f8291a;
            if (materialCardView.getUseCompatPadding()) {
                float maxCardElevation = materialCardView.getMaxCardElevation() * 1.5f;
                boolean i20 = i();
                float f11 = g.f34069a;
                if (i20) {
                    f10 = a();
                } else {
                    f10 = 0.0f;
                }
                i12 = (int) Math.ceil((maxCardElevation + f10) * 2.0f);
                float maxCardElevation2 = materialCardView.getMaxCardElevation();
                if (i()) {
                    f11 = a();
                }
                i13 = (int) Math.ceil((maxCardElevation2 + f11) * 2.0f);
            } else {
                i12 = 0;
                i13 = 0;
            }
            int i21 = this.f8297g;
            if ((i21 & 8388613) == 8388613) {
                i14 = ((i10 - this.f8295e) - this.f8296f) - i13;
            } else {
                i14 = this.f8295e;
            }
            if ((i21 & 80) == 80) {
                i15 = this.f8295e;
            } else {
                i15 = ((i11 - this.f8295e) - this.f8296f) - i12;
            }
            int i22 = i15;
            if ((i21 & 8388613) == 8388613) {
                i16 = this.f8295e;
            } else {
                i16 = ((i10 - this.f8295e) - this.f8296f) - i13;
            }
            if ((i21 & 80) == 80) {
                i17 = ((i11 - this.f8295e) - this.f8296f) - i12;
            } else {
                i17 = this.f8295e;
            }
            WeakHashMap weakHashMap = n1.f13788a;
            if (w0.d(materialCardView) == 1) {
                i19 = i16;
                i18 = i14;
            } else {
                i18 = i16;
                i19 = i14;
            }
            this.f8306p.setLayerInset(2, i19, i17, i18, i22);
        }
    }

    public final void f(boolean z10, boolean z11) {
        float f10;
        int i10;
        Drawable drawable = this.f8300j;
        if (drawable != null) {
            int i11 = 0;
            float f11 = g.f34069a;
            if (z11) {
                if (z10) {
                    f11 = 1.0f;
                }
                if (z10) {
                    f10 = 1.0f - this.f8314x;
                } else {
                    f10 = this.f8314x;
                }
                ValueAnimator valueAnimator = this.f8310t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.f8310t = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f8314x, f11);
                this.f8310t = ofFloat;
                ofFloat.addUpdateListener(new e(this, 1));
                this.f8310t.setInterpolator(this.f8311u);
                ValueAnimator valueAnimator2 = this.f8310t;
                if (z10) {
                    i10 = this.f8312v;
                } else {
                    i10 = this.f8313w;
                }
                valueAnimator2.setDuration(i10 * f10);
                this.f8310t.start();
                return;
            }
            if (z10) {
                i11 = 255;
            }
            drawable.setAlpha(i11);
            if (z10) {
                f11 = 1.0f;
            }
            this.f8314x = f11;
        }
    }

    public final void g(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f8300j = mutate;
            v3.b.h(mutate, this.f8302l);
            f(this.f8291a.isChecked(), false);
        } else {
            this.f8300j = f8290z;
        }
        LayerDrawable layerDrawable = this.f8306p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.f8300j);
        }
    }

    public final void h(l lVar) {
        this.f8303m = lVar;
        h hVar = this.f8293c;
        hVar.setShapeAppearanceModel(lVar);
        hVar.f36274v = !hVar.l();
        h hVar2 = this.f8294d;
        if (hVar2 != null) {
            hVar2.setShapeAppearanceModel(lVar);
        }
        h hVar3 = this.f8307q;
        if (hVar3 != null) {
            hVar3.setShapeAppearanceModel(lVar);
        }
    }

    public final boolean i() {
        MaterialCardView materialCardView = this.f8291a;
        if (materialCardView.getPreventCornerOverlap() && this.f8293c.l() && materialCardView.getUseCompatPadding()) {
            return true;
        }
        return false;
    }

    public final void j() {
        boolean z10;
        float a10;
        MaterialCardView materialCardView = this.f8291a;
        if (materialCardView.getPreventCornerOverlap() && !this.f8293c.l()) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = g.f34069a;
        if (!z10 && !i()) {
            a10 = 0.0f;
        } else {
            a10 = a();
        }
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            f10 = (float) ((1.0d - f8289y) * materialCardView.getCardViewRadius());
        }
        int i10 = (int) (a10 - f10);
        Rect rect = this.f8292b;
        materialCardView.f1155c.set(rect.left + i10, rect.top + i10, rect.right + i10, rect.bottom + i10);
        tr.e eVar = materialCardView.f1157e;
        if (!((CardView) eVar.f36362c).getUseCompatPadding()) {
            eVar.C(0, 0, 0, 0);
            return;
        }
        s.a aVar = (s.a) ((Drawable) eVar.f36361b);
        float f11 = aVar.f34012e;
        float f12 = aVar.f34008a;
        int ceil = (int) Math.ceil(s.b.a(f11, f12, eVar.w()));
        int ceil2 = (int) Math.ceil(s.b.b(f11, f12, eVar.w()));
        eVar.C(ceil, ceil2, ceil, ceil2);
    }

    public final void k() {
        boolean z10 = this.f8308r;
        MaterialCardView materialCardView = this.f8291a;
        if (!z10) {
            materialCardView.setBackgroundInternal(d(this.f8293c));
        }
        materialCardView.setForeground(d(this.f8299i));
    }
}
