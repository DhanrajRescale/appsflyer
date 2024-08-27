package androidx.loader.app;

import android.os.Bundle;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.t;

/* loaded from: classes.dex */
public final class c extends e0 implements androidx.loader.content.d {

    /* renamed from: c, reason: collision with root package name */
    public final androidx.loader.content.e f2010c;

    /* renamed from: d, reason: collision with root package name */
    public t f2011d;

    /* renamed from: e, reason: collision with root package name */
    public d f2012e;

    /* renamed from: a, reason: collision with root package name */
    public final int f2008a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f2009b = null;

    /* renamed from: f, reason: collision with root package name */
    public androidx.loader.content.e f2013f = null;

    public c(androidx.loader.content.e eVar) {
        this.f2010c = eVar;
        eVar.registerListener(0, this);
    }

    public final void a() {
        t tVar = this.f2011d;
        d dVar = this.f2012e;
        if (tVar != null && dVar != null) {
            super.removeObserver(dVar);
            observe(tVar, dVar);
        }
    }

    @Override // androidx.lifecycle.LiveData
    public final void onActive() {
        this.f2010c.startLoading();
    }

    @Override // androidx.lifecycle.LiveData
    public final void onInactive() {
        this.f2010c.stopLoading();
    }

    @Override // androidx.lifecycle.LiveData
    public final void removeObserver(f0 f0Var) {
        super.removeObserver(f0Var);
        this.f2011d = null;
        this.f2012e = null;
    }

    @Override // androidx.lifecycle.e0, androidx.lifecycle.LiveData
    public final void setValue(Object obj) {
        super.setValue(obj);
        androidx.loader.content.e eVar = this.f2013f;
        if (eVar != null) {
            eVar.reset();
            this.f2013f = null;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("LoaderInfo{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" #");
        sb2.append(this.f2008a);
        sb2.append(" : ");
        hl.f.x(this.f2010c, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
