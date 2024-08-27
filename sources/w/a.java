package w;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.assetgro.stockgro.data.model.arenaV2.ArenaSortOptions;
import com.assetgro.stockgro.data.model.arenaV2.Option;
import com.assetgro.stockgro.feature_market.data.remote.FnoOrderInfoResponseDto;
import com.assetgro.stockgro.feature_market.domain.model.OptionContract;
import com.assetgro.stockgro.feature_market.presentation.fno.order.ModifyOrderPageBottomSheetViewModel;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.create.GroupCreateViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import t0.l3;

/* loaded from: classes.dex */
public final class a extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38414b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38415c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f38416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f38417e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ArenaSortOptions arenaSortOptions, Option option, Function0 function0, Function1 function1) {
        super(1);
        this.f38413a = 12;
        this.f38414b = arenaSortOptions;
        this.f38415c = option;
        this.f38417e = function0;
        this.f38416d = function1;
    }

    /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Object, t0.n0] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, t0.n0] */
    public final t0.n0 a(t0.o0 DisposableEffect) {
        int i10 = this.f38413a;
        Object obj = this.f38415c;
        Object obj2 = this.f38417e;
        Object obj3 = this.f38416d;
        Object obj4 = this.f38414b;
        switch (i10) {
            case 4:
                d0.f0 f0Var = (d0.f0) obj4;
                f0Var.f13160a = new d0.u0((d0.s) obj, (a2.j1) obj3, (d0.s0) obj2);
                return new c.c(f0Var, 3);
            case 5:
                i0.q1 q1Var = (i0.q1) obj4;
                if (q1Var.b()) {
                    p2.d0 d0Var = (p2.d0) obj;
                    iu.z zVar = new iu.z();
                    c.g gVar = new c.g(12, q1Var.f19137d, q1Var.f19153t, zVar);
                    p2.x xVar = d0Var.f30532a;
                    xVar.b((p2.c0) obj3, (p2.o) obj2, gVar, q1Var.f19154u);
                    p2.i0 i0Var = new p2.i0(d0Var, xVar);
                    d0Var.f30533b.set(i0Var);
                    zVar.f20560a = i0Var;
                    q1Var.f19138e = i0Var;
                }
                return new Object();
            case 6:
            default:
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                int intValue = ((Number) ((t0.g1) obj4).getValue()).intValue();
                double d10 = 0.0d;
                if (intValue != 0) {
                    if (intValue == 1) {
                        ModifyOrderPageBottomSheetViewModel modifyOrderPageBottomSheetViewModel = (ModifyOrderPageBottomSheetViewModel) obj;
                        tu.k1 k1Var = modifyOrderPageBottomSheetViewModel.f8638m;
                        l3 l3Var = (l3) obj2;
                        FnoOrderInfoResponseDto fnoOrderInfoResponseDto = (FnoOrderInfoResponseDto) l3Var.getValue();
                        if (fnoOrderInfoResponseDto != null) {
                            d10 = kj.f.p(fnoOrderInfoResponseDto.getEntryPrice());
                        } else {
                            FnoOrderInfoResponseDto fnoOrderInfoResponseDto2 = (FnoOrderInfoResponseDto) l3Var.getValue();
                            if (fnoOrderInfoResponseDto2 != null) {
                                d10 = fnoOrderInfoResponseDto2.getLtp();
                            }
                        }
                        k1Var.m(Double.valueOf(d10));
                        ((t0.g1) obj3).setValue(String.valueOf(((Number) modifyOrderPageBottomSheetViewModel.f8638m.getValue()).doubleValue()));
                    }
                } else {
                    ModifyOrderPageBottomSheetViewModel modifyOrderPageBottomSheetViewModel2 = (ModifyOrderPageBottomSheetViewModel) obj;
                    tu.k1 k1Var2 = modifyOrderPageBottomSheetViewModel2.f8638m;
                    FnoOrderInfoResponseDto fnoOrderInfoResponseDto3 = (FnoOrderInfoResponseDto) ((l3) obj2).getValue();
                    if (fnoOrderInfoResponseDto3 != null) {
                        d10 = fnoOrderInfoResponseDto3.getLtp();
                    }
                    k1Var2.m(Double.valueOf(d10));
                    ((t0.g1) obj3).setValue(String.valueOf(((Number) modifyOrderPageBottomSheetViewModel2.f8638m.getValue()).doubleValue()));
                }
                return new Object();
            case 7:
                o0.k kVar = (o0.k) obj4;
                kVar.f29357k.addView(kVar, kVar.f29358l);
                kVar.h((Function0) obj, (w2.k) obj2);
                return new c.c(kVar, 7);
        }
    }

    public final void d(c0.d0 LazyColumn) {
        int i10 = this.f38413a;
        Object obj = this.f38417e;
        Object obj2 = this.f38416d;
        Object obj3 = this.f38415c;
        Object obj4 = this.f38414b;
        switch (i10) {
            case 12:
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                ArenaSortOptions arenaSortOptions = (ArenaSortOptions) obj4;
                List<Option> options = arenaSortOptions.getOptions();
                if (options != null) {
                    int size = options.size();
                    v.c cVar = new v.c(9, options);
                    wc.b bVar = new wc.b(options, (Option) obj3, (Function0) obj, arenaSortOptions, (Function1) obj2);
                    Object obj5 = b1.d.f3079a;
                    ((c0.j) LazyColumn).a0(size, null, cVar, new b1.c(bVar, true, -1091073711));
                    return;
                }
                return;
            case 13:
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                m0.i0 i0Var = new m0.i0(4, (GroupCreateViewModel) obj3, (t0.g1) obj2, (t0.g1) obj);
                Object obj6 = b1.d.f3079a;
                c0.d0.a(LazyColumn, new b1.c(i0Var, true, 1600791431));
                e1.s sVar = (e1.s) obj4;
                if (!sVar.isEmpty()) {
                    int i11 = 0;
                    c0.d0.a(LazyColumn, new b1.c(new pd.n(sVar, i11), true, -952357172));
                    c0.j jVar = (c0.j) LazyColumn;
                    jVar.a0(sVar.size(), null, new lb.j(pd.h.f30893e, sVar, 6), new b1.c(new pd.p(sVar, sVar, i11), true, -632812321));
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                List list = (List) obj4;
                if (list != null) {
                    Function1 function1 = (Function1) obj2;
                    Function0 function0 = (Function0) obj;
                    int size2 = list.size();
                    v.c cVar2 = new v.c(21, list);
                    wc.b bVar2 = new wc.b(list, (kh.m) obj3, function1, function0, list);
                    Object obj7 = b1.d.f3079a;
                    ((c0.j) LazyColumn).a0(size2, null, cVar2, new b1.c(bVar2, true, -1091073711));
                    return;
                }
                return;
        }
    }

    public final void e(m mVar) {
        int i10 = this.f38413a;
        Object obj = this.f38417e;
        Object obj2 = this.f38416d;
        Object obj3 = this.f38415c;
        Object obj4 = this.f38414b;
        switch (i10) {
            case 0:
                d dVar = (d) obj4;
                e.y(mVar, dVar.f38453c);
                t0.n1 n1Var = mVar.f38600e;
                Object a10 = d.a(dVar, n1Var.getValue());
                if (!Intrinsics.a(a10, n1Var.getValue())) {
                    dVar.f38453c.f38622b.setValue(a10);
                    ((o) obj3).f38622b.setValue(a10);
                    Function1 function1 = (Function1) obj2;
                    if (function1 != null) {
                        function1.invoke(dVar);
                    }
                    mVar.f38604i.setValue(Boolean.FALSE);
                    mVar.f38599d.mo2invoke();
                    ((iu.v) obj).f20556a = true;
                    return;
                }
                Function1 function12 = (Function1) obj2;
                if (function12 != null) {
                    function12.invoke(dVar);
                    return;
                }
                return;
            default:
                iu.w wVar = (iu.w) obj4;
                float floatValue = ((Number) mVar.f38600e.getValue()).floatValue() - wVar.f20557a;
                float a11 = ((y.q1) obj3).a(floatValue);
                wVar.f20557a = ((Number) mVar.f38600e.getValue()).floatValue();
                ((iu.w) obj2).f20557a = ((Number) mVar.f38596a.f38735b.invoke(mVar.f38601f)).floatValue();
                if (Math.abs(floatValue - a11) > 0.5f) {
                    mVar.f38604i.setValue(Boolean.FALSE);
                    mVar.f38599d.mo2invoke();
                }
                ((y.u) obj).getClass();
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j10;
        boolean z10;
        int i10 = this.f38413a;
        int i11 = 0;
        Object obj2 = this.f38417e;
        Object obj3 = this.f38416d;
        Object obj4 = this.f38415c;
        Object obj5 = this.f38414b;
        switch (i10) {
            case 0:
                e((m) obj);
                return Unit.f23355a;
            case 1:
                long longValue = ((Number) obj).longValue();
                l3 l3Var = (l3) ((t0.g1) obj5).getValue();
                if (l3Var != null) {
                    j10 = ((Number) l3Var.getValue()).longValue();
                } else {
                    j10 = longValue;
                }
                q0 q0Var = (q0) obj4;
                long j11 = q0Var.f38645c;
                v0.h hVar = q0Var.f38643a;
                if (j11 == Long.MIN_VALUE || ((iu.w) obj3).f20557a != e.q(((qu.f0) obj2).H())) {
                    q0Var.f38645c = longValue;
                    int i12 = hVar.f37655c;
                    if (i12 > 0) {
                        Object[] objArr = hVar.f37653a;
                        int i13 = 0;
                        do {
                            ((l0) objArr[i13]).f38587g = true;
                            i13++;
                        } while (i13 < i12);
                    }
                    ((iu.w) obj3).f20557a = e.q(((qu.f0) obj2).H());
                }
                float f10 = ((iu.w) obj3).f20557a;
                if (f10 == s0.g.f34069a) {
                    int i14 = hVar.f37655c;
                    if (i14 > 0) {
                        Object[] objArr2 = hVar.f37653a;
                        do {
                            l0 l0Var = (l0) objArr2[i11];
                            l0Var.f38584d.setValue(l0Var.f38585e.f38609c);
                            l0Var.f38587g = true;
                            i11++;
                        } while (i11 < i14);
                    }
                } else {
                    long j12 = ((float) (j10 - q0Var.f38645c)) / f10;
                    int i15 = hVar.f37655c;
                    if (i15 > 0) {
                        Object[] objArr3 = hVar.f37653a;
                        int i16 = 0;
                        z10 = true;
                        do {
                            l0 l0Var2 = (l0) objArr3[i16];
                            if (!l0Var2.f38586f) {
                                l0Var2.f38589i.f38644b.setValue(Boolean.FALSE);
                                if (l0Var2.f38587g) {
                                    l0Var2.f38587g = false;
                                    l0Var2.f38588h = j12;
                                }
                                long j13 = j12 - l0Var2.f38588h;
                                l0Var2.f38584d.setValue(l0Var2.f38585e.f(j13));
                                l0Var2.f38586f = l0Var2.f38585e.e(j13);
                            }
                            if (!l0Var2.f38586f) {
                                z10 = false;
                            }
                            i16++;
                        } while (i16 < i15);
                    } else {
                        z10 = true;
                    }
                    q0Var.f38646d.setValue(Boolean.valueOf(!z10));
                }
                return Unit.f23355a;
            case 2:
                e((m) obj);
                return Unit.f23355a;
            case 3:
                a2.z0 z0Var = (a2.z0) obj;
                v0.h hVar2 = ((b0.p0) obj5).f2973c;
                b0.m1 m1Var = (b0.m1) obj4;
                int[] iArr = (int[]) obj3;
                a2.o0 o0Var = (a2.o0) obj2;
                int i17 = hVar2.f37655c;
                if (i17 > 0) {
                    Object[] objArr4 = hVar2.f37653a;
                    do {
                        m1Var.c(z0Var, (b0.k1) objArr4[i11], iArr[i11], o0Var.getLayoutDirection());
                        i11++;
                    } while (i11 < i17);
                }
                return Unit.f23355a;
            case 4:
                return a((t0.o0) obj);
            case 5:
                return a((t0.o0) obj);
            case 6:
                j0.r rVar = (j0.r) obj;
                rVar.f20609e = (p2.c0) obj5;
                rVar.f20610f = (p2.o) obj4;
                rVar.f20607c = (Function1) obj3;
                rVar.f20608d = (Function1) obj2;
                return Unit.f23355a;
            case 7:
                return a((t0.o0) obj);
            case 8:
                androidx.navigation.n it = (androidx.navigation.n) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ((iu.v) obj2).f20556a = true;
                ((androidx.navigation.t) obj5).a((androidx.navigation.c0) obj4, (Bundle) obj3, it, vt.i0.f38321a);
                return Unit.f23355a;
            case 9:
                return a((t0.o0) obj);
            case 10:
                ((t0.g1) obj2).setValue(Boolean.valueOf(((Boolean) obj).booleanValue()));
                OptionContract optionContract = (OptionContract) obj4;
                ((t0.g1) obj5).setValue(Double.valueOf(optionContract.getPremium()));
                ((t0.g1) obj3).setValue(String.valueOf(optionContract.getPremium()));
                return Unit.f23355a;
            case 11:
                hb.y postInteraction = (hb.y) obj;
                Intrinsics.checkNotNullParameter(postInteraction, "postInteraction");
                if (!((hb.s) obj5).f18227d.f18220g) {
                    Context context = (Context) obj4;
                    String text = context.getString(R.string.follow_group_to_interact_message);
                    Intrinsics.checkNotNullExpressionValue(text, "getString(...)");
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(text, "text");
                    if (text.length() != 0) {
                        Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                        Object systemService = context.getSystemService("layout_inflater");
                        Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                        View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                        k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                    }
                } else {
                    ((Function2) obj3).invoke((hb.u) obj2, postInteraction);
                }
                return Unit.f23355a;
            case 12:
                d((c0.d0) obj);
                return Unit.f23355a;
            case 13:
                d((c0.d0) obj);
                return Unit.f23355a;
            default:
                d((c0.d0) obj);
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(iu.v vVar, androidx.navigation.t tVar, androidx.navigation.c0 c0Var, Bundle bundle) {
        super(1);
        this.f38413a = 8;
        this.f38417e = vVar;
        this.f38414b = tVar;
        this.f38415c = c0Var;
        this.f38416d = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        super(1);
        this.f38413a = i10;
        this.f38414b = obj;
        this.f38415c = obj2;
        this.f38416d = obj3;
        this.f38417e = obj4;
    }
}
