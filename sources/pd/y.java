package pd;

import b0.l1;
import b0.o1;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.CreateGroupUser;
import com.assetgro.stockgro.feature_market.data.remote.OptionValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import t0.m2;
import t0.r1;

/* loaded from: classes.dex */
public final class y extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30997a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f30998b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Function2 function2, int i10) {
        super(2);
        this.f30997a = i10;
        this.f30998b = function2;
    }

    public final void a(CreateGroupUser user, boolean z10) {
        int i10 = this.f30997a;
        Function2 function2 = this.f30998b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(user, "user");
                function2.invoke(user, Boolean.valueOf(z10));
                return;
            case 1:
                Intrinsics.checkNotNullParameter(user, "user");
                function2.invoke(user, Boolean.valueOf(z10));
                return;
            case 2:
                Intrinsics.checkNotNullParameter(user, "addUser");
                function2.invoke(user, Boolean.valueOf(z10));
                return;
            case 3:
                Intrinsics.checkNotNullParameter(user, "addUser");
                function2.invoke(user, Boolean.valueOf(z10));
                return;
            case 4:
                Intrinsics.checkNotNullParameter(user, "addUser");
                function2.invoke(user, Boolean.valueOf(z10));
                return;
            case 5:
                Intrinsics.checkNotNullParameter(user, "addUser");
                function2.invoke(user, Boolean.valueOf(z10));
                return;
            default:
                Intrinsics.checkNotNullParameter(user, "addUser");
                function2.invoke(user, Boolean.valueOf(z10));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f30997a;
        Function2 function2 = this.f30998b;
        switch (i10) {
            case 0:
                a((CreateGroupUser) obj, ((Boolean) obj2).booleanValue());
                return Unit.f23355a;
            case 1:
                a((CreateGroupUser) obj, ((Boolean) obj2).booleanValue());
                return Unit.f23355a;
            case 2:
                a((CreateGroupUser) obj, ((Boolean) obj2).booleanValue());
                return Unit.f23355a;
            case 3:
                a((CreateGroupUser) obj, ((Boolean) obj2).booleanValue());
                return Unit.f23355a;
            case 4:
                a((CreateGroupUser) obj, ((Boolean) obj2).booleanValue());
                return Unit.f23355a;
            case 5:
                a((CreateGroupUser) obj, ((Boolean) obj2).booleanValue());
                return Unit.f23355a;
            case 6:
                a((CreateGroupUser) obj, ((Boolean) obj2).booleanValue());
                return Unit.f23355a;
            case 7:
                String mentionedUserId = (String) obj;
                String mentionedUsername = (String) obj2;
                Intrinsics.checkNotNullParameter(mentionedUserId, "mentionedUserId");
                Intrinsics.checkNotNullParameter(mentionedUsername, "mentionedUsername");
                function2.invoke(mentionedUserId, mentionedUsername);
                return Unit.f23355a;
            case 8:
                t0.n nVar = (t0.n) obj;
                if ((((Number) obj2).intValue() & 11) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return Unit.f23355a;
                    }
                }
                g1.f fVar = g1.a.f16389k;
                float f10 = 8;
                float f11 = 4;
                g1.o w10 = androidx.compose.foundation.layout.a.w(g1.l.f16404b, f10, f11, f10, f11);
                t0.r rVar2 = (t0.r) nVar;
                rVar2.b0(693286680);
                l1 a10 = o1.a(b0.n.f2935a, fVar, rVar2, 48);
                rVar2.b0(-1323940314);
                int i11 = rVar2.P;
                r1 o10 = rVar2.o();
                c2.l.M.getClass();
                c2.j jVar = c2.k.f7746b;
                b1.c j10 = androidx.compose.ui.layout.a.j(w10);
                if (rVar2.f35166a instanceof t0.f) {
                    rVar2.e0();
                    if (rVar2.O) {
                        rVar2.n(jVar);
                    } else {
                        rVar2.n0();
                    }
                    t0.t.v0(rVar2, a10, c2.k.f7749e);
                    t0.t.v0(rVar2, o10, c2.k.f7748d);
                    c2.i iVar = c2.k.f7750f;
                    if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i11))) {
                        nn.d.s(i11, rVar2, i11, iVar);
                    }
                    nn.d.q(0, j10, new m2(rVar2), rVar2, 2058660585);
                    com.google.android.gms.internal.p002firebaseauthapi.a.p(0, function2, rVar2, false, true);
                    rVar2.s(false);
                    rVar2.s(false);
                    return Unit.f23355a;
                }
                al.d.v0();
                throw null;
            case 9:
                String deeplink = (String) obj;
                AnalyticEvent analyticsEvent = (AnalyticEvent) obj2;
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                Intrinsics.checkNotNullParameter(analyticsEvent, "analyticsEvent");
                function2.invoke(deeplink, analyticsEvent);
                return Unit.f23355a;
            case 10:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                OptionValue fnoValue = (OptionValue) obj2;
                switch (i10) {
                    case 10:
                        Intrinsics.checkNotNullParameter(fnoValue, "fnoValue");
                        function2.invoke(Boolean.valueOf(booleanValue), fnoValue);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(fnoValue, "optionValue");
                        function2.invoke(Boolean.valueOf(booleanValue), fnoValue);
                        break;
                }
                return Unit.f23355a;
            default:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                OptionValue fnoValue2 = (OptionValue) obj2;
                switch (i10) {
                    case 10:
                        Intrinsics.checkNotNullParameter(fnoValue2, "fnoValue");
                        function2.invoke(Boolean.valueOf(booleanValue2), fnoValue2);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(fnoValue2, "optionValue");
                        function2.invoke(Boolean.valueOf(booleanValue2), fnoValue2);
                        break;
                }
                return Unit.f23355a;
        }
    }
}
