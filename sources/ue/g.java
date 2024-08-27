package ue;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final g f37089a = new iu.k(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String mentionedUserId = (String) obj;
        String mentionedUsername = (String) obj2;
        Intrinsics.checkNotNullParameter(mentionedUserId, "mentionedUserId");
        Intrinsics.checkNotNullParameter(mentionedUsername, "mentionedUsername");
        return Unit.f23355a;
    }
}
