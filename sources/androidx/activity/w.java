package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f879a;

    /* renamed from: b, reason: collision with root package name */
    public final vt.q f880b = new vt.q();

    /* renamed from: c, reason: collision with root package name */
    public final r f881c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f882d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f883e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f884f;

    public w(Runnable runnable) {
        this.f879a = runnable;
        if (Build.VERSION.SDK_INT >= 33) {
            this.f881c = new r(this, 0);
            this.f882d = t.f872a.a(new r(this, 1));
        }
    }

    public final void a(androidx.lifecycle.t owner, q onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        androidx.lifecycle.o lifecycle = owner.getLifecycle();
        if (lifecycle.b() == androidx.lifecycle.n.f1947a) {
            return;
        }
        onBackPressedCallback.addCancellable(new u(this, lifecycle, onBackPressedCallback));
        if (Build.VERSION.SDK_INT >= 33) {
            d();
            onBackPressedCallback.setEnabledChangedCallback$activity_release(this.f881c);
        }
    }

    public final v b(q onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.f880b.h(onBackPressedCallback);
        v vVar = new v(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(vVar);
        if (Build.VERSION.SDK_INT >= 33) {
            d();
            onBackPressedCallback.setEnabledChangedCallback$activity_release(this.f881c);
        }
        return vVar;
    }

    public final void c() {
        Object obj;
        vt.q qVar = this.f880b;
        ListIterator<E> listIterator = qVar.listIterator(qVar.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                if (((q) obj).isEnabled()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        q qVar2 = (q) obj;
        if (qVar2 != null) {
            qVar2.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.f879a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void d() {
        boolean z10;
        OnBackInvokedCallback onBackInvokedCallback;
        vt.q qVar = this.f880b;
        if (!(qVar instanceof Collection) || !qVar.isEmpty()) {
            Iterator it = qVar.iterator();
            while (it.hasNext()) {
                if (((q) it.next()).isEnabled()) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f883e;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f882d) != null) {
            t tVar = t.f872a;
            if (z10 && !this.f884f) {
                tVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f884f = true;
            } else if (!z10 && this.f884f) {
                tVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f884f = false;
            }
        }
    }
}
