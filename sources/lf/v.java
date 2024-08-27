package lf;

import com.assetgro.stockgro.data.model.homedata.ListItem;
import com.assetgro.stockgro.data.model.homedata.Widget;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24794a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Widget f24795b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1.o f24796c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f24797d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Widget widget, g1.o oVar, Function2 function2, int i10) {
        super(1);
        this.f24794a = i10;
        this.f24795b = widget;
        this.f24796c = oVar;
        this.f24797d = function2;
    }

    public final void a(c0.d0 LazyRow) {
        int i10 = this.f24794a;
        Widget widget = this.f24795b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
                List<ListItem> listItems = widget.getListItems();
                g1.o oVar = this.f24796c;
                Function2 function2 = this.f24797d;
                Widget widget2 = this.f24795b;
                int size = listItems.size();
                v.c cVar = new v.c(14, listItems);
                u uVar = new u(listItems, oVar, function2, widget2, 0);
                Object obj = b1.d.f3079a;
                ((c0.j) LazyRow).a0(size, null, cVar, new b1.c(uVar, true, -1091073711));
                return;
            case 1:
                Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
                List<ListItem> listItems2 = widget.getListItems();
                g1.o oVar2 = this.f24796c;
                Function2 function22 = this.f24797d;
                Widget widget3 = this.f24795b;
                int size2 = listItems2.size();
                v.c cVar2 = new v.c(15, listItems2);
                u uVar2 = new u(listItems2, oVar2, function22, widget3, 1);
                Object obj2 = b1.d.f3079a;
                ((c0.j) LazyRow).a0(size2, null, cVar2, new b1.c(uVar2, true, -1091073711));
                return;
            case 2:
                Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
                List<ListItem> listItems3 = widget.getListItems();
                g1.o oVar3 = this.f24796c;
                Function2 function23 = this.f24797d;
                Widget widget4 = this.f24795b;
                int size3 = listItems3.size();
                v.c cVar3 = new v.c(16, listItems3);
                u uVar3 = new u(listItems3, oVar3, function23, widget4, 2);
                Object obj3 = b1.d.f3079a;
                ((c0.j) LazyRow).a0(size3, null, cVar3, new b1.c(uVar3, true, -1091073711));
                return;
            case 3:
                Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
                List<ListItem> listItems4 = widget.getListItems();
                g1.o oVar4 = this.f24796c;
                Function2 function24 = this.f24797d;
                Widget widget5 = this.f24795b;
                int size4 = listItems4.size();
                v.c cVar4 = new v.c(17, listItems4);
                u uVar4 = new u(listItems4, oVar4, function24, widget5, 3);
                Object obj4 = b1.d.f3079a;
                ((c0.j) LazyRow).a0(size4, null, cVar4, new b1.c(uVar4, true, -1091073711));
                return;
            default:
                Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
                c0.d0.a(LazyRow, i.f24732b);
                List<ListItem> listItems5 = widget.getListItems();
                g1.o oVar5 = this.f24796c;
                Function2 function25 = this.f24797d;
                Widget widget6 = this.f24795b;
                int size5 = listItems5.size();
                v.c cVar5 = new v.c(19, listItems5);
                u uVar5 = new u(listItems5, oVar5, function25, widget6, 4);
                Object obj5 = b1.d.f3079a;
                ((c0.j) LazyRow).a0(size5, null, cVar5, new b1.c(uVar5, true, -1091073711));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f24794a) {
            case 0:
                a((c0.d0) obj);
                return Unit.f23355a;
            case 1:
                a((c0.d0) obj);
                return Unit.f23355a;
            case 2:
                a((c0.d0) obj);
                return Unit.f23355a;
            case 3:
                a((c0.d0) obj);
                return Unit.f23355a;
            default:
                a((c0.d0) obj);
                return Unit.f23355a;
        }
    }
}
