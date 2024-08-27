package androidx.fragment.app;

import android.util.Log;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a extends p1 implements a1 {

    /* renamed from: q, reason: collision with root package name */
    public final d1 f1584q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1585r;

    /* renamed from: s, reason: collision with root package name */
    public int f1586s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1587t;

    public a(d1 d1Var) {
        d1Var.G();
        n0 n0Var = d1Var.f1665v;
        if (n0Var != null) {
            n0Var.f1775b.getClassLoader();
        }
        this.f1586s = -1;
        this.f1587t = false;
        this.f1584q = d1Var;
    }

    @Override // androidx.fragment.app.a1
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f1804g) {
            d1 d1Var = this.f1584q;
            if (d1Var.f1647d == null) {
                d1Var.f1647d = new ArrayList();
            }
            d1Var.f1647d.add(this);
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.p1
    public final void e(int i10, g0 g0Var, String str, int i11) {
        String str2 = g0Var.mPreviousWho;
        if (str2 != null) {
            u4.c.d(g0Var, str2);
        }
        Class<?> cls = g0Var.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = g0Var.mTag;
                if (str3 != null && !str.equals(str3)) {
                    StringBuilder sb2 = new StringBuilder("Can't change tag of fragment ");
                    sb2.append(g0Var);
                    sb2.append(": was ");
                    throw new IllegalStateException(v.e.j(sb2, g0Var.mTag, " now ", str));
                }
                g0Var.mTag = str;
            }
            if (i10 != 0) {
                if (i10 != -1) {
                    int i12 = g0Var.mFragmentId;
                    if (i12 != 0 && i12 != i10) {
                        throw new IllegalStateException("Can't change container ID of fragment " + g0Var + ": was " + g0Var.mFragmentId + " now " + i10);
                    }
                    g0Var.mFragmentId = i10;
                    g0Var.mContainerId = i10;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + g0Var + " with tag " + str + " to container view with no id");
                }
            }
            b(new o1(g0Var, i11));
            g0Var.mFragmentManager = this.f1584q;
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    public final void g(int i10) {
        if (!this.f1804g) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
        }
        ArrayList arrayList = this.f1798a;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            o1 o1Var = (o1) arrayList.get(i11);
            g0 g0Var = o1Var.f1788b;
            if (g0Var != null) {
                g0Var.mBackStackNesting += i10;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Bump nesting of " + o1Var.f1788b + " to " + o1Var.f1788b.mBackStackNesting);
                }
            }
        }
    }

    public final int h(boolean z10) {
        if (!this.f1585r) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new a2());
                j("  ", printWriter, true);
                printWriter.close();
            }
            this.f1585r = true;
            boolean z11 = this.f1804g;
            d1 d1Var = this.f1584q;
            if (z11) {
                this.f1586s = d1Var.f1652i.getAndIncrement();
            } else {
                this.f1586s = -1;
            }
            d1Var.v(this, z10);
            return this.f1586s;
        }
        throw new IllegalStateException("commit already called");
    }

    public final void i() {
        d();
        this.f1584q.y(this, false);
    }

    public final void j(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1806i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1586s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1585r);
            if (this.f1803f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1803f));
            }
            if (this.f1799b != 0 || this.f1800c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1799b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1800c));
            }
            if (this.f1801d != 0 || this.f1802e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1801d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1802e));
            }
            if (this.f1807j != 0 || this.f1808k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1807j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1808k);
            }
            if (this.f1809l != 0 || this.f1810m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1809l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1810m);
            }
        }
        ArrayList arrayList = this.f1798a;
        if (!arrayList.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                o1 o1Var = (o1) arrayList.get(i10);
                switch (o1Var.f1787a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + o1Var.f1787a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(o1Var.f1788b);
                if (z10) {
                    if (o1Var.f1790d != 0 || o1Var.f1791e != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(o1Var.f1790d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(o1Var.f1791e));
                    }
                    if (o1Var.f1792f != 0 || o1Var.f1793g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(o1Var.f1792f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(o1Var.f1793g));
                    }
                }
            }
        }
    }

    public final a k(g0 g0Var) {
        d1 d1Var = g0Var.mFragmentManager;
        if (d1Var != null && d1Var != this.f1584q) {
            throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + g0Var.toString() + " is already attached to a FragmentManager.");
        }
        b(new o1(g0Var, 4));
        return this;
    }

    public final a l(g0 g0Var) {
        d1 d1Var = g0Var.mFragmentManager;
        if (d1Var != null && d1Var != this.f1584q) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + g0Var.toString() + " is already attached to a FragmentManager.");
        }
        b(new o1(g0Var, 3));
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.fragment.app.o1, java.lang.Object] */
    public final a m(g0 g0Var, androidx.lifecycle.n nVar) {
        d1 d1Var = g0Var.mFragmentManager;
        d1 d1Var2 = this.f1584q;
        if (d1Var == d1Var2) {
            if (nVar == androidx.lifecycle.n.f1948b && g0Var.mState > -1) {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + nVar + " after the Fragment has been created");
            }
            if (nVar != androidx.lifecycle.n.f1947a) {
                ?? obj = new Object();
                obj.f1787a = 10;
                obj.f1788b = g0Var;
                obj.f1789c = false;
                obj.f1794h = g0Var.mMaxState;
                obj.f1795i = nVar;
                b(obj);
                return this;
            }
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + nVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
        throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + d1Var2);
    }

    public final a n(g0 g0Var) {
        d1 d1Var;
        if (g0Var != null && (d1Var = g0Var.mFragmentManager) != null && d1Var != this.f1584q) {
            throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + g0Var.toString() + " is already attached to a FragmentManager.");
        }
        b(new o1(g0Var, 8));
        return this;
    }

    public final a o(gd.m mVar) {
        d1 d1Var = mVar.mFragmentManager;
        if (d1Var != null && d1Var != this.f1584q) {
            throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + mVar.toString() + " is already attached to a FragmentManager.");
        }
        b(new o1(mVar, 5));
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1586s >= 0) {
            sb2.append(" #");
            sb2.append(this.f1586s);
        }
        if (this.f1806i != null) {
            sb2.append(" ");
            sb2.append(this.f1806i);
        }
        sb2.append(UrlTreeKt.componentParamSuffix);
        return sb2.toString();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.fragment.app.o1, java.lang.Object] */
    public a(a aVar) {
        aVar.f1584q.G();
        n0 n0Var = aVar.f1584q.f1665v;
        if (n0Var != null) {
            n0Var.f1775b.getClassLoader();
        }
        Iterator it = aVar.f1798a.iterator();
        while (it.hasNext()) {
            o1 o1Var = (o1) it.next();
            ArrayList arrayList = this.f1798a;
            ?? obj = new Object();
            obj.f1787a = o1Var.f1787a;
            obj.f1788b = o1Var.f1788b;
            obj.f1789c = o1Var.f1789c;
            obj.f1790d = o1Var.f1790d;
            obj.f1791e = o1Var.f1791e;
            obj.f1792f = o1Var.f1792f;
            obj.f1793g = o1Var.f1793g;
            obj.f1794h = o1Var.f1794h;
            obj.f1795i = o1Var.f1795i;
            arrayList.add(obj);
        }
        this.f1799b = aVar.f1799b;
        this.f1800c = aVar.f1800c;
        this.f1801d = aVar.f1801d;
        this.f1802e = aVar.f1802e;
        this.f1803f = aVar.f1803f;
        this.f1804g = aVar.f1804g;
        this.f1805h = aVar.f1805h;
        this.f1806i = aVar.f1806i;
        this.f1809l = aVar.f1809l;
        this.f1810m = aVar.f1810m;
        this.f1807j = aVar.f1807j;
        this.f1808k = aVar.f1808k;
        if (aVar.f1811n != null) {
            ArrayList arrayList2 = new ArrayList();
            this.f1811n = arrayList2;
            arrayList2.addAll(aVar.f1811n);
        }
        if (aVar.f1812o != null) {
            ArrayList arrayList3 = new ArrayList();
            this.f1812o = arrayList3;
            arrayList3.addAll(aVar.f1812o);
        }
        this.f1813p = aVar.f1813p;
        this.f1586s = -1;
        this.f1587t = false;
        this.f1584q = aVar.f1584q;
        this.f1585r = aVar.f1585r;
        this.f1586s = aVar.f1586s;
        this.f1587t = aVar.f1587t;
    }
}
