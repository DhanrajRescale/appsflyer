package pd;

import com.assetgro.stockgro.prod.R;
import d2.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class a extends iu.k implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f30845b = new a(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30846a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10) {
        super(2);
        this.f30846a = i10;
    }

    public final void a(t0.n nVar, int i10) {
        switch (this.f30846a) {
            case 0:
                if ((i10 & 11) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                al.d.C(hl.f.c1(R.string.search_name_or_username, nVar), null, w0.e(R.color.hintColorGrey, nVar), yk.j.e1(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, nVar, 3072, 0, 131058);
                return;
            default:
                if ((i10 & 11) == 2) {
                    t0.r rVar2 = (t0.r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                al.d.C(hl.f.c1(R.string.add_a_group_name, nVar), null, w0.e(R.color.greyText, nVar), yk.j.e1(16), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, nVar, 3072, 0, 131058);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f30846a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
