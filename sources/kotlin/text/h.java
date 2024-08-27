package kotlin.text;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class h extends iu.h implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final h f23415i = new h();

    public h() {
        super(1, MatchResult.class, "next", "next()Lkotlin/text/MatchResult;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MatchResult p02 = (MatchResult) obj;
        Intrinsics.checkNotNullParameter(p02, "p0");
        return p02.next();
    }
}
