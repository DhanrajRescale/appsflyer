package h;

import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import m.b4;
import m.r2;
import q3.b1;

/* loaded from: classes.dex */
public abstract class m extends androidx.fragment.app.j0 implements n {

    /* renamed from: a, reason: collision with root package name */
    public e0 f17712a;

    public m() {
        getSavedStateRegistry().c("androidx:appcompat", new k(this));
        addOnContextAvailableListener(new l(this));
    }

    @Override // androidx.activity.m, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        s();
        e0 e0Var = (e0) q();
        e0Var.w();
        ((ViewGroup) e0Var.B.findViewById(R.id.content)).addView(view, layoutParams);
        e0Var.f17636m.a(e0Var.f17634l.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Configuration configuration;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        e0 e0Var = (e0) q();
        e0Var.f17627g0 = true;
        int i18 = e0Var.f17633k0;
        if (i18 == -100) {
            i18 = q.f17722b;
        }
        int C = e0Var.C(i18, context);
        if (q.c(context) && q.c(context)) {
            if (y3.b.c()) {
                if (!q.f17726f) {
                    q.f17721a.execute(new androidx.activity.b(context, 4));
                }
            } else {
                synchronized (q.f17729i) {
                    try {
                        y3.l lVar = q.f17723c;
                        if (lVar == null) {
                            if (q.f17724d == null) {
                                q.f17724d = y3.l.a(qu.i0.F(context));
                            }
                            if (!q.f17724d.b()) {
                                q.f17723c = q.f17724d;
                            }
                        } else if (!lVar.equals(q.f17724d)) {
                            y3.l lVar2 = q.f17723c;
                            q.f17724d = lVar2;
                            qu.i0.E(context, ((y3.n) lVar2.f41146a).f41147a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            }
        }
        y3.l o10 = e0.o(context);
        if (e0.C0 && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(e0.s(context, C, o10, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof k.e) {
            try {
                ((k.e) context).a(e0.s(context, C, o10, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (e0.B0) {
            int i19 = Build.VERSION.SDK_INT;
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = s0.g.f34069a;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = s0.g.f34069a;
                if (configuration3.diff(configuration4) != 0) {
                    float f10 = configuration3.fontScale;
                    float f11 = configuration4.fontScale;
                    if (f10 != f11) {
                        configuration.fontScale = f11;
                    }
                    int i20 = configuration3.mcc;
                    int i21 = configuration4.mcc;
                    if (i20 != i21) {
                        configuration.mcc = i21;
                    }
                    int i22 = configuration3.mnc;
                    int i23 = configuration4.mnc;
                    if (i22 != i23) {
                        configuration.mnc = i23;
                    }
                    v.a(configuration3, configuration4, configuration);
                    int i24 = configuration3.touchscreen;
                    int i25 = configuration4.touchscreen;
                    if (i24 != i25) {
                        configuration.touchscreen = i25;
                    }
                    int i26 = configuration3.keyboard;
                    int i27 = configuration4.keyboard;
                    if (i26 != i27) {
                        configuration.keyboard = i27;
                    }
                    int i28 = configuration3.keyboardHidden;
                    int i29 = configuration4.keyboardHidden;
                    if (i28 != i29) {
                        configuration.keyboardHidden = i29;
                    }
                    int i30 = configuration3.navigation;
                    int i31 = configuration4.navigation;
                    if (i30 != i31) {
                        configuration.navigation = i31;
                    }
                    int i32 = configuration3.navigationHidden;
                    int i33 = configuration4.navigationHidden;
                    if (i32 != i33) {
                        configuration.navigationHidden = i33;
                    }
                    int i34 = configuration3.orientation;
                    int i35 = configuration4.orientation;
                    if (i34 != i35) {
                        configuration.orientation = i35;
                    }
                    int i36 = configuration3.screenLayout & 15;
                    int i37 = configuration4.screenLayout & 15;
                    if (i36 != i37) {
                        configuration.screenLayout |= i37;
                    }
                    int i38 = configuration3.screenLayout & 192;
                    int i39 = configuration4.screenLayout & 192;
                    if (i38 != i39) {
                        configuration.screenLayout |= i39;
                    }
                    int i40 = configuration3.screenLayout & 48;
                    int i41 = configuration4.screenLayout & 48;
                    if (i40 != i41) {
                        configuration.screenLayout |= i41;
                    }
                    int i42 = configuration3.screenLayout & 768;
                    int i43 = configuration4.screenLayout & 768;
                    if (i42 != i43) {
                        configuration.screenLayout |= i43;
                    }
                    if (i19 >= 26) {
                        i10 = configuration3.colorMode;
                        int i44 = i10 & 3;
                        i11 = configuration4.colorMode;
                        if (i44 != (i11 & 3)) {
                            i16 = configuration.colorMode;
                            i17 = configuration4.colorMode;
                            configuration.colorMode = i16 | (i17 & 3);
                        }
                        i12 = configuration3.colorMode;
                        int i45 = i12 & 12;
                        i13 = configuration4.colorMode;
                        if (i45 != (i13 & 12)) {
                            i14 = configuration.colorMode;
                            i15 = configuration4.colorMode;
                            configuration.colorMode = i14 | (i15 & 12);
                        }
                    }
                    int i46 = configuration3.uiMode & 15;
                    int i47 = configuration4.uiMode & 15;
                    if (i46 != i47) {
                        configuration.uiMode |= i47;
                    }
                    int i48 = configuration3.uiMode & 48;
                    int i49 = configuration4.uiMode & 48;
                    if (i48 != i49) {
                        configuration.uiMode |= i49;
                    }
                    int i50 = configuration3.screenWidthDp;
                    int i51 = configuration4.screenWidthDp;
                    if (i50 != i51) {
                        configuration.screenWidthDp = i51;
                    }
                    int i52 = configuration3.screenHeightDp;
                    int i53 = configuration4.screenHeightDp;
                    if (i52 != i53) {
                        configuration.screenHeightDp = i53;
                    }
                    int i54 = configuration3.smallestScreenWidthDp;
                    int i55 = configuration4.smallestScreenWidthDp;
                    if (i54 != i55) {
                        configuration.smallestScreenWidthDp = i55;
                    }
                    int i56 = configuration3.densityDpi;
                    int i57 = configuration4.densityDpi;
                    if (i56 != i57) {
                        configuration.densityDpi = i57;
                    }
                }
            } else {
                configuration = null;
            }
            Configuration s7 = e0.s(context, C, o10, configuration, true);
            k.e eVar = new k.e(context, 2132083407);
            eVar.a(s7);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = eVar.getTheme();
                    if (i19 >= 29) {
                        t3.o.a(theme);
                    } else {
                        synchronized (t3.n.f35321a) {
                            if (!t3.n.f35323c) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                                    t3.n.f35322b = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e10) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e10);
                                }
                                t3.n.f35323c = true;
                            }
                            Method method = t3.n.f35322b;
                            if (method != null) {
                                try {
                                    method.invoke(theme, new Object[0]);
                                } catch (IllegalAccessException | InvocationTargetException e11) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e11);
                                    t3.n.f35322b = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = eVar;
        }
        super.attachBaseContext(context);
    }

    @Override // h.n
    public final void c() {
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        vl.b r10 = r();
        if (getWindow().hasFeature(0)) {
            if (r10 == null || !r10.g()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // q3.o, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        vl.b r10 = r();
        if (keyCode == 82 && r10 != null && r10.M(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i10) {
        e0 e0Var = (e0) q();
        e0Var.w();
        return e0Var.f17634l.findViewById(i10);
    }

    @Override // h.n
    public final void g() {
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        Context context;
        e0 e0Var = (e0) q();
        if (e0Var.f17641p == null) {
            e0Var.A();
            vl.b bVar = e0Var.f17639o;
            if (bVar != null) {
                context = bVar.C();
            } else {
                context = e0Var.f17632k;
            }
            e0Var.f17641p = new k.j(context);
        }
        return e0Var.f17641p;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i10 = b4.f25495a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        q().b();
    }

    @Override // h.n
    public final void j() {
    }

    @Override // androidx.activity.m, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        e0 e0Var = (e0) q();
        if (e0Var.G && e0Var.A) {
            e0Var.A();
            vl.b bVar = e0Var.f17639o;
            if (bVar != null) {
                bVar.J();
            }
        }
        m.x a10 = m.x.a();
        Context context = e0Var.f17632k;
        synchronized (a10) {
            r2 r2Var = a10.f25797a;
            synchronized (r2Var) {
                t.o oVar = (t.o) r2Var.f25703b.get(context);
                if (oVar != null) {
                    oVar.a();
                }
            }
        }
        e0Var.f17631j0 = new Configuration(e0Var.f17632k.getResources().getConfiguration());
        e0Var.l(false, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // androidx.fragment.app.j0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        q().e();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.fragment.app.j0, androidx.activity.m, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        vl.b r10 = r();
        if (menuItem.getItemId() == 16908332 && r10 != null && (r10.s() & 4) != 0) {
            return t();
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    @Override // androidx.activity.m, android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((e0) q()).w();
    }

    @Override // androidx.fragment.app.j0, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        e0 e0Var = (e0) q();
        e0Var.A();
        vl.b bVar = e0Var.f17639o;
        if (bVar != null) {
            bVar.k0(true);
        }
    }

    @Override // androidx.fragment.app.j0, android.app.Activity
    public void onStart() {
        super.onStart();
        ((e0) q()).l(true, false);
    }

    @Override // androidx.fragment.app.j0, android.app.Activity
    public void onStop() {
        super.onStop();
        e0 e0Var = (e0) q();
        e0Var.A();
        vl.b bVar = e0Var.f17639o;
        if (bVar != null) {
            bVar.k0(false);
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        q().k(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        vl.b r10 = r();
        if (getWindow().hasFeature(0)) {
            if (r10 == null || !r10.Y()) {
                super.openOptionsMenu();
            }
        }
    }

    public final q q() {
        if (this.f17712a == null) {
            n0 n0Var = q.f17721a;
            this.f17712a = new e0(this, null, this, this);
        }
        return this.f17712a;
    }

    public final vl.b r() {
        e0 e0Var = (e0) q();
        e0Var.A();
        return e0Var.f17639o;
    }

    public final void s() {
        yk.j.r1(getWindow().getDecorView(), this);
        qu.i0.H(getWindow().getDecorView(), this);
        yk.g.Z(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullParameter(decorView, "<this>");
        Intrinsics.checkNotNullParameter(this, "onBackPressedDispatcherOwner");
        decorView.setTag(com.assetgro.stockgro.prod.R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    @Override // androidx.activity.m, android.app.Activity
    public final void setContentView(int i10) {
        s();
        q().h(i10);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i10) {
        super.setTheme(i10);
        ((e0) q()).f17635l0 = i10;
    }

    @Override // androidx.fragment.app.j0
    public final void supportInvalidateOptionsMenu() {
        q().b();
    }

    public boolean t() {
        Intent a12 = yk.j.a1(this);
        if (a12 != null) {
            if (q3.u.c(this, a12)) {
                b1 b1Var = new b1(this);
                Intent a13 = yk.j.a1(this);
                if (a13 == null) {
                    a13 = yk.j.a1(this);
                }
                if (a13 != null) {
                    ComponentName component = a13.getComponent();
                    if (component == null) {
                        component = a13.resolveActivity(b1Var.f31585b.getPackageManager());
                    }
                    b1Var.e(component);
                    b1Var.b(a13);
                }
                b1Var.g();
                try {
                    int i10 = q3.h.f31615a;
                    q3.a.a(this);
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            }
            q3.u.b(this, a12);
            return true;
        }
        return false;
    }

    public final void u(Toolbar toolbar) {
        CharSequence charSequence;
        e0 e0Var = (e0) q();
        if (e0Var.f17630j instanceof Activity) {
            e0Var.A();
            vl.b bVar = e0Var.f17639o;
            if (!(bVar instanceof x0)) {
                e0Var.f17641p = null;
                if (bVar != null) {
                    bVar.K();
                }
                e0Var.f17639o = null;
                if (toolbar != null) {
                    Object obj = e0Var.f17630j;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = e0Var.f17643q;
                    }
                    s0 s0Var = new s0(toolbar, charSequence, e0Var.f17636m);
                    e0Var.f17639o = s0Var;
                    e0Var.f17636m.f17786b = s0Var.f17740i;
                    toolbar.setBackInvokedCallbackEnabled(true);
                } else {
                    e0Var.f17636m.f17786b = null;
                }
                e0Var.b();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    @Override // androidx.activity.m, android.app.Activity
    public void setContentView(View view) {
        s();
        q().i(view);
    }

    @Override // androidx.activity.m, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        s();
        q().j(view, layoutParams);
    }
}
