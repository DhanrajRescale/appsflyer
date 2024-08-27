package androidx.navigation;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/navigation/g0;", "Landroidx/navigation/v0;", "Landroidx/navigation/f0;", "navigation-common_release"}, k = 1, mv = {1, 8, 0})
@u0("navigation")
/* loaded from: classes.dex */
public class g0 extends v0 {

    /* renamed from: c, reason: collision with root package name */
    public final w0 f2211c;

    public g0(w0 navigatorProvider) {
        Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
        this.f2211c = navigatorProvider;
    }

    @Override // androidx.navigation.v0
    public final c0 a() {
        return new f0(this);
    }

    @Override // androidx.navigation.v0
    public final void d(List entries, k0 k0Var) {
        c0 destination;
        String str;
        Intrinsics.checkNotNullParameter(entries, "entries");
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            c0 c0Var = nVar.f2258b;
            Intrinsics.d(c0Var, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            f0 f0Var = (f0) c0Var;
            Bundle a10 = nVar.a();
            int i10 = f0Var.f2192l;
            String str2 = f0Var.f2194n;
            if (i10 == 0 && str2 == null) {
                StringBuilder sb2 = new StringBuilder("no start destination defined via app:startDestination for ");
                int i11 = f0Var.f2181h;
                if (i11 != 0) {
                    str = f0Var.f2176c;
                    if (str == null) {
                        str = String.valueOf(i11);
                    }
                } else {
                    str = "the root navigation";
                }
                sb2.append(str);
                throw new IllegalStateException(sb2.toString().toString());
            }
            if (str2 != null) {
                destination = f0Var.p(str2, false);
            } else {
                destination = f0Var.o(i10, false);
            }
            if (destination == null) {
                if (f0Var.f2193m == null) {
                    String str3 = f0Var.f2194n;
                    if (str3 == null) {
                        str3 = String.valueOf(f0Var.f2192l);
                    }
                    f0Var.f2193m = str3;
                }
                String str4 = f0Var.f2193m;
                Intrinsics.c(str4);
                throw new IllegalArgumentException(nn.d.k("navigation destination ", str4, " is not a direct child of this NavGraph"));
            }
            v0 b10 = this.f2211c.b(destination.f2174a);
            q b11 = b();
            Bundle e10 = destination.e(a10);
            Intrinsics.checkNotNullParameter(destination, "destination");
            int i12 = n.f2256m;
            t tVar = b11.f2285h;
            b10.d(vt.x.a(mt.p.q(tVar.f2304a, destination, e10, tVar.i(), tVar.f2318o)), k0Var);
        }
    }
}
