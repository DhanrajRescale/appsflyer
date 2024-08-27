package h;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import d4.a2;
import d4.b1;
import d4.b2;
import d4.n1;
import d4.y0;
import d4.y1;
import d4.z0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.m1;
import m.s3;
import m.w3;

/* loaded from: classes.dex */
public final class x0 extends vl.b implements m.f {
    public static final AccelerateInterpolator F = new AccelerateInterpolator();
    public static final DecelerateInterpolator G = new DecelerateInterpolator();
    public boolean A;
    public boolean B;
    public final v0 C;
    public final v0 D;
    public final t9.c E;

    /* renamed from: g, reason: collision with root package name */
    public Context f17765g;

    /* renamed from: h, reason: collision with root package name */
    public Context f17766h;

    /* renamed from: i, reason: collision with root package name */
    public ActionBarOverlayLayout f17767i;

    /* renamed from: j, reason: collision with root package name */
    public ActionBarContainer f17768j;

    /* renamed from: k, reason: collision with root package name */
    public m1 f17769k;

    /* renamed from: l, reason: collision with root package name */
    public ActionBarContextView f17770l;

    /* renamed from: m, reason: collision with root package name */
    public final View f17771m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f17772n;

    /* renamed from: o, reason: collision with root package name */
    public w0 f17773o;

    /* renamed from: p, reason: collision with root package name */
    public w0 f17774p;

    /* renamed from: q, reason: collision with root package name */
    public k.a f17775q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f17776r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f17777s;

    /* renamed from: t, reason: collision with root package name */
    public int f17778t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f17779u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f17780v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f17781w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f17782x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f17783y;

    /* renamed from: z, reason: collision with root package name */
    public k.l f17784z;

    public x0(Activity activity, boolean z10) {
        new ArrayList();
        this.f17777s = new ArrayList();
        this.f17778t = 0;
        this.f17779u = true;
        this.f17783y = true;
        this.C = new v0(this, 0);
        this.D = new v0(this, 1);
        this.E = new t9.c(this, 4);
        View decorView = activity.getWindow().getDecorView();
        u0(decorView);
        if (z10) {
            return;
        }
        this.f17771m = decorView.findViewById(R.id.content);
    }

    @Override // vl.b
    public final Context C() {
        if (this.f17766h == null) {
            TypedValue typedValue = new TypedValue();
            this.f17765g.getTheme().resolveAttribute(com.assetgro.stockgro.prod.R.attr.actionBarWidgetTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f17766h = new ContextThemeWrapper(this.f17765g, i10);
            } else {
                this.f17766h = this.f17765g;
            }
        }
        return this.f17766h;
    }

    @Override // vl.b
    public final void F() {
        if (!this.f17780v) {
            this.f17780v = true;
            w0(false);
        }
    }

    @Override // vl.b
    public final void J() {
        v0(this.f17765g.getResources().getBoolean(com.assetgro.stockgro.prod.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // vl.b
    public final boolean L(int i10, KeyEvent keyEvent) {
        l.o oVar;
        int i11;
        w0 w0Var = this.f17773o;
        if (w0Var == null || (oVar = w0Var.f17761d) == null) {
            return false;
        }
        if (keyEvent != null) {
            i11 = keyEvent.getDeviceId();
        } else {
            i11 = -1;
        }
        boolean z10 = true;
        if (KeyCharacterMap.load(i11).getKeyboardType() == 1) {
            z10 = false;
        }
        oVar.setQwertyMode(z10);
        return oVar.performShortcut(i10, keyEvent, 0);
    }

    @Override // vl.b
    public final boolean i() {
        s3 s3Var;
        l.q qVar;
        m1 m1Var = this.f17769k;
        if (m1Var != null && (s3Var = ((w3) m1Var).f25780a.f1116g0) != null && s3Var.f25719b != null) {
            s3 s3Var2 = ((w3) m1Var).f25780a.f1116g0;
            if (s3Var2 == null) {
                qVar = null;
            } else {
                qVar = s3Var2.f25719b;
            }
            if (qVar != null) {
                qVar.collapseActionView();
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // vl.b
    public final void i0(boolean z10) {
        int i10;
        if (!this.f17772n) {
            if (z10) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            w3 w3Var = (w3) this.f17769k;
            int i11 = w3Var.f25781b;
            this.f17772n = true;
            w3Var.a((i10 & 4) | (i11 & (-5)));
        }
    }

    @Override // vl.b
    public final void j0() {
        w3 w3Var = (w3) this.f17769k;
        w3Var.a(w3Var.f25781b & (-9));
    }

    @Override // vl.b
    public final void k0(boolean z10) {
        k.l lVar;
        this.A = z10;
        if (!z10 && (lVar = this.f17784z) != null) {
            lVar.a();
        }
    }

    @Override // vl.b
    public final void l0(String str) {
        w3 w3Var = (w3) this.f17769k;
        w3Var.f25786g = true;
        w3Var.f25787h = str;
        if ((w3Var.f25781b & 8) != 0) {
            Toolbar toolbar = w3Var.f25780a;
            toolbar.setTitle(str);
            if (w3Var.f25786g) {
                n1.o(toolbar.getRootView(), str);
            }
        }
    }

    @Override // vl.b
    public final void m(boolean z10) {
        if (z10 == this.f17776r) {
            return;
        }
        this.f17776r = z10;
        ArrayList arrayList = this.f17777s;
        if (arrayList.size() <= 0) {
            return;
        }
        a3.a.u(arrayList.get(0));
        throw null;
    }

    @Override // vl.b
    public final void n0(CharSequence charSequence) {
        w3 w3Var = (w3) this.f17769k;
        if (!w3Var.f25786g) {
            w3Var.f25787h = charSequence;
            if ((w3Var.f25781b & 8) != 0) {
                Toolbar toolbar = w3Var.f25780a;
                toolbar.setTitle(charSequence);
                if (w3Var.f25786g) {
                    n1.o(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // vl.b
    public final k.b o0(u uVar) {
        w0 w0Var = this.f17773o;
        if (w0Var != null) {
            w0Var.a();
        }
        this.f17767i.setHideOnContentScrollEnabled(false);
        this.f17770l.e();
        w0 w0Var2 = new w0(this, this.f17770l.getContext(), uVar);
        l.o oVar = w0Var2.f17761d;
        oVar.z();
        try {
            if (w0Var2.f17762e.c(w0Var2, oVar)) {
                this.f17773o = w0Var2;
                w0Var2.g();
                this.f17770l.c(w0Var2);
                t0(true);
                return w0Var2;
            }
            return null;
        } finally {
            oVar.y();
        }
    }

    @Override // vl.b
    public final int s() {
        return ((w3) this.f17769k).f25781b;
    }

    public final void t0(boolean z10) {
        b2 l10;
        b2 b2Var;
        long j10;
        if (z10) {
            if (!this.f17782x) {
                this.f17782x = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f17767i;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                w0(false);
            }
        } else if (this.f17782x) {
            this.f17782x = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f17767i;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            w0(false);
        }
        ActionBarContainer actionBarContainer = this.f17768j;
        WeakHashMap weakHashMap = n1.f13788a;
        if (y0.c(actionBarContainer)) {
            if (z10) {
                w3 w3Var = (w3) this.f17769k;
                l10 = n1.a(w3Var.f25780a);
                l10.a(s0.g.f34069a);
                l10.c(100L);
                l10.d(new k.k(w3Var, 4));
                b2Var = this.f17770l.l(0, 200L);
            } else {
                w3 w3Var2 = (w3) this.f17769k;
                b2 a10 = n1.a(w3Var2.f25780a);
                a10.a(1.0f);
                a10.c(200L);
                a10.d(new k.k(w3Var2, 0));
                l10 = this.f17770l.l(8, 100L);
                b2Var = a10;
            }
            k.l lVar = new k.l();
            ArrayList arrayList = lVar.f21801a;
            arrayList.add(l10);
            View view = (View) l10.f13721a.get();
            if (view != null) {
                j10 = view.animate().getDuration();
            } else {
                j10 = 0;
            }
            View view2 = (View) b2Var.f13721a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j10);
            }
            arrayList.add(b2Var);
            lVar.b();
            return;
        }
        if (z10) {
            ((w3) this.f17769k).f25780a.setVisibility(4);
            this.f17770l.setVisibility(0);
        } else {
            ((w3) this.f17769k).f25780a.setVisibility(0);
            this.f17770l.setVisibility(8);
        }
    }

    public final void u0(View view) {
        String str;
        m1 wrapper;
        boolean z10;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.assetgro.stockgro.prod.R.id.decor_content_parent);
        this.f17767i = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.assetgro.stockgro.prod.R.id.action_bar);
        if (findViewById instanceof m1) {
            wrapper = (m1) findViewById;
        } else if (findViewById instanceof Toolbar) {
            wrapper = ((Toolbar) findViewById).getWrapper();
        } else {
            if (findViewById != null) {
                str = findViewById.getClass().getSimpleName();
            } else {
                str = "null";
            }
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(str));
        }
        this.f17769k = wrapper;
        this.f17770l = (ActionBarContextView) view.findViewById(com.assetgro.stockgro.prod.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.assetgro.stockgro.prod.R.id.action_bar_container);
        this.f17768j = actionBarContainer;
        m1 m1Var = this.f17769k;
        if (m1Var != null && this.f17770l != null && actionBarContainer != null) {
            Context context = ((w3) m1Var).f25780a.getContext();
            this.f17765g = context;
            if ((((w3) this.f17769k).f25781b & 4) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f17772n = true;
            }
            b8.f fVar = new b8.f(context);
            int i10 = context.getApplicationInfo().targetSdkVersion;
            this.f17769k.getClass();
            v0(fVar.f4092a.getResources().getBoolean(com.assetgro.stockgro.prod.R.bool.abc_action_bar_embed_tabs));
            TypedArray obtainStyledAttributes = this.f17765g.obtainStyledAttributes(null, g.a.f16349a, com.assetgro.stockgro.prod.R.attr.actionBarStyle, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f17767i;
                if (actionBarOverlayLayout2.f958h) {
                    this.B = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.f17768j;
                WeakHashMap weakHashMap = n1.f13788a;
                b1.s(actionBarContainer2, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(x0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
    }

    public final void v0(boolean z10) {
        if (!z10) {
            ((w3) this.f17769k).getClass();
            this.f17768j.setTabContainer(null);
        } else {
            this.f17768j.setTabContainer(null);
            ((w3) this.f17769k).getClass();
        }
        this.f17769k.getClass();
        ((w3) this.f17769k).f25780a.setCollapsible(false);
        this.f17767i.setHasNonEmbeddedTabs(false);
    }

    public final void w0(boolean z10) {
        boolean z11;
        boolean z12 = this.f17780v;
        boolean z13 = this.f17781w;
        if (this.f17782x || (!z12 && !z13)) {
            z11 = true;
        } else {
            z11 = false;
        }
        t9.c cVar = this.E;
        View view = this.f17771m;
        y1 y1Var = null;
        if (z11) {
            if (!this.f17783y) {
                this.f17783y = true;
                k.l lVar = this.f17784z;
                if (lVar != null) {
                    lVar.a();
                }
                this.f17768j.setVisibility(0);
                int i10 = this.f17778t;
                v0 v0Var = this.D;
                if (i10 == 0 && (this.A || z10)) {
                    this.f17768j.setTranslationY(s0.g.f34069a);
                    float f10 = -this.f17768j.getHeight();
                    if (z10) {
                        this.f17768j.getLocationInWindow(new int[]{0, 0});
                        f10 -= r12[1];
                    }
                    this.f17768j.setTranslationY(f10);
                    k.l lVar2 = new k.l();
                    b2 a10 = n1.a(this.f17768j);
                    a10.e(s0.g.f34069a);
                    View view2 = (View) a10.f13721a.get();
                    if (view2 != null) {
                        if (cVar != null) {
                            y1Var = new y1(0, cVar, view2);
                        }
                        a2.a(view2.animate(), y1Var);
                    }
                    boolean z14 = lVar2.f21805e;
                    ArrayList arrayList = lVar2.f21801a;
                    if (!z14) {
                        arrayList.add(a10);
                    }
                    if (this.f17779u && view != null) {
                        view.setTranslationY(f10);
                        b2 a11 = n1.a(view);
                        a11.e(s0.g.f34069a);
                        if (!lVar2.f21805e) {
                            arrayList.add(a11);
                        }
                    }
                    DecelerateInterpolator decelerateInterpolator = G;
                    boolean z15 = lVar2.f21805e;
                    if (!z15) {
                        lVar2.f21803c = decelerateInterpolator;
                    }
                    if (!z15) {
                        lVar2.f21802b = 250L;
                    }
                    if (!z15) {
                        lVar2.f21804d = v0Var;
                    }
                    this.f17784z = lVar2;
                    lVar2.b();
                } else {
                    this.f17768j.setAlpha(1.0f);
                    this.f17768j.setTranslationY(s0.g.f34069a);
                    if (this.f17779u && view != null) {
                        view.setTranslationY(s0.g.f34069a);
                    }
                    v0Var.c();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f17767i;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = n1.f13788a;
                    z0.c(actionBarOverlayLayout);
                    return;
                }
                return;
            }
            return;
        }
        if (this.f17783y) {
            this.f17783y = false;
            k.l lVar3 = this.f17784z;
            if (lVar3 != null) {
                lVar3.a();
            }
            int i11 = this.f17778t;
            v0 v0Var2 = this.C;
            if (i11 == 0 && (this.A || z10)) {
                this.f17768j.setAlpha(1.0f);
                this.f17768j.setTransitioning(true);
                k.l lVar4 = new k.l();
                float f11 = -this.f17768j.getHeight();
                if (z10) {
                    this.f17768j.getLocationInWindow(new int[]{0, 0});
                    f11 -= r12[1];
                }
                b2 a12 = n1.a(this.f17768j);
                a12.e(f11);
                View view3 = (View) a12.f13721a.get();
                if (view3 != null) {
                    if (cVar != null) {
                        y1Var = new y1(0, cVar, view3);
                    }
                    a2.a(view3.animate(), y1Var);
                }
                boolean z16 = lVar4.f21805e;
                ArrayList arrayList2 = lVar4.f21801a;
                if (!z16) {
                    arrayList2.add(a12);
                }
                if (this.f17779u && view != null) {
                    b2 a13 = n1.a(view);
                    a13.e(f11);
                    if (!lVar4.f21805e) {
                        arrayList2.add(a13);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = F;
                boolean z17 = lVar4.f21805e;
                if (!z17) {
                    lVar4.f21803c = accelerateInterpolator;
                }
                if (!z17) {
                    lVar4.f21802b = 250L;
                }
                if (!z17) {
                    lVar4.f21804d = v0Var2;
                }
                this.f17784z = lVar4;
                lVar4.b();
                return;
            }
            v0Var2.c();
        }
    }

    public x0(Dialog dialog) {
        new ArrayList();
        this.f17777s = new ArrayList();
        this.f17778t = 0;
        this.f17779u = true;
        this.f17783y = true;
        this.C = new v0(this, 0);
        this.D = new v0(this, 1);
        this.E = new t9.c(this, 4);
        u0(dialog.getWindow().getDecorView());
    }
}
