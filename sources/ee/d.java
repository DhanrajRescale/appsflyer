package ee;

import android.view.View;
import com.assetgro.stockgro.data.model.GroupMember;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final d f15392a = new k(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        GroupMember member = (GroupMember) obj;
        View view = (View) obj2;
        Intrinsics.checkNotNullParameter(member, "member");
        Intrinsics.checkNotNullParameter(view, "view");
        return Unit.f23355a;
    }
}
