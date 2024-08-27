package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.strictmode.Violation;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import com.assetgro.stockgro.prod.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f1752a;

    /* renamed from: b, reason: collision with root package name */
    public final n1 f1753b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f1754c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1755d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f1756e = -1;

    public l1(a0 a0Var, n1 n1Var, g0 g0Var) {
        this.f1752a = a0Var;
        this.f1753b = n1Var;
        this.f1754c = g0Var;
    }

    public final void a() {
        Bundle bundle;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        g0 g0Var = this.f1754c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + g0Var);
        }
        Bundle bundle2 = g0Var.mSavedFragmentState;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        g0Var.performActivityCreated(bundle);
        this.f1752a.a(false);
    }

    public final void b() {
        View view;
        View view2;
        g0 fragment = this.f1754c;
        g0 expectedParentFragment = d1.D(fragment.mContainer);
        g0 parentFragment = fragment.getParentFragment();
        if (expectedParentFragment != null && !expectedParentFragment.equals(parentFragment)) {
            int i10 = fragment.mContainerId;
            u4.b bVar = u4.c.f36741a;
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
            StringBuilder sb2 = new StringBuilder("Attempting to nest fragment ");
            sb2.append(fragment);
            sb2.append(" within the view of parent fragment ");
            sb2.append(expectedParentFragment);
            sb2.append(" via container with ID ");
            Violation violation = new Violation(fragment, nn.d.m(sb2, i10, " without using parent's childFragmentManager"));
            u4.c.c(violation);
            u4.b a10 = u4.c.a(fragment);
            if (a10.f36739a.contains(u4.a.f36732e) && u4.c.e(a10, fragment.getClass(), WrongNestedHierarchyViolation.class)) {
                u4.c.b(a10, violation);
            }
        }
        n1 n1Var = this.f1753b;
        n1Var.getClass();
        ViewGroup viewGroup = fragment.mContainer;
        int i11 = -1;
        if (viewGroup != null) {
            ArrayList arrayList = n1Var.f1778a;
            int indexOf = arrayList.indexOf(fragment);
            int i12 = indexOf - 1;
            while (true) {
                if (i12 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        g0 g0Var = (g0) arrayList.get(indexOf);
                        if (g0Var.mContainer == viewGroup && (view = g0Var.mView) != null) {
                            i11 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    g0 g0Var2 = (g0) arrayList.get(i12);
                    if (g0Var2.mContainer == viewGroup && (view2 = g0Var2.mView) != null) {
                        i11 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i12--;
                }
            }
        }
        fragment.mContainer.addView(fragment.mView, i11);
    }

    public final void c() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        g0 g0Var = this.f1754c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ATTACHED: " + g0Var);
        }
        g0 g0Var2 = g0Var.mTarget;
        l1 l1Var = null;
        n1 n1Var = this.f1753b;
        if (g0Var2 != null) {
            l1 l1Var2 = (l1) n1Var.f1779b.get(g0Var2.mWho);
            if (l1Var2 != null) {
                g0Var.mTargetWho = g0Var.mTarget.mWho;
                g0Var.mTarget = null;
                l1Var = l1Var2;
            } else {
                throw new IllegalStateException("Fragment " + g0Var + " declared target fragment " + g0Var.mTarget + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = g0Var.mTargetWho;
            if (str != null && (l1Var = (l1) n1Var.f1779b.get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(g0Var);
                sb2.append(" declared target fragment ");
                throw new IllegalStateException(nn.d.o(sb2, g0Var.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (l1Var != null) {
            l1Var.k();
        }
        d1 d1Var = g0Var.mFragmentManager;
        g0Var.mHost = d1Var.f1665v;
        g0Var.mParentFragment = d1Var.f1667x;
        a0 a0Var = this.f1752a;
        a0Var.g(false);
        g0Var.performAttach();
        a0Var.b(false);
    }

    public final int d() {
        d2 d2Var;
        Object obj;
        int i10;
        g0 g0Var = this.f1754c;
        if (g0Var.mFragmentManager == null) {
            return g0Var.mState;
        }
        int i11 = this.f1756e;
        int ordinal = g0Var.mMaxState.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        i11 = Math.min(i11, -1);
                    }
                } else {
                    i11 = Math.min(i11, 5);
                }
            } else {
                i11 = Math.min(i11, 1);
            }
        } else {
            i11 = Math.min(i11, 0);
        }
        if (g0Var.mFromLayout) {
            if (g0Var.mInLayout) {
                i11 = Math.max(this.f1756e, 2);
                View view = g0Var.mView;
                if (view != null && view.getParent() == null) {
                    i11 = Math.min(i11, 2);
                }
            } else {
                i11 = this.f1756e < 4 ? Math.min(i11, g0Var.mState) : Math.min(i11, 1);
            }
        }
        if (!g0Var.mAdded) {
            i11 = Math.min(i11, 1);
        }
        ViewGroup viewGroup = g0Var.mContainer;
        d2 d2Var2 = null;
        if (viewGroup != null) {
            n l10 = n.l(viewGroup, g0Var.getParentFragmentManager());
            l10.getClass();
            Intrinsics.checkNotNullParameter(this, "fragmentStateManager");
            Intrinsics.checkNotNullExpressionValue(g0Var, "fragmentStateManager.fragment");
            f2 j10 = l10.j(g0Var);
            if (j10 != null) {
                d2Var = j10.f1697b;
            } else {
                d2Var = null;
            }
            Iterator it = l10.f1771c.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    f2 f2Var = (f2) obj;
                    if (Intrinsics.a(f2Var.f1698c, g0Var) && !f2Var.f1701f) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            f2 f2Var2 = (f2) obj;
            if (f2Var2 != null) {
                d2Var2 = f2Var2.f1697b;
            }
            if (d2Var == null) {
                i10 = -1;
            } else {
                i10 = g2.f1706a[d2Var.ordinal()];
            }
            if (i10 != -1 && i10 != 1) {
                d2Var2 = d2Var;
            }
        }
        if (d2Var2 == d2.f1671b) {
            i11 = Math.min(i11, 6);
        } else if (d2Var2 == d2.f1672c) {
            i11 = Math.max(i11, 3);
        } else if (g0Var.mRemoving) {
            if (g0Var.isInBackStack()) {
                i11 = Math.min(i11, 1);
            } else {
                i11 = Math.min(i11, -1);
            }
        }
        if (g0Var.mDeferStart && g0Var.mState < 5) {
            i11 = Math.min(i11, 4);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i11 + " for " + g0Var);
        }
        return i11;
    }

    public final void e() {
        Bundle bundle;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        g0 g0Var = this.f1754c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + g0Var);
        }
        Bundle bundle2 = g0Var.mSavedFragmentState;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        if (!g0Var.mIsCreated) {
            a0 a0Var = this.f1752a;
            a0Var.h(false);
            g0Var.performCreate(bundle);
            a0Var.c(false);
            return;
        }
        g0Var.mState = 1;
        g0Var.restoreChildFragmentState();
    }

    public final void f() {
        Bundle bundle;
        String str;
        g0 fragment = this.f1754c;
        if (fragment.mFromLayout) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
        }
        Bundle bundle2 = fragment.mSavedFragmentState;
        ViewGroup container = null;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(bundle);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            container = viewGroup;
        } else {
            int i10 = fragment.mContainerId;
            if (i10 != 0) {
                if (i10 != -1) {
                    container = (ViewGroup) fragment.mFragmentManager.f1666w.b(i10);
                    if (container == null) {
                        if (!fragment.mRestored) {
                            try {
                                str = fragment.getResources().getResourceName(fragment.mContainerId);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.mContainerId) + " (" + str + ") for fragment " + fragment);
                        }
                    } else if (!(container instanceof FragmentContainerView)) {
                        u4.b bVar = u4.c.f36741a;
                        Intrinsics.checkNotNullParameter(fragment, "fragment");
                        Intrinsics.checkNotNullParameter(container, "container");
                        Intrinsics.checkNotNullParameter(fragment, "fragment");
                        Intrinsics.checkNotNullParameter(container, "container");
                        Violation violation = new Violation(fragment, "Attempting to add fragment " + fragment + " to container " + container + " which is not a FragmentContainerView");
                        u4.c.c(violation);
                        u4.b a10 = u4.c.a(fragment);
                        if (a10.f36739a.contains(u4.a.f36736i) && u4.c.e(a10, fragment.getClass(), WrongFragmentContainerViolation.class)) {
                            u4.c.b(a10, violation);
                        }
                    }
                } else {
                    throw new IllegalArgumentException(a3.a.e("Cannot create fragment ", fragment, " for a container view with no id"));
                }
            }
        }
        fragment.mContainer = container;
        fragment.performCreateView(performGetLayoutInflater, container, bundle);
        if (fragment.mView != null) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + fragment);
            }
            fragment.mView.setSaveFromParentEnabled(false);
            fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
            if (container != null) {
                b();
            }
            if (fragment.mHidden) {
                fragment.mView.setVisibility(8);
            }
            View view = fragment.mView;
            WeakHashMap weakHashMap = d4.n1.f13788a;
            if (d4.y0.b(view)) {
                d4.z0.c(fragment.mView);
            } else {
                View view2 = fragment.mView;
                view2.addOnAttachStateChangeListener(new o0(this, view2));
            }
            fragment.performViewCreated();
            this.f1752a.m(fragment, fragment.mView, bundle, false);
            int visibility = fragment.mView.getVisibility();
            fragment.setPostOnViewCreatedAlpha(fragment.mView.getAlpha());
            if (fragment.mContainer != null && visibility == 0) {
                View findFocus = fragment.mView.findFocus();
                if (findFocus != null) {
                    fragment.setFocusedView(findFocus);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + fragment);
                    }
                }
                fragment.mView.setAlpha(s0.g.f34069a);
            }
        }
        fragment.mState = 2;
    }

    public final void g() {
        boolean z10;
        g0 b10;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        g0 g0Var = this.f1754c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + g0Var);
        }
        boolean z11 = true;
        if (g0Var.mRemoving && !g0Var.isInBackStack()) {
            z10 = true;
        } else {
            z10 = false;
        }
        n1 n1Var = this.f1753b;
        if (z10 && !g0Var.mBeingSaved) {
            n1Var.i(null, g0Var.mWho);
        }
        if (!z10) {
            FragmentManagerViewModel fragmentManagerViewModel = n1Var.f1781d;
            if (fragmentManagerViewModel.f1578b.containsKey(g0Var.mWho) && fragmentManagerViewModel.f1581e && !fragmentManagerViewModel.f1582f) {
                String str = g0Var.mTargetWho;
                if (str != null && (b10 = n1Var.b(str)) != null && b10.mRetainInstance) {
                    g0Var.mTarget = b10;
                }
                g0Var.mState = 0;
                return;
            }
        }
        n0 n0Var = g0Var.mHost;
        if (n0Var instanceof androidx.lifecycle.i1) {
            z11 = n1Var.f1781d.f1582f;
        } else {
            Context context = n0Var.f1775b;
            if (context instanceof Activity) {
                z11 = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if ((z10 && !g0Var.mBeingSaved) || z11) {
            n1Var.f1781d.f(g0Var, false);
        }
        g0Var.performDestroy();
        this.f1752a.d(false);
        Iterator it = n1Var.d().iterator();
        while (it.hasNext()) {
            l1 l1Var = (l1) it.next();
            if (l1Var != null) {
                String str2 = g0Var.mWho;
                g0 g0Var2 = l1Var.f1754c;
                if (str2.equals(g0Var2.mTargetWho)) {
                    g0Var2.mTarget = g0Var;
                    g0Var2.mTargetWho = null;
                }
            }
        }
        String str3 = g0Var.mTargetWho;
        if (str3 != null) {
            g0Var.mTarget = n1Var.b(str3);
        }
        n1Var.h(this);
    }

    public final void h() {
        View view;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        g0 g0Var = this.f1754c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + g0Var);
        }
        ViewGroup viewGroup = g0Var.mContainer;
        if (viewGroup != null && (view = g0Var.mView) != null) {
            viewGroup.removeView(view);
        }
        g0Var.performDestroyView();
        this.f1752a.n(false);
        g0Var.mContainer = null;
        g0Var.mView = null;
        g0Var.mViewLifecycleOwner = null;
        g0Var.mViewLifecycleOwnerLiveData.setValue(null);
        g0Var.mInLayout = false;
    }

    public final void i() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        g0 g0Var = this.f1754c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + g0Var);
        }
        g0Var.performDetach();
        this.f1752a.e(false);
        g0Var.mState = -1;
        g0Var.mHost = null;
        g0Var.mParentFragment = null;
        g0Var.mFragmentManager = null;
        if (!g0Var.mRemoving || g0Var.isInBackStack()) {
            FragmentManagerViewModel fragmentManagerViewModel = this.f1753b.f1781d;
            if (fragmentManagerViewModel.f1578b.containsKey(g0Var.mWho) && fragmentManagerViewModel.f1581e && !fragmentManagerViewModel.f1582f) {
                return;
            }
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "initState called for fragment: " + g0Var);
        }
        g0Var.initState();
    }

    public final void j() {
        Bundle bundle;
        g0 g0Var = this.f1754c;
        if (g0Var.mFromLayout && g0Var.mInLayout && !g0Var.mPerformedCreateView) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + g0Var);
            }
            Bundle bundle2 = g0Var.mSavedFragmentState;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("savedInstanceState");
            } else {
                bundle = null;
            }
            g0Var.performCreateView(g0Var.performGetLayoutInflater(bundle), null, bundle);
            View view = g0Var.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                g0Var.mView.setTag(R.id.fragment_container_view_tag, g0Var);
                if (g0Var.mHidden) {
                    g0Var.mView.setVisibility(8);
                }
                g0Var.performViewCreated();
                this.f1752a.m(g0Var, g0Var.mView, bundle, false);
                g0Var.mState = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x017f, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k() {
        /*
            Method dump skipped, instructions count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.l1.k():void");
    }

    public final void l(ClassLoader classLoader) {
        g0 g0Var = this.f1754c;
        Bundle bundle = g0Var.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (g0Var.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            g0Var.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        g0Var.mSavedViewState = g0Var.mSavedFragmentState.getSparseParcelableArray("viewState");
        g0Var.mSavedViewRegistryState = g0Var.mSavedFragmentState.getBundle("viewRegistryState");
        k1 k1Var = (k1) g0Var.mSavedFragmentState.getParcelable("state");
        if (k1Var != null) {
            g0Var.mTargetWho = k1Var.f1744l;
            g0Var.mTargetRequestCode = k1Var.f1745m;
            Boolean bool = g0Var.mSavedUserVisibleHint;
            if (bool != null) {
                g0Var.mUserVisibleHint = bool.booleanValue();
                g0Var.mSavedUserVisibleHint = null;
            } else {
                g0Var.mUserVisibleHint = k1Var.f1746n;
            }
        }
        if (!g0Var.mUserVisibleHint) {
            g0Var.mDeferStart = true;
        }
    }

    public final void m() {
        String str;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        g0 g0Var = this.f1754c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto RESUMED: " + g0Var);
        }
        View focusedView = g0Var.getFocusedView();
        if (focusedView != null) {
            if (focusedView != g0Var.mView) {
                for (ViewParent parent = focusedView.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != g0Var.mView) {
                    }
                }
            }
            boolean requestFocus = focusedView.requestFocus();
            if (Log.isLoggable("FragmentManager", 2)) {
                StringBuilder sb2 = new StringBuilder("requestFocus: Restoring focused view ");
                sb2.append(focusedView);
                sb2.append(" ");
                if (requestFocus) {
                    str = "succeeded";
                } else {
                    str = "failed";
                }
                sb2.append(str);
                sb2.append(" on Fragment ");
                sb2.append(g0Var);
                sb2.append(" resulting in focused view ");
                sb2.append(g0Var.mView.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        g0Var.setFocusedView(null);
        g0Var.performResume();
        this.f1752a.i(g0Var, false);
        this.f1753b.i(null, g0Var.mWho);
        g0Var.mSavedFragmentState = null;
        g0Var.mSavedViewState = null;
        g0Var.mSavedViewRegistryState = null;
    }

    public final Bundle n() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        g0 g0Var = this.f1754c;
        if (g0Var.mState == -1 && (bundle = g0Var.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new k1(g0Var));
        if (g0Var.mState > -1) {
            Bundle bundle3 = new Bundle();
            g0Var.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f1752a.j(false);
            Bundle bundle4 = new Bundle();
            g0Var.mSavedStateRegistryController.c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle W = g0Var.mChildFragmentManager.W();
            if (!W.isEmpty()) {
                bundle2.putBundle("childFragmentManager", W);
            }
            if (g0Var.mView != null) {
                o();
            }
            SparseArray<Parcelable> sparseArray = g0Var.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = g0Var.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = g0Var.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void o() {
        g0 g0Var = this.f1754c;
        if (g0Var.mView == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + g0Var + " with view " + g0Var.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        g0Var.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            g0Var.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        g0Var.mViewLifecycleOwner.f1865f.c(bundle);
        if (!bundle.isEmpty()) {
            g0Var.mSavedViewRegistryState = bundle;
        }
    }

    public l1(a0 a0Var, n1 n1Var, ClassLoader classLoader, u0 u0Var, Bundle bundle) {
        this.f1752a = a0Var;
        this.f1753b = n1Var;
        g0 a10 = ((k1) bundle.getParcelable("state")).a(u0Var);
        this.f1754c = a10;
        a10.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a10.setArguments(bundle2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a10);
        }
    }

    public l1(a0 a0Var, n1 n1Var, g0 g0Var, Bundle bundle) {
        this.f1752a = a0Var;
        this.f1753b = n1Var;
        this.f1754c = g0Var;
        g0Var.mSavedViewState = null;
        g0Var.mSavedViewRegistryState = null;
        g0Var.mBackStackNesting = 0;
        g0Var.mInLayout = false;
        g0Var.mAdded = false;
        g0 g0Var2 = g0Var.mTarget;
        g0Var.mTargetWho = g0Var2 != null ? g0Var2.mWho : null;
        g0Var.mTarget = null;
        g0Var.mSavedFragmentState = bundle;
        g0Var.mArguments = bundle.getBundle("arguments");
    }
}
