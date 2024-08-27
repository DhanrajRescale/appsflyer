package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class v0 implements androidx.lifecycle.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1845a = "SOCIAL_BOTTOM_SHEET_RESULT";

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j1 f1846b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.o f1847c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d1 f1848d;

    public v0(d1 d1Var, j1 j1Var, androidx.lifecycle.o oVar) {
        this.f1848d = d1Var;
        this.f1846b = j1Var;
        this.f1847c = oVar;
    }

    @Override // androidx.lifecycle.r
    public final void c(androidx.lifecycle.t tVar, androidx.lifecycle.m mVar) {
        Bundle bundle;
        androidx.lifecycle.m mVar2 = androidx.lifecycle.m.ON_START;
        d1 d1Var = this.f1848d;
        String str = this.f1845a;
        if (mVar == mVar2 && (bundle = (Bundle) d1Var.f1654k.get(str)) != null) {
            this.f1846b.d(bundle, str);
            d1Var.f1654k.remove(str);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Clearing fragment result with key " + str);
            }
        }
        if (mVar == androidx.lifecycle.m.ON_DESTROY) {
            this.f1847c.c(this);
            d1Var.f1655l.remove(str);
        }
    }
}
