package a8;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import d4.n1;
import d4.v0;
import java.util.WeakHashMap;
import k7.i1;
import k7.z0;

/* loaded from: classes.dex */
public final class j extends b4.l {

    /* renamed from: c, reason: collision with root package name */
    public final e.l f271c;

    /* renamed from: d, reason: collision with root package name */
    public final t9.c f272d;

    /* renamed from: e, reason: collision with root package name */
    public d f273e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f274f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ViewPager2 viewPager2) {
        super(viewPager2);
        this.f274f = viewPager2;
        this.f271c = new e.l(this, 22);
        this.f272d = new t9.c(this, 23);
    }

    public final void h(z0 z0Var) {
        o();
        if (z0Var != null) {
            z0Var.o(this.f273e);
        }
    }

    public final void i(z0 z0Var) {
        if (z0Var != null) {
            z0Var.f22651a.unregisterObserver(this.f273e);
        }
    }

    public final void j(RecyclerView recyclerView) {
        WeakHashMap weakHashMap = n1.f13788a;
        v0.s(recyclerView, 2);
        this.f273e = new d(this, 1);
        ViewPager2 viewPager2 = this.f274f;
        if (v0.c(viewPager2) == 0) {
            v0.s(viewPager2, 1);
        }
    }

    public final void k(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        int i11;
        int a10;
        ViewPager2 viewPager2 = this.f274f;
        if (viewPager2.getAdapter() != null) {
            if (viewPager2.getOrientation() == 1) {
                i10 = viewPager2.getAdapter().a();
                i11 = 1;
            } else {
                i11 = viewPager2.getAdapter().a();
                i10 = 1;
            }
        } else {
            i10 = 0;
            i11 = 0;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) e4.k.e(i10, i11, 0).f14993a);
        z0 adapter = viewPager2.getAdapter();
        if (adapter != null && (a10 = adapter.a()) != 0 && viewPager2.f2526r) {
            if (viewPager2.f2512d > 0) {
                accessibilityNodeInfo.addAction(UserMetadata.MAX_INTERNAL_KEY_SIZE);
            }
            if (viewPager2.f2512d < a10 - 1) {
                accessibilityNodeInfo.addAction(4096);
            }
            accessibilityNodeInfo.setScrollable(true);
        }
    }

    public final void l(View view, e4.m mVar) {
        int i10;
        ViewPager2 viewPager2 = this.f274f;
        int i11 = 0;
        if (viewPager2.getOrientation() == 1) {
            viewPager2.f2515g.getClass();
            i10 = i1.H(view);
        } else {
            i10 = 0;
        }
        if (viewPager2.getOrientation() == 0) {
            viewPager2.f2515g.getClass();
            i11 = i1.H(view);
        }
        mVar.l(e4.l.a(i10, 1, i11, 1, false, false));
    }

    public final void m(int i10, Bundle bundle) {
        int currentItem;
        if (i10 != 8192 && i10 != 4096) {
            throw new IllegalStateException();
        }
        ViewPager2 viewPager2 = this.f274f;
        if (i10 == 8192) {
            currentItem = viewPager2.getCurrentItem() - 1;
        } else {
            currentItem = viewPager2.getCurrentItem() + 1;
        }
        if (viewPager2.f2526r) {
            viewPager2.d(currentItem, true);
        }
    }

    public final void n(AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.setSource(this.f274f);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    public final void o() {
        int a10;
        int i10;
        ViewPager2 viewPager2 = this.f274f;
        int i11 = R.id.accessibilityActionPageLeft;
        n1.k(viewPager2, R.id.accessibilityActionPageLeft);
        boolean z10 = false;
        n1.h(viewPager2, 0);
        n1.k(viewPager2, R.id.accessibilityActionPageRight);
        n1.h(viewPager2, 0);
        n1.k(viewPager2, R.id.accessibilityActionPageUp);
        n1.h(viewPager2, 0);
        n1.k(viewPager2, R.id.accessibilityActionPageDown);
        n1.h(viewPager2, 0);
        if (viewPager2.getAdapter() == null || (a10 = viewPager2.getAdapter().a()) == 0 || !viewPager2.f2526r) {
            return;
        }
        int orientation = viewPager2.getOrientation();
        t9.c cVar = this.f272d;
        e.l lVar = this.f271c;
        if (orientation == 0) {
            if (viewPager2.f2515g.C() == 1) {
                z10 = true;
            }
            if (z10) {
                i10 = 16908360;
            } else {
                i10 = 16908361;
            }
            if (z10) {
                i11 = 16908361;
            }
            if (viewPager2.f2512d < a10 - 1) {
                n1.l(viewPager2, new e4.f(i10, (String) null), lVar);
            }
            if (viewPager2.f2512d > 0) {
                n1.l(viewPager2, new e4.f(i11, (String) null), cVar);
                return;
            }
            return;
        }
        if (viewPager2.f2512d < a10 - 1) {
            n1.l(viewPager2, new e4.f(R.id.accessibilityActionPageDown, (String) null), lVar);
        }
        if (viewPager2.f2512d > 0) {
            n1.l(viewPager2, new e4.f(R.id.accessibilityActionPageUp, (String) null), cVar);
        }
    }
}
