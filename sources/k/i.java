package k;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import l.q;
import l.r;
import l.w;

/* loaded from: classes.dex */
public final class i {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ j E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f21765a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21772h;

    /* renamed from: i, reason: collision with root package name */
    public int f21773i;

    /* renamed from: j, reason: collision with root package name */
    public int f21774j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f21775k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f21776l;

    /* renamed from: m, reason: collision with root package name */
    public int f21777m;

    /* renamed from: n, reason: collision with root package name */
    public char f21778n;

    /* renamed from: o, reason: collision with root package name */
    public int f21779o;

    /* renamed from: p, reason: collision with root package name */
    public char f21780p;

    /* renamed from: q, reason: collision with root package name */
    public int f21781q;

    /* renamed from: r, reason: collision with root package name */
    public int f21782r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f21783s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f21784t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f21785u;

    /* renamed from: v, reason: collision with root package name */
    public int f21786v;

    /* renamed from: w, reason: collision with root package name */
    public int f21787w;

    /* renamed from: x, reason: collision with root package name */
    public String f21788x;

    /* renamed from: y, reason: collision with root package name */
    public String f21789y;

    /* renamed from: z, reason: collision with root package name */
    public r f21790z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f21766b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f21767c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f21768d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f21769e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21770f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21771g = true;

    public i(j jVar, Menu menu) {
        this.E = jVar;
        this.f21765a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f21795c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e10) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [android.view.MenuItem$OnMenuItemClickListener, k.h, java.lang.Object] */
    public final void b(MenuItem menuItem) {
        boolean z10;
        MenuItem enabled = menuItem.setChecked(this.f21783s).setVisible(this.f21784t).setEnabled(this.f21785u);
        boolean z11 = false;
        if (this.f21782r >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        enabled.setCheckable(z10).setTitleCondensed(this.f21776l).setIcon(this.f21777m);
        int i10 = this.f21786v;
        if (i10 >= 0) {
            menuItem.setShowAsAction(i10);
        }
        String str = this.f21789y;
        j jVar = this.E;
        if (str != null) {
            if (!jVar.f21795c.isRestricted()) {
                if (jVar.f21796d == null) {
                    jVar.f21796d = j.a(jVar.f21795c);
                }
                Object obj = jVar.f21796d;
                String str2 = this.f21789y;
                ?? obj2 = new Object();
                obj2.f21763a = obj;
                Class<?> cls = obj.getClass();
                try {
                    obj2.f21764b = cls.getMethod(str2, h.f21762c);
                    menuItem.setOnMenuItemClickListener(obj2);
                } catch (Exception e10) {
                    StringBuilder s7 = da.e.s("Couldn't resolve menu item onClick handler ", str2, " in class ");
                    s7.append(cls.getName());
                    InflateException inflateException = new InflateException(s7.toString());
                    inflateException.initCause(e10);
                    throw inflateException;
                }
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.f21782r >= 2) {
            if (menuItem instanceof q) {
                ((q) menuItem).g(true);
            } else if (menuItem instanceof w) {
                w wVar = (w) menuItem;
                try {
                    Method method = wVar.f23698e;
                    w3.b bVar = wVar.f23697d;
                    if (method == null) {
                        wVar.f23698e = bVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    wVar.f23698e.invoke(bVar, Boolean.TRUE);
                } catch (Exception e11) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e11);
                }
            }
        }
        String str3 = this.f21788x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, j.f21791e, jVar.f21793a));
            z11 = true;
        }
        int i11 = this.f21787w;
        if (i11 > 0) {
            if (!z11) {
                menuItem.setActionView(i11);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        r rVar = this.f21790z;
        if (rVar != null) {
            if (menuItem instanceof w3.b) {
                ((w3.b) menuItem).b(rVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z12 = menuItem instanceof w3.b;
        if (z12) {
            ((w3.b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            d4.w.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z12) {
            ((w3.b) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            d4.w.m(menuItem, charSequence2);
        }
        char c10 = this.f21778n;
        int i12 = this.f21779o;
        if (z12) {
            ((w3.b) menuItem).setAlphabeticShortcut(c10, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            d4.w.g(menuItem, c10, i12);
        }
        char c11 = this.f21780p;
        int i13 = this.f21781q;
        if (z12) {
            ((w3.b) menuItem).setNumericShortcut(c11, i13);
        } else if (Build.VERSION.SDK_INT >= 26) {
            d4.w.k(menuItem, c11, i13);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z12) {
                ((w3.b) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                d4.w.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z12) {
                ((w3.b) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                d4.w.i(menuItem, colorStateList);
            }
        }
    }
}
