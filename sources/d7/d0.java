package d7;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.assetgro.stockgro.prod.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d0 {
    public boolean A;
    public boolean B;

    /* renamed from: a, reason: collision with root package name */
    public final x f13978a;

    /* renamed from: b, reason: collision with root package name */
    public final View f13979b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f13980c;

    /* renamed from: d, reason: collision with root package name */
    public final ViewGroup f13981d;

    /* renamed from: e, reason: collision with root package name */
    public final ViewGroup f13982e;

    /* renamed from: f, reason: collision with root package name */
    public final ViewGroup f13983f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewGroup f13984g;

    /* renamed from: h, reason: collision with root package name */
    public final ViewGroup f13985h;

    /* renamed from: i, reason: collision with root package name */
    public final ViewGroup f13986i;

    /* renamed from: j, reason: collision with root package name */
    public final View f13987j;

    /* renamed from: k, reason: collision with root package name */
    public final View f13988k;

    /* renamed from: l, reason: collision with root package name */
    public final AnimatorSet f13989l;

    /* renamed from: m, reason: collision with root package name */
    public final AnimatorSet f13990m;

    /* renamed from: n, reason: collision with root package name */
    public final AnimatorSet f13991n;

    /* renamed from: o, reason: collision with root package name */
    public final AnimatorSet f13992o;

    /* renamed from: p, reason: collision with root package name */
    public final AnimatorSet f13993p;

    /* renamed from: q, reason: collision with root package name */
    public final ValueAnimator f13994q;

    /* renamed from: r, reason: collision with root package name */
    public final ValueAnimator f13995r;

    /* renamed from: s, reason: collision with root package name */
    public final y f13996s = new y(this, 0);

    /* renamed from: t, reason: collision with root package name */
    public final y f13997t = new y(this, 1);

    /* renamed from: u, reason: collision with root package name */
    public final y f13998u = new y(this, 2);

    /* renamed from: v, reason: collision with root package name */
    public final y f13999v = new y(this, 3);

    /* renamed from: w, reason: collision with root package name */
    public final y f14000w = new y(this, 4);

    /* renamed from: x, reason: collision with root package name */
    public final i f14001x = new i(this, 1);
    public boolean C = true;

    /* renamed from: z, reason: collision with root package name */
    public int f14003z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f14002y = new ArrayList();

    public d0(x xVar) {
        this.f13978a = xVar;
        final int i10 = 0;
        final int i11 = 1;
        final int i12 = 2;
        final int i13 = 3;
        this.f13979b = xVar.findViewById(R.id.exo_controls_background);
        this.f13980c = (ViewGroup) xVar.findViewById(R.id.exo_center_controls);
        this.f13982e = (ViewGroup) xVar.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) xVar.findViewById(R.id.exo_bottom_bar);
        this.f13981d = viewGroup;
        this.f13986i = (ViewGroup) xVar.findViewById(R.id.exo_time);
        View findViewById = xVar.findViewById(R.id.exo_progress);
        this.f13987j = findViewById;
        this.f13983f = (ViewGroup) xVar.findViewById(R.id.exo_basic_controls);
        this.f13984g = (ViewGroup) xVar.findViewById(R.id.exo_extra_controls);
        this.f13985h = (ViewGroup) xVar.findViewById(R.id.exo_extra_controls_scroll_view);
        View findViewById2 = xVar.findViewById(R.id.exo_overflow_show);
        this.f13988k = findViewById2;
        View findViewById3 = xVar.findViewById(R.id.exo_overflow_hide);
        if (findViewById2 != null && findViewById3 != null) {
            findViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: d7.a0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d0 f13957b;

                {
                    this.f13957b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i14 = i10;
                    d0.a(this.f13957b, view);
                }
            });
            findViewById3.setOnClickListener(new View.OnClickListener(this) { // from class: d7.a0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d0 f13957b;

                {
                    this.f13957b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i14 = i11;
                    d0.a(this.f13957b, view);
                }
            });
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, s0.g.f34069a);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: d7.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f14180b;

            {
                this.f14180b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i14 = i12;
                d0 d0Var = this.f14180b;
                switch (i14) {
                    case 0:
                        d0Var.getClass();
                        d0Var.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    case 1:
                        d0Var.getClass();
                        d0Var.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    case 2:
                        d0Var.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = d0Var.f13979b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = d0Var.f13980c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = d0Var.f13982e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            return;
                        }
                        return;
                    default:
                        d0Var.getClass();
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = d0Var.f13979b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = d0Var.f13980c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = d0Var.f13982e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            return;
                        }
                        return;
                }
            }
        });
        ofFloat.addListener(new b0(this, i10));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(s0.g.f34069a, 1.0f);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: d7.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f14180b;

            {
                this.f14180b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i14 = i13;
                d0 d0Var = this.f14180b;
                switch (i14) {
                    case 0:
                        d0Var.getClass();
                        d0Var.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    case 1:
                        d0Var.getClass();
                        d0Var.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    case 2:
                        d0Var.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = d0Var.f13979b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = d0Var.f13980c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = d0Var.f13982e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            return;
                        }
                        return;
                    default:
                        d0Var.getClass();
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = d0Var.f13979b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = d0Var.f13980c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = d0Var.f13982e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            return;
                        }
                        return;
                }
            }
        });
        ofFloat2.addListener(new b0(this, i11));
        Resources resources = xVar.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f13989l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new c0(this, xVar, i10));
        animatorSet.play(ofFloat).with(e(findViewById, s0.g.f34069a, dimension)).with(e(viewGroup, s0.g.f34069a, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f13990m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new c0(this, xVar, i11));
        animatorSet2.play(e(findViewById, dimension, dimension2)).with(e(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f13991n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new c0(this, xVar, i12));
        animatorSet3.play(ofFloat).with(e(findViewById, s0.g.f34069a, dimension2)).with(e(viewGroup, s0.g.f34069a, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f13992o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new b0(this, i12));
        animatorSet4.play(ofFloat2).with(e(findViewById, dimension, s0.g.f34069a)).with(e(viewGroup, dimension, s0.g.f34069a));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f13993p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new b0(this, i13));
        animatorSet5.play(ofFloat2).with(e(findViewById, dimension2, s0.g.f34069a)).with(e(viewGroup, dimension2, s0.g.f34069a));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(s0.g.f34069a, 1.0f);
        this.f13994q = ofFloat3;
        ofFloat3.setDuration(250L);
        final int i14 = 0;
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: d7.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f14180b;

            {
                this.f14180b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i142 = i14;
                d0 d0Var = this.f14180b;
                switch (i142) {
                    case 0:
                        d0Var.getClass();
                        d0Var.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    case 1:
                        d0Var.getClass();
                        d0Var.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    case 2:
                        d0Var.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = d0Var.f13979b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = d0Var.f13980c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = d0Var.f13982e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            return;
                        }
                        return;
                    default:
                        d0Var.getClass();
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = d0Var.f13979b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = d0Var.f13980c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = d0Var.f13982e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            return;
                        }
                        return;
                }
            }
        });
        ofFloat3.addListener(new b0(this, 4));
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, s0.g.f34069a);
        this.f13995r = ofFloat4;
        ofFloat4.setDuration(250L);
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: d7.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f14180b;

            {
                this.f14180b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i142 = i11;
                d0 d0Var = this.f14180b;
                switch (i142) {
                    case 0:
                        d0Var.getClass();
                        d0Var.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    case 1:
                        d0Var.getClass();
                        d0Var.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    case 2:
                        d0Var.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = d0Var.f13979b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = d0Var.f13980c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = d0Var.f13982e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            return;
                        }
                        return;
                    default:
                        d0Var.getClass();
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = d0Var.f13979b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = d0Var.f13980c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = d0Var.f13982e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            return;
                        }
                        return;
                }
            }
        });
        ofFloat4.addListener(new b0(this, 5));
    }

    public static void a(d0 d0Var, View view) {
        d0Var.h();
        if (view.getId() == R.id.exo_overflow_show) {
            d0Var.f13994q.start();
        } else if (view.getId() == R.id.exo_overflow_hide) {
            d0Var.f13995r.start();
        }
    }

    public static int d(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        }
        return width;
    }

    public static ObjectAnimator e(View view, float f10, float f11) {
        return ObjectAnimator.ofFloat(view, "translationY", f10, f11);
    }

    public static boolean k(View view) {
        int id2 = view.getId();
        if (id2 != R.id.exo_bottom_bar && id2 != R.id.exo_prev && id2 != R.id.exo_next && id2 != R.id.exo_rew && id2 != R.id.exo_rew_with_amount && id2 != R.id.exo_ffwd && id2 != R.id.exo_ffwd_with_amount) {
            return false;
        }
        return true;
    }

    public final void b(float f10) {
        ViewGroup viewGroup = this.f13985h;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f10) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.f13986i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f10);
        }
        ViewGroup viewGroup3 = this.f13983f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f10);
        }
    }

    public final boolean c(View view) {
        if (view != null && this.f14002y.contains(view)) {
            return true;
        }
        return false;
    }

    public final void f(y yVar, long j10) {
        if (j10 >= 0) {
            this.f13978a.postDelayed(yVar, j10);
        }
    }

    public final void g() {
        x xVar = this.f13978a;
        xVar.removeCallbacks(this.f14000w);
        xVar.removeCallbacks(this.f13997t);
        xVar.removeCallbacks(this.f13999v);
        xVar.removeCallbacks(this.f13998u);
    }

    public final void h() {
        if (this.f14003z == 3) {
            return;
        }
        g();
        int showTimeoutMs = this.f13978a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.C) {
                f(this.f14000w, showTimeoutMs);
            } else if (this.f14003z == 1) {
                f(this.f13998u, 2000L);
            } else {
                f(this.f13999v, showTimeoutMs);
            }
        }
    }

    public final void i(View view, boolean z10) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.f14002y;
        if (!z10) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.A && k(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    public final void j(int i10) {
        int i11 = this.f14003z;
        this.f14003z = i10;
        x xVar = this.f13978a;
        if (i10 == 2) {
            xVar.setVisibility(8);
        } else if (i11 == 2) {
            xVar.setVisibility(0);
        }
        if (i11 != i10) {
            Iterator it = xVar.f14133d.iterator();
            while (it.hasNext()) {
                w wVar = (w) it.next();
                xVar.getVisibility();
                e0 e0Var = (e0) wVar;
                e0Var.getClass();
                e0Var.f14008c.j();
            }
        }
    }

    public final void l() {
        if (!this.C) {
            j(0);
            h();
            return;
        }
        int i10 = this.f14003z;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return;
                    }
                } else {
                    this.B = true;
                }
            } else {
                this.f13993p.start();
            }
        } else {
            this.f13992o.start();
        }
        h();
    }
}
