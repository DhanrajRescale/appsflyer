package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes.dex */
public final class f0 extends c0 implements Iterable, ju.a {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f2190o = 0;

    /* renamed from: k, reason: collision with root package name */
    public final t.k0 f2191k;

    /* renamed from: l, reason: collision with root package name */
    public int f2192l;

    /* renamed from: m, reason: collision with root package name */
    public String f2193m;

    /* renamed from: n, reason: collision with root package name */
    public String f2194n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(v0 navGraphNavigator) {
        super(navGraphNavigator);
        Intrinsics.checkNotNullParameter(navGraphNavigator, "navGraphNavigator");
        this.f2191k = new t.k0();
    }

    @Override // androidx.navigation.c0
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof f0)) {
            return false;
        }
        t.k0 k0Var = this.f2191k;
        Sequence b10 = pu.m.b(qu.i0.Q(k0Var));
        Intrinsics.checkNotNullParameter(b10, "<this>");
        ArrayList destination = new ArrayList();
        Intrinsics.checkNotNullParameter(b10, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Iterator it = b10.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        f0 f0Var = (f0) obj;
        t.k0 k0Var2 = f0Var.f2191k;
        t.m0 Q = qu.i0.Q(k0Var2);
        while (Q.hasNext()) {
            destination.remove((c0) Q.next());
        }
        if (!super.equals(obj) || k0Var.h() != k0Var2.h() || this.f2192l != f0Var.f2192l || !destination.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // androidx.navigation.c0
    public final int hashCode() {
        int i10 = this.f2192l;
        t.k0 k0Var = this.f2191k;
        int h10 = k0Var.h();
        for (int i11 = 0; i11 < h10; i11++) {
            i10 = (((i10 * 31) + k0Var.f(i11)) * 31) + ((c0) k0Var.i(i11)).hashCode();
        }
        return i10;
    }

    @Override // androidx.navigation.c0
    public final b0 i(h.c navDeepLinkRequest) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        b0 i10 = super.i(navDeepLinkRequest);
        ArrayList arrayList = new ArrayList();
        e0 e0Var = new e0(this);
        while (e0Var.hasNext()) {
            b0 i11 = ((c0) e0Var.next()).i(navDeepLinkRequest);
            if (i11 != null) {
                arrayList.add(i11);
            }
        }
        b0[] elements = {i10, (b0) vt.g0.E(arrayList)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (b0) vt.g0.E(vt.v.p(elements));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new e0(this);
    }

    @Override // androidx.navigation.c0
    public final void k(Context context, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.k(context, attrs);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, e7.a.f15089d);
        Intrinsics.checkNotNullExpressionValue(obtainAttributes, "context.resources.obtain…vGraphNavigator\n        )");
        q(obtainAttributes.getResourceId(0, 0));
        this.f2193m = x2.c.o(this.f2192l, context);
        Unit unit = Unit.f23355a;
        obtainAttributes.recycle();
    }

    public final void m(c0 node) {
        Intrinsics.checkNotNullParameter(node, "node");
        int i10 = node.f2181h;
        String str = node.f2182i;
        if (i10 == 0 && str == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString());
        }
        if (this.f2182i != null && !(!Intrinsics.a(str, r2))) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + this).toString());
        }
        if (i10 != this.f2181h) {
            t.k0 k0Var = this.f2191k;
            c0 c0Var = (c0) k0Var.e(i10);
            if (c0Var == node) {
                return;
            }
            if (node.f2175b == null) {
                if (c0Var != null) {
                    c0Var.f2175b = null;
                }
                node.f2175b = this;
                k0Var.g(node.f2181h, node);
                return;
            }
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString());
        }
        throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + this).toString());
    }

    public final c0 o(int i10, boolean z10) {
        f0 f0Var;
        c0 c0Var = (c0) this.f2191k.e(i10);
        if (c0Var == null) {
            if (z10 && (f0Var = this.f2175b) != null) {
                return f0Var.o(i10, true);
            }
            return null;
        }
        return c0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final c0 p(String route, boolean z10) {
        f0 f0Var;
        c0 c0Var;
        b0 i10;
        Intrinsics.checkNotNullParameter(route, "route");
        int hashCode = x2.c.n(route).hashCode();
        t.k0 k0Var = this.f2191k;
        c0 c0Var2 = (c0) k0Var.e(hashCode);
        Object obj = null;
        if (c0Var2 == null) {
            Iterator it = pu.m.b(qu.i0.Q(k0Var)).iterator();
            while (true) {
                if (it.hasNext()) {
                    c0Var = it.next();
                    c0 c0Var3 = (c0) c0Var;
                    c0Var3.getClass();
                    Intrinsics.checkNotNullParameter(route, "route");
                    Uri uri = Uri.parse(x2.c.n(route));
                    Intrinsics.b(uri, "Uri.parse(this)");
                    Intrinsics.checkNotNullParameter(uri, "uri");
                    Intrinsics.checkNotNullParameter(uri, "uri");
                    h.c request = new h.c(19, uri, obj, obj);
                    if (c0Var3 instanceof f0) {
                        Intrinsics.checkNotNullParameter(request, "request");
                        i10 = super.i(request);
                    } else {
                        i10 = c0Var3.i(request);
                    }
                    if (i10 != null) {
                        break;
                    }
                } else {
                    c0Var = 0;
                    break;
                }
            }
            c0Var2 = c0Var;
        }
        if (c0Var2 == null) {
            if (!z10 || (f0Var = this.f2175b) == null || route == null || kotlin.text.w.C(route)) {
                return null;
            }
            return f0Var.p(route, true);
        }
        return c0Var2;
    }

    public final void q(int i10) {
        if (i10 != this.f2181h) {
            if (this.f2194n != null) {
                this.f2192l = 0;
                this.f2194n = null;
            }
            this.f2192l = i10;
            this.f2193m = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i10 + " cannot use the same id as the graph " + this).toString());
    }

    @Override // androidx.navigation.c0
    public final String toString() {
        c0 c0Var;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        String str = this.f2194n;
        if (str != null && !kotlin.text.w.C(str)) {
            c0Var = p(str, true);
        } else {
            c0Var = null;
        }
        if (c0Var == null) {
            c0Var = o(this.f2192l, true);
        }
        sb2.append(" startDestination=");
        if (c0Var == null) {
            String str2 = this.f2194n;
            if (str2 != null) {
                sb2.append(str2);
            } else {
                String str3 = this.f2193m;
                if (str3 != null) {
                    sb2.append(str3);
                } else {
                    sb2.append("0x" + Integer.toHexString(this.f2192l));
                }
            }
        } else {
            sb2.append(UrlTreeKt.componentParamPrefix);
            sb2.append(c0Var.toString());
            sb2.append(UrlTreeKt.componentParamSuffix);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "sb.toString()");
        return sb3;
    }
}
