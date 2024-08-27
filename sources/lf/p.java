package lf;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.RecyclerView;
import ba.eq;
import com.assetgro.stockgro.data.model.homedata.ListItem;
import com.assetgro.stockgro.data.model.homedata.Widget;
import com.assetgro.stockgro.prod.R;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.mig35.carousellayoutmanager.CarouselLayoutManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y.q0;

/* loaded from: classes.dex */
public final class p extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24759a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Widget f24760b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f24761c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Widget widget, Function2 function2, int i10) {
        super(1);
        this.f24759a = i10;
        this.f24760b = widget;
        this.f24761c = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, mt.p] */
    /* JADX WARN: Type inference failed for: r1v4, types: [k7.n1, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f24759a;
        Function2 function2 = this.f24761c;
        Widget widget = this.f24760b;
        switch (i10) {
            case 0:
                Context ctx = (Context) obj;
                Intrinsics.checkNotNullParameter(ctx, "ctx");
                LayoutInflater from = LayoutInflater.from(ctx);
                int i11 = eq.f4638t;
                DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
                eq eqVar = (eq) m4.m.g(from, R.layout.home_coverflow_section, null, false, null);
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
                recylerViewCarousel.setAdapter(new m(widget.getListItems(), new q0(25, widget, function2)));
                Long autoScrollTimeInSec = widget.getAutoScrollTimeInSec();
                if (autoScrollTimeInSec != null) {
                    long longValue = autoScrollTimeInSec.longValue() * CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
                    int i12 = kj.f.f23221a;
                    Intrinsics.checkNotNullParameter(recylerViewCarousel, "<this>");
                    Handler handler = new Handler(Looper.getMainLooper());
                    handler.postDelayed(new kj.e(0, longValue, recylerViewCarousel, handler), longValue);
                }
                return eqVar.f27491e;
            default:
                c0.d0 LazyRow = (c0.d0) obj;
                Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
                c0.d0.a(LazyRow, i.f24731a);
                List<ListItem> listItems = widget.getListItems();
                int size = listItems.size();
                v.c cVar = new v.c(18, listItems);
                ob.j jVar = new ob.j(2, widget, listItems, function2);
                Object obj2 = b1.d.f3079a;
                ((c0.j) LazyRow).a0(size, null, cVar, new b1.c(jVar, true, -1091073711));
                return Unit.f23355a;
        }
    }
}
