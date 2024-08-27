package ka;

import com.assetgro.stockgro.data.model.UserChatGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import t0.g1;

/* loaded from: classes.dex */
public final class c1 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22758a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22759b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22760c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22761d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(qu.f0 f0Var, e0.j0 j0Var, int i10) {
        super(0);
        this.f22758a = 2;
        this.f22760c = f0Var;
        this.f22761d = j0Var;
        this.f22759b = i10;
    }

    public final void a() {
        boolean z10;
        int i10 = this.f22758a;
        Object obj = this.f22761d;
        int i11 = this.f22759b;
        Object obj2 = this.f22760c;
        switch (i10) {
            case 0:
                Function1 function1 = (Function1) obj2;
                if (i11 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                function1.invoke(Boolean.valueOf(z10));
                ((g1) obj).setValue(Integer.valueOf(i11));
                return;
            case 1:
                ((Function2) obj2).invoke(Integer.valueOf(i11), (UserChatGroup) obj);
                return;
            case 2:
                yk.g.H((qu.f0) obj2, null, null, new pg.d((e0.j0) obj, i11, null), 3);
                return;
            default:
                ((Function1) obj2).invoke(Integer.valueOf(i11));
                ((Function1) obj).invoke(Boolean.FALSE);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f22758a) {
            case 0:
                a();
                return Unit.f23355a;
            case 1:
                a();
                return Unit.f23355a;
            case 2:
                a();
                return Unit.f23355a;
            default:
                a();
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(ut.d dVar, int i10, Object obj, int i11) {
        super(0);
        this.f22758a = i11;
        this.f22760c = dVar;
        this.f22759b = i10;
        this.f22761d = obj;
    }
}
