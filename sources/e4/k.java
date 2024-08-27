package e4;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import d2.g0;
import k7.c1;

/* loaded from: classes.dex */
public class k implements yj.g, hp.a, c1, ln.b {

    /* renamed from: a, reason: collision with root package name */
    public Object f14993a;

    public /* synthetic */ k(Object obj) {
        this.f14993a = obj;
    }

    public static k e(int i10, int i11, int i12) {
        return new k(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, false, i12));
    }

    @Override // hp.b
    public Object a() {
        return this.f14993a;
    }

    public m b(int i10) {
        return null;
    }

    @Override // yj.g
    public void c() {
    }

    public m d(int i10) {
        return null;
    }

    public boolean f(int i10, int i11, Bundle bundle) {
        return false;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return this.f14993a;
    }

    @Override // yj.g
    public Object l() {
        return this.f14993a;
    }

    public k() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f14993a = new g0(this);
        } else {
            this.f14993a = new g0(this);
        }
    }
}
