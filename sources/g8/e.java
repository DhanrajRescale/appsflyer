package g8;

import androidx.work.u;
import androidx.work.v;
import j8.k;

/* loaded from: classes.dex */
public final class e extends c {
    static {
        u.C("NetworkNotRoamingCtrlr");
    }

    @Override // g8.c
    public final boolean a(k kVar) {
        if (kVar.f21083j.f2552a == v.f2641d) {
            return true;
        }
        return false;
    }

    @Override // g8.c
    public final boolean b(Object obj) {
        f8.a aVar = (f8.a) obj;
        if (aVar.f15979a && aVar.f15982d) {
            return false;
        }
        return true;
    }
}
