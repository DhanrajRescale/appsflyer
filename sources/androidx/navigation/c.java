package androidx.navigation;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.assetgro.stockgro.prod.R;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final c f2160b = new c(0);

    /* renamed from: c, reason: collision with root package name */
    public static final c f2161c = new c(1);

    /* renamed from: d, reason: collision with root package name */
    public static final c f2162d = new c(2);

    /* renamed from: e, reason: collision with root package name */
    public static final c f2163e = new c(3);

    /* renamed from: f, reason: collision with root package name */
    public static final c f2164f = new c(4);

    /* renamed from: g, reason: collision with root package name */
    public static final c f2165g = new c(5);

    /* renamed from: h, reason: collision with root package name */
    public static final c f2166h = new c(6);

    /* renamed from: i, reason: collision with root package name */
    public static final c f2167i = new c(7);

    /* renamed from: j, reason: collision with root package name */
    public static final c f2168j = new c(8);

    /* renamed from: k, reason: collision with root package name */
    public static final c f2169k = new c(9);

    /* renamed from: l, reason: collision with root package name */
    public static final c f2170l = new c(10);

    /* renamed from: m, reason: collision with root package name */
    public static final c f2171m = new c(11);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2172a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10) {
        super(1);
        this.f2172a = i10;
    }

    public final Context a(Context it) {
        switch (this.f2172a) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof ContextWrapper)) {
                    return null;
                }
                return ((ContextWrapper) it).getBaseContext();
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof ContextWrapper)) {
                    return null;
                }
                return ((ContextWrapper) it).getBaseContext();
        }
    }

    public final c0 d(c0 destination) {
        switch (this.f2172a) {
            case 3:
                Intrinsics.checkNotNullParameter(destination, "destination");
                f0 f0Var = destination.f2175b;
                if (f0Var == null || f0Var.f2192l != destination.f2181h) {
                    return null;
                }
                return f0Var;
            case 4:
                Intrinsics.checkNotNullParameter(destination, "destination");
                f0 f0Var2 = destination.f2175b;
                if (f0Var2 == null || f0Var2.f2192l != destination.f2181h) {
                    return null;
                }
                return f0Var2;
            case 5:
            case 6:
            default:
                Intrinsics.checkNotNullParameter(destination, "it");
                if (!(destination instanceof f0)) {
                    return null;
                }
                f0 f0Var3 = (f0) destination;
                return f0Var3.o(f0Var3.f2192l, true);
            case 7:
                Intrinsics.checkNotNullParameter(destination, "it");
                return destination.f2175b;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f2172a;
        switch (i10) {
            case 0:
                return a((Context) obj);
            case 1:
                return a((Context) obj);
            case 2:
                l0 navOptions = (l0) obj;
                switch (i10) {
                    case 2:
                        Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
                        navOptions.f2249c = true;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
                        navOptions.f2248b = true;
                        break;
                }
                return Unit.f23355a;
            case 3:
                return d((c0) obj);
            case 4:
                return d((c0) obj);
            case 5:
                e anim = (e) obj;
                Intrinsics.checkNotNullParameter(anim, "$this$anim");
                anim.f2185a = 0;
                anim.f2186b = 0;
                return Unit.f23355a;
            case 6:
                x0 popUpTo = (x0) obj;
                Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
                popUpTo.f2341b = true;
                return Unit.f23355a;
            case 7:
                return d((c0) obj);
            case 8:
                return d((c0) obj);
            case 9:
                View it = (View) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                Object parent = it.getParent();
                if (!(parent instanceof View)) {
                    return null;
                }
                return (View) parent;
            case 10:
                View it2 = (View) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                Object tag = it2.getTag(R.id.nav_controller_view_tag);
                if (tag instanceof WeakReference) {
                    return (t) ((WeakReference) tag).get();
                }
                if (!(tag instanceof t)) {
                    return null;
                }
                return (t) tag;
            default:
                l0 navOptions2 = (l0) obj;
                switch (i10) {
                    case 2:
                        Intrinsics.checkNotNullParameter(navOptions2, "$this$navOptions");
                        navOptions2.f2249c = true;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(navOptions2, "$this$navOptions");
                        navOptions2.f2248b = true;
                        break;
                }
                return Unit.f23355a;
        }
    }
}
