package g8;

import android.os.Build;
import androidx.work.u;
import androidx.work.v;
import j8.k;

/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: e, reason: collision with root package name */
    public static final String f17172e = u.C("NetworkMeteredCtrlr");

    @Override // g8.c
    public final boolean a(k kVar) {
        if (kVar.f21083j.f2552a == v.f2642e) {
            return true;
        }
        return false;
    }

    @Override // g8.c
    public final boolean b(Object obj) {
        f8.a aVar = (f8.a) obj;
        boolean z10 = true;
        if (Build.VERSION.SDK_INT < 26) {
            u.w().u(f17172e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
            return !aVar.f15979a;
        }
        if (aVar.f15979a && aVar.f15981c) {
            z10 = false;
        }
        return z10;
    }
}
