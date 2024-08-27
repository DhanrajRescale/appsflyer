package androidx.lifecycle;

import android.view.View;
import com.assetgro.stockgro.prod.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j1 extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final j1 f1921b = new j1(0);

    /* renamed from: c, reason: collision with root package name */
    public static final j1 f1922c = new j1(1);

    /* renamed from: d, reason: collision with root package name */
    public static final j1 f1923d = new j1(2);

    /* renamed from: e, reason: collision with root package name */
    public static final j1 f1924e = new j1(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1925a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(int i10) {
        super(1);
        this.f1925a = i10;
    }

    public final View a(View currentView) {
        switch (this.f1925a) {
            case 0:
                Intrinsics.checkNotNullParameter(currentView, "currentView");
                Object parent = currentView.getParent();
                if (!(parent instanceof View)) {
                    return null;
                }
                return (View) parent;
            default:
                Intrinsics.checkNotNullParameter(currentView, "view");
                Object parent2 = currentView.getParent();
                if (!(parent2 instanceof View)) {
                    return null;
                }
                return (View) parent2;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f1925a) {
            case 0:
                return a((View) obj);
            case 1:
                View viewParent = (View) obj;
                Intrinsics.checkNotNullParameter(viewParent, "viewParent");
                Object tag = viewParent.getTag(R.id.view_tree_lifecycle_owner);
                if (!(tag instanceof t)) {
                    return null;
                }
                return (t) tag;
            case 2:
                return a((View) obj);
            default:
                View view = (View) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                Object tag2 = view.getTag(R.id.view_tree_view_model_store_owner);
                if (!(tag2 instanceof i1)) {
                    return null;
                }
                return (i1) tag2;
        }
    }
}
