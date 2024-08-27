package td;

import com.assetgro.stockgro.ui.chat.detail.group.info.GroupInfoV2Fragment;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m0.w4;

/* loaded from: classes.dex */
public final class n extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35915a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupInfoV2Fragment f35916b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qu.f0 f35917c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w4 f35918d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(GroupInfoV2Fragment groupInfoV2Fragment, qu.f0 f0Var, w4 w4Var, int i10) {
        super(3);
        this.f35915a = i10;
        this.f35916b = groupInfoV2Fragment;
        this.f35917c = f0Var;
        this.f35918d = w4Var;
    }

    public final void a(b0.z ModalBottomSheetLayout, t0.n nVar, int i10) {
        int i11 = this.f35915a;
        w4 w4Var = this.f35918d;
        qu.f0 f0Var = this.f35917c;
        GroupInfoV2Fragment groupInfoV2Fragment = this.f35916b;
        switch (i11) {
            case 0:
                Intrinsics.checkNotNullParameter(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
                if ((i10 & 81) == 16) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                yk.j.b0(new l(groupInfoV2Fragment, f0Var, w4Var, 0), new ib.j(5, w4Var, f0Var), nVar, 0, 0);
                return;
            default:
                Intrinsics.checkNotNullParameter(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
                if ((i10 & 81) == 16) {
                    t0.r rVar2 = (t0.r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                yk.j.b0(new l(groupInfoV2Fragment, f0Var, w4Var, 1), new ib.j(7, w4Var, f0Var), nVar, 0, 0);
                return;
        }
    }

    @Override // hu.c
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f35915a) {
            case 0:
                a((b0.z) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            default:
                a((b0.z) obj, (t0.n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
        }
    }
}
