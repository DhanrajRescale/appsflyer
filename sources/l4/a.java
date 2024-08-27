package l4;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import d4.n1;
import d4.v0;
import e4.k;
import e4.m;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a extends k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f23935b;

    public a(b bVar) {
        this.f23935b = bVar;
    }

    @Override // e4.k
    public final m b(int i10) {
        return new m(AccessibilityNodeInfo.obtain(this.f23935b.r(i10).f14996a));
    }

    @Override // e4.k
    public final m d(int i10) {
        int i11;
        b bVar = this.f23935b;
        if (i10 == 2) {
            i11 = bVar.f23946k;
        } else {
            i11 = bVar.f23947l;
        }
        if (i11 == Integer.MIN_VALUE) {
            return null;
        }
        return b(i11);
    }

    @Override // e4.k
    public final boolean f(int i10, int i11, Bundle bundle) {
        int i12;
        b bVar = this.f23935b;
        View view = bVar.f23944i;
        if (i10 != -1) {
            boolean z10 = true;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 64) {
                        if (i11 != 128) {
                            return bVar.s(i10, i11, bundle);
                        }
                        if (bVar.f23946k == i10) {
                            bVar.f23946k = Integer.MIN_VALUE;
                            view.invalidate();
                            bVar.x(i10, 65536);
                        }
                        z10 = false;
                    } else {
                        AccessibilityManager accessibilityManager = bVar.f23943h;
                        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i12 = bVar.f23946k) != i10) {
                            if (i12 != Integer.MIN_VALUE) {
                                bVar.f23946k = Integer.MIN_VALUE;
                                bVar.f23944i.invalidate();
                                bVar.x(i12, 65536);
                            }
                            bVar.f23946k = i10;
                            view.invalidate();
                            bVar.x(i10, 32768);
                        }
                        z10 = false;
                    }
                    return z10;
                }
                return bVar.j(i10);
            }
            return bVar.w(i10);
        }
        WeakHashMap weakHashMap = n1.f13788a;
        return v0.j(view, i11, bundle);
    }
}
