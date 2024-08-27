package h;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import d4.b1;
import d4.b2;
import d4.c1;
import d4.d3;
import d4.n1;
import d4.y0;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import m.d4;
import m.l1;
import m.w3;

/* loaded from: classes.dex */
public final class e0 extends q implements l.m, LayoutInflater.Factory2 {
    public boolean A;
    public ViewGroup B;
    public TextView C;
    public View D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean X;
    public boolean Y;
    public d0[] Z;

    /* renamed from: e0, reason: collision with root package name */
    public d0 f17625e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f17626f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f17627g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f17628h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f17629i0;

    /* renamed from: j, reason: collision with root package name */
    public final Object f17630j;

    /* renamed from: j0, reason: collision with root package name */
    public Configuration f17631j0;

    /* renamed from: k, reason: collision with root package name */
    public final Context f17632k;

    /* renamed from: k0, reason: collision with root package name */
    public final int f17633k0;

    /* renamed from: l, reason: collision with root package name */
    public Window f17634l;

    /* renamed from: l0, reason: collision with root package name */
    public int f17635l0;

    /* renamed from: m, reason: collision with root package name */
    public y f17636m;

    /* renamed from: m0, reason: collision with root package name */
    public int f17637m0;

    /* renamed from: n, reason: collision with root package name */
    public final n f17638n;
    public boolean n0;

    /* renamed from: o, reason: collision with root package name */
    public vl.b f17639o;

    /* renamed from: o0, reason: collision with root package name */
    public z f17640o0;

    /* renamed from: p, reason: collision with root package name */
    public k.j f17641p;

    /* renamed from: p0, reason: collision with root package name */
    public z f17642p0;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f17643q;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f17644q0;

    /* renamed from: r, reason: collision with root package name */
    public l1 f17645r;

    /* renamed from: r0, reason: collision with root package name */
    public int f17646r0;

    /* renamed from: s, reason: collision with root package name */
    public t9.c f17647s;

    /* renamed from: t, reason: collision with root package name */
    public s f17649t;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f17650t0;

    /* renamed from: u, reason: collision with root package name */
    public k.b f17651u;

    /* renamed from: u0, reason: collision with root package name */
    public Rect f17652u0;

    /* renamed from: v, reason: collision with root package name */
    public ActionBarContextView f17653v;

    /* renamed from: v0, reason: collision with root package name */
    public Rect f17654v0;

    /* renamed from: w, reason: collision with root package name */
    public PopupWindow f17655w;

    /* renamed from: w0, reason: collision with root package name */
    public j0 f17656w0;

    /* renamed from: x, reason: collision with root package name */
    public r f17657x;

    /* renamed from: x0, reason: collision with root package name */
    public OnBackInvokedDispatcher f17658x0;

    /* renamed from: y0, reason: collision with root package name */
    public OnBackInvokedCallback f17660y0;

    /* renamed from: z0, reason: collision with root package name */
    public static final t.j0 f17624z0 = new t.j0(0);
    public static final int[] A0 = {R.attr.windowBackground};
    public static final boolean B0 = !"robolectric".equals(Build.FINGERPRINT);
    public static final boolean C0 = true;

    /* renamed from: y, reason: collision with root package name */
    public b2 f17659y = null;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f17661z = true;

    /* renamed from: s0, reason: collision with root package name */
    public final r f17648s0 = new r(this, 0);

    public e0(Context context, Window window, n nVar, Object obj) {
        m mVar = null;
        this.f17633k0 = -100;
        this.f17632k = context;
        this.f17638n = nVar;
        this.f17630j = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (context instanceof m) {
                        mVar = (m) context;
                        break;
                    } else if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    break;
                }
            }
            if (mVar != null) {
                this.f17633k0 = ((e0) mVar.q()).f17633k0;
            }
        }
        if (this.f17633k0 == -100) {
            t.j0 j0Var = f17624z0;
            Integer num = (Integer) j0Var.get(this.f17630j.getClass().getName());
            if (num != null) {
                this.f17633k0 = num.intValue();
                j0Var.remove(this.f17630j.getClass().getName());
            }
        }
        if (window != null) {
            m(window);
        }
        m.x.d();
    }

    public static y3.l o(Context context) {
        y3.l lVar;
        y3.l lVar2;
        Locale locale;
        if (Build.VERSION.SDK_INT >= 33 || (lVar = q.f17723c) == null) {
            return null;
        }
        y3.l b10 = v.b(context.getApplicationContext().getResources().getConfiguration());
        if (lVar.b()) {
            lVar2 = y3.l.f41145b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i10 = 0;
            while (true) {
                y3.m mVar = lVar.f41146a;
                if (i10 >= ((y3.n) b10.f41146a).f41147a.size() + ((y3.n) mVar).f41147a.size()) {
                    break;
                }
                if (i10 < ((y3.n) mVar).f41147a.size()) {
                    locale = ((y3.n) mVar).f41147a.get(i10);
                } else {
                    locale = ((y3.n) b10.f41146a).f41147a.get(i10 - ((y3.n) mVar).f41147a.size());
                }
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i10++;
            }
            lVar2 = new y3.l(new y3.n(y3.k.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        if (!lVar2.b()) {
            return lVar2;
        }
        return b10;
    }

    public static Configuration s(Context context, int i10, y3.l lVar, Configuration configuration, boolean z10) {
        int i11;
        if (i10 != 1) {
            if (i10 != 2) {
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                }
            } else {
                i11 = 32;
            }
        } else {
            i11 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = s0.g.f34069a;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (lVar != null) {
            v.d(configuration2, lVar);
        }
        return configuration2;
    }

    public final void A() {
        w();
        if (this.G && this.f17639o == null) {
            Object obj = this.f17630j;
            if (obj instanceof Activity) {
                this.f17639o = new x0((Activity) obj, this.H);
            } else if (obj instanceof Dialog) {
                this.f17639o = new x0((Dialog) obj);
            }
            vl.b bVar = this.f17639o;
            if (bVar != null) {
                bVar.i0(this.f17650t0);
            }
        }
    }

    public final void B(int i10) {
        this.f17646r0 = (1 << i10) | this.f17646r0;
        if (!this.f17644q0) {
            View decorView = this.f17634l.getDecorView();
            WeakHashMap weakHashMap = n1.f13788a;
            d4.v0.m(decorView, this.f17648s0);
            this.f17644q0 = true;
        }
    }

    public final int C(int i10, Context context) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2) {
                    if (i10 == 3) {
                        if (this.f17642p0 == null) {
                            this.f17642p0 = new z(this, context);
                        }
                        return this.f17642p0.c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                return i10;
            }
            if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            }
            return y(context).c();
        }
        return i10;
    }

    public final boolean D() {
        boolean z10 = this.f17626f0;
        this.f17626f0 = false;
        d0 z11 = z(0);
        if (z11.f17602m) {
            if (!z10) {
                r(z11, true);
            }
            return true;
        }
        k.b bVar = this.f17651u;
        if (bVar != null) {
            bVar.a();
            return true;
        }
        A();
        vl.b bVar2 = this.f17639o;
        if (bVar2 == null || !bVar2.i()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0172, code lost:
    
        if (r3.f23628f.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0152, code lost:
    
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(h.d0 r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.e0.E(h.d0, android.view.KeyEvent):void");
    }

    public final boolean F(d0 d0Var, int i10, KeyEvent keyEvent) {
        l.o oVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!d0Var.f17600k && !G(d0Var, keyEvent)) || (oVar = d0Var.f17597h) == null) {
            return false;
        }
        return oVar.performShortcut(i10, keyEvent, 1);
    }

    public final boolean G(d0 d0Var, KeyEvent keyEvent) {
        boolean z10;
        l1 l1Var;
        l1 l1Var2;
        Resources.Theme theme;
        int i10;
        boolean z11;
        l1 l1Var3;
        l1 l1Var4;
        if (this.f17629i0) {
            return false;
        }
        if (d0Var.f17600k) {
            return true;
        }
        d0 d0Var2 = this.f17625e0;
        if (d0Var2 != null && d0Var2 != d0Var) {
            r(d0Var2, false);
        }
        Window.Callback callback = this.f17634l.getCallback();
        int i11 = d0Var.f17590a;
        if (callback != null) {
            d0Var.f17596g = callback.onCreatePanelView(i11);
        }
        if (i11 != 0 && i11 != 108) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && (l1Var4 = this.f17645r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) l1Var4;
            actionBarOverlayLayout.k();
            ((w3) actionBarOverlayLayout.f955e).f25791l = true;
        }
        if (d0Var.f17596g == null && (!z10 || !(this.f17639o instanceof s0))) {
            l.o oVar = d0Var.f17597h;
            if (oVar == null || d0Var.f17604o) {
                if (oVar == null) {
                    Context context = this.f17632k;
                    if ((i11 == 0 || i11 == 108) && this.f17645r != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(com.assetgro.stockgro.prod.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(com.assetgro.stockgro.prod.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(com.assetgro.stockgro.prod.R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            k.e eVar = new k.e(context, 0);
                            eVar.getTheme().setTo(theme);
                            context = eVar;
                        }
                    }
                    l.o oVar2 = new l.o(context);
                    oVar2.f23640e = this;
                    l.o oVar3 = d0Var.f17597h;
                    if (oVar2 != oVar3) {
                        if (oVar3 != null) {
                            oVar3.r(d0Var.f17598i);
                        }
                        d0Var.f17597h = oVar2;
                        l.k kVar = d0Var.f17598i;
                        if (kVar != null) {
                            oVar2.b(kVar, oVar2.f23636a);
                        }
                    }
                    if (d0Var.f17597h == null) {
                        return false;
                    }
                }
                if (z10 && (l1Var2 = this.f17645r) != null) {
                    if (this.f17647s == null) {
                        this.f17647s = new t9.c(this, 2);
                    }
                    ((ActionBarOverlayLayout) l1Var2).l(d0Var.f17597h, this.f17647s);
                }
                d0Var.f17597h.z();
                if (!callback.onCreatePanelMenu(i11, d0Var.f17597h)) {
                    l.o oVar4 = d0Var.f17597h;
                    if (oVar4 != null) {
                        if (oVar4 != null) {
                            oVar4.r(d0Var.f17598i);
                        }
                        d0Var.f17597h = null;
                    }
                    if (z10 && (l1Var = this.f17645r) != null) {
                        ((ActionBarOverlayLayout) l1Var).l(null, this.f17647s);
                    }
                    return false;
                }
                d0Var.f17604o = false;
            }
            d0Var.f17597h.z();
            Bundle bundle = d0Var.f17605p;
            if (bundle != null) {
                d0Var.f17597h.s(bundle);
                d0Var.f17605p = null;
            }
            if (!callback.onPreparePanel(0, d0Var.f17596g, d0Var.f17597h)) {
                if (z10 && (l1Var3 = this.f17645r) != null) {
                    ((ActionBarOverlayLayout) l1Var3).l(null, this.f17647s);
                }
                d0Var.f17597h.y();
                return false;
            }
            if (keyEvent != null) {
                i10 = keyEvent.getDeviceId();
            } else {
                i10 = -1;
            }
            if (KeyCharacterMap.load(i10).getKeyboardType() != 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            d0Var.f17597h.setQwertyMode(z11);
            d0Var.f17597h.y();
        }
        d0Var.f17600k = true;
        d0Var.f17601l = false;
        this.f17625e0 = d0Var;
        return true;
    }

    public final void H() {
        if (!this.A) {
        } else {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void I() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z10 = false;
            if (this.f17658x0 != null && (z(0).f17602m || this.f17651u != null)) {
                z10 = true;
            }
            if (z10 && this.f17660y0 == null) {
                this.f17660y0 = x.b(this.f17658x0, this);
            } else if (!z10 && (onBackInvokedCallback = this.f17660y0) != null) {
                x.c(this.f17658x0, onBackInvokedCallback);
            }
        }
    }

    public final int J(d3 d3Var, Rect rect) {
        int i10;
        boolean z10;
        int b10;
        int c10;
        boolean z11;
        int color;
        int i11 = 0;
        if (d3Var != null) {
            i10 = d3Var.d();
        } else if (rect != null) {
            i10 = rect.top;
        } else {
            i10 = 0;
        }
        ActionBarContextView actionBarContextView = this.f17653v;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f17653v.getLayoutParams();
            boolean z12 = true;
            if (this.f17653v.isShown()) {
                if (this.f17652u0 == null) {
                    this.f17652u0 = new Rect();
                    this.f17654v0 = new Rect();
                }
                Rect rect2 = this.f17652u0;
                Rect rect3 = this.f17654v0;
                if (d3Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(d3Var.b(), d3Var.d(), d3Var.c(), d3Var.a());
                }
                ViewGroup viewGroup = this.B;
                Method method = d4.f25513a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect2, rect3);
                    } catch (Exception e10) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e10);
                    }
                }
                int i12 = rect2.top;
                int i13 = rect2.left;
                int i14 = rect2.right;
                ViewGroup viewGroup2 = this.B;
                WeakHashMap weakHashMap = n1.f13788a;
                d3 a10 = c1.a(viewGroup2);
                if (a10 == null) {
                    b10 = 0;
                } else {
                    b10 = a10.b();
                }
                if (a10 == null) {
                    c10 = 0;
                } else {
                    c10 = a10.c();
                }
                if (marginLayoutParams.topMargin == i12 && marginLayoutParams.leftMargin == i13 && marginLayoutParams.rightMargin == i14) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i12;
                    marginLayoutParams.leftMargin = i13;
                    marginLayoutParams.rightMargin = i14;
                    z11 = true;
                }
                Context context = this.f17632k;
                if (i12 > 0 && this.D == null) {
                    View view = new View(context);
                    this.D = view;
                    view.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b10;
                    layoutParams.rightMargin = c10;
                    this.B.addView(this.D, -1, layoutParams);
                } else {
                    View view2 = this.D;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i15 = marginLayoutParams2.height;
                        int i16 = marginLayoutParams.topMargin;
                        if (i15 != i16 || marginLayoutParams2.leftMargin != b10 || marginLayoutParams2.rightMargin != c10) {
                            marginLayoutParams2.height = i16;
                            marginLayoutParams2.leftMargin = b10;
                            marginLayoutParams2.rightMargin = c10;
                            this.D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = this.D;
                if (view3 == null) {
                    z12 = false;
                }
                if (z12 && view3.getVisibility() != 0) {
                    View view4 = this.D;
                    if ((d4.v0.g(view4) & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                        color = r3.k.getColor(context, com.assetgro.stockgro.prod.R.color.abc_decor_view_status_guard_light);
                    } else {
                        color = r3.k.getColor(context, com.assetgro.stockgro.prod.R.color.abc_decor_view_status_guard);
                    }
                    view4.setBackgroundColor(color);
                }
                if (!this.I && z12) {
                    i10 = 0;
                }
                z10 = z12;
                z12 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z12 = false;
            }
            if (z12) {
                this.f17653v.setLayoutParams(marginLayoutParams);
            }
        } else {
            z10 = false;
        }
        View view5 = this.D;
        if (view5 != null) {
            if (!z10) {
                i11 = 8;
            }
            view5.setVisibility(i11);
        }
        return i10;
    }

    @Override // h.q
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f17632k);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof e0)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // h.q
    public final void b() {
        if (this.f17639o != null) {
            A();
            if (!this.f17639o.G()) {
                B(0);
            }
        }
    }

    @Override // h.q
    public final void d(Bundle bundle) {
        String str;
        this.f17627g0 = true;
        l(false, true);
        x();
        Object obj = this.f17630j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = yk.j.c1(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new IllegalArgumentException(e10);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                vl.b bVar = this.f17639o;
                if (bVar == null) {
                    this.f17650t0 = true;
                } else {
                    bVar.i0(true);
                }
            }
            synchronized (q.f17728h) {
                q.f(this);
                q.f17727g.add(new WeakReference(this));
            }
        }
        this.f17631j0 = new Configuration(this.f17632k.getResources().getConfiguration());
        this.f17628h0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // h.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f17630j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = h.q.f17728h
            monitor-enter(r0)
            h.q.f(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f17644q0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f17634l
            android.view.View r0 = r0.getDecorView()
            h.r r1 = r3.f17648s0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.f17629i0 = r0
            int r0 = r3.f17633k0
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f17630j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            t.j0 r0 = h.e0.f17624z0
            java.lang.Object r1 = r3.f17630j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f17633k0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            t.j0 r0 = h.e0.f17624z0
            java.lang.Object r1 = r3.f17630j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            vl.b r0 = r3.f17639o
            if (r0 == 0) goto L63
            r0.K()
        L63:
            h.z r0 = r3.f17640o0
            if (r0 == 0) goto L6a
            r0.a()
        L6a:
            h.z r0 = r3.f17642p0
            if (r0 == 0) goto L71
            r0.a()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.e0.e():void");
    }

    @Override // h.q
    public final boolean g(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i10 = 108;
        } else if (i10 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i10 = 109;
        }
        if (this.X && i10 == 108) {
            return false;
        }
        if (this.G && i10 == 1) {
            this.G = false;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 5) {
                    if (i10 != 10) {
                        if (i10 != 108) {
                            if (i10 != 109) {
                                return this.f17634l.requestFeature(i10);
                            }
                            H();
                            this.H = true;
                            return true;
                        }
                        H();
                        this.G = true;
                        return true;
                    }
                    H();
                    this.I = true;
                    return true;
                }
                H();
                this.F = true;
                return true;
            }
            H();
            this.E = true;
            return true;
        }
        H();
        this.X = true;
        return true;
    }

    @Override // h.q
    public final void h(int i10) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f17632k).inflate(i10, viewGroup);
        this.f17636m.a(this.f17634l.getCallback());
    }

    @Override // h.q
    public final void i(View view) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f17636m.a(this.f17634l.getCallback());
    }

    @Override // h.q
    public final void j(View view, ViewGroup.LayoutParams layoutParams) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f17636m.a(this.f17634l.getCallback());
    }

    @Override // h.q
    public final void k(CharSequence charSequence) {
        this.f17643q = charSequence;
        l1 l1Var = this.f17645r;
        if (l1Var != null) {
            l1Var.setWindowTitle(charSequence);
            return;
        }
        vl.b bVar = this.f17639o;
        if (bVar != null) {
            bVar.n0(charSequence);
            return;
        }
        TextView textView = this.C;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x021e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.e0.l(boolean, boolean):boolean");
    }

    public final void m(Window window) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        if (this.f17634l == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof y)) {
                y yVar = new y(this, callback);
                this.f17636m = yVar;
                window.setCallback(yVar);
                int[] iArr = A0;
                Context context = this.f17632k;
                c cVar = new c(context, context.obtainStyledAttributes((AttributeSet) null, iArr));
                Drawable w10 = cVar.w(0);
                if (w10 != null) {
                    window.setBackgroundDrawable(w10);
                }
                cVar.R();
                this.f17634l = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.f17658x0) == null) {
                    if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f17660y0) != null) {
                        x.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.f17660y0 = null;
                    }
                    Object obj = this.f17630j;
                    if (obj instanceof Activity) {
                        Activity activity = (Activity) obj;
                        if (activity.getWindow() != null) {
                            this.f17658x0 = x.a(activity);
                            I();
                            return;
                        }
                    }
                    this.f17658x0 = null;
                    I();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.h() != false) goto L20;
     */
    @Override // l.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(l.o r6) {
        /*
            r5 = this;
            m.l1 r6 = r5.f17645r
            r0 = 1
            r1 = 0
            if (r6 == 0) goto Ld3
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            m.m1 r6 = r6.f955e
            m.w3 r6 = (m.w3) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f25780a
            int r2 = r6.getVisibility()
            if (r2 != 0) goto Ld3
            androidx.appcompat.widget.ActionMenuView r6 = r6.f1107a
            if (r6 == 0) goto Ld3
            boolean r6 = r6.f980s
            if (r6 == 0) goto Ld3
            android.content.Context r6 = r5.f17632k
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L4a
            m.l1 r6 = r5.f17645r
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            m.m1 r6 = r6.f955e
            m.w3 r6 = (m.w3) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f25780a
            androidx.appcompat.widget.ActionMenuView r6 = r6.f1107a
            if (r6 == 0) goto Ld3
            m.n r6 = r6.f981t
            if (r6 == 0) goto Ld3
            m.j r2 = r6.f25652v
            if (r2 != 0) goto L4a
            boolean r6 = r6.h()
            if (r6 == 0) goto Ld3
        L4a:
            android.view.Window r6 = r5.f17634l
            android.view.Window$Callback r6 = r6.getCallback()
            m.l1 r2 = r5.f17645r
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = (androidx.appcompat.widget.ActionBarOverlayLayout) r2
            r2.k()
            m.m1 r2 = r2.f955e
            m.w3 r2 = (m.w3) r2
            androidx.appcompat.widget.Toolbar r2 = r2.f25780a
            boolean r2 = r2.q()
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 == 0) goto L8c
            m.l1 r0 = r5.f17645r
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.k()
            m.m1 r0 = r0.f955e
            m.w3 r0 = (m.w3) r0
            androidx.appcompat.widget.Toolbar r0 = r0.f25780a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f1107a
            if (r0 == 0) goto L7e
            m.n r0 = r0.f981t
            if (r0 == 0) goto L7e
            boolean r0 = r0.f()
        L7e:
            boolean r0 = r5.f17629i0
            if (r0 != 0) goto Le0
            h.d0 r0 = r5.z(r1)
            l.o r0 = r0.f17597h
            r6.onPanelClosed(r3, r0)
            goto Le0
        L8c:
            if (r6 == 0) goto Le0
            boolean r2 = r5.f17629i0
            if (r2 != 0) goto Le0
            boolean r2 = r5.f17644q0
            if (r2 == 0) goto La9
            int r2 = r5.f17646r0
            r0 = r0 & r2
            if (r0 == 0) goto La9
            android.view.Window r0 = r5.f17634l
            android.view.View r0 = r0.getDecorView()
            h.r r2 = r5.f17648s0
            r0.removeCallbacks(r2)
            r2.run()
        La9:
            h.d0 r0 = r5.z(r1)
            l.o r2 = r0.f17597h
            if (r2 == 0) goto Le0
            boolean r4 = r0.f17604o
            if (r4 != 0) goto Le0
            android.view.View r4 = r0.f17596g
            boolean r1 = r6.onPreparePanel(r1, r4, r2)
            if (r1 == 0) goto Le0
            l.o r0 = r0.f17597h
            r6.onMenuOpened(r3, r0)
            m.l1 r6 = r5.f17645r
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            m.m1 r6 = r6.f955e
            m.w3 r6 = (m.w3) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f25780a
            r6.w()
            goto Le0
        Ld3:
            h.d0 r6 = r5.z(r1)
            r6.f17603n = r0
            r5.r(r6, r1)
            r0 = 0
            r5.E(r6, r0)
        Le0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.e0.n(l.o):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x010d, code lost:
    
        if (r10.equals("ImageButton") == false) goto L24;
     */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 736
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.e0.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void p(int i10, d0 d0Var, l.o oVar) {
        if (oVar == null) {
            if (d0Var == null && i10 >= 0) {
                d0[] d0VarArr = this.Z;
                if (i10 < d0VarArr.length) {
                    d0Var = d0VarArr[i10];
                }
            }
            if (d0Var != null) {
                oVar = d0Var.f17597h;
            }
        }
        if ((d0Var == null || d0Var.f17602m) && !this.f17629i0) {
            y yVar = this.f17636m;
            Window.Callback callback = this.f17634l.getCallback();
            yVar.getClass();
            try {
                yVar.f17789e = true;
                callback.onPanelClosed(i10, oVar);
            } finally {
                yVar.f17789e = false;
            }
        }
    }

    public final void q(l.o oVar) {
        m.n nVar;
        if (this.Y) {
            return;
        }
        this.Y = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f17645r;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((w3) actionBarOverlayLayout.f955e).f25780a.f1107a;
        if (actionMenuView != null && (nVar = actionMenuView.f981t) != null) {
            nVar.f();
            m.h hVar = nVar.f25651u;
            if (hVar != null && hVar.b()) {
                hVar.f23555j.dismiss();
            }
        }
        Window.Callback callback = this.f17634l.getCallback();
        if (callback != null && !this.f17629i0) {
            callback.onPanelClosed(108, oVar);
        }
        this.Y = false;
    }

    public final void r(d0 d0Var, boolean z10) {
        c0 c0Var;
        l1 l1Var;
        if (z10 && d0Var.f17590a == 0 && (l1Var = this.f17645r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) l1Var;
            actionBarOverlayLayout.k();
            if (((w3) actionBarOverlayLayout.f955e).f25780a.q()) {
                q(d0Var.f17597h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f17632k.getSystemService("window");
        if (windowManager != null && d0Var.f17602m && (c0Var = d0Var.f17594e) != null) {
            windowManager.removeView(c0Var);
            if (z10) {
                p(d0Var.f17590a, d0Var, null);
            }
        }
        d0Var.f17600k = false;
        d0Var.f17601l = false;
        d0Var.f17602m = false;
        d0Var.f17595f = null;
        d0Var.f17603n = true;
        if (this.f17625e0 == d0Var) {
            this.f17625e0 = null;
        }
        if (d0Var.f17590a == 0) {
            I();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean t(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.e0.t(android.view.KeyEvent):boolean");
    }

    public final void u(int i10) {
        d0 z10 = z(i10);
        if (z10.f17597h != null) {
            Bundle bundle = new Bundle();
            z10.f17597h.u(bundle);
            if (bundle.size() > 0) {
                z10.f17605p = bundle;
            }
            z10.f17597h.z();
            z10.f17597h.clear();
        }
        z10.f17604o = true;
        z10.f17603n = true;
        if ((i10 == 108 || i10 == 0) && this.f17645r != null) {
            d0 z11 = z(0);
            z11.f17600k = false;
            G(z11, null);
        }
    }

    @Override // l.m
    public final boolean v(l.o oVar, MenuItem menuItem) {
        int i10;
        d0 d0Var;
        Window.Callback callback = this.f17634l.getCallback();
        if (callback != null && !this.f17629i0) {
            l.o k10 = oVar.k();
            d0[] d0VarArr = this.Z;
            if (d0VarArr != null) {
                i10 = d0VarArr.length;
            } else {
                i10 = 0;
            }
            int i11 = 0;
            while (true) {
                if (i11 < i10) {
                    d0Var = d0VarArr[i11];
                    if (d0Var != null && d0Var.f17597h == k10) {
                        break;
                    }
                    i11++;
                } else {
                    d0Var = null;
                    break;
                }
            }
            if (d0Var != null) {
                return callback.onMenuItemSelected(d0Var.f17590a, menuItem);
            }
        }
        return false;
    }

    public final void w() {
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.A) {
            int[] iArr = g.a.f16358j;
            Context context2 = this.f17632k;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(117)) {
                int i10 = 0;
                int i11 = 1;
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    g(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    g(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    g(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    g(10);
                }
                this.J = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                x();
                this.f17634l.getDecorView();
                LayoutInflater from = LayoutInflater.from(context2);
                if (!this.X) {
                    if (this.J) {
                        viewGroup = (ViewGroup) from.inflate(com.assetgro.stockgro.prod.R.layout.abc_dialog_title_material, (ViewGroup) null);
                        this.H = false;
                        this.G = false;
                    } else if (this.G) {
                        TypedValue typedValue = new TypedValue();
                        context2.getTheme().resolveAttribute(com.assetgro.stockgro.prod.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            context = new k.e(context2, typedValue.resourceId);
                        } else {
                            context = context2;
                        }
                        viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(com.assetgro.stockgro.prod.R.layout.abc_screen_toolbar, (ViewGroup) null);
                        l1 l1Var = (l1) viewGroup.findViewById(com.assetgro.stockgro.prod.R.id.decor_content_parent);
                        this.f17645r = l1Var;
                        l1Var.setWindowCallback(this.f17634l.getCallback());
                        if (this.H) {
                            ((ActionBarOverlayLayout) this.f17645r).j(109);
                        }
                        if (this.E) {
                            ((ActionBarOverlayLayout) this.f17645r).j(2);
                        }
                        if (this.F) {
                            ((ActionBarOverlayLayout) this.f17645r).j(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    viewGroup = this.I ? (ViewGroup) from.inflate(com.assetgro.stockgro.prod.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.assetgro.stockgro.prod.R.layout.abc_screen_simple, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    eb.f fVar = new eb.f(this, i10);
                    WeakHashMap weakHashMap = n1.f13788a;
                    b1.u(viewGroup, fVar);
                    if (this.f17645r == null) {
                        this.C = (TextView) viewGroup.findViewById(com.assetgro.stockgro.prod.R.id.title);
                    }
                    Method method = d4.f25513a;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, new Object[0]);
                    } catch (IllegalAccessException e10) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (InvocationTargetException e11) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e11);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.assetgro.stockgro.prod.R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.f17634l.findViewById(R.id.content);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(R.id.content);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground(null);
                        }
                    }
                    this.f17634l.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new e.l(this, i11));
                    this.B = viewGroup;
                    Object obj = this.f17630j;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.f17643q;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        l1 l1Var2 = this.f17645r;
                        if (l1Var2 != null) {
                            l1Var2.setWindowTitle(charSequence);
                        } else {
                            vl.b bVar = this.f17639o;
                            if (bVar != null) {
                                bVar.n0(charSequence);
                            } else {
                                TextView textView = this.C;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.B.findViewById(R.id.content);
                    View decorView = this.f17634l.getDecorView();
                    contentFrameLayout2.f1018g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap weakHashMap2 = n1.f13788a;
                    if (y0.c(contentFrameLayout2)) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(iArr);
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(122)) {
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.A = true;
                    d0 z10 = z(0);
                    if (!this.f17629i0 && z10.f17597h == null) {
                        B(108);
                        return;
                    }
                    return;
                }
                StringBuilder sb2 = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
                sb2.append(this.G);
                sb2.append(", windowActionBarOverlay: ");
                sb2.append(this.H);
                sb2.append(", android:windowIsFloating: ");
                sb2.append(this.J);
                sb2.append(", windowActionModeOverlay: ");
                sb2.append(this.I);
                sb2.append(", windowNoTitle: ");
                throw new IllegalArgumentException(da.e.o(sb2, this.X, " }"));
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void x() {
        if (this.f17634l == null) {
            Object obj = this.f17630j;
            if (obj instanceof Activity) {
                m(((Activity) obj).getWindow());
            }
        }
        if (this.f17634l != null) {
        } else {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final b0 y(Context context) {
        if (this.f17640o0 == null) {
            if (c.f17581e == null) {
                Context applicationContext = context.getApplicationContext();
                c.f17581e = new c(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f17640o0 = new z(this, c.f17581e);
        }
        return this.f17640o0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
    
        if (r2 <= r5) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, h.d0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final h.d0 z(int r5) {
        /*
            r4 = this;
            h.d0[] r0 = r4.Z
            r1 = 0
            if (r0 == 0) goto L8
            int r2 = r0.length
            if (r2 > r5) goto L15
        L8:
            int r2 = r5 + 1
            h.d0[] r2 = new h.d0[r2]
            if (r0 == 0) goto L12
            int r3 = r0.length
            java.lang.System.arraycopy(r0, r1, r2, r1, r3)
        L12:
            r4.Z = r2
            r0 = r2
        L15:
            r2 = r0[r5]
            if (r2 != 0) goto L24
            h.d0 r2 = new h.d0
            r2.<init>()
            r2.f17590a = r5
            r2.f17603n = r1
            r0[r5] = r2
        L24:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h.e0.z(int):h.d0");
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
