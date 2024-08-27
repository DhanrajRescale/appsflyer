package zo;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import d4.n1;
import d4.w0;
import d4.y0;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class t extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f42686a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatTextView f42687b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f42688c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f42689d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f42690e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f42691f;

    /* renamed from: g, reason: collision with root package name */
    public int f42692g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView.ScaleType f42693h;

    /* renamed from: i, reason: collision with root package name */
    public View.OnLongClickListener f42694i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f42695j;

    public t(TextInputLayout textInputLayout, h.c cVar) {
        super(textInputLayout.getContext());
        CharSequence F;
        this.f42686a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f42689d = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.f42687b = appCompatTextView;
        if (dp.b.t1(getContext())) {
            d4.q.g((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        View.OnLongClickListener onLongClickListener = this.f42694i;
        checkableImageButton.setOnClickListener(null);
        pn.e.x(checkableImageButton, onLongClickListener);
        this.f42694i = null;
        checkableImageButton.setOnLongClickListener(null);
        pn.e.x(checkableImageButton, null);
        if (cVar.H(67)) {
            this.f42690e = dp.b.m1(getContext(), cVar, 67);
        }
        if (cVar.H(68)) {
            this.f42691f = pn.e.s(cVar.z(68, -1), null);
        }
        if (cVar.H(64)) {
            a(cVar.v(64));
            if (cVar.H(63) && checkableImageButton.getContentDescription() != (F = cVar.F(63))) {
                checkableImageButton.setContentDescription(F);
            }
            checkableImageButton.setCheckable(cVar.q(62, true));
        }
        int u10 = cVar.u(65, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (u10 >= 0) {
            if (u10 != this.f42692g) {
                this.f42692g = u10;
                checkableImageButton.setMinimumWidth(u10);
                checkableImageButton.setMinimumHeight(u10);
            }
            if (cVar.H(66)) {
                ImageView.ScaleType d10 = pn.e.d(cVar.z(66, -1));
                this.f42693h = d10;
                checkableImageButton.setScaleType(d10);
            }
            appCompatTextView.setVisibility(8);
            appCompatTextView.setId(R.id.textinput_prefix_text);
            appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            WeakHashMap weakHashMap = n1.f13788a;
            y0.f(appCompatTextView, 1);
            appCompatTextView.setTextAppearance(cVar.C(58, 0));
            if (cVar.H(59)) {
                appCompatTextView.setTextColor(cVar.r(59));
            }
            CharSequence F2 = cVar.F(57);
            this.f42688c = TextUtils.isEmpty(F2) ? null : F2;
            appCompatTextView.setText(F2);
            d();
            addView(checkableImageButton);
            addView(appCompatTextView);
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public final void a(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f42689d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f42690e;
            PorterDuff.Mode mode = this.f42691f;
            TextInputLayout textInputLayout = this.f42686a;
            pn.e.b(textInputLayout, checkableImageButton, colorStateList, mode);
            b(true);
            pn.e.t(textInputLayout, checkableImageButton, this.f42690e);
            return;
        }
        b(false);
        View.OnLongClickListener onLongClickListener = this.f42694i;
        checkableImageButton.setOnClickListener(null);
        pn.e.x(checkableImageButton, onLongClickListener);
        this.f42694i = null;
        checkableImageButton.setOnLongClickListener(null);
        pn.e.x(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void b(boolean z10) {
        boolean z11;
        CheckableImageButton checkableImageButton = this.f42689d;
        int i10 = 0;
        if (checkableImageButton.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 != z10) {
            if (!z10) {
                i10 = 8;
            }
            checkableImageButton.setVisibility(i10);
            c();
            d();
        }
    }

    public final void c() {
        int f10;
        EditText editText = this.f42686a.f11482d;
        if (editText == null) {
            return;
        }
        if (this.f42689d.getVisibility() == 0) {
            f10 = 0;
        } else {
            WeakHashMap weakHashMap = n1.f13788a;
            f10 = w0.f(editText);
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = n1.f13788a;
        w0.k(this.f42687b, f10, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void d() {
        int i10;
        int i11 = 8;
        if (this.f42688c != null && !this.f42695j) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        if (this.f42689d.getVisibility() == 0 || i10 == 0) {
            i11 = 0;
        }
        setVisibility(i11);
        this.f42687b.setVisibility(i10);
        this.f42686a.p();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        c();
    }
}
