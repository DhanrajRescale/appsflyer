package rb;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.RecyclerView;
import ba.eq;
import c0.d0;
import c0.j;
import c0.y;
import com.assetgro.stockgro.data.model.homedata.Widget;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.create_compose.screens.create_group.GroupCreateHostActivityCompose;
import com.assetgro.stockgro.ui.chat.detail.members.compose.AddMembersHostComposeActivity;
import com.assetgro.stockgro.ui.chat.host.GroupChatHostViewModel;
import com.assetgro.stockgro.ui.profile.report.ReportEntityActivity;
import com.assetgro.stockgro.ui.profile.report.ReportEntityViewModel;
import com.mig35.carousellayoutmanager.CarouselLayoutManager;
import d2.d3;
import d2.u1;
import e1.s;
import el.l;
import i0.n1;
import iu.k;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.UndeliveredElementException;
import m0.w4;
import m4.m;
import pd.l0;
import qu.f0;
import t0.g1;
import yk.g;

/* loaded from: classes.dex */
public final class f extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33577a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33578b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f33579c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f33580d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10, Object obj, Object obj2, Object obj3) {
        super(1);
        this.f33577a = i10;
        this.f33578b = obj;
        this.f33579c = obj2;
        this.f33580d = obj3;
    }

    public final void a(d0 LazyRow) {
        int i10 = this.f33577a;
        int i11 = 1;
        Object obj = this.f33580d;
        Object obj2 = this.f33578b;
        Object obj3 = this.f33579c;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
                if (((nb.b) obj2) != null) {
                    ((j) LazyRow).a0(10, null, y.f7619c, c.f33566a);
                    d0.a(LazyRow, c.f33567b);
                    return;
                }
                List list = (List) obj3;
                d dVar = d.f33569b;
                int size = list.size();
                lb.j jVar = new lb.j(dVar, list, 3);
                e eVar = new e(list, (Function1) obj, 0);
                Object obj4 = b1.d.f3079a;
                j jVar2 = (j) LazyRow;
                jVar2.a0(size, null, jVar, new b1.c(eVar, true, -632812321));
                if (!list.isEmpty()) {
                    d0.a(jVar2, c.f33568c);
                    return;
                }
                return;
            case 3:
                Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyColumn");
                h7.b bVar = (h7.b) obj2;
                int b10 = bVar.b();
                ob.j jVar3 = new ob.j(i11, bVar, (Function2) obj, (List) obj3);
                Object obj5 = b1.d.f3079a;
                ((j) LazyRow).a0(b10, null, y.f7619c, new b1.c(jVar3, true, -5779101));
                return;
            default:
                Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyColumn");
                List list2 = (List) obj3;
                int size2 = list2.size();
                v.c cVar = new v.c(20, list2);
                ob.j jVar4 = new ob.j(list2, (pg.c) obj2, (Function1) obj, 5);
                Object obj6 = b1.d.f3079a;
                ((j) LazyRow).a0(size2, null, cVar, new b1.c(jVar4, true, -1091073711));
                return;
        }
    }

    public final void d(s it) {
        int i10 = this.f33577a;
        Object obj = this.f33579c;
        Object obj2 = this.f33580d;
        Object obj3 = this.f33578b;
        switch (i10) {
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.size() != 0) {
                    g.H((f0) obj3, null, null, new l0((w4) obj2, null), 3);
                    return;
                } else {
                    ((GroupCreateHostActivityCompose) obj).finish();
                    return;
                }
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.size() != 0) {
                    g.H((f0) obj3, null, null, new wd.c((w4) obj2, null), 3);
                    return;
                } else {
                    ((AddMembersHostComposeActivity) obj).finish();
                    return;
                }
        }
    }

    public final void invoke(Throwable th2) {
        int i10 = this.f33577a;
        Object obj = this.f33578b;
        Object obj2 = this.f33579c;
        Object obj3 = this.f33580d;
        switch (i10) {
            case 11:
                if (obj == su.e.f34806l) {
                    return;
                }
                Function1 function1 = ((su.c) obj2).f34793b;
                a3.a.u(obj3);
                throw null;
            default:
                CoroutineContext coroutineContext = (CoroutineContext) obj2;
                UndeliveredElementException y10 = l.y((Function1) obj3, obj, null);
                if (y10 != null) {
                    l.k0(coroutineContext, y10);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10, Object obj, Object obj2, Function1 function1) {
        super(1);
        this.f33577a = i10;
        this.f33580d = function1;
        this.f33578b = obj;
        this.f33579c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10, Object obj, List list, ut.d dVar) {
        super(1);
        this.f33577a = i10;
        this.f33579c = list;
        this.f33578b = obj;
        this.f33580d = dVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g1 g1Var, Function1 function1, List list) {
        super(1);
        this.f33577a = 2;
        this.f33578b = g1Var;
        this.f33580d = function1;
        this.f33579c = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, mt.p] */
    /* JADX WARN: Type inference failed for: r2v4, types: [k7.n1, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f33577a;
        Object obj2 = this.f33580d;
        Object obj3 = this.f33579c;
        Object obj4 = this.f33578b;
        switch (i10) {
            case 0:
                a((d0) obj);
                return Unit.f23355a;
            case 1:
                e.a result = (e.a) obj;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.f14610a == -1) {
                    g1 g1Var = (g1) obj4;
                    float f10 = s0.g.f34069a;
                    Intent intent = result.f14611b;
                    if (intent != null) {
                        f10 = intent.getFloatExtra("ELAPSED_TIME_YOUTUBE", s0.g.f34069a);
                    }
                    g1Var.setValue(Float.valueOf(f10));
                }
                qs.e eVar = (qs.e) ((g1) obj3).getValue();
                if (eVar != null) {
                    ((us.g) eVar).c();
                }
                ((g1) obj2).setValue(Boolean.FALSE);
                return Unit.f23355a;
            case 2:
                int intValue = ((Number) obj).intValue();
                ((g1) obj4).setValue(Integer.valueOf(intValue));
                ((Function1) obj2).invoke(((List) obj3).get(intValue));
                return Unit.f23355a;
            case 3:
                a((d0) obj);
                return Unit.f23355a;
            case 4:
                n1 $receiver = (n1) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                g1 g1Var2 = (g1) obj3;
                if (((String) g1Var2.getValue()).length() > 2) {
                    ((Function1) obj2).invoke((String) g1Var2.getValue());
                }
                d3 d3Var = (d3) obj4;
                if (d3Var != null) {
                    ((u1) d3Var).a();
                }
                return Unit.f23355a;
            case 5:
                d((s) obj);
                return Unit.f23355a;
            case 6:
                d((s) obj);
                return Unit.f23355a;
            case 7:
                GroupChatHostViewModel groupChatHostViewModel = (GroupChatHostViewModel) obj4;
                groupChatHostViewModel.f9084g.postValue(Boolean.FALSE);
                groupChatHostViewModel.o((String) obj3, (String) obj2);
                return Unit.f23355a;
            case 8:
                Context ctx = (Context) obj;
                Intrinsics.checkNotNullParameter(ctx, "ctx");
                LayoutInflater from = LayoutInflater.from(ctx);
                int i11 = eq.f4638t;
                DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
                eq eqVar = (eq) m.g(from, R.layout.home_coverflow_section, null, false, null);
                Intrinsics.checkNotNullExpressionValue(eqVar, "inflate(...)");
                RecyclerView recylerViewCarousel = eqVar.f4639s;
                Intrinsics.checkNotNullExpressionValue(recylerViewCarousel, "recylerViewCarousel");
                CarouselLayoutManager carouselLayoutManager = new CarouselLayoutManager();
                carouselLayoutManager.f12107w = new Object();
                carouselLayoutManager.q0();
                carouselLayoutManager.f12106v.f14632a = 1;
                carouselLayoutManager.q0();
                recylerViewCarousel.setHasFixedSize(true);
                recylerViewCarousel.j(new es.c());
                recylerViewCarousel.j(new Object());
                recylerViewCarousel.setLayoutManager(carouselLayoutManager);
                recylerViewCarousel.setAdapter(new lf.g((List) obj3, (Widget) obj4, new pd.y((Function2) obj2, 9)));
                return eqVar.f27491e;
            case 9:
                a((d0) obj);
                return Unit.f23355a;
            case 10:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ReportEntityActivity reportEntityActivity = (ReportEntityActivity) obj4;
                ((ReportEntityViewModel) reportEntityActivity.x()).f10017u = true;
                ReportEntityViewModel reportEntityViewModel = (ReportEntityViewModel) reportEntityActivity.x();
                String string = reportEntityActivity.getString(R.string.others_capital_text);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                ReportEntityViewModel.h(reportEntityViewModel, string, null, it, 2);
                reportEntityActivity.setResult(-1);
                g.H((f0) obj3, null, null, new hh.b((w4) obj2, null), 3);
                return Unit.f23355a;
            case 11:
                invoke((Throwable) obj);
                return Unit.f23355a;
            default:
                invoke((Throwable) obj);
                return Unit.f23355a;
        }
    }
}
