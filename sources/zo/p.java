package zo;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.textfield.TextInputLayout;
import d4.n1;
import d4.w0;
import d4.y0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class p {
    public ColorStateList A;
    public Typeface B;

    /* renamed from: a, reason: collision with root package name */
    public final int f42647a;

    /* renamed from: b, reason: collision with root package name */
    public final int f42648b;

    /* renamed from: c, reason: collision with root package name */
    public final int f42649c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f42650d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f42651e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f42652f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f42653g;

    /* renamed from: h, reason: collision with root package name */
    public final TextInputLayout f42654h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f42655i;

    /* renamed from: j, reason: collision with root package name */
    public int f42656j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f42657k;

    /* renamed from: l, reason: collision with root package name */
    public Animator f42658l;

    /* renamed from: m, reason: collision with root package name */
    public final float f42659m;

    /* renamed from: n, reason: collision with root package name */
    public int f42660n;

    /* renamed from: o, reason: collision with root package name */
    public int f42661o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f42662p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f42663q;

    /* renamed from: r, reason: collision with root package name */
    public AppCompatTextView f42664r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f42665s;

    /* renamed from: t, reason: collision with root package name */
    public int f42666t;

    /* renamed from: u, reason: collision with root package name */
    public int f42667u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f42668v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f42669w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f42670x;

    /* renamed from: y, reason: collision with root package name */
    public AppCompatTextView f42671y;

    /* renamed from: z, reason: collision with root package name */
    public int f42672z;

    public p(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f42653g = context;
        this.f42654h = textInputLayout;
        this.f42659m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f42647a = dp.b.E1(context, R.attr.motionDurationShort4, 217);
        this.f42648b = dp.b.E1(context, R.attr.motionDurationMedium4, 167);
        this.f42649c = dp.b.E1(context, R.attr.motionDurationShort4, 167);
        this.f42650d = dp.b.F1(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, vn.a.f38183d);
        LinearInterpolator linearInterpolator = vn.a.f38180a;
        this.f42651e = dp.b.F1(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f42652f = dp.b.F1(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(TextView textView, int i10) {
        if (this.f42655i == null && this.f42657k == null) {
            Context context = this.f42653g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f42655i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f42655i;
            TextInputLayout textInputLayout = this.f42654h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f42657k = new FrameLayout(context);
            this.f42655i.addView(this.f42657k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i10 != 0 && i10 != 1) {
            this.f42655i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        } else {
            this.f42657k.setVisibility(0);
            this.f42657k.addView(textView);
        }
        this.f42655i.setVisibility(0);
        this.f42656j++;
    }

    public final void b() {
        if (this.f42655i != null) {
            TextInputLayout textInputLayout = this.f42654h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f42653g;
                boolean t12 = dp.b.t1(context);
                LinearLayout linearLayout = this.f42655i;
                WeakHashMap weakHashMap = n1.f13788a;
                int f10 = w0.f(editText);
                if (t12) {
                    f10 = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (t12) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int e10 = w0.e(editText);
                if (t12) {
                    e10 = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                w0.k(linearLayout, f10, dimensionPixelSize, e10, 0);
            }
        }
    }

    public final void c() {
        Animator animator = this.f42658l;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z10, TextView textView, int i10, int i11, int i12) {
        boolean z11;
        float f10;
        long j10;
        TimeInterpolator timeInterpolator;
        if (textView != null && z10) {
            if (i10 == i12 || i10 == i11) {
                if (i12 == i10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, f10);
                int i13 = this.f42649c;
                if (z11) {
                    j10 = this.f42648b;
                } else {
                    j10 = i13;
                }
                ofFloat.setDuration(j10);
                if (z11) {
                    timeInterpolator = this.f42651e;
                } else {
                    timeInterpolator = this.f42652f;
                }
                ofFloat.setInterpolator(timeInterpolator);
                if (i10 == i12 && i11 != 0) {
                    ofFloat.setStartDelay(i13);
                }
                arrayList.add(ofFloat);
                if (i12 == i10 && i11 != 0) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f42659m, s0.g.f34069a);
                    ofFloat2.setDuration(this.f42647a);
                    ofFloat2.setInterpolator(this.f42650d);
                    ofFloat2.setStartDelay(i13);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    public final TextView e(int i10) {
        if (i10 == 1) {
            return this.f42664r;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f42671y;
    }

    public final void f() {
        this.f42662p = null;
        c();
        if (this.f42660n == 1) {
            if (this.f42670x && !TextUtils.isEmpty(this.f42669w)) {
                this.f42661o = 2;
            } else {
                this.f42661o = 0;
            }
        }
        i(this.f42660n, this.f42661o, h(this.f42664r, HttpUrl.FRAGMENT_ENCODE_SET));
    }

    public final void g(TextView textView, int i10) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f42655i;
        if (linearLayout == null) {
            return;
        }
        if ((i10 == 0 || i10 == 1) && (frameLayout = this.f42657k) != null) {
            frameLayout.removeView(textView);
        } else {
            linearLayout.removeView(textView);
        }
        int i11 = this.f42656j - 1;
        this.f42656j = i11;
        LinearLayout linearLayout2 = this.f42655i;
        if (i11 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(TextView textView, CharSequence charSequence) {
        WeakHashMap weakHashMap = n1.f13788a;
        TextInputLayout textInputLayout = this.f42654h;
        if (y0.c(textInputLayout) && textInputLayout.isEnabled() && (this.f42661o != this.f42660n || textView == null || !TextUtils.equals(textView.getText(), charSequence))) {
            return true;
        }
        return false;
    }

    public final void i(int i10, int i11, boolean z10) {
        TextView e10;
        TextView e11;
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f42658l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f42670x, this.f42671y, 2, i10, i11);
            d(arrayList, this.f42663q, this.f42664r, 1, i10, i11);
            dp.b.B1(animatorSet, arrayList);
            animatorSet.addListener(new n(this, i11, e(i10), i10, e(i11)));
            animatorSet.start();
        } else if (i10 != i11) {
            if (i11 != 0 && (e11 = e(i11)) != null) {
                e11.setVisibility(0);
                e11.setAlpha(1.0f);
            }
            if (i10 != 0 && (e10 = e(i10)) != null) {
                e10.setVisibility(4);
                if (i10 == 1) {
                    e10.setText((CharSequence) null);
                }
            }
            this.f42660n = i11;
        }
        TextInputLayout textInputLayout = this.f42654h;
        textInputLayout.q();
        textInputLayout.t(z10, false);
        textInputLayout.w();
    }
}
