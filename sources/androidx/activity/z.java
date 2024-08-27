package androidx.activity;

import android.view.View;
import com.assetgro.stockgro.prod.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final z f887b = new z(0);

    /* renamed from: c, reason: collision with root package name */
    public static final z f888c = new z(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f889a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(int i10) {
        super(1);
        this.f889a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f889a) {
            case 0:
                View it = (View) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                Object parent = it.getParent();
                if (!(parent instanceof View)) {
                    return null;
                }
                return (View) parent;
            default:
                View it2 = (View) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                Object tag = it2.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                if (!(tag instanceof y)) {
                    return null;
                }
                return (y) tag;
        }
    }
}
