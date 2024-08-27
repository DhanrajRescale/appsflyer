package ce;

import ba.aw;
import ba.l8;
import ba.pr;
import com.assetgro.stockgro.data.model.DiscoverCategory;
import com.assetgro.stockgro.data.model.Group;
import com.assetgro.stockgro.ui.chat.discover.category.DiscoverCategoryItemViewModel;
import iu.k;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8120a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f8121b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i10) {
        super(1);
        this.f8120a = i10;
        this.f8121b = dVar;
    }

    public final void a(Group it) {
        int i10 = this.f8120a;
        String str = null;
        d dVar = this.f8121b;
        switch (i10) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                Function2 function2 = dVar.f8122x;
                DiscoverCategory discoverCategory = (DiscoverCategory) ((DiscoverCategoryItemViewModel) dVar.v()).f9075c.getValue();
                if (discoverCategory != null) {
                    str = discoverCategory.getCategoryName();
                }
                function2.invoke(it, str);
                return;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                Function2 function22 = dVar.f8122x;
                DiscoverCategory discoverCategory2 = (DiscoverCategory) ((DiscoverCategoryItemViewModel) dVar.v()).f9075c.getValue();
                if (discoverCategory2 != null) {
                    str = discoverCategory2.getCategoryName();
                }
                function22.invoke(it, str);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f8120a) {
            case 0:
                DiscoverCategory discoverCategory = (DiscoverCategory) obj;
                List<Group> categoryGroups = discoverCategory.getCategoryGroups();
                if (categoryGroups != null && !categoryGroups.isEmpty()) {
                    boolean a10 = Intrinsics.a(discoverCategory.getOrientation(), "H");
                    d dVar = this.f8121b;
                    if (a10) {
                        l8 l8Var = (l8) dVar.f17291u;
                        l8Var.f5326u.f27491e.setVisibility(8);
                        pr prVar = l8Var.f5325t;
                        prVar.f27491e.setVisibility(0);
                        prVar.f5801u.setText(discoverCategory.getCategoryName());
                        de.a aVar = dVar.f8123y;
                        if (aVar != null) {
                            aVar.u(discoverCategory.getCategoryGroups());
                        } else {
                            Intrinsics.k("horizontalGroupAdapter");
                            throw null;
                        }
                    } else {
                        l8 l8Var2 = (l8) dVar.f17291u;
                        l8Var2.f5325t.f27491e.setVisibility(8);
                        aw awVar = l8Var2.f5326u;
                        awVar.f27491e.setVisibility(0);
                        awVar.f4235t.setText(discoverCategory.getCategoryName());
                        fe.b bVar = dVar.f8124z;
                        if (bVar != null) {
                            bVar.u(discoverCategory.getCategoryGroups());
                        } else {
                            Intrinsics.k("verticalGroupAdapter");
                            throw null;
                        }
                    }
                }
                return Unit.f23355a;
            case 1:
                a((Group) obj);
                return Unit.f23355a;
            default:
                a((Group) obj);
                return Unit.f23355a;
        }
    }
}
