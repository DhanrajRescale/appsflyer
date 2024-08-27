package kd;

import com.assetgro.stockgro.data.model.UserChatGroup;
import iu.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f23065a = new k(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj).intValue();
        UserChatGroup group = (UserChatGroup) obj2;
        Intrinsics.checkNotNullParameter(group, "group");
        return group.getGroupId();
    }
}
