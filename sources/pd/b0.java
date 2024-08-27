package pd;

import com.assetgro.stockgro.ui.chat.create.GroupCreateViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class b0 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30853a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1.o f30854b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GroupCreateViewModel f30855c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f30856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f30857e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(g1.o oVar, GroupCreateViewModel groupCreateViewModel, int i10, int i11, int i12) {
        super(2);
        this.f30853a = i12;
        this.f30854b = oVar;
        this.f30855c = groupCreateViewModel;
        this.f30856d = i10;
        this.f30857e = i11;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f30853a;
        GroupCreateViewModel groupCreateViewModel = this.f30855c;
        g1.o oVar = this.f30854b;
        int i12 = this.f30857e;
        int i13 = this.f30856d;
        switch (i11) {
            case 0:
                yk.j.I(oVar, groupCreateViewModel, nVar, t0.t.H0(i13 | 1), i12);
                return;
            default:
                yk.j.J(oVar, groupCreateViewModel, nVar, t0.t.H0(i13 | 1), i12);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f30853a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
