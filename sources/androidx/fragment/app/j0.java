package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class j0 extends androidx.activity.m implements q3.g {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    boolean mResumed;
    final m0 mFragments = new m0(new i0(this));
    final androidx.lifecycle.v mFragmentLifecycleRegistry = new androidx.lifecycle.v(this);
    boolean mStopped = true;

    public j0() {
        final int i10 = 1;
        getSavedStateRegistry().c(LIFECYCLE_TAG, new androidx.activity.d(this, 2));
        final int i11 = 0;
        addOnConfigurationChangedListener(new c4.a(this) { // from class: androidx.fragment.app.h0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j0 f1713b;

            {
                this.f1713b = this;
            }

            @Override // c4.a
            public final void b(Object obj) {
                int i12 = i11;
                j0 j0Var = this.f1713b;
                switch (i12) {
                    case 0:
                        j0Var.mFragments.a();
                        return;
                    default:
                        j0Var.mFragments.a();
                        return;
                }
            }
        });
        addOnNewIntentListener(new c4.a(this) { // from class: androidx.fragment.app.h0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j0 f1713b;

            {
                this.f1713b = this;
            }

            @Override // c4.a
            public final void b(Object obj) {
                int i12 = i10;
                j0 j0Var = this.f1713b;
                switch (i12) {
                    case 0:
                        j0Var.mFragments.a();
                        return;
                    default:
                        j0Var.mFragments.a();
                        return;
                }
            }
        });
        addOnContextAvailableListener(new androidx.activity.e(this, 1));
    }

    public static void n(j0 j0Var) {
        n0 n0Var = j0Var.mFragments.f1761a;
        n0Var.f1777d.b(n0Var, n0Var, null);
    }

    public static /* synthetic */ Bundle o(j0 j0Var) {
        j0Var.markFragmentsCreated();
        j0Var.mFragmentLifecycleRegistry.f(androidx.lifecycle.m.ON_STOP);
        return new Bundle();
    }

    public static boolean p(d1 d1Var) {
        androidx.lifecycle.n nVar = androidx.lifecycle.n.f1949c;
        boolean z10 = false;
        for (g0 g0Var : d1Var.f1646c.f()) {
            if (g0Var != null) {
                if (g0Var.getHost() != null) {
                    z10 |= p(g0Var.getChildFragmentManager());
                }
                y1 y1Var = g0Var.mViewLifecycleOwner;
                androidx.lifecycle.n nVar2 = androidx.lifecycle.n.f1950d;
                if (y1Var != null) {
                    y1Var.b();
                    if (y1Var.f1864e.f1978d.a(nVar2)) {
                        g0Var.mViewLifecycleOwner.f1864e.h(nVar);
                        z10 = true;
                    }
                }
                if (g0Var.mLifecycleRegistry.f1978d.a(nVar2)) {
                    g0Var.mLifecycleRegistry.h(nVar);
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final View dispatchFragmentsOnCreateView(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.mFragments.f1761a.f1777d.f1649f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (!shouldDumpInternalState(strArr)) {
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            androidx.loader.app.b.a(this).c(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.f1761a.f1777d.u(str, fileDescriptor, printWriter, strArr);
    }

    @NonNull
    public d1 getSupportFragmentManager() {
        return this.mFragments.f1761a.f1777d;
    }

    @NonNull
    @Deprecated
    public androidx.loader.app.b getSupportLoaderManager() {
        return androidx.loader.app.b.a(this);
    }

    public void markFragmentsCreated() {
        do {
        } while (p(getSupportFragmentManager()));
    }

    @Override // androidx.activity.m, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i10, i11, intent);
    }

    @Deprecated
    public void onAttachFragment(@NonNull g0 g0Var) {
    }

    @Override // androidx.activity.m, q3.o, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.m.ON_CREATE);
        e1 e1Var = this.mFragments.f1761a.f1777d;
        e1Var.G = false;
        e1Var.H = false;
        e1Var.N.f1583g = false;
        e1Var.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f1761a.f1777d.k();
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.m.ON_DESTROY);
    }

    @Override // androidx.activity.m, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.mFragments.f1761a.f1777d.i(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f1761a.f1777d.t(5);
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.m.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.m, android.app.Activity
    public void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f1761a.f1777d.x(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.m.ON_RESUME);
        e1 e1Var = this.mFragments.f1761a.f1777d;
        e1Var.G = false;
        e1Var.H = false;
        e1Var.N.f1583g = false;
        e1Var.t(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            e1 e1Var = this.mFragments.f1761a.f1777d;
            e1Var.G = false;
            e1Var.H = false;
            e1Var.N.f1583g = false;
            e1Var.t(4);
        }
        this.mFragments.f1761a.f1777d.x(true);
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.m.ON_START);
        e1 e1Var2 = this.mFragments.f1761a.f1777d;
        e1Var2.G = false;
        e1Var2.H = false;
        e1Var2.N.f1583g = false;
        e1Var2.t(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        e1 e1Var = this.mFragments.f1761a.f1777d;
        e1Var.H = true;
        e1Var.N.f1583g = true;
        e1Var.t(4);
        this.mFragmentLifecycleRegistry.f(androidx.lifecycle.m.ON_STOP);
    }

    public void setEnterSharedElementCallback(q3.z0 z0Var) {
        int i10 = q3.h.f31615a;
        q3.b.c(this, null);
    }

    public void setExitSharedElementCallback(q3.z0 z0Var) {
        int i10 = q3.h.f31615a;
        q3.b.d(this, null);
    }

    public void startActivityFromFragment(@NonNull g0 g0Var, @NonNull Intent intent, int i10) {
        startActivityFromFragment(g0Var, intent, i10, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(@NonNull g0 g0Var, @NonNull IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        if (i10 == -1) {
            int i14 = q3.h.f31615a;
            q3.a.c(this, intentSender, i10, intent, i11, i12, i13, bundle);
        } else {
            g0Var.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        int i10 = q3.h.f31615a;
        q3.b.a(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        int i10 = q3.h.f31615a;
        q3.b.b(this);
    }

    public void supportStartPostponedEnterTransition() {
        int i10 = q3.h.f31615a;
        q3.b.e(this);
    }

    @Override // q3.g
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i10) {
    }

    public void startActivityFromFragment(@NonNull g0 g0Var, @NonNull Intent intent, int i10, Bundle bundle) {
        if (i10 == -1) {
            int i11 = q3.h.f31615a;
            q3.a.b(this, intent, -1, bundle);
        } else {
            g0Var.startActivityForResult(intent, i10, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }
}
