package yb;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class q extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f41456a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f41457b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String str, Function1 function1) {
        super(0);
        this.f41456a = str;
        this.f41457b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        String str = this.f41456a;
        if (str != null) {
            this.f41457b.invoke(str);
        }
        return Unit.f23355a;
    }
}
