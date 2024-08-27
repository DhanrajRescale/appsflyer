package rd;

import com.assetgro.stockgro.ui.chat.detail.group.GroupChatFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33630a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupChatFragment f33631b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(GroupChatFragment groupChatFragment, int i10) {
        super(2);
        this.f33630a = i10;
        this.f33631b = groupChatFragment;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f33630a;
        int i12 = 6;
        int i13 = 1;
        int i14 = 0;
        GroupChatFragment groupChatFragment = this.f33631b;
        int i15 = 2;
        switch (i11) {
            case 0:
                if ((i10 & 11) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                el.l.m(false, new j(groupChatFragment, i14), nVar, 0, 1);
                return;
            case 1:
                if ((i10 & 11) == 2) {
                    t0.r rVar2 = (t0.r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                el.l.n(null, new j(groupChatFragment, i13), nVar, 0, 1);
                return;
            case 2:
                if ((i10 & 11) == 2) {
                    t0.r rVar3 = (t0.r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                el.l.m(false, new j(groupChatFragment, i15), nVar, 0, 1);
                return;
            case 3:
                if ((i10 & 11) == 2) {
                    t0.r rVar4 = (t0.r) nVar;
                    if (rVar4.G()) {
                        rVar4.V();
                        return;
                    }
                }
                el.l.n(null, new j(groupChatFragment, 3), nVar, 0, 1);
                return;
            case 4:
                if ((i10 & 11) == 2) {
                    t0.r rVar5 = (t0.r) nVar;
                    if (rVar5.G()) {
                        rVar5.V();
                        return;
                    }
                }
                el.l.m(false, new j(groupChatFragment, i12), nVar, 6, 0);
                return;
            case 5:
                if ((i10 & 11) == 2) {
                    t0.r rVar6 = (t0.r) nVar;
                    if (rVar6.G()) {
                        rVar6.V();
                        return;
                    }
                }
                if (Intrinsics.a(groupChatFragment.L().f9138s.getValue(), Boolean.TRUE)) {
                    t0.r rVar7 = (t0.r) nVar;
                    rVar7.b0(1061228159);
                    el.l.m(false, new j(groupChatFragment, 7), rVar7, 0, 1);
                    rVar7.s(false);
                } else {
                    t0.r rVar8 = (t0.r) nVar;
                    rVar8.b0(1061391374);
                    el.l.m(true, null, rVar8, 6, 2);
                    rVar8.s(false);
                }
                groupChatFragment.f9159s = true;
                return;
            default:
                if ((i10 & 11) == 2) {
                    t0.r rVar9 = (t0.r) nVar;
                    if (rVar9.G()) {
                        rVar9.V();
                        return;
                    }
                }
                el.l.m(false, new j(groupChatFragment, 8), nVar, 6, 0);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f33630a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 1:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 2:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 3:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 4:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 5:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
