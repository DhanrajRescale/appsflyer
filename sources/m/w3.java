package m;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class w3 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final Toolbar f25780a;

    /* renamed from: b, reason: collision with root package name */
    public int f25781b;

    /* renamed from: c, reason: collision with root package name */
    public final View f25782c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f25783d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f25784e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f25785f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f25786g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f25787h;

    /* renamed from: i, reason: collision with root package name */
    public final CharSequence f25788i;

    /* renamed from: j, reason: collision with root package name */
    public final CharSequence f25789j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f25790k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f25791l;

    /* renamed from: m, reason: collision with root package name */
    public n f25792m;

    /* renamed from: n, reason: collision with root package name */
    public final int f25793n;

    /* renamed from: o, reason: collision with root package name */
    public final Drawable f25794o;

    public w3(Toolbar toolbar, boolean z10) {
        boolean z11;
        Drawable drawable;
        this.f25793n = 0;
        this.f25780a = toolbar;
        this.f25787h = toolbar.getTitle();
        this.f25788i = toolbar.getSubtitle();
        if (this.f25787h != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f25786g = z11;
        this.f25785f = toolbar.getNavigationIcon();
        h.c N = h.c.N(toolbar.getContext(), null, g.a.f16349a, R.attr.actionBarStyle);
        int i10 = 15;
        this.f25794o = N.v(15);
        if (z10) {
            CharSequence F = N.F(27);
            if (!TextUtils.isEmpty(F)) {
                this.f25786g = true;
                this.f25787h = F;
                if ((this.f25781b & 8) != 0) {
                    Toolbar toolbar2 = this.f25780a;
                    toolbar2.setTitle(F);
                    if (this.f25786g) {
                        d4.n1.o(toolbar2.getRootView(), F);
                    }
                }
            }
            CharSequence F2 = N.F(25);
            if (!TextUtils.isEmpty(F2)) {
                this.f25788i = F2;
                if ((this.f25781b & 8) != 0) {
                    toolbar.setSubtitle(F2);
                }
            }
            Drawable v10 = N.v(20);
            if (v10 != null) {
                this.f25784e = v10;
                c();
            }
            Drawable v11 = N.v(17);
            if (v11 != null) {
                this.f25783d = v11;
                c();
            }
            if (this.f25785f == null && (drawable = this.f25794o) != null) {
                this.f25785f = drawable;
                int i11 = this.f25781b & 4;
                Toolbar toolbar3 = this.f25780a;
                if (i11 != 0) {
                    toolbar3.setNavigationIcon(drawable);
                } else {
                    toolbar3.setNavigationIcon((Drawable) null);
                }
            }
            a(N.z(10, 0));
            int C = N.C(9, 0);
            if (C != 0) {
                View inflate = LayoutInflater.from(toolbar.getContext()).inflate(C, (ViewGroup) toolbar, false);
                View view = this.f25782c;
                if (view != null && (this.f25781b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f25782c = inflate;
                if (inflate != null && (this.f25781b & 16) != 0) {
                    toolbar.addView(inflate);
                }
                a(this.f25781b | 16);
            }
            int layoutDimension = ((TypedArray) N.f17584c).getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int t10 = N.t(7, -1);
            int t11 = N.t(3, -1);
            if (t10 >= 0 || t11 >= 0) {
                int max = Math.max(t10, 0);
                int max2 = Math.max(t11, 0);
                toolbar.d();
                toolbar.f1135t.a(max, max2);
            }
            int C2 = N.C(28, 0);
            if (C2 != 0) {
                Context context = toolbar.getContext();
                toolbar.f1125l = C2;
                AppCompatTextView appCompatTextView = toolbar.f1108b;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextAppearance(context, C2);
                }
            }
            int C3 = N.C(26, 0);
            if (C3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.f1127m = C3;
                AppCompatTextView appCompatTextView2 = toolbar.f1109c;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTextAppearance(context2, C3);
                }
            }
            int C4 = N.C(22, 0);
            if (C4 != 0) {
                toolbar.setPopupTheme(C4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f25794o = toolbar.getNavigationIcon();
            } else {
                i10 = 11;
            }
            this.f25781b = i10;
        }
        N.R();
        if (R.string.abc_action_bar_up_description != this.f25793n) {
            this.f25793n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i12 = this.f25793n;
                this.f25789j = i12 != 0 ? toolbar.getContext().getString(i12) : null;
                b();
            }
        }
        this.f25789j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new c(this));
    }

    public final void a(int i10) {
        View view;
        int i11 = this.f25781b ^ i10;
        this.f25781b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                int i12 = this.f25781b & 4;
                Toolbar toolbar = this.f25780a;
                if (i12 != 0) {
                    Drawable drawable = this.f25785f;
                    if (drawable == null) {
                        drawable = this.f25794o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i11 & 3) != 0) {
                c();
            }
            int i13 = i11 & 8;
            Toolbar toolbar2 = this.f25780a;
            if (i13 != 0) {
                if ((i10 & 8) != 0) {
                    toolbar2.setTitle(this.f25787h);
                    toolbar2.setSubtitle(this.f25788i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f25782c) != null) {
                if ((i10 & 16) != 0) {
                    toolbar2.addView(view);
                } else {
                    toolbar2.removeView(view);
                }
            }
        }
    }

    public final void b() {
        if ((this.f25781b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f25789j);
            Toolbar toolbar = this.f25780a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f25793n);
            } else {
                toolbar.setNavigationContentDescription(this.f25789j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f25781b;
        if ((i10 & 2) != 0) {
            if ((i10 & 1) != 0) {
                drawable = this.f25784e;
                if (drawable == null) {
                    drawable = this.f25783d;
                }
            } else {
                drawable = this.f25783d;
            }
        } else {
            drawable = null;
        }
        this.f25780a.setLogo(drawable);
    }
}
