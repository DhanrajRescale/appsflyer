package zo;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import d4.n1;
import d4.v0;
import d4.w0;
import d4.y0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class l extends LinearLayout {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f42614w = 0;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f42615a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f42616b;

    /* renamed from: c, reason: collision with root package name */
    public final CheckableImageButton f42617c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f42618d;

    /* renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f42619e;

    /* renamed from: f, reason: collision with root package name */
    public View.OnLongClickListener f42620f;

    /* renamed from: g, reason: collision with root package name */
    public final CheckableImageButton f42621g;

    /* renamed from: h, reason: collision with root package name */
    public final e.j f42622h;

    /* renamed from: i, reason: collision with root package name */
    public int f42623i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f42624j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f42625k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f42626l;

    /* renamed from: m, reason: collision with root package name */
    public int f42627m;

    /* renamed from: n, reason: collision with root package name */
    public ImageView.ScaleType f42628n;

    /* renamed from: o, reason: collision with root package name */
    public View.OnLongClickListener f42629o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f42630p;

    /* renamed from: q, reason: collision with root package name */
    public final AppCompatTextView f42631q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f42632r;

    /* renamed from: s, reason: collision with root package name */
    public EditText f42633s;

    /* renamed from: t, reason: collision with root package name */
    public final AccessibilityManager f42634t;

    /* renamed from: u, reason: collision with root package name */
    public e4.d f42635u;

    /* renamed from: v, reason: collision with root package name */
    public final j f42636v;

    /* JADX WARN: Type inference failed for: r11v1, types: [e.j, java.lang.Object] */
    public l(TextInputLayout textInputLayout, h.c cVar) {
        super(textInputLayout.getContext());
        CharSequence F;
        this.f42623i = 0;
        this.f42624j = new LinkedHashSet();
        this.f42636v = new j(this);
        k kVar = new k(this);
        this.f42634t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f42615a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f42616b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a10 = a(R.id.text_input_error_icon, from, this);
        this.f42617c = a10;
        CheckableImageButton a11 = a(R.id.text_input_end_icon, from, frameLayout);
        this.f42621g = a11;
        ?? obj = new Object();
        obj.f14634c = new SparseArray();
        obj.f14635d = this;
        obj.f14632a = cVar.C(26, 0);
        obj.f14633b = cVar.C(50, 0);
        this.f42622h = obj;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.f42631q = appCompatTextView;
        if (cVar.H(36)) {
            this.f42618d = dp.b.m1(getContext(), cVar, 36);
        }
        if (cVar.H(37)) {
            this.f42619e = pn.e.s(cVar.z(37, -1), null);
        }
        if (cVar.H(35)) {
            h(cVar.v(35));
        }
        a10.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = n1.f13788a;
        v0.s(a10, 2);
        a10.setClickable(false);
        a10.setPressable(false);
        a10.setFocusable(false);
        if (!cVar.H(51)) {
            if (cVar.H(30)) {
                this.f42625k = dp.b.m1(getContext(), cVar, 30);
            }
            if (cVar.H(31)) {
                this.f42626l = pn.e.s(cVar.z(31, -1), null);
            }
        }
        if (cVar.H(28)) {
            f(cVar.z(28, 0));
            if (cVar.H(25) && a11.getContentDescription() != (F = cVar.F(25))) {
                a11.setContentDescription(F);
            }
            a11.setCheckable(cVar.q(24, true));
        } else if (cVar.H(51)) {
            if (cVar.H(52)) {
                this.f42625k = dp.b.m1(getContext(), cVar, 52);
            }
            if (cVar.H(53)) {
                this.f42626l = pn.e.s(cVar.z(53, -1), null);
            }
            f(cVar.q(51, false) ? 1 : 0);
            CharSequence F2 = cVar.F(49);
            if (a11.getContentDescription() != F2) {
                a11.setContentDescription(F2);
            }
        }
        int u10 = cVar.u(27, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (u10 >= 0) {
            if (u10 != this.f42627m) {
                this.f42627m = u10;
                a11.setMinimumWidth(u10);
                a11.setMinimumHeight(u10);
                a10.setMinimumWidth(u10);
                a10.setMinimumHeight(u10);
            }
            if (cVar.H(29)) {
                ImageView.ScaleType d10 = pn.e.d(cVar.z(29, -1));
                this.f42628n = d10;
                a11.setScaleType(d10);
                a10.setScaleType(d10);
            }
            appCompatTextView.setVisibility(8);
            appCompatTextView.setId(R.id.textinput_suffix_text);
            appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            y0.f(appCompatTextView, 1);
            appCompatTextView.setTextAppearance(cVar.C(70, 0));
            if (cVar.H(71)) {
                appCompatTextView.setTextColor(cVar.r(71));
            }
            CharSequence F3 = cVar.F(69);
            this.f42630p = TextUtils.isEmpty(F3) ? null : F3;
            appCompatTextView.setText(F3);
            m();
            frameLayout.addView(a11);
            addView(appCompatTextView);
            addView(frameLayout);
            addView(a10);
            textInputLayout.f11513t0.add(kVar);
            if (textInputLayout.f11482d != null) {
                kVar.a(textInputLayout);
            }
            addOnAttachStateChangeListener(new l.f(this, 5));
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public final CheckableImageButton a(int i10, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i10);
        if (dp.b.t1(getContext())) {
            d4.q.h((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    public final m b() {
        int i10 = this.f42623i;
        e.j jVar = this.f42622h;
        m mVar = (m) ((SparseArray) jVar.f14634c).get(i10);
        if (mVar == null) {
            if (i10 != -1) {
                int i11 = 1;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                mVar = new i((l) jVar.f14635d);
                            } else {
                                throw new IllegalArgumentException(jr.h.n("Invalid end icon mode: ", i10));
                            }
                        } else {
                            mVar = new c((l) jVar.f14635d);
                        }
                    } else {
                        mVar = new s((l) jVar.f14635d, jVar.f14633b);
                    }
                } else {
                    mVar = new d((l) jVar.f14635d, i11);
                }
            } else {
                mVar = new d((l) jVar.f14635d, 0);
            }
            ((SparseArray) jVar.f14634c).append(i10, mVar);
        }
        return mVar;
    }

    public final boolean c() {
        if (this.f42616b.getVisibility() == 0 && this.f42621g.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f42617c.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void e(boolean z10) {
        boolean z11;
        boolean isActivated;
        boolean isChecked;
        m b10 = b();
        boolean k10 = b10.k();
        CheckableImageButton checkableImageButton = this.f42621g;
        boolean z12 = true;
        if (k10 && (isChecked = checkableImageButton.isChecked()) != b10.l()) {
            checkableImageButton.setChecked(!isChecked);
            z11 = true;
        } else {
            z11 = false;
        }
        if ((b10 instanceof i) && (isActivated = checkableImageButton.isActivated()) != b10.j()) {
            checkableImageButton.setActivated(!isActivated);
        } else {
            z12 = z11;
        }
        if (z10 || z12) {
            pn.e.t(this.f42615a, checkableImageButton, this.f42625k);
        }
    }

    public final void f(int i10) {
        boolean z10;
        Drawable drawable;
        if (this.f42623i == i10) {
            return;
        }
        m b10 = b();
        e4.d dVar = this.f42635u;
        AccessibilityManager accessibilityManager = this.f42634t;
        if (dVar != null && accessibilityManager != null) {
            e4.c.b(accessibilityManager, dVar);
        }
        CharSequence charSequence = null;
        this.f42635u = null;
        b10.s();
        this.f42623i = i10;
        Iterator it = this.f42624j.iterator();
        if (!it.hasNext()) {
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            g(z10);
            m b11 = b();
            int i11 = this.f42622h.f14632a;
            if (i11 == 0) {
                i11 = b11.d();
            }
            if (i11 != 0) {
                drawable = iu.j.m(getContext(), i11);
            } else {
                drawable = null;
            }
            CheckableImageButton checkableImageButton = this.f42621g;
            checkableImageButton.setImageDrawable(drawable);
            TextInputLayout textInputLayout = this.f42615a;
            if (drawable != null) {
                pn.e.b(textInputLayout, checkableImageButton, this.f42625k, this.f42626l);
                pn.e.t(textInputLayout, checkableImageButton, this.f42625k);
            }
            int c10 = b11.c();
            if (c10 != 0) {
                charSequence = getResources().getText(c10);
            }
            if (checkableImageButton.getContentDescription() != charSequence) {
                checkableImageButton.setContentDescription(charSequence);
            }
            checkableImageButton.setCheckable(b11.k());
            if (b11.i(textInputLayout.getBoxBackgroundMode())) {
                b11.r();
                e4.d h10 = b11.h();
                this.f42635u = h10;
                if (h10 != null && accessibilityManager != null) {
                    WeakHashMap weakHashMap = n1.f13788a;
                    if (y0.b(this)) {
                        e4.c.a(accessibilityManager, this.f42635u);
                    }
                }
                View.OnClickListener f10 = b11.f();
                View.OnLongClickListener onLongClickListener = this.f42629o;
                checkableImageButton.setOnClickListener(f10);
                pn.e.x(checkableImageButton, onLongClickListener);
                EditText editText = this.f42633s;
                if (editText != null) {
                    b11.m(editText);
                    i(b11);
                }
                pn.e.b(textInputLayout, checkableImageButton, this.f42625k, this.f42626l);
                e(true);
                return;
            }
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        a3.a.u(it.next());
        throw null;
    }

    public final void g(boolean z10) {
        int i10;
        if (c() != z10) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            this.f42621g.setVisibility(i10);
            j();
            l();
            this.f42615a.p();
        }
    }

    public final void h(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f42617c;
        checkableImageButton.setImageDrawable(drawable);
        k();
        pn.e.b(this.f42615a, checkableImageButton, this.f42618d, this.f42619e);
    }

    public final void i(m mVar) {
        if (this.f42633s == null) {
            return;
        }
        if (mVar.e() != null) {
            this.f42633s.setOnFocusChangeListener(mVar.e());
        }
        if (mVar.g() != null) {
            this.f42621g.setOnFocusChangeListener(mVar.g());
        }
    }

    public final void j() {
        int i10;
        boolean z10;
        int i11 = 8;
        if (this.f42621g.getVisibility() == 0 && !d()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f42616b.setVisibility(i10);
        if (this.f42630p != null && !this.f42632r) {
            z10 = false;
        } else {
            z10 = 8;
        }
        if (c() || d() || !z10) {
            i11 = 0;
        }
        setVisibility(i11);
    }

    public final void k() {
        int i10;
        CheckableImageButton checkableImageButton = this.f42617c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f42615a;
        if (drawable != null && textInputLayout.f11493j.f42663q && textInputLayout.m()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        checkableImageButton.setVisibility(i10);
        j();
        l();
        if (this.f42623i == 0) {
            textInputLayout.p();
        }
    }

    public final void l() {
        int i10;
        TextInputLayout textInputLayout = this.f42615a;
        if (textInputLayout.f11482d == null) {
            return;
        }
        if (!c() && !d()) {
            EditText editText = textInputLayout.f11482d;
            WeakHashMap weakHashMap = n1.f13788a;
            i10 = w0.e(editText);
        } else {
            i10 = 0;
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f11482d.getPaddingTop();
        int paddingBottom = textInputLayout.f11482d.getPaddingBottom();
        WeakHashMap weakHashMap2 = n1.f13788a;
        w0.k(this.f42631q, dimensionPixelSize, paddingTop, i10, paddingBottom);
    }

    public final void m() {
        int i10;
        AppCompatTextView appCompatTextView = this.f42631q;
        int visibility = appCompatTextView.getVisibility();
        boolean z10 = false;
        if (this.f42630p != null && !this.f42632r) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        if (visibility != i10) {
            m b10 = b();
            if (i10 == 0) {
                z10 = true;
            }
            b10.p(z10);
        }
        j();
        appCompatTextView.setVisibility(i10);
        this.f42615a.p();
    }
}
