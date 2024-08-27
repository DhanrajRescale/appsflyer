package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import androidx.fragment.app.t0;
import androidx.lifecycle.c1;
import androidx.lifecycle.d1;
import androidx.lifecycle.h1;
import androidx.lifecycle.i1;
import androidx.lifecycle.p0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.prod.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import q3.w0;
import q3.x0;
import q3.y0;
import qu.i0;

/* loaded from: classes.dex */
public abstract class m extends q3.o implements i1, androidx.lifecycle.i, o7.f, y, e.i, r3.n, r3.o, w0, x0, d4.r {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final e.h mActivityResultRegistry;
    private int mContentLayoutId;
    private d1 mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;

    @NonNull
    final p mFullyDrawnReporter;
    private final d4.v mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private final w mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<c4.a> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<c4.a> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<c4.a> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<c4.a> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<c4.a> mOnTrimMemoryListeners;
    final k mReportFullyDrawnExecutor;
    final o7.e mSavedStateRegistryController;
    private h1 mViewModelStore;
    final d.a mContextAwareHelper = new d.a();
    private final androidx.lifecycle.v mLifecycleRegistry = new androidx.lifecycle.v(this);

    public m() {
        int i10 = 0;
        this.mMenuHostHelper = new d4.v(new b(this, i10));
        o7.e m10 = x2.c.m(this);
        this.mSavedStateRegistryController = m10;
        this.mOnBackPressedDispatcher = new w(new f(this));
        l lVar = new l(this);
        this.mReportFullyDrawnExecutor = lVar;
        this.mFullyDrawnReporter = new p(lVar, new c(this, i10));
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new g(this);
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() != null) {
            getLifecycle().a(new h(this, 1));
            getLifecycle().a(new h(this, i10));
            getLifecycle().a(new h(this, 2));
            m10.a();
            u0.d(this);
            getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new d(this, i10));
            addOnContextAvailableListener(new e(this, 0));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public static Bundle k(m mVar) {
        mVar.getClass();
        Bundle bundle = new Bundle();
        e.h hVar = mVar.mActivityResultRegistry;
        hVar.getClass();
        HashMap hashMap = hVar.f14626c;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(hVar.f14628e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) hVar.f14631h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", hVar.f14624a);
        return bundle;
    }

    public static void l(m mVar) {
        Bundle a10 = mVar.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (a10 != null) {
            e.h hVar = mVar.mActivityResultRegistry;
            hVar.getClass();
            ArrayList<Integer> integerArrayList = a10.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a10.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                hVar.f14628e = a10.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                hVar.f14624a = (Random) a10.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                Bundle bundle = a10.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                Bundle bundle2 = hVar.f14631h;
                bundle2.putAll(bundle);
                for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
                    String str = stringArrayList.get(i10);
                    HashMap hashMap = hVar.f14626c;
                    boolean containsKey = hashMap.containsKey(str);
                    HashMap hashMap2 = hVar.f14625b;
                    if (containsKey) {
                        Integer num = (Integer) hashMap.remove(str);
                        if (!bundle2.containsKey(str)) {
                            hashMap2.remove(num);
                        }
                    }
                    int intValue = integerArrayList.get(i10).intValue();
                    String str2 = stringArrayList.get(i10);
                    hashMap2.put(Integer.valueOf(intValue), str2);
                    hashMap.put(str2, Integer.valueOf(intValue));
                }
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m();
        this.mReportFullyDrawnExecutor.J(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // d4.r
    public void addMenuProvider(@NonNull d4.x xVar) {
        d4.v vVar = this.mMenuHostHelper;
        vVar.f13845b.add(xVar);
        vVar.f13844a.run();
    }

    @Override // r3.n
    public final void addOnConfigurationChangedListener(@NonNull c4.a aVar) {
        this.mOnConfigurationChangedListeners.add(aVar);
    }

    public final void addOnContextAvailableListener(@NonNull d.b listener) {
        d.a aVar = this.mContextAwareHelper;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        Context context = aVar.f13126b;
        if (context != null) {
            listener.a(context);
        }
        aVar.f13125a.add(listener);
    }

    @Override // q3.w0
    public final void addOnMultiWindowModeChangedListener(@NonNull c4.a aVar) {
        this.mOnMultiWindowModeChangedListeners.add(aVar);
    }

    public final void addOnNewIntentListener(@NonNull c4.a aVar) {
        this.mOnNewIntentListeners.add(aVar);
    }

    @Override // q3.x0
    public final void addOnPictureInPictureModeChangedListener(@NonNull c4.a aVar) {
        this.mOnPictureInPictureModeChangedListeners.add(aVar);
    }

    @Override // r3.o
    public final void addOnTrimMemoryListener(@NonNull c4.a aVar) {
        this.mOnTrimMemoryListeners.add(aVar);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            j jVar = (j) getLastNonConfigurationInstance();
            if (jVar != null) {
                this.mViewModelStore = jVar.f856b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new h1();
            }
        }
    }

    @Override // e.i
    @NonNull
    public final e.h getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.i
    @NonNull
    public y4.c getDefaultViewModelCreationExtras() {
        y4.e eVar = new y4.e(0);
        if (getApplication() != null) {
            eVar.b(c1.f1897d, getApplication());
        }
        eVar.b(u0.f1972a, this);
        eVar.b(u0.f1973b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            eVar.b(u0.f1974c, getIntent().getExtras());
        }
        return eVar;
    }

    @Override // androidx.lifecycle.i
    @NonNull
    public d1 getDefaultViewModelProviderFactory() {
        Bundle bundle;
        if (this.mDefaultFactory == null) {
            Application application = getApplication();
            if (getIntent() != null) {
                bundle = getIntent().getExtras();
            } else {
                bundle = null;
            }
            this.mDefaultFactory = new androidx.lifecycle.w0(application, this, bundle);
        }
        return this.mDefaultFactory;
    }

    @NonNull
    public p getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        j jVar = (j) getLastNonConfigurationInstance();
        if (jVar != null) {
            return jVar.f855a;
        }
        return null;
    }

    @Override // androidx.lifecycle.t
    @NonNull
    public androidx.lifecycle.o getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.y
    @NonNull
    public final w getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // o7.f
    @NonNull
    public final o7.d getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f29766b;
    }

    @Override // androidx.lifecycle.i1
    @NonNull
    public h1 getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    public final void m() {
        yk.j.r1(getWindow().getDecorView(), this);
        i0.H(getWindow().getDecorView(), this);
        yk.g.Z(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullParameter(decorView, "<this>");
        Intrinsics.checkNotNullParameter(this, "onBackPressedDispatcherOwner");
        decorView.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView2 = getWindow().getDecorView();
        Intrinsics.checkNotNullParameter(decorView2, "<this>");
        Intrinsics.checkNotNullParameter(this, "fullyDrawnReporterOwner");
        decorView2.setTag(R.id.report_drawn, this);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (!this.mActivityResultRegistry.a(i10, i11, intent)) {
            super.onActivityResult(i10, i11, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<c4.a> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().b(configuration);
        }
    }

    @Override // q3.o, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.b(bundle);
        d.a aVar = this.mContextAwareHelper;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(this, "context");
        aVar.f13126b = this;
        Iterator it = aVar.f13125a.iterator();
        while (it.hasNext()) {
            ((d.b) it.next()).a(this);
        }
        super.onCreate(bundle);
        p0.b(this);
        if (y3.b.c()) {
            w wVar = this.mOnBackPressedDispatcher;
            OnBackInvokedDispatcher invoker = i.a(this);
            wVar.getClass();
            Intrinsics.checkNotNullParameter(invoker, "invoker");
            wVar.f883e = invoker;
            wVar.d();
        }
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, @NonNull Menu menu) {
        if (i10 == 0) {
            super.onCreatePanelMenu(i10, menu);
            d4.v vVar = this.mMenuHostHelper;
            MenuInflater menuInflater = getMenuInflater();
            Iterator it = vVar.f13845b.iterator();
            while (it.hasNext()) {
                ((t0) ((d4.x) it.next())).f1831a.j(menu, menuInflater);
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            return this.mMenuHostHelper.a(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<c4.a> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().b(new q3.t(z10));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<c4.a> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().b(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, @NonNull Menu menu) {
        Iterator it = this.mMenuHostHelper.f13845b.iterator();
        while (it.hasNext()) {
            ((t0) ((d4.x) it.next())).f1831a.p(menu);
        }
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<c4.a> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().b(new y0(z10));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, @NonNull Menu menu) {
        if (i10 == 0) {
            super.onPreparePanel(i10, view, menu);
            Iterator it = this.mMenuHostHelper.f13845b.iterator();
            while (it.hasNext()) {
                ((t0) ((d4.x) it.next())).f1831a.s(menu);
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (!this.mActivityResultRegistry.a(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i10, strArr, iArr);
        }
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.activity.j, java.lang.Object] */
    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        j jVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        h1 h1Var = this.mViewModelStore;
        if (h1Var == null && (jVar = (j) getLastNonConfigurationInstance()) != null) {
            h1Var = jVar.f856b;
        }
        if (h1Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f855a = onRetainCustomNonConfigurationInstance;
        obj.f856b = h1Var;
        return obj;
    }

    @Override // q3.o, android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        androidx.lifecycle.o lifecycle = getLifecycle();
        if (lifecycle instanceof androidx.lifecycle.v) {
            ((androidx.lifecycle.v) lifecycle).h(androidx.lifecycle.n.f1949c);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<c4.a> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().b(Integer.valueOf(i10));
        }
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.f13126b;
    }

    @NonNull
    public final <I, O> e.c registerForActivityResult(@NonNull f.a aVar, @NonNull e.h hVar, @NonNull e.b bVar) {
        return hVar.c("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, aVar, bVar);
    }

    @Override // d4.r
    public void removeMenuProvider(@NonNull d4.x xVar) {
        this.mMenuHostHelper.b(xVar);
    }

    @Override // r3.n
    public final void removeOnConfigurationChangedListener(@NonNull c4.a aVar) {
        this.mOnConfigurationChangedListeners.remove(aVar);
    }

    public final void removeOnContextAvailableListener(@NonNull d.b listener) {
        d.a aVar = this.mContextAwareHelper;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        aVar.f13125a.remove(listener);
    }

    @Override // q3.w0
    public final void removeOnMultiWindowModeChangedListener(@NonNull c4.a aVar) {
        this.mOnMultiWindowModeChangedListeners.remove(aVar);
    }

    public final void removeOnNewIntentListener(@NonNull c4.a aVar) {
        this.mOnNewIntentListeners.remove(aVar);
    }

    @Override // q3.x0
    public final void removeOnPictureInPictureModeChangedListener(@NonNull c4.a aVar) {
        this.mOnPictureInPictureModeChangedListeners.remove(aVar);
    }

    @Override // r3.o
    public final void removeOnTrimMemoryListener(@NonNull c4.a aVar) {
        this.mOnTrimMemoryListeners.remove(aVar);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (q6.l.j()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.mFullyDrawnReporter.a();
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        m();
        this.mReportFullyDrawnExecutor.J(getWindow().getDecorView());
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i10, Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10, @NonNull Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z10, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<c4.a> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().b(new q3.t(z10, 0));
            }
        } catch (Throwable th2) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10, @NonNull Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<c4.a> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().b(new y0(z10, 0));
            }
        } catch (Throwable th2) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th2;
        }
    }

    public void addMenuProvider(@NonNull d4.x xVar, @NonNull androidx.lifecycle.t tVar) {
        d4.v vVar = this.mMenuHostHelper;
        vVar.f13845b.add(xVar);
        vVar.f13844a.run();
        androidx.lifecycle.o lifecycle = tVar.getLifecycle();
        HashMap hashMap = vVar.f13846c;
        d4.u uVar = (d4.u) hashMap.remove(xVar);
        if (uVar != null) {
            uVar.f13833a.c(uVar.f13834b);
            uVar.f13834b = null;
        }
        hashMap.put(xVar, new d4.u(lifecycle, new d4.s(0, vVar, xVar)));
    }

    @NonNull
    public final <I, O> e.c registerForActivityResult(@NonNull f.a aVar, @NonNull e.b bVar) {
        return registerForActivityResult(aVar, this.mActivityResultRegistry, bVar);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        m();
        this.mReportFullyDrawnExecutor.J(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m();
        this.mReportFullyDrawnExecutor.J(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@NonNull d4.x xVar, @NonNull androidx.lifecycle.t tVar, @NonNull androidx.lifecycle.n nVar) {
        d4.v vVar = this.mMenuHostHelper;
        vVar.getClass();
        androidx.lifecycle.o lifecycle = tVar.getLifecycle();
        HashMap hashMap = vVar.f13846c;
        d4.u uVar = (d4.u) hashMap.remove(xVar);
        if (uVar != null) {
            uVar.f13833a.c(uVar.f13834b);
            uVar.f13834b = null;
        }
        hashMap.put(xVar, new d4.u(lifecycle, new d4.t(0, vVar, nVar, xVar)));
    }
}
