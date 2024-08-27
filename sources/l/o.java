package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import d4.p1;
import d4.r1;
import in.juspay.hyper.constants.LogSubCategory;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class o implements w3.a {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f23635y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f23636a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f23637b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23638c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23639d;

    /* renamed from: e, reason: collision with root package name */
    public m f23640e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f23641f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f23642g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f23643h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f23644i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f23645j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f23646k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f23648m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f23649n;

    /* renamed from: o, reason: collision with root package name */
    public View f23650o;

    /* renamed from: v, reason: collision with root package name */
    public q f23657v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f23659x;

    /* renamed from: l, reason: collision with root package name */
    public int f23647l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f23651p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f23652q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f23653r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f23654s = false;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f23655t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f23656u = new CopyOnWriteArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f23658w = false;

    public o(Context context) {
        Resources resources;
        int identifier;
        boolean z10 = false;
        this.f23636a = context;
        Resources resources2 = context.getResources();
        this.f23637b = resources2;
        this.f23641f = new ArrayList();
        this.f23642g = new ArrayList();
        this.f23643h = true;
        this.f23644i = new ArrayList();
        this.f23645j = new ArrayList();
        this.f23646k = true;
        if (resources2.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = r1.f13811a;
            if (Build.VERSION.SDK_INT < 28 ? !((identifier = (resources = context.getResources()).getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", LogSubCategory.LifeCycle.ANDROID)) == 0 || !resources.getBoolean(identifier)) : p1.b(viewConfiguration)) {
                z10 = true;
            }
        }
        this.f23639d = z10;
    }

    public q a(int i10, int i11, int i12, CharSequence charSequence) {
        int i13;
        int i14 = ((-65536) & i12) >> 16;
        if (i14 >= 0 && i14 < 6) {
            int i15 = (f23635y[i14] << 16) | (65535 & i12);
            q qVar = new q(this, i10, i11, i12, i15, charSequence, this.f23647l);
            ArrayList arrayList = this.f23641f;
            int size = arrayList.size() - 1;
            while (true) {
                if (size >= 0) {
                    if (((q) arrayList.get(size)).f23666d <= i15) {
                        i13 = size + 1;
                        break;
                    }
                    size--;
                } else {
                    i13 = 0;
                    break;
                }
            }
            arrayList.add(i13, qVar);
            p(true);
            return qVar;
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        Intent intent2;
        int i15;
        PackageManager packageManager = this.f23636a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i14 = queryIntentActivityOptions.size();
        } else {
            i14 = 0;
        }
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i16 = 0; i16 < i14; i16++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i16);
            int i17 = resolveInfo.specificIndex;
            if (i17 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i17];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            q a10 = a(i10, i11, i12, resolveInfo.loadLabel(packageManager));
            a10.setIcon(resolveInfo.loadIcon(packageManager));
            a10.f23669g = intent3;
            if (menuItemArr != null && (i15 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i15] = a10;
            }
        }
        return i14;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(c0 c0Var, Context context) {
        this.f23656u.add(new WeakReference(c0Var));
        c0Var.j(context, this);
        this.f23646k = true;
    }

    public final void c(boolean z10) {
        if (this.f23654s) {
            return;
        }
        this.f23654s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f23656u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            c0 c0Var = (c0) weakReference.get();
            if (c0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                c0Var.b(this, z10);
            }
        }
        this.f23654s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        q qVar = this.f23657v;
        if (qVar != null) {
            d(qVar);
        }
        this.f23641f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f23649n = null;
        this.f23648m = null;
        this.f23650o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(q qVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f23656u;
        boolean z10 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f23657v == qVar) {
            z();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                c0 c0Var = (c0) weakReference.get();
                if (c0Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z10 = c0Var.m(qVar);
                    if (z10) {
                        break;
                    }
                }
            }
            y();
            if (z10) {
                this.f23657v = null;
            }
        }
        return z10;
    }

    public boolean e(o oVar, MenuItem menuItem) {
        m mVar = this.f23640e;
        if (mVar != null && mVar.v(oVar, menuItem)) {
            return true;
        }
        return false;
    }

    public boolean f(q qVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f23656u;
        boolean z10 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        z();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            c0 c0Var = (c0) weakReference.get();
            if (c0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z10 = c0Var.c(qVar);
                if (z10) {
                    break;
                }
            }
        }
        y();
        if (z10) {
            this.f23657v = qVar;
        }
        return z10;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        MenuItem findItem;
        ArrayList arrayList = this.f23641f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            q qVar = (q) arrayList.get(i11);
            if (qVar.f23663a == i10) {
                return qVar;
            }
            if (qVar.hasSubMenu() && (findItem = qVar.f23677o.findItem(i10)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final q g(int i10, KeyEvent keyEvent) {
        char c10;
        ArrayList arrayList = this.f23655t;
        arrayList.clear();
        h(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (q) arrayList.get(0);
        }
        boolean n10 = n();
        for (int i11 = 0; i11 < size; i11++) {
            q qVar = (q) arrayList.get(i11);
            if (n10) {
                c10 = qVar.f23672j;
            } else {
                c10 = qVar.f23670h;
            }
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (n10 && c10 == '\b' && i10 == 67))) {
                return qVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return (MenuItem) this.f23641f.get(i10);
    }

    public final void h(ArrayList arrayList, int i10, KeyEvent keyEvent) {
        char c10;
        int i11;
        boolean n10 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData) && i10 != 67) {
            return;
        }
        ArrayList arrayList2 = this.f23641f;
        int size = arrayList2.size();
        for (int i12 = 0; i12 < size; i12++) {
            q qVar = (q) arrayList2.get(i12);
            if (qVar.hasSubMenu()) {
                qVar.f23677o.h(arrayList, i10, keyEvent);
            }
            if (n10) {
                c10 = qVar.f23672j;
            } else {
                c10 = qVar.f23670h;
            }
            if (n10) {
                i11 = qVar.f23673k;
            } else {
                i11 = qVar.f23671i;
            }
            if ((modifiers & 69647) == (i11 & 69647) && c10 != 0) {
                char[] cArr = keyData.meta;
                if (c10 != cArr[0] && c10 != cArr[2]) {
                    if (n10 && c10 == '\b') {
                        if (i10 != 67) {
                        }
                    }
                }
                if (qVar.isEnabled()) {
                    arrayList.add(qVar);
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f23659x) {
            return true;
        }
        ArrayList arrayList = this.f23641f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((q) arrayList.get(i10)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l10 = l();
        if (!this.f23646k) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f23656u;
        Iterator it = copyOnWriteArrayList.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            c0 c0Var = (c0) weakReference.get();
            if (c0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z10 |= c0Var.e();
            }
        }
        ArrayList arrayList = this.f23644i;
        ArrayList arrayList2 = this.f23645j;
        if (z10) {
            arrayList.clear();
            arrayList2.clear();
            int size = l10.size();
            for (int i10 = 0; i10 < size; i10++) {
                q qVar = (q) l10.get(i10);
                if (qVar.f()) {
                    arrayList.add(qVar);
                } else {
                    arrayList2.add(qVar);
                }
            }
        } else {
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(l());
        }
        this.f23646k = false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        if (g(i10, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public o k() {
        return this;
    }

    public final ArrayList l() {
        boolean z10 = this.f23643h;
        ArrayList arrayList = this.f23642g;
        if (!z10) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f23641f;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            q qVar = (q) arrayList2.get(i10);
            if (qVar.isVisible()) {
                arrayList.add(qVar);
            }
        }
        this.f23643h = false;
        this.f23646k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f23658w;
    }

    public boolean n() {
        return this.f23638c;
    }

    public boolean o() {
        return this.f23639d;
    }

    public void p(boolean z10) {
        if (!this.f23651p) {
            if (z10) {
                this.f23643h = true;
                this.f23646k = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f23656u;
            if (!copyOnWriteArrayList.isEmpty()) {
                z();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    c0 c0Var = (c0) weakReference.get();
                    if (c0Var == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        c0Var.d(z10);
                    }
                }
                y();
                return;
            }
            return;
        }
        this.f23652q = true;
        if (z10) {
            this.f23653r = true;
        }
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return q(findItem(i10), null, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        boolean z10;
        q g10 = g(i10, keyEvent);
        if (g10 != null) {
            z10 = q(g10, null, i11);
        } else {
            z10 = false;
        }
        if ((i11 & 2) != 0) {
            c(true);
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(android.view.MenuItem r7, l.c0 r8, int r9) {
        /*
            r6 = this;
            l.q r7 = (l.q) r7
            r0 = 0
            if (r7 == 0) goto Ld7
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Ld7
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f23678p
            r2 = 1
            if (r1 == 0) goto L1a
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L1a
        L18:
            r1 = r2
            goto L43
        L1a:
            l.o r1 = r7.f23676n
            boolean r3 = r1.e(r1, r7)
            if (r3 == 0) goto L23
            goto L18
        L23:
            android.content.Intent r3 = r7.f23669g
            if (r3 == 0) goto L35
            android.content.Context r1 = r1.f23636a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L18
        L2d:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L35:
            l.r r1 = r7.A
            if (r1 == 0) goto L42
            android.view.ActionProvider r1 = r1.f23689a
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L42
            goto L18
        L42:
            r1 = r0
        L43:
            l.r r3 = r7.A
            if (r3 == 0) goto L51
            android.view.ActionProvider r4 = r3.f23689a
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L51
            r4 = r2
            goto L52
        L51:
            r4 = r0
        L52:
            boolean r5 = r7.e()
            if (r5 == 0) goto L64
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Ld6
            r6.c(r2)
            goto Ld6
        L64:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L75
            if (r4 == 0) goto L6d
            goto L75
        L6d:
            r7 = r9 & 1
            if (r7 != 0) goto Ld6
            r6.c(r2)
            goto Ld6
        L75:
            r9 = r9 & 4
            if (r9 != 0) goto L7c
            r6.c(r0)
        L7c:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L90
            l.i0 r9 = new l.i0
            android.content.Context r5 = r6.f23636a
            r9.<init>(r5, r6, r7)
            r7.f23677o = r9
            java.lang.CharSequence r5 = r7.f23667e
            r9.setHeaderTitle(r5)
        L90:
            l.i0 r7 = r7.f23677o
            if (r4 == 0) goto L9e
            l.w r9 = r3.f23690b
            r9.getClass()
            android.view.ActionProvider r9 = r3.f23689a
            r9.onPrepareSubMenu(r7)
        L9e:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.f23656u
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto La7
            goto Ld0
        La7:
            if (r8 == 0) goto Lad
            boolean r0 = r8.l(r7)
        Lad:
            java.util.Iterator r8 = r9.iterator()
        Lb1:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Ld0
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            l.c0 r4 = (l.c0) r4
            if (r4 != 0) goto Lc9
            r9.remove(r3)
            goto Lb1
        Lc9:
            if (r0 != 0) goto Lb1
            boolean r0 = r4.l(r7)
            goto Lb1
        Ld0:
            r1 = r1 | r0
            if (r1 != 0) goto Ld6
            r6.c(r2)
        Ld6:
            return r1
        Ld7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.o.q(android.view.MenuItem, l.c0, int):boolean");
    }

    public final void r(c0 c0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f23656u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            c0 c0Var2 = (c0) weakReference.get();
            if (c0Var2 == null || c0Var2 == c0Var) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        ArrayList arrayList = this.f23641f;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 < size) {
                if (((q) arrayList.get(i12)).f23664b == i10) {
                    break;
                } else {
                    i12++;
                }
            } else {
                i12 = -1;
                break;
            }
        }
        if (i12 >= 0) {
            int size2 = arrayList.size() - i12;
            while (true) {
                int i13 = i11 + 1;
                if (i11 >= size2 || ((q) arrayList.get(i12)).f23664b != i10) {
                    break;
                }
                if (i12 >= 0) {
                    ArrayList arrayList2 = this.f23641f;
                    if (i12 < arrayList2.size()) {
                        arrayList2.remove(i12);
                    }
                }
                i11 = i13;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        ArrayList arrayList = this.f23641f;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                if (((q) arrayList.get(i11)).f23663a == i10) {
                    break;
                } else {
                    i11++;
                }
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0) {
            ArrayList arrayList2 = this.f23641f;
            if (i11 < arrayList2.size()) {
                arrayList2.remove(i11);
                p(true);
            }
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f23641f.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((i0) item.getSubMenu()).s(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 > 0 && (findItem = findItem(i11)) != null) {
            findItem.expandActionView();
        }
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
        ArrayList arrayList = this.f23641f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            q qVar = (q) arrayList.get(i11);
            if (qVar.f23664b == i10) {
                qVar.g(z11);
                qVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f23658w = z10;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z10) {
        ArrayList arrayList = this.f23641f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            q qVar = (q) arrayList.get(i11);
            if (qVar.f23664b == i10) {
                qVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z10) {
        int i11;
        ArrayList arrayList = this.f23641f;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i12 = 0; i12 < size; i12++) {
            q qVar = (q) arrayList.get(i12);
            if (qVar.f23664b == i10) {
                int i13 = qVar.f23686x;
                int i14 = i13 & (-9);
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                int i15 = i14 | i11;
                qVar.f23686x = i15;
                if (i13 != i15) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f23638c = z10;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f23641f.size();
    }

    public final void t(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f23656u;
            if (!copyOnWriteArrayList.isEmpty()) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    c0 c0Var = (c0) weakReference.get();
                    if (c0Var == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        int id2 = c0Var.getId();
                        if (id2 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id2)) != null) {
                            c0Var.g(parcelable);
                        }
                    }
                }
            }
        }
    }

    public final void u(Bundle bundle) {
        int size = this.f23641f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((i0) item.getSubMenu()).u(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void v(Bundle bundle) {
        Parcelable k10;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f23656u;
        if (!copyOnWriteArrayList.isEmpty()) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                c0 c0Var = (c0) weakReference.get();
                if (c0Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int id2 = c0Var.getId();
                    if (id2 > 0 && (k10 = c0Var.k()) != null) {
                        sparseArray.put(id2, k10);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    public void w(m mVar) {
        this.f23640e = mVar;
    }

    public final void x(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        if (view != null) {
            this.f23650o = view;
            this.f23648m = null;
            this.f23649n = null;
        } else {
            if (i10 > 0) {
                this.f23648m = this.f23637b.getText(i10);
            } else if (charSequence != null) {
                this.f23648m = charSequence;
            }
            if (i11 > 0) {
                this.f23649n = r3.k.getDrawable(this.f23636a, i11);
            } else if (drawable != null) {
                this.f23649n = drawable;
            }
            this.f23650o = null;
        }
        p(false);
    }

    public final void y() {
        this.f23651p = false;
        if (this.f23652q) {
            this.f23652q = false;
            p(this.f23653r);
        }
    }

    public final void z() {
        if (this.f23651p) {
            return;
        }
        this.f23651p = true;
        this.f23652q = false;
        this.f23653r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return a(0, 0, 0, this.f23637b.getString(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f23637b.getString(i10));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        q a10 = a(i10, i11, i12, charSequence);
        i0 i0Var = new i0(this.f23636a, this, a10);
        a10.f23677o = i0Var;
        i0Var.setHeaderTitle(a10.f23667e);
        return i0Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f23637b.getString(i13));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f23637b.getString(i13));
    }
}
