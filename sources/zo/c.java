package zo;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes2.dex */
public final class c extends m {

    /* renamed from: e, reason: collision with root package name */
    public final int f42584e;

    /* renamed from: f, reason: collision with root package name */
    public final int f42585f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f42586g;

    /* renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f42587h;

    /* renamed from: i, reason: collision with root package name */
    public EditText f42588i;

    /* renamed from: j, reason: collision with root package name */
    public final ph.a f42589j;

    /* renamed from: k, reason: collision with root package name */
    public final fc.a f42590k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f42591l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f42592m;

    public c(l lVar) {
        super(lVar);
        this.f42589j = new ph.a(this, 25);
        this.f42590k = new fc.a(this, 3);
        this.f42584e = dp.b.E1(lVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f42585f = dp.b.E1(lVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f42586g = dp.b.F1(lVar.getContext(), R.attr.motionEasingLinearInterpolator, vn.a.f38180a);
        this.f42587h = dp.b.F1(lVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, vn.a.f38183d);
    }

    @Override // zo.m
    public final void a() {
        if (this.f42638b.f42630p != null) {
            return;
        }
        t(u());
    }

    @Override // zo.m
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // zo.m
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // zo.m
    public final View.OnFocusChangeListener e() {
        return this.f42590k;
    }

    @Override // zo.m
    public final View.OnClickListener f() {
        return this.f42589j;
    }

    @Override // zo.m
    public final View.OnFocusChangeListener g() {
        return this.f42590k;
    }

    @Override // zo.m
    public final void m(EditText editText) {
        this.f42588i = editText;
        this.f42637a.setEndIconVisible(u());
    }

    @Override // zo.m
    public final void p(boolean z10) {
        if (this.f42638b.f42630p == null) {
            return;
        }
        t(z10);
    }

    @Override // zo.m
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f42587h);
        ofFloat.setDuration(this.f42585f);
        final int i10 = 0;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: zo.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f42581b;

            {
                this.f42581b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i11 = i10;
                c cVar = this.f42581b;
                switch (i11) {
                    case 0:
                        cVar.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = cVar.f42640d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                    default:
                        cVar.getClass();
                        cVar.f42640d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(s0.g.f34069a, 1.0f);
        TimeInterpolator timeInterpolator = this.f42586g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i11 = this.f42584e;
        ofFloat2.setDuration(i11);
        final int i12 = 1;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: zo.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f42581b;

            {
                this.f42581b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i112 = i12;
                c cVar = this.f42581b;
                switch (i112) {
                    case 0:
                        cVar.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = cVar.f42640d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                    default:
                        cVar.getClass();
                        cVar.f42640d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f42591l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f42591l.addListener(new b(this, i10));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, s0.g.f34069a);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i11);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: zo.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f42581b;

            {
                this.f42581b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i112 = i12;
                c cVar = this.f42581b;
                switch (i112) {
                    case 0:
                        cVar.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = cVar.f42640d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                    default:
                        cVar.getClass();
                        cVar.f42640d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                }
            }
        });
        this.f42592m = ofFloat3;
        ofFloat3.addListener(new b(this, i12));
    }

    @Override // zo.m
    public final void s() {
        EditText editText = this.f42588i;
        if (editText != null) {
            editText.post(new bl.d(this, 13));
        }
    }

    public final void t(boolean z10) {
        boolean z11;
        if (this.f42638b.c() == z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && !this.f42591l.isRunning()) {
            this.f42592m.cancel();
            this.f42591l.start();
            if (z11) {
                this.f42591l.end();
                return;
            }
            return;
        }
        if (!z10) {
            this.f42591l.cancel();
            this.f42592m.start();
            if (z11) {
                this.f42592m.end();
            }
        }
    }

    public final boolean u() {
        EditText editText = this.f42588i;
        if (editText != null && ((editText.hasFocus() || this.f42640d.hasFocus()) && this.f42588i.getText().length() > 0)) {
            return true;
        }
        return false;
    }
}
