package wo;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* loaded from: classes2.dex */
public final class m extends k {
    public static final int[] E = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};
    public final AccessibilityManager C;
    public boolean D;

    public m(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.C = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static m g(View view, String str, int i10) {
        ViewGroup viewGroup;
        int i11;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (view instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) view;
                break;
            }
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    viewGroup = (ViewGroup) view;
                    break;
                }
                viewGroup2 = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
            }
            if (view == null) {
                viewGroup = viewGroup2;
                break;
            }
        }
        if (viewGroup != null) {
            Context context = viewGroup.getContext();
            LayoutInflater from = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(E);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
            obtainStyledAttributes.recycle();
            if (resourceId != -1 && resourceId2 != -1) {
                i11 = R.layout.mtrl_layout_snackbar_include;
            } else {
                i11 = R.layout.design_layout_snackbar_include;
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(i11, viewGroup, false);
            m mVar = new m(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
            ((SnackbarContentLayout) mVar.f39390i.getChildAt(0)).getMessageView().setText(str);
            mVar.f39392k = i10;
            return mVar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    public final void h() {
        int i10;
        o b10 = o.b();
        int i11 = this.f39392k;
        int i12 = -2;
        if (i11 != -2) {
            int i13 = Build.VERSION.SDK_INT;
            AccessibilityManager accessibilityManager = this.C;
            if (i13 >= 29) {
                if (this.D) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                i12 = accessibilityManager.getRecommendedTimeoutMillis(i11, i10 | 3);
            } else {
                if (this.D && accessibilityManager.isTouchExplorationEnabled()) {
                    i11 = -2;
                }
                i12 = i11;
            }
        }
        g gVar = this.f39403v;
        synchronized (b10.f39408a) {
            try {
                if (b10.c(gVar)) {
                    n nVar = b10.f39410c;
                    nVar.f39405b = i12;
                    b10.f39409b.removeCallbacksAndMessages(nVar);
                    b10.f(b10.f39410c);
                    return;
                }
                n nVar2 = b10.f39411d;
                if (nVar2 != null && gVar != null && nVar2.f39404a.get() == gVar) {
                    b10.f39411d.f39405b = i12;
                } else {
                    b10.f39411d = new n(i12, gVar);
                }
                n nVar3 = b10.f39410c;
                if (nVar3 == null || !b10.a(nVar3, 4)) {
                    b10.f39410c = null;
                    b10.g();
                }
            } finally {
            }
        }
    }
}
