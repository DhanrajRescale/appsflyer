package g0;

import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class c extends k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16376a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f16377b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f16378c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Function1 function1, boolean z10, int i10) {
        super(0);
        this.f16376a = i10;
        this.f16377b = function1;
        this.f16378c = z10;
    }

    public final void a() {
        int i10 = this.f16376a;
        Function1 function1 = this.f16377b;
        boolean z10 = this.f16378c;
        switch (i10) {
            case 0:
                function1.invoke(Boolean.valueOf(!z10));
                return;
            case 1:
                function1.invoke(Boolean.valueOf(!z10));
                return;
            default:
                function1.invoke(Boolean.valueOf(!z10));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f16376a) {
            case 0:
                a();
                return Unit.f23355a;
            case 1:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }
}
