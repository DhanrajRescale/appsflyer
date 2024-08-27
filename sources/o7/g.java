package o7;

import android.view.View;
import com.assetgro.stockgro.prod.R;
import iu.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final g f29768b = new g(0);

    /* renamed from: c, reason: collision with root package name */
    public static final g f29769c = new g(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29770a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i10) {
        super(1);
        this.f29770a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f29770a) {
            case 0:
                View view = (View) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    return null;
                }
                return (View) parent;
            default:
                View view2 = (View) obj;
                Intrinsics.checkNotNullParameter(view2, "view");
                Object tag = view2.getTag(R.id.view_tree_saved_state_registry_owner);
                if (!(tag instanceof f)) {
                    return null;
                }
                return (f) tag;
        }
    }
}
