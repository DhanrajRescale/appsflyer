package h9;

import android.view.View;
import com.afollestad.materialdialogs.internal.main.DialogScrollView;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f18063a = new k(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10;
        DialogScrollView receiver = (DialogScrollView) obj;
        Intrinsics.e(receiver, "$receiver");
        receiver.a();
        if (receiver.getChildCount() != 0 && receiver.getMeasuredHeight() != 0) {
            View childAt = receiver.getChildAt(0);
            Intrinsics.b(childAt, "getChildAt(0)");
            if (childAt.getMeasuredHeight() > receiver.getHeight()) {
                i10 = 1;
                receiver.setOverScrollMode(i10);
                return Unit.f23355a;
            }
        }
        i10 = 2;
        receiver.setOverScrollMode(i10);
        return Unit.f23355a;
    }
}
