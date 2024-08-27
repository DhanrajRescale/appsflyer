package ob;

import b0.h1;
import b0.s;
import b0.v;
import com.assetgro.stockgro.feature_social.presentation.feed.home.SocialHomeFeedV2ViewModel;
import g1.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t0.m2;
import t0.n;
import t0.r;
import t0.r1;
import t0.t;

/* loaded from: classes.dex */
public final class e extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SocialHomeFeedV2ViewModel f29889a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nb.b f29890b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nb.b f29891c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f29892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function0 f29893e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function0 f29894f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function1 f29895g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function1 f29896h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function1 f29897i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function0 f29898j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SocialHomeFeedV2ViewModel socialHomeFeedV2ViewModel, nb.b bVar, nb.b bVar2, boolean z10, Function0 function0, Function0 function02, Function1 function1, Function1 function12, Function1 function13, Function0 function03) {
        super(3);
        this.f29889a = socialHomeFeedV2ViewModel;
        this.f29890b = bVar;
        this.f29891c = bVar2;
        this.f29892d = z10;
        this.f29893e = function0;
        this.f29894f = function02;
        this.f29895g = function1;
        this.f29896h = function12;
        this.f29897i = function13;
        this.f29898j = function03;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        int i10;
        int i11;
        h1 paddingValue = (h1) obj;
        n nVar = (n) obj2;
        int intValue = ((Number) obj3).intValue();
        Intrinsics.checkNotNullParameter(paddingValue, "paddingValue");
        if ((intValue & 14) == 0) {
            if (((r) nVar).h(paddingValue)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            intValue |= i11;
        }
        if ((intValue & 91) == 18) {
            r rVar = (r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        o s7 = androidx.compose.foundation.layout.a.s(g1.l.f16404b, paddingValue);
        nb.b bVar = this.f29890b;
        nb.b bVar2 = this.f29891c;
        boolean z10 = this.f29892d;
        Function0 function0 = this.f29893e;
        Function0 function02 = this.f29894f;
        Function1 function1 = this.f29895g;
        Function1 function12 = this.f29896h;
        Function1 function13 = this.f29897i;
        Function0 function03 = this.f29898j;
        r rVar2 = (r) nVar;
        rVar2.b0(733328855);
        v c10 = s.c(g1.a.f16379a, false, rVar2, 0);
        rVar2.b0(-1323940314);
        int i12 = rVar2.P;
        r1 o10 = rVar2.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(s7);
        if (rVar2.f35166a instanceof t0.f) {
            rVar2.e0();
            if (rVar2.O) {
                rVar2.n(jVar);
            } else {
                rVar2.n0();
            }
            t.v0(rVar2, c10, c2.k.f7749e);
            t.v0(rVar2, o10, c2.k.f7748d);
            c2.i iVar = c2.k.f7750f;
            if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i12))) {
                nn.d.s(i12, rVar2, i12, iVar);
            }
            nn.d.q(0, j10, new m2(rVar2), rVar2, 2058660585);
            SocialHomeFeedV2ViewModel socialHomeFeedV2ViewModel = this.f29889a;
            e1.s sVar = socialHomeFeedV2ViewModel.f8822r;
            Integer num = ((nb.c) socialHomeFeedV2ViewModel.f8820p.getValue()).f28574h;
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = 0;
            }
            yk.j.h0(sVar, socialHomeFeedV2ViewModel.f8824t, i10, bVar, bVar2, z10, function0, function02, function1, function12, function13, function03, rVar2, 920125440, 54, 0);
            v.e.y(rVar2, false, true, false, false);
            return Unit.f23355a;
        }
        al.d.v0();
        throw null;
    }
}
