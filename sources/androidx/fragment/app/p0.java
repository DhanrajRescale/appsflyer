package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import androidx.fragment.app.strictmode.Violation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p0 implements LayoutInflater.Factory2 {

    /* renamed from: a, reason: collision with root package name */
    public final d1 f1797a;

    public p0(d1 d1Var) {
        this.f1797a = d1Var;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        l1 f10;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        d1 d1Var = this.f1797a;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, d1Var);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t4.a.f35338a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                if (g0.class.isAssignableFrom(u0.b(context.getClassLoader(), attributeValue))) {
                    int id2 = view != null ? view.getId() : 0;
                    if (id2 == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    g0 fragment = resourceId != -1 ? d1Var.B(resourceId) : null;
                    if (fragment == null && string != null) {
                        fragment = d1Var.C(string);
                    }
                    if (fragment == null && id2 != -1) {
                        fragment = d1Var.B(id2);
                    }
                    if (fragment == null) {
                        u0 G = d1Var.G();
                        context.getClassLoader();
                        fragment = G.a(attributeValue);
                        fragment.mFromLayout = true;
                        fragment.mFragmentId = resourceId != 0 ? resourceId : id2;
                        fragment.mContainerId = id2;
                        fragment.mTag = string;
                        fragment.mInLayout = true;
                        fragment.mFragmentManager = d1Var;
                        n0 n0Var = d1Var.f1665v;
                        fragment.mHost = n0Var;
                        fragment.onInflate(n0Var.f1775b, attributeSet, fragment.mSavedFragmentState);
                        f10 = d1Var.a(fragment);
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "Fragment " + fragment + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else if (!fragment.mInLayout) {
                        fragment.mInLayout = true;
                        fragment.mFragmentManager = d1Var;
                        n0 n0Var2 = d1Var.f1665v;
                        fragment.mHost = n0Var2;
                        fragment.onInflate(n0Var2.f1775b, attributeSet, fragment.mSavedFragmentState);
                        f10 = d1Var.f(fragment);
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "Retained Fragment " + fragment + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    u4.b bVar = u4.c.f36741a;
                    Intrinsics.checkNotNullParameter(fragment, "fragment");
                    Intrinsics.checkNotNullParameter(fragment, "fragment");
                    Violation violation = new Violation(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
                    u4.c.c(violation);
                    u4.b a10 = u4.c.a(fragment);
                    if (a10.f36739a.contains(u4.a.f36731d) && u4.c.e(a10, fragment.getClass(), FragmentTagUsageViolation.class)) {
                        u4.c.b(a10, violation);
                    }
                    fragment.mContainer = viewGroup;
                    f10.k();
                    f10.j();
                    View view2 = fragment.mView;
                    if (view2 != null) {
                        if (resourceId != 0) {
                            view2.setId(resourceId);
                        }
                        if (fragment.mView.getTag() == null) {
                            fragment.mView.setTag(string);
                        }
                        fragment.mView.addOnAttachStateChangeListener(new o0(this, f10));
                        return fragment.mView;
                    }
                    throw new IllegalStateException(nn.d.k("Fragment ", attributeValue, " did not create a view."));
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        return null;
    }
}
