package y;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40790a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f40791b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(Function2 function2, int i10) {
        super(1);
        this.f40790a = i10;
        this.f40791b = function2;
    }

    public final void a(fv.f message) {
        int i10 = this.f40790a;
        Function2 function2 = this.f40791b;
        switch (i10) {
            case 1:
                Intrinsics.checkNotNullParameter(message, "message");
                le.c.b(message, "new_msg_out", function2);
                return;
            case 2:
                Intrinsics.checkNotNullParameter(message, "message");
                le.c.b(message, "edit_msg_out", function2);
                return;
            case 3:
                Intrinsics.checkNotNullParameter(message, "message");
                le.c.b(message, "del_msg_out", function2);
                return;
            default:
                Intrinsics.checkNotNullParameter(message, "message");
                le.c.b(message, "recent_messages", function2);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f40790a) {
            case 0:
                x1.t tVar = (x1.t) obj;
                this.f40791b.invoke(tVar, new m1.c(t0.t.p0(tVar, false)));
                tVar.a();
                return Unit.f23355a;
            case 1:
                a((fv.f) obj);
                return Unit.f23355a;
            case 2:
                a((fv.f) obj);
                return Unit.f23355a;
            case 3:
                a((fv.f) obj);
                return Unit.f23355a;
            default:
                a((fv.f) obj);
                return Unit.f23355a;
        }
    }
}
