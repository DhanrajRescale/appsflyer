package yb;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class m extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f41449a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f41450b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, Function1 function1) {
        super(0);
        this.f41449a = str;
        this.f41450b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        String str = this.f41449a;
        if (str != null) {
            this.f41450b.invoke(str);
        }
        return Unit.f23355a;
    }
}
