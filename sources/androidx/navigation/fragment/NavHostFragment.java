package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.d1;
import androidx.fragment.app.g0;
import androidx.navigation.h0;
import androidx.navigation.y0;
import c2.p0;
import com.assetgro.stockgro.prod.R;
import f7.j;
import hl.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import ut.g;
import ut.h;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment;", "Landroidx/fragment/app/g0;", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "()V", "ni/j", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class NavHostFragment extends g0 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f2202e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final g f2203a = h.a(new p0(this, 10));

    /* renamed from: b, reason: collision with root package name */
    public View f2204b;

    /* renamed from: c, reason: collision with root package name */
    public int f2205c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2206d;

    @Override // androidx.fragment.app.g0
    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (this.f2206d) {
            d1 parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager);
            aVar.n(this);
            aVar.h(false);
        }
    }

    @Override // androidx.fragment.app.g0
    public final void onCreate(Bundle bundle) {
        p();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.f2206d = true;
            d1 parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager);
            aVar.n(this);
            aVar.h(false);
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.g0
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context context = inflater.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int id2 = getId();
        if (id2 == 0 || id2 == -1) {
            id2 = R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(id2);
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.g0
    public final void onDestroyView() {
        super.onDestroyView();
        View view = this.f2204b;
        if (view != null && f.Z(view) == p()) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.setTag(R.id.nav_controller_view_tag, null);
        }
        this.f2204b = null;
    }

    @Override // androidx.fragment.app.g0
    public final void onInflate(Context context, AttributeSet attrs, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.onInflate(context, attrs, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, y0.f2345b);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…yleable.NavHost\n        )");
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f2205c = resourceId;
        }
        Unit unit = Unit.f23355a;
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attrs, j.f15978c);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes2, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if (obtainStyledAttributes2.getBoolean(0, false)) {
            this.f2206d = true;
        }
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.g0
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        if (this.f2206d) {
            outState.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    @Override // androidx.fragment.app.g0
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        if (view instanceof ViewGroup) {
            h0 p10 = p();
            Intrinsics.checkNotNullParameter(view, "view");
            view.setTag(R.id.nav_controller_view_tag, p10);
            if (view.getParent() != null) {
                Object parent = view.getParent();
                Intrinsics.d(parent, "null cannot be cast to non-null type android.view.View");
                View view2 = (View) parent;
                this.f2204b = view2;
                if (view2.getId() == getId()) {
                    View view3 = this.f2204b;
                    Intrinsics.c(view3);
                    h0 p11 = p();
                    Intrinsics.checkNotNullParameter(view3, "view");
                    view3.setTag(R.id.nav_controller_view_tag, p11);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
    }

    public final h0 p() {
        return (h0) this.f2203a.getValue();
    }
}
