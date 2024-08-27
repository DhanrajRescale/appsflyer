package o3;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import ko.k;

/* loaded from: classes.dex */
public final class f implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29561a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f29562b;

    public /* synthetic */ f(Object obj, int i10) {
        this.f29561a = i10;
        this.f29562b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i10;
        int i11 = 0;
        int i12 = this.f29561a;
        Object obj = this.f29562b;
        switch (i12) {
            case 0:
                ((CoordinatorLayout) obj).q(0);
                return true;
            case 1:
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                ok.h hVar = (ok.h) ((WeakReference) obj).get();
                if (hVar != null) {
                    ArrayList arrayList = hVar.f30109b;
                    if (!arrayList.isEmpty()) {
                        View view = hVar.f30108a;
                        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams != null) {
                            i10 = layoutParams.width;
                        } else {
                            i10 = 0;
                        }
                        int a10 = hVar.a(view.getWidth(), i10, paddingRight);
                        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        if (layoutParams2 != null) {
                            i11 = layoutParams2.height;
                        }
                        int a11 = hVar.a(view.getHeight(), i11, paddingBottom);
                        if ((a10 > 0 || a10 == Integer.MIN_VALUE) && (a11 > 0 || a11 == Integer.MIN_VALUE)) {
                            Iterator it = new ArrayList(arrayList).iterator();
                            while (it.hasNext()) {
                                ((nk.g) ((ok.f) it.next())).o(a10, a11);
                            }
                            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnPreDrawListener(hVar.f30110c);
                            }
                            hVar.f30110c = null;
                            arrayList.clear();
                        }
                    }
                }
                return true;
            default:
                k kVar = (k) obj;
                float rotation = kVar.f23346s.getRotation();
                if (kVar.f23342o != rotation) {
                    kVar.f23342o = rotation;
                    kVar.p();
                }
                return true;
        }
    }

    public f(ok.h hVar) {
        this.f29561a = 1;
        this.f29562b = new WeakReference(hVar);
    }
}
