package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.annotation.NonNull;
import androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetUserVisibleHintViolation;
import androidx.fragment.app.strictmode.Violation;
import androidx.lifecycle.LiveData;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class g0 implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.t, androidx.lifecycle.i1, androidx.lifecycle.i, o7.f {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    c0 mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    androidx.lifecycle.d1 mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    d1 mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    n0 mHost;
    boolean mInLayout;
    boolean mIsCreated;
    LayoutInflater mLayoutInflater;
    androidx.lifecycle.v mLifecycleRegistry;
    g0 mParentFragment;
    boolean mPerformedCreateView;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    o7.e mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    String mTag;
    g0 mTarget;
    int mTargetRequestCode;
    View mView;
    y1 mViewLifecycleOwner;
    int mState = -1;

    @NonNull
    String mWho = UUID.randomUUID().toString();
    String mTargetWho = null;
    private Boolean mIsPrimaryNavigationFragment = null;

    @NonNull
    d1 mChildFragmentManager = new d1();
    boolean mMenuVisible = true;
    boolean mUserVisibleHint = true;
    Runnable mPostponedDurationRunnable = new u(this, 0);
    androidx.lifecycle.n mMaxState = androidx.lifecycle.n.f1951e;
    androidx.lifecycle.e0 mViewLifecycleOwnerLiveData = new LiveData();
    private final AtomicInteger mNextLocalRequestCode = new AtomicInteger();
    private final ArrayList<d0> mOnPreAttachedListeners = new ArrayList<>();
    private final d0 mSavedStateAttachListener = new v(this);

    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public g0() {
        n();
    }

    @NonNull
    @Deprecated
    public static g0 instantiate(@NonNull Context context, @NonNull String str) {
        return instantiate(context, str, null);
    }

    public static void j(g0 g0Var) {
        y1 y1Var = g0Var.mViewLifecycleOwner;
        y1Var.f1865f.b(g0Var.mSavedViewRegistryState);
        g0Var.mSavedViewRegistryState = null;
    }

    public void callStartTransitionListener(boolean z10) {
        ViewGroup viewGroup;
        d1 d1Var;
        c0 c0Var = this.mAnimationInfo;
        if (c0Var != null) {
            c0Var.f1637s = false;
        }
        if (this.mView != null && (viewGroup = this.mContainer) != null && (d1Var = this.mFragmentManager) != null) {
            n l10 = n.l(viewGroup, d1Var);
            l10.m();
            if (z10) {
                this.mHost.f1776c.post(new w(l10));
            } else {
                l10.h();
            }
            Handler handler = this.mPostponedHandler;
            if (handler != null) {
                handler.removeCallbacks(this.mPostponedDurationRunnable);
                this.mPostponedHandler = null;
            }
        }
    }

    @NonNull
    public l0 createFragmentContainer() {
        return new x(this);
    }

    public void dump(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        g0 m10 = m(false);
        if (m10 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(m10);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            androidx.loader.app.b.a(this).c(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.u(jr.h.r(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public g0 findFragmentByWho(@NonNull String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        return this.mChildFragmentManager.f1646c.c(str);
    }

    @NonNull
    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final j0 getActivity() {
        n0 n0Var = this.mHost;
        if (n0Var == null) {
            return null;
        }
        return (j0) n0Var.f1774a;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        c0 c0Var = this.mAnimationInfo;
        if (c0Var != null && (bool = c0Var.f1634p) != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        c0 c0Var = this.mAnimationInfo;
        if (c0Var != null && (bool = c0Var.f1633o) != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public View getAnimatingAway() {
        c0 c0Var = this.mAnimationInfo;
        if (c0Var == null) {
            return null;
        }
        c0Var.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    @NonNull
    public final d1 getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(a3.a.e("Fragment ", this, " has not been attached yet."));
    }

    public Context getContext() {
        n0 n0Var = this.mHost;
        if (n0Var == null) {
            return null;
        }
        return n0Var.f1775b;
    }

    @Override // androidx.lifecycle.i
    @NonNull
    public y4.c getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        if (application == null && Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        y4.e eVar = new y4.e(0);
        if (application != null) {
            eVar.b(androidx.lifecycle.c1.f1897d, application);
        }
        eVar.b(androidx.lifecycle.u0.f1972a, this);
        eVar.b(androidx.lifecycle.u0.f1973b, this);
        if (getArguments() != null) {
            eVar.b(androidx.lifecycle.u0.f1974c, getArguments());
        }
        return eVar;
    }

    @Override // androidx.lifecycle.i
    @NonNull
    public androidx.lifecycle.d1 getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager != null) {
            if (this.mDefaultFactory == null) {
                Context applicationContext = requireContext().getApplicationContext();
                while (true) {
                    if (applicationContext instanceof ContextWrapper) {
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                            break;
                        }
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    } else {
                        application = null;
                        break;
                    }
                }
                if (application == null && Log.isLoggable("FragmentManager", 3)) {
                    Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.mDefaultFactory = new androidx.lifecycle.w0(application, this, getArguments());
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public int getEnterAnim() {
        c0 c0Var = this.mAnimationInfo;
        if (c0Var == null) {
            return 0;
        }
        return c0Var.f1620b;
    }

    public Object getEnterTransition() {
        c0 c0Var = this.mAnimationInfo;
        if (c0Var == null) {
            return null;
        }
        return c0Var.f1627i;
    }

    public q3.z0 getEnterTransitionCallback() {
        c0 c0Var = this.mAnimationInfo;
        if (c0Var == null) {
            return null;
        }
        c0Var.getClass();
        return null;
    }

    public int getExitAnim() {
        c0 c0Var = this.mAnimationInfo;
        if (c0Var == null) {
            return 0;
        }
        return c0Var.f1621c;
    }

    public Object getExitTransition() {
        c0 c0Var = this.mAnimationInfo;
        if (c0Var == null) {
            return null;
        }
        return c0Var.f1629k;
    }

    public q3.z0 getExitTransitionCallback() {
        c0 c0Var = this.mAnimationInfo;
        if (c0Var == null) {
            return null;
        }
        c0Var.getClass();
        return null;
    }

    public View getFocusedView() {
        c0 c0Var = this.mAnimationInfo;
        if (c0Var == null) {
            return null;
        }
        return c0Var.f1636r;
    }

    @Deprecated
    public final d1 getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        n0 n0Var = this.mHost;
        if (n0Var == null) {
            return null;
        }
        return ((i0) n0Var).f1717e;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @NonNull
    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        n0 n0Var = this.mHost;
        if (n0Var != null) {
            j0 j0Var = ((i0) n0Var).f1717e;
            LayoutInflater cloneInContext = j0Var.getLayoutInflater().cloneInContext(j0Var);
            cloneInContext.setFactory2(this.mChildFragmentManager.f1649f);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Override // androidx.lifecycle.t
    @NonNull
    public androidx.lifecycle.o getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @NonNull
    @Deprecated
    public androidx.loader.app.b getLoaderManager() {
        return androidx.loader.app.b.a(this);
    }

    public int getNextTransition() {
        c0 c0Var = this.mAnimationInfo;
        if (c0Var == null) {
            return 0;
        }
        return c0Var.f1624f;
    }

    public final g0 getParentFragment() {
        return this.mParentFragment;
    }

    @NonNull
    public final d1 getParentFragmentManager() {
        d1 d1Var = this.mFragmentManager;
        if (d1Var != null) {
            return d1Var;
        }
        throw new IllegalStateException(a3.a.e("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        c0 c0Var = this.mAnimationInfo;
        if (c0Var == null) {
            return false;
        }
        return c0Var.f1619a;
    }

    public int getPopEnterAnim() {
        c0 c0Var = this.mAnimationInfo;
        if (c0Var == null) {
            return 0;
        }
        return c0Var.f1622d;
    }

    public int getPopExitAnim() {
        c0 c0Var = this.mAnimationInfo;
        if (c0Var == null) {
            return 0;
        }
        return c0Var.f1623e;
    }

    public float getPostOnViewCreatedAlpha() {
        c0 c0Var = this.mAnimationInfo;
        if (c0Var == null) {
            return 1.0f;
        }
        return c0Var.f1635q;
    }

    public Object getReenterTransition() {
        c0 c0Var = this.mAnimationInfo;
        if (c0Var == null) {
            return null;
        }
        Object obj = c0Var.f1630l;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getExitTransition();
        }
        return obj;
    }

    @NonNull
    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        u4.b bVar = u4.c.f36741a;
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(this, "fragment");
        Violation violation = new Violation(this, "Attempting to get retain instance for fragment " + this);
        u4.c.c(violation);
        u4.b a10 = u4.c.a(this);
        if (a10.f36739a.contains(u4.a.f36733f) && u4.c.e(a10, getClass(), GetRetainInstanceUsageViolation.class)) {
            u4.c.b(a10, violation);
        }
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        c0 c0Var = this.mAnimationInfo;
        if (c0Var == null) {
            return null;
        }
        Object obj = c0Var.f1628j;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getEnterTransition();
        }
        return obj;
    }

    @Override // o7.f
    @NonNull
    public final o7.d getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f29766b;
    }

    public Object getSharedElementEnterTransition() {
        c0 c0Var = this.mAnimationInfo;
        if (c0Var == null) {
            return null;
        }
        return c0Var.f1631m;
    }

    public Object getSharedElementReturnTransition() {
        c0 c0Var = this.mAnimationInfo;
        if (c0Var == null) {
            return null;
        }
        Object obj = c0Var.f1632n;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getSharedElementEnterTransition();
        }
        return obj;
    }

    @NonNull
    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        c0 c0Var = this.mAnimationInfo;
        if (c0Var != null && (arrayList = c0Var.f1625g) != null) {
            return arrayList;
        }
        return new ArrayList<>();
    }

    @NonNull
    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        c0 c0Var = this.mAnimationInfo;
        if (c0Var != null && (arrayList = c0Var.f1626h) != null) {
            return arrayList;
        }
        return new ArrayList<>();
    }

    @NonNull
    public final String getString(int i10) {
        return getResources().getString(i10);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final g0 getTargetFragment() {
        return m(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        u4.b bVar = u4.c.f36741a;
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(this, "fragment");
        Violation violation = new Violation(this, "Attempting to get target request code from fragment " + this);
        u4.c.c(violation);
        u4.b a10 = u4.c.a(this);
        if (a10.f36739a.contains(u4.a.f36735h) && u4.c.e(a10, getClass(), GetTargetFragmentRequestCodeUsageViolation.class)) {
            u4.c.b(a10, violation);
        }
        return this.mTargetRequestCode;
    }

    @NonNull
    public final CharSequence getText(int i10) {
        return getResources().getText(i10);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    @NonNull
    public androidx.lifecycle.t getViewLifecycleOwner() {
        y1 y1Var = this.mViewLifecycleOwner;
        if (y1Var != null) {
            return y1Var;
        }
        throw new IllegalStateException(a3.a.e("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    @NonNull
    public LiveData<androidx.lifecycle.t> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.i1
    @NonNull
    public androidx.lifecycle.h1 getViewModelStore() {
        if (this.mFragmentManager != null) {
            if (l() != 1) {
                HashMap hashMap = this.mFragmentManager.N.f1580d;
                androidx.lifecycle.h1 h1Var = (androidx.lifecycle.h1) hashMap.get(this.mWho);
                if (h1Var == null) {
                    androidx.lifecycle.h1 h1Var2 = new androidx.lifecycle.h1();
                    hashMap.put(this.mWho, h1Var2);
                    return h1Var2;
                }
                return h1Var;
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        n();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new d1();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (!this.mHidden) {
            d1 d1Var = this.mFragmentManager;
            if (d1Var != null) {
                g0 g0Var = this.mParentFragment;
                d1Var.getClass();
                if (g0Var != null && g0Var.isHidden()) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        g0 g0Var;
        if (this.mMenuVisible && (this.mFragmentManager == null || (g0Var = this.mParentFragment) == null || g0Var.isMenuVisible())) {
            return true;
        }
        return false;
    }

    public boolean isPostponed() {
        c0 c0Var = this.mAnimationInfo;
        if (c0Var == null) {
            return false;
        }
        return c0Var.f1637s;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        d1 d1Var = this.mFragmentManager;
        if (d1Var == null) {
            return false;
        }
        return d1Var.M();
    }

    public final boolean isVisible() {
        View view;
        if (isAdded() && !isHidden() && (view = this.mView) != null && view.getWindowToken() != null && this.mView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.fragment.app.c0] */
    public final c0 k() {
        if (this.mAnimationInfo == null) {
            ?? obj = new Object();
            obj.f1627i = null;
            Object obj2 = USE_DEFAULT_TRANSITION;
            obj.f1628j = obj2;
            obj.f1629k = null;
            obj.f1630l = obj2;
            obj.f1631m = null;
            obj.f1632n = obj2;
            obj.f1635q = 1.0f;
            obj.f1636r = null;
            this.mAnimationInfo = obj;
        }
        return this.mAnimationInfo;
    }

    public final int l() {
        androidx.lifecycle.n nVar = this.mMaxState;
        if (nVar != androidx.lifecycle.n.f1948b && this.mParentFragment != null) {
            return Math.min(nVar.ordinal(), this.mParentFragment.l());
        }
        return nVar.ordinal();
    }

    public final g0 m(boolean z10) {
        String str;
        if (z10) {
            u4.b bVar = u4.c.f36741a;
            Intrinsics.checkNotNullParameter(this, "fragment");
            Intrinsics.checkNotNullParameter(this, "fragment");
            Intrinsics.checkNotNullParameter(this, "fragment");
            Violation violation = new Violation(this, "Attempting to get target fragment from fragment " + this);
            u4.c.c(violation);
            u4.b a10 = u4.c.a(this);
            if (a10.f36739a.contains(u4.a.f36735h) && u4.c.e(a10, getClass(), GetTargetFragmentUsageViolation.class)) {
                u4.c.b(a10, violation);
            }
        }
        g0 g0Var = this.mTarget;
        if (g0Var != null) {
            return g0Var;
        }
        d1 d1Var = this.mFragmentManager;
        if (d1Var != null && (str = this.mTargetWho) != null) {
            return d1Var.f1646c.b(str);
        }
        return null;
    }

    public final void n() {
        this.mLifecycleRegistry = new androidx.lifecycle.v(this);
        this.mSavedStateRegistryController = x2.c.m(this);
        this.mDefaultFactory = null;
        if (!this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            d0 d0Var = this.mSavedStateAttachListener;
            if (this.mState >= 0) {
                d0Var.a();
            } else {
                this.mOnPreAttachedListeners.add(d0Var);
            }
        }
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.O();
    }

    public final e.e o(f.a aVar, p.a aVar2, e.b bVar) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            b0 b0Var = new b0(this, aVar2, atomicReference, aVar, bVar);
            if (this.mState >= 0) {
                b0Var.a();
            } else {
                this.mOnPreAttachedListeners.add(b0Var);
            }
            return new e.e(this, atomicReference, aVar, 2);
        }
        throw new IllegalStateException(a3.a.e("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    @Deprecated
    public void onAttach(@NonNull Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onAttachFragment(@NonNull g0 g0Var) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        d1 d1Var = this.mChildFragmentManager;
        if (d1Var.f1664u < 1) {
            d1Var.G = false;
            d1Var.H = false;
            d1Var.N.f1583g = false;
            d1Var.t(1);
        }
    }

    public Animation onCreateAnimation(int i10, boolean z10, int i11) {
        return null;
    }

    public Animator onCreateAnimator(int i10, boolean z10, int i11) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(@NonNull ContextMenu contextMenu, @NonNull View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
    }

    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    @NonNull
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z10) {
    }

    @Deprecated
    public void onInflate(@NonNull Activity activity, @NonNull AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z10) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(@NonNull Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z10) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(@NonNull Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z10) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(@NonNull View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        Bundle bundle2;
        this.mChildFragmentManager.O();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
            }
            if (this.mView != null) {
                Bundle bundle3 = this.mSavedFragmentState;
                if (bundle3 != null) {
                    bundle2 = bundle3.getBundle("savedInstanceState");
                } else {
                    bundle2 = null;
                }
                restoreViewState(bundle2);
            }
            this.mSavedFragmentState = null;
            d1 d1Var = this.mChildFragmentManager;
            d1Var.G = false;
            d1Var.H = false;
            d1Var.N.f1583g = false;
            d1Var.t(4);
            return;
        }
        throw new AndroidRuntimeException(a3.a.e("Fragment ", this, " did not call through to super.onActivityCreated()"));
    }

    public void performAttach() {
        Iterator<d0> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.f1775b);
        if (this.mCalled) {
            d1 d1Var = this.mFragmentManager;
            Iterator it2 = d1Var.f1658o.iterator();
            while (it2.hasNext()) {
                ((h1) it2.next()).a(d1Var, this);
            }
            d1 d1Var2 = this.mChildFragmentManager;
            d1Var2.G = false;
            d1Var2.H = false;
            d1Var2.N.f1583g = false;
            d1Var2.t(0);
            return;
        }
        throw new AndroidRuntimeException(a3.a.e("Fragment ", this, " did not call through to super.onAttach()"));
    }

    public void performConfigurationChanged(@NonNull Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(@NonNull MenuItem menuItem) {
        if (!this.mHidden) {
            if (onContextItemSelected(menuItem)) {
                return true;
            }
            return this.mChildFragmentManager.i(menuItem);
        }
        return false;
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.O();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new y(this));
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.f(androidx.lifecycle.m.ON_CREATE);
            return;
        }
        throw new AndroidRuntimeException(a3.a.e("Fragment ", this, " did not call through to super.onCreate()"));
    }

    public boolean performCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z10 = true;
        }
        return z10 | this.mChildFragmentManager.j(menu, menuInflater);
    }

    public void performCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.O();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new y1(this, getViewModelStore(), new androidx.activity.b(this, 12));
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView != null) {
            this.mViewLifecycleOwner.b();
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
            }
            yk.j.r1(this.mView, this.mViewLifecycleOwner);
            qu.i0.H(this.mView, this.mViewLifecycleOwner);
            yk.g.Z(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
            return;
        }
        if (this.mViewLifecycleOwner.f1864e == null) {
            this.mViewLifecycleOwner = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public void performDestroy() {
        this.mChildFragmentManager.k();
        this.mLifecycleRegistry.f(androidx.lifecycle.m.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
        } else {
            throw new AndroidRuntimeException(a3.a.e("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.t(1);
        if (this.mView != null) {
            y1 y1Var = this.mViewLifecycleOwner;
            y1Var.b();
            if (y1Var.f1864e.f1978d.a(androidx.lifecycle.n.f1949c)) {
                this.mViewLifecycleOwner.a(androidx.lifecycle.m.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            androidx.loader.app.b.a(this).d();
            this.mPerformedCreateView = false;
            return;
        }
        throw new AndroidRuntimeException(a3.a.e("Fragment ", this, " did not call through to super.onDestroyView()"));
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            d1 d1Var = this.mChildFragmentManager;
            if (!d1Var.I) {
                d1Var.k();
                this.mChildFragmentManager = new d1();
                return;
            }
            return;
        }
        throw new AndroidRuntimeException(a3.a.e("Fragment ", this, " did not call through to super.onDetach()"));
    }

    @NonNull
    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z10) {
        onMultiWindowModeChanged(z10);
    }

    public boolean performOptionsItemSelected(@NonNull MenuItem menuItem) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
                return true;
            }
            return this.mChildFragmentManager.o(menuItem);
        }
        return false;
    }

    public void performOptionsMenuClosed(@NonNull Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            this.mChildFragmentManager.p(menu);
        }
    }

    public void performPause() {
        this.mChildFragmentManager.t(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.m.ON_PAUSE);
        }
        this.mLifecycleRegistry.f(androidx.lifecycle.m.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
        } else {
            throw new AndroidRuntimeException(a3.a.e("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z10) {
        onPictureInPictureModeChanged(z10);
    }

    public boolean performPrepareOptionsMenu(@NonNull Menu menu) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z10 = true;
        }
        return z10 | this.mChildFragmentManager.s(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean L = d1.L(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != L) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(L);
            onPrimaryNavigationFragmentChanged(L);
            d1 d1Var = this.mChildFragmentManager;
            d1Var.h0();
            d1Var.q(d1Var.f1668y);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.O();
        this.mChildFragmentManager.x(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            androidx.lifecycle.v vVar = this.mLifecycleRegistry;
            androidx.lifecycle.m mVar = androidx.lifecycle.m.ON_RESUME;
            vVar.f(mVar);
            if (this.mView != null) {
                this.mViewLifecycleOwner.f1864e.f(mVar);
            }
            d1 d1Var = this.mChildFragmentManager;
            d1Var.G = false;
            d1Var.H = false;
            d1Var.N.f1583g = false;
            d1Var.t(7);
            return;
        }
        throw new AndroidRuntimeException(a3.a.e("Fragment ", this, " did not call through to super.onResume()"));
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.O();
        this.mChildFragmentManager.x(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            androidx.lifecycle.v vVar = this.mLifecycleRegistry;
            androidx.lifecycle.m mVar = androidx.lifecycle.m.ON_START;
            vVar.f(mVar);
            if (this.mView != null) {
                this.mViewLifecycleOwner.f1864e.f(mVar);
            }
            d1 d1Var = this.mChildFragmentManager;
            d1Var.G = false;
            d1Var.H = false;
            d1Var.N.f1583g = false;
            d1Var.t(5);
            return;
        }
        throw new AndroidRuntimeException(a3.a.e("Fragment ", this, " did not call through to super.onStart()"));
    }

    public void performStop() {
        d1 d1Var = this.mChildFragmentManager;
        d1Var.H = true;
        d1Var.N.f1583g = true;
        d1Var.t(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.m.ON_STOP);
        }
        this.mLifecycleRegistry.f(androidx.lifecycle.m.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
        } else {
            throw new AndroidRuntimeException(a3.a.e("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        onViewCreated(this.mView, bundle);
        this.mChildFragmentManager.t(2);
    }

    public void postponeEnterTransition() {
        k().f1637s = true;
    }

    @NonNull
    public final <I, O> e.c registerForActivityResult(@NonNull f.a aVar, @NonNull e.b bVar) {
        return o(aVar, new z(this), bVar);
    }

    public void registerForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(@NonNull String[] strArr, int i10) {
        if (this.mHost != null) {
            d1 parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.D != null) {
                parentFragmentManager.E.addLast(new y0(this.mWho, i10));
                parentFragmentManager.D.a(strArr);
                return;
            }
            parentFragmentManager.f1665v.getClass();
            return;
        }
        throw new IllegalStateException(a3.a.e("Fragment ", this, " not attached to Activity"));
    }

    @NonNull
    public final j0 requireActivity() {
        j0 activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(a3.a.e("Fragment ", this, " not attached to an activity."));
    }

    @NonNull
    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(a3.a.e("Fragment ", this, " does not have any arguments."));
    }

    @NonNull
    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(a3.a.e("Fragment ", this, " not attached to a context."));
    }

    @NonNull
    @Deprecated
    public final d1 requireFragmentManager() {
        return getParentFragmentManager();
    }

    @NonNull
    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(a3.a.e("Fragment ", this, " not attached to a host."));
    }

    @NonNull
    public final g0 requireParentFragment() {
        g0 parentFragment = getParentFragment();
        if (parentFragment == null) {
            if (getContext() == null) {
                throw new IllegalStateException(a3.a.e("Fragment ", this, " is not attached to any Fragment or host"));
            }
            throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
        }
        return parentFragment;
    }

    @NonNull
    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(a3.a.e("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 != null && (bundle = bundle2.getBundle("childFragmentManager")) != null) {
            this.mChildFragmentManager.V(bundle);
            d1 d1Var = this.mChildFragmentManager;
            d1Var.G = false;
            d1Var.H = false;
            d1Var.N.f1583g = false;
            d1Var.t(1);
        }
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(androidx.lifecycle.m.ON_CREATE);
                return;
            }
            return;
        }
        throw new AndroidRuntimeException(a3.a.e("Fragment ", this, " did not call through to super.onViewStateRestored()"));
    }

    public void setAllowEnterTransitionOverlap(boolean z10) {
        k().f1634p = Boolean.valueOf(z10);
    }

    public void setAllowReturnTransitionOverlap(boolean z10) {
        k().f1633o = Boolean.valueOf(z10);
    }

    public void setAnimations(int i10, int i11, int i12, int i13) {
        if (this.mAnimationInfo == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        k().f1620b = i10;
        k().f1621c = i11;
        k().f1622d = i12;
        k().f1623e = i13;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(q3.z0 z0Var) {
        k().getClass();
    }

    public void setEnterTransition(Object obj) {
        k().f1627i = obj;
    }

    public void setExitSharedElementCallback(q3.z0 z0Var) {
        k().getClass();
    }

    public void setExitTransition(Object obj) {
        k().f1629k = obj;
    }

    public void setFocusedView(View view) {
        k().f1636r = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z10) {
        if (this.mHasMenu != z10) {
            this.mHasMenu = z10;
            if (isAdded() && !isHidden()) {
                ((i0) this.mHost).f1717e.invalidateMenu();
            }
        }
    }

    public void setInitialSavedState(f0 f0Var) {
        Bundle bundle;
        if (this.mFragmentManager == null) {
            if (f0Var == null || (bundle = f0Var.f1687a) == null) {
                bundle = null;
            }
            this.mSavedFragmentState = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void setMenuVisibility(boolean z10) {
        if (this.mMenuVisible != z10) {
            this.mMenuVisible = z10;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                ((i0) this.mHost).f1717e.invalidateMenu();
            }
        }
    }

    public void setNextTransition(int i10) {
        if (this.mAnimationInfo == null && i10 == 0) {
            return;
        }
        k();
        this.mAnimationInfo.f1624f = i10;
    }

    public void setPopDirection(boolean z10) {
        if (this.mAnimationInfo == null) {
            return;
        }
        k().f1619a = z10;
    }

    public void setPostOnViewCreatedAlpha(float f10) {
        k().f1635q = f10;
    }

    public void setReenterTransition(Object obj) {
        k().f1630l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z10) {
        u4.b bVar = u4.c.f36741a;
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(this, "fragment");
        Violation violation = new Violation(this, "Attempting to set retain instance for fragment " + this);
        u4.c.c(violation);
        u4.b a10 = u4.c.a(this);
        if (a10.f36739a.contains(u4.a.f36733f) && u4.c.e(a10, getClass(), SetRetainInstanceUsageViolation.class)) {
            u4.c.b(a10, violation);
        }
        this.mRetainInstance = z10;
        d1 d1Var = this.mFragmentManager;
        if (d1Var != null) {
            if (z10) {
                d1Var.N.e(this);
                return;
            } else {
                d1Var.N.i(this);
                return;
            }
        }
        this.mRetainInstanceChangedWhileDetached = true;
    }

    public void setReturnTransition(Object obj) {
        k().f1628j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        k().f1631m = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        k();
        c0 c0Var = this.mAnimationInfo;
        c0Var.f1625g = arrayList;
        c0Var.f1626h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        k().f1632n = obj;
    }

    @Deprecated
    public void setTargetFragment(g0 targetFragment, int i10) {
        d1 d1Var;
        if (targetFragment != null) {
            u4.b bVar = u4.c.f36741a;
            Intrinsics.checkNotNullParameter(this, "violatingFragment");
            Intrinsics.checkNotNullParameter(targetFragment, "targetFragment");
            Intrinsics.checkNotNullParameter(this, "fragment");
            Intrinsics.checkNotNullParameter(targetFragment, "targetFragment");
            Intrinsics.checkNotNullParameter(this, "fragment");
            Violation violation = new Violation(this, "Attempting to set target fragment " + targetFragment + " with request code " + i10 + " for fragment " + this);
            u4.c.c(violation);
            u4.b a10 = u4.c.a(this);
            if (a10.f36739a.contains(u4.a.f36735h) && u4.c.e(a10, getClass(), SetTargetFragmentUsageViolation.class)) {
                u4.c.b(a10, violation);
            }
        }
        d1 d1Var2 = this.mFragmentManager;
        if (targetFragment != null) {
            d1Var = targetFragment.mFragmentManager;
        } else {
            d1Var = null;
        }
        if (d1Var2 != null && d1Var != null && d1Var2 != d1Var) {
            throw new IllegalArgumentException(a3.a.e("Fragment ", targetFragment, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (g0 g0Var = targetFragment; g0Var != null; g0Var = g0Var.m(false)) {
            if (g0Var.equals(this)) {
                throw new IllegalArgumentException("Setting " + targetFragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (targetFragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager != null && targetFragment.mFragmentManager != null) {
            this.mTargetWho = targetFragment.mWho;
            this.mTarget = null;
        } else {
            this.mTargetWho = null;
            this.mTarget = targetFragment;
        }
        this.mTargetRequestCode = i10;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z10) {
        u4.b bVar = u4.c.f36741a;
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(this, "fragment");
        Violation violation = new Violation(this, "Attempting to set user visible hint to " + z10 + " for fragment " + this);
        u4.c.c(violation);
        u4.b a10 = u4.c.a(this);
        if (a10.f36739a.contains(u4.a.f36734g) && u4.c.e(a10, getClass(), SetUserVisibleHintViolation.class)) {
            u4.c.b(a10, violation);
        }
        boolean z11 = false;
        if (!this.mUserVisibleHint && z10 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            d1 d1Var = this.mFragmentManager;
            l1 f10 = d1Var.f(this);
            g0 g0Var = f10.f1754c;
            if (g0Var.mDeferStart) {
                if (d1Var.f1645b) {
                    d1Var.J = true;
                } else {
                    g0Var.mDeferStart = false;
                    f10.k();
                }
            }
        }
        this.mUserVisibleHint = z10;
        if (this.mState < 5 && !z10) {
            z11 = true;
        }
        this.mDeferStart = z11;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z10);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@NonNull String str) {
        n0 n0Var = this.mHost;
        if (n0Var != null) {
            return q3.h.b(((i0) n0Var).f1717e, str);
        }
        return false;
    }

    public void startActivity(@NonNull Intent intent, Bundle bundle) {
        n0 n0Var = this.mHost;
        if (n0Var != null) {
            r3.k.startActivity(n0Var.f1775b, intent, bundle);
            return;
        }
        throw new IllegalStateException(a3.a.e("Fragment ", this, " not attached to Activity"));
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i10) {
        startActivityForResult(intent, i10, null);
    }

    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2 = intent;
        if (this.mHost != null) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i10 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
            }
            d1 parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.C != null) {
                if (bundle != null) {
                    if (intent2 == null) {
                        intent2 = new Intent();
                        intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                    }
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + this);
                    }
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                Intrinsics.checkNotNullParameter(intentSender, "intentSender");
                e.k kVar = new e.k(intentSender, intent2, i11, i12);
                parentFragmentManager.E.addLast(new y0(this.mWho, i10));
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Fragment " + this + "is launching an IntentSender for result ");
                }
                parentFragmentManager.C.a(kVar);
                return;
            }
            n0 n0Var = parentFragmentManager.f1665v;
            if (i10 == -1) {
                Activity activity = n0Var.f1774a;
                int i14 = q3.h.f31615a;
                q3.a.c(activity, intentSender, i10, intent, i11, i12, i13, bundle);
                return;
            }
            n0Var.getClass();
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        throw new IllegalStateException(a3.a.e("Fragment ", this, " not attached to Activity"));
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo != null && k().f1637s) {
            if (this.mHost == null) {
                k().f1637s = false;
            } else if (Looper.myLooper() != this.mHost.f1776c.getLooper()) {
                this.mHost.f1776c.postAtFrontOfQueue(new u(this, 1));
            } else {
                callStartTransitionListener(true);
            }
        }
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append(UrlTreeKt.componentParamPrefix);
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} (");
        sb2.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb2.append(" tag=");
            sb2.append(this.mTag);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void unregisterForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @NonNull
    @Deprecated
    public static g0 instantiate(@NonNull Context context, @NonNull String str, Bundle bundle) {
        try {
            g0 g0Var = (g0) u0.c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(g0Var.getClass().getClassLoader());
                g0Var.setArguments(bundle);
            }
            return g0Var;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(nn.d.k("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(nn.d.k("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException(nn.d.k("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e12);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException(nn.d.k("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e13);
        }
    }

    @NonNull
    public final String getString(int i10, Object... objArr) {
        return getResources().getString(i10, objArr);
    }

    public void onAttach(@NonNull Context context) {
        this.mCalled = true;
        n0 n0Var = this.mHost;
        Activity activity = n0Var == null ? null : n0Var.f1774a;
        if (activity != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    public void onInflate(@NonNull Context context, @NonNull AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        n0 n0Var = this.mHost;
        Activity activity = n0Var == null ? null : n0Var.f1774a;
        if (activity != null) {
            this.mCalled = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    public final void postponeEnterTransition(long j10, @NonNull TimeUnit timeUnit) {
        k().f1637s = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        d1 d1Var = this.mFragmentManager;
        if (d1Var != null) {
            this.mPostponedHandler = d1Var.f1665v.f1776c;
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j10));
    }

    @NonNull
    public final <I, O> e.c registerForActivityResult(@NonNull f.a aVar, @NonNull e.h hVar, @NonNull e.b bVar) {
        return o(aVar, new a0(this, hVar), bVar);
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i10, Bundle bundle) {
        if (this.mHost != null) {
            d1 parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.B != null) {
                parentFragmentManager.E.addLast(new y0(this.mWho, i10));
                if (bundle != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                parentFragmentManager.B.a(intent);
                return;
            }
            n0 n0Var = parentFragmentManager.f1665v;
            if (i10 == -1) {
                r3.k.startActivity(n0Var.f1775b, intent, bundle);
                return;
            } else {
                n0Var.getClass();
                throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
            }
        }
        throw new IllegalStateException(a3.a.e("Fragment ", this, " not attached to Activity"));
    }

    @NonNull
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    public void startActivity(@NonNull Intent intent) {
        startActivity(intent, null);
    }
}
