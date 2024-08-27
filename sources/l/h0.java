package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.assetgro.stockgro.prod.R;
import d4.n1;
import d4.w0;
import java.util.WeakHashMap;
import m.i2;
import m.o2;
import m.w1;

/* loaded from: classes.dex */
public final class h0 extends x implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f23575b;

    /* renamed from: c, reason: collision with root package name */
    public final o f23576c;

    /* renamed from: d, reason: collision with root package name */
    public final l f23577d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f23578e;

    /* renamed from: f, reason: collision with root package name */
    public final int f23579f;

    /* renamed from: g, reason: collision with root package name */
    public final int f23580g;

    /* renamed from: h, reason: collision with root package name */
    public final int f23581h;

    /* renamed from: i, reason: collision with root package name */
    public final o2 f23582i;

    /* renamed from: l, reason: collision with root package name */
    public PopupWindow.OnDismissListener f23585l;

    /* renamed from: m, reason: collision with root package name */
    public View f23586m;

    /* renamed from: n, reason: collision with root package name */
    public View f23587n;

    /* renamed from: o, reason: collision with root package name */
    public b0 f23588o;

    /* renamed from: p, reason: collision with root package name */
    public ViewTreeObserver f23589p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f23590q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f23591r;

    /* renamed from: s, reason: collision with root package name */
    public int f23592s;

    /* renamed from: u, reason: collision with root package name */
    public boolean f23594u;

    /* renamed from: j, reason: collision with root package name */
    public final e f23583j = new e(this, 1);

    /* renamed from: k, reason: collision with root package name */
    public final f f23584k = new f(this, 1);

    /* renamed from: t, reason: collision with root package name */
    public int f23593t = 0;

    /* JADX WARN: Type inference failed for: r7v1, types: [m.o2, m.i2] */
    public h0(int i10, int i11, Context context, View view, o oVar, boolean z10) {
        this.f23575b = context;
        this.f23576c = oVar;
        this.f23578e = z10;
        this.f23577d = new l(oVar, LayoutInflater.from(context), z10, R.layout.abc_popup_menu_item_layout);
        this.f23580g = i10;
        this.f23581h = i11;
        Resources resources = context.getResources();
        this.f23579f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f23586m = view;
        this.f23582i = new i2(context, null, i10, i11);
        oVar.b(this, context);
    }

    @Override // l.g0
    public final boolean a() {
        if (!this.f23590q && this.f23582i.f25583z.isShowing()) {
            return true;
        }
        return false;
    }

    @Override // l.c0
    public final void b(o oVar, boolean z10) {
        if (oVar != this.f23576c) {
            return;
        }
        dismiss();
        b0 b0Var = this.f23588o;
        if (b0Var != null) {
            b0Var.b(oVar, z10);
        }
    }

    @Override // l.c0
    public final void d(boolean z10) {
        this.f23591r = false;
        l lVar = this.f23577d;
        if (lVar != null) {
            lVar.notifyDataSetChanged();
        }
    }

    @Override // l.g0
    public final void dismiss() {
        if (a()) {
            this.f23582i.dismiss();
        }
    }

    @Override // l.c0
    public final boolean e() {
        return false;
    }

    @Override // l.g0
    public final void f() {
        View view;
        boolean z10;
        Rect rect;
        if (!a()) {
            if (!this.f23590q && (view = this.f23586m) != null) {
                this.f23587n = view;
                o2 o2Var = this.f23582i;
                o2Var.f25583z.setOnDismissListener(this);
                o2Var.f25573p = this;
                o2Var.f25582y = true;
                o2Var.f25583z.setFocusable(true);
                View view2 = this.f23587n;
                if (this.f23589p == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.f23589p = viewTreeObserver;
                if (z10) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f23583j);
                }
                view2.addOnAttachStateChangeListener(this.f23584k);
                o2Var.f25572o = view2;
                o2Var.f25569l = this.f23593t;
                boolean z11 = this.f23591r;
                Context context = this.f23575b;
                l lVar = this.f23577d;
                if (!z11) {
                    this.f23592s = x.o(lVar, context, this.f23579f);
                    this.f23591r = true;
                }
                o2Var.q(this.f23592s);
                o2Var.f25583z.setInputMethodMode(2);
                Rect rect2 = this.f23699a;
                if (rect2 != null) {
                    rect = new Rect(rect2);
                } else {
                    rect = null;
                }
                o2Var.f25581x = rect;
                o2Var.f();
                w1 w1Var = o2Var.f25560c;
                w1Var.setOnKeyListener(this);
                if (this.f23594u) {
                    o oVar = this.f23576c;
                    if (oVar.f23648m != null) {
                        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) w1Var, false);
                        TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                        if (textView != null) {
                            textView.setText(oVar.f23648m);
                        }
                        frameLayout.setEnabled(false);
                        w1Var.addHeaderView(frameLayout, null, false);
                    }
                }
                o2Var.o(lVar);
                o2Var.f();
                return;
            }
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // l.c0
    public final void g(Parcelable parcelable) {
    }

    @Override // l.g0
    public final ListView h() {
        return this.f23582i.f25560c;
    }

    @Override // l.c0
    public final void i(b0 b0Var) {
        this.f23588o = b0Var;
    }

    @Override // l.c0
    public final Parcelable k() {
        return null;
    }

    @Override // l.c0
    public final boolean l(i0 i0Var) {
        if (i0Var.hasVisibleItems()) {
            a0 a0Var = new a0(this.f23580g, this.f23581h, this.f23575b, this.f23587n, i0Var, this.f23578e);
            b0 b0Var = this.f23588o;
            a0Var.f23554i = b0Var;
            x xVar = a0Var.f23555j;
            if (xVar != null) {
                xVar.i(b0Var);
            }
            boolean w10 = x.w(i0Var);
            a0Var.f23553h = w10;
            x xVar2 = a0Var.f23555j;
            if (xVar2 != null) {
                xVar2.q(w10);
            }
            a0Var.f23556k = this.f23585l;
            this.f23585l = null;
            this.f23576c.c(false);
            o2 o2Var = this.f23582i;
            int i10 = o2Var.f25563f;
            int n10 = o2Var.n();
            int i11 = this.f23593t;
            View view = this.f23586m;
            WeakHashMap weakHashMap = n1.f13788a;
            if ((Gravity.getAbsoluteGravity(i11, w0.d(view)) & 7) == 5) {
                i10 += this.f23586m.getWidth();
            }
            if (!a0Var.b()) {
                if (a0Var.f23551f != null) {
                    a0Var.d(i10, n10, true, true);
                }
            }
            b0 b0Var2 = this.f23588o;
            if (b0Var2 != null) {
                b0Var2.e(i0Var);
            }
            return true;
        }
        return false;
    }

    @Override // l.x
    public final void n(o oVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f23590q = true;
        this.f23576c.c(true);
        ViewTreeObserver viewTreeObserver = this.f23589p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f23589p = this.f23587n.getViewTreeObserver();
            }
            this.f23589p.removeGlobalOnLayoutListener(this.f23583j);
            this.f23589p = null;
        }
        this.f23587n.removeOnAttachStateChangeListener(this.f23584k);
        PopupWindow.OnDismissListener onDismissListener = this.f23585l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i10 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // l.x
    public final void p(View view) {
        this.f23586m = view;
    }

    @Override // l.x
    public final void q(boolean z10) {
        this.f23577d.f23631c = z10;
    }

    @Override // l.x
    public final void r(int i10) {
        this.f23593t = i10;
    }

    @Override // l.x
    public final void s(int i10) {
        this.f23582i.f25563f = i10;
    }

    @Override // l.x
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f23585l = onDismissListener;
    }

    @Override // l.x
    public final void u(boolean z10) {
        this.f23594u = z10;
    }

    @Override // l.x
    public final void v(int i10) {
        this.f23582i.j(i10);
    }
}
