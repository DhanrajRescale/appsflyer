package zo;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.textfield.TextInputLayout;
import d4.n1;
import d4.v0;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class i extends m {

    /* renamed from: e, reason: collision with root package name */
    public final int f42598e;

    /* renamed from: f, reason: collision with root package name */
    public final int f42599f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f42600g;

    /* renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f42601h;

    /* renamed from: i, reason: collision with root package name */
    public final ph.a f42602i;

    /* renamed from: j, reason: collision with root package name */
    public final fc.a f42603j;

    /* renamed from: k, reason: collision with root package name */
    public final dj.e f42604k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f42605l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f42606m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f42607n;

    /* renamed from: o, reason: collision with root package name */
    public long f42608o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f42609p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f42610q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f42611r;

    public i(l lVar) {
        super(lVar);
        this.f42602i = new ph.a(this, 26);
        this.f42603j = new fc.a(this, 4);
        this.f42604k = new dj.e(this, 20);
        this.f42608o = Long.MAX_VALUE;
        this.f42599f = dp.b.E1(lVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f42598e = dp.b.E1(lVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f42600g = dp.b.F1(lVar.getContext(), R.attr.motionEasingLinearInterpolator, vn.a.f38180a);
    }

    @Override // zo.m
    public final void a() {
        if (this.f42609p.isTouchExplorationEnabled() && this.f42601h.getInputType() != 0 && !this.f42640d.hasFocus()) {
            this.f42601h.dismissDropDown();
        }
        this.f42601h.post(new bl.d(this, 14));
    }

    @Override // zo.m
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // zo.m
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // zo.m
    public final View.OnFocusChangeListener e() {
        return this.f42603j;
    }

    @Override // zo.m
    public final View.OnClickListener f() {
        return this.f42602i;
    }

    @Override // zo.m
    public final e4.d h() {
        return this.f42604k;
    }

    @Override // zo.m
    public final boolean i(int i10) {
        return i10 != 0;
    }

    @Override // zo.m
    public final boolean j() {
        return this.f42605l;
    }

    @Override // zo.m
    public final boolean l() {
        return this.f42607n;
    }

    @Override // zo.m
    public final void m(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.f42601h = autoCompleteTextView;
            autoCompleteTextView.setOnTouchListener(new ha.g(this, 5));
            this.f42601h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: zo.h
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    i iVar = i.this;
                    iVar.f42606m = true;
                    iVar.f42608o = System.currentTimeMillis();
                    iVar.t(false);
                }
            });
            this.f42601h.setThreshold(0);
            TextInputLayout textInputLayout = this.f42637a;
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (editText.getInputType() == 0 && this.f42609p.isTouchExplorationEnabled()) {
                WeakHashMap weakHashMap = n1.f13788a;
                v0.s(this.f42640d, 2);
            }
            textInputLayout.setEndIconVisible(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    @Override // zo.m
    public final void n(e4.m mVar) {
        boolean e10;
        if (this.f42601h.getInputType() == 0) {
            mVar.j(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            e10 = mVar.f14996a.isShowingHintText();
        } else {
            e10 = mVar.e(4);
        }
        if (e10) {
            mVar.o(null);
        }
    }

    @Override // zo.m
    public final void o(AccessibilityEvent accessibilityEvent) {
        boolean z10;
        if (this.f42609p.isEnabled() && this.f42601h.getInputType() == 0) {
            if (accessibilityEvent.getEventType() == 32768 && this.f42607n && !this.f42601h.isPopupShowing()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (accessibilityEvent.getEventType() == 1 || z10) {
                u();
                this.f42606m = true;
                this.f42608o = System.currentTimeMillis();
            }
        }
    }

    @Override // zo.m
    public final void r() {
        int i10 = 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(s0.g.f34069a, 1.0f);
        TimeInterpolator timeInterpolator = this.f42600g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f42599f);
        ofFloat.addUpdateListener(new d7.e(this, i10));
        this.f42611r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, s0.g.f34069a);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f42598e);
        ofFloat2.addUpdateListener(new d7.e(this, i10));
        this.f42610q = ofFloat2;
        ofFloat2.addListener(new m.d(this, 9));
        this.f42609p = (AccessibilityManager) this.f42639c.getSystemService("accessibility");
    }

    @Override // zo.m
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f42601h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f42601h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z10) {
        if (this.f42607n != z10) {
            this.f42607n = z10;
            this.f42611r.cancel();
            this.f42610q.start();
        }
    }

    public final void u() {
        boolean z10;
        if (this.f42601h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f42608o;
        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            this.f42606m = false;
        }
        if (!this.f42606m) {
            t(!this.f42607n);
            if (this.f42607n) {
                this.f42601h.requestFocus();
                this.f42601h.showDropDown();
                return;
            } else {
                this.f42601h.dismissDropDown();
                return;
            }
        }
        this.f42606m = false;
    }
}
